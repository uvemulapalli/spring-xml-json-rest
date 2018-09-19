package com.basic.spring.rest.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * An abstract controller which holds the beanFactory instance and 
 * handles all application exceptions that occur while controller is processing the request.
 * 
 * @author Upendra Vemulapalli
 *
 */
public abstract class AbstractController implements BeanFactoryAware {
	
	protected BeanFactory beanFactory;
	
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;		
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllException(Exception ex) {
		ModelAndView model = new ModelAndView();
		model.addObject("errMsg", "this is Exception.class");
		return model;
	}
}