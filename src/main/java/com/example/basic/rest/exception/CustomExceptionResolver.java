package com.example.basic.rest.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

/**
 * A custom exception resolver that handles all pre-controller exceptions.
 * 
 * @author Upendra Vemulapalli
 *
 */
public class CustomExceptionResolver extends DefaultHandlerExceptionResolver {
 
    @Override
    protected ModelAndView doResolveException(HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            Exception ex) {
         
        try {
            if (ex instanceof HttpMediaTypeNotAcceptableException) {
            	System.out.println("MediaType - " + request.getContentType());
                return handleHttpMediaTypeNotAcceptable((HttpMediaTypeNotAcceptableException) ex, request, response);
            } else if (ex instanceof HttpMediaTypeNotSupportedException) {
            	System.out.println("MediaType - " + request.getContentType());
                return handleHttpMediaTypeNotSupportedException((HttpMediaTypeNotSupportedException) ex, request, response);
            } 
        }
        catch (Exception handlerException) {
            logger.warn("Handling of [" + ex.getClass().getName() + "] resulted in Exception", handlerException);
        }
         
        return super.doResolveException(request, response, handler, ex);
    }
     
    private ModelAndView handleHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException ex,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
    	return handleCommonResponse(response);
	}

	/**
	 * @param response
	 * @return
	 * @throws IOException
	 */
	private ModelAndView handleCommonResponse(HttpServletResponse response) throws IOException {
		System.out.println("Please check your input");
    	response.sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Please check your input");  // HTTP Status code 503
        return new ModelAndView();
	}

	private ModelAndView handleHttpMediaTypeNotAcceptable(HttpMediaTypeNotAcceptableException ex,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
    	return handleCommonResponse(response);
    }
     
}