package com.basic.spring.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.basic.spring.rest.bean.ElectronicTune;

/**
 * A controller that is written with the help of Spring 3.x configuration.
 * 
 * @author Upendra Vemulapalli
 *
 */
@Controller
public class ElectronicTunesController extends AbstractController {
	
	/**
	 * A controller method that accepts ONLY xml input based on URI path extension and returns ONLY xml output.
	 * 
	 * @param tuneId
	 * @return com.basic.spring.rest.bean.ElectronicTune
	 */
	@RequestMapping(value = "/electronic-tune/{tuneId}.xml", method = RequestMethod.GET, consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public ElectronicTune getElectronicTuneByTuneIdAsXml(@PathVariable Integer tuneId){
		ElectronicTune electronicTune = getElectronicTuneObject();
		return electronicTune;
	}
	
	/**
	 * A controller method that accepts ONLY xml input based on URI path extension and returns ONLY json output.
	 * 
	 * @param tuneId
	 * @return com.basic.spring.rest.bean.ElectronicTune
	 */
	@RequestMapping(value = "/electronic-tune/{tuneId}.json", method = RequestMethod.GET, consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ElectronicTune getElectronicTuneByTuneIdAsJson(@PathVariable Integer tuneId){
		ElectronicTune electronicTune = getElectronicTuneObject();
		return electronicTune;
	}

	/**
	 * An utility method to contruct ElectronicTune instance.
	 * 
	 * @return com.basic.spring.rest.bean.ElectronicTune
	 */
	private ElectronicTune getElectronicTuneObject() {
		ElectronicTune electronicTune = beanFactory.getBean(ElectronicTune.class);
		electronicTune.setTuneId(1001);
		electronicTune.setAlbumName("Maroon 5");
		electronicTune.setArtistName("Adam Levine");
		electronicTune.setTunePrice(new Double("0.99"));
		return electronicTune;
	}
}