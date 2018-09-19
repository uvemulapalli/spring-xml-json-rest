package com.basic.spring.rest.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.stereotype.Component;

/**
 * A serializable object for view and controller layers.
 * 
 * @author Upendra Vemulapalli
 *
 */
@Component
@XmlRootElement(name="electronicTune")
@XmlType(propOrder = {"tuneId", "artistName", "albumName", "tunePrice"})
@org.codehaus.jackson.annotate.JsonPropertyOrder({"tuneId", "artistName", "albumName", "tunePrice"})
public class ElectronicTune implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer tuneId;
	
	private String albumName;
	
	private String artistName;
	
	private Double tunePrice;

	/**
	 * @return the tuneId
	 */
	public @XmlElement Integer getTuneId() {
		return tuneId;
	}

	/**
	 * @param tuneId the tuneId to set
	 */
	public void setTuneId(Integer tuneId) {
		this.tuneId = tuneId;
	}

	/**
	 * @return the albumName
	 */
	public @XmlElement String getAlbumName() {
		return albumName;
	}

	/**
	 * @param albumName the albumName to set
	 */
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	/**
	 * @return the artistName
	 */
	public @XmlElement String getArtistName() {
		return artistName;
	}

	/**
	 * @param artistName the artistName to set
	 */
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	/**
	 * @return the tunePrice
	 */
	public @XmlElement Double getTunePrice() {
		return tunePrice;
	}

	/**
	 * @param tunePrice the tunePrice to set
	 */
	public void setTunePrice(Double tunePrice) {
		this.tunePrice = tunePrice;
	}
}