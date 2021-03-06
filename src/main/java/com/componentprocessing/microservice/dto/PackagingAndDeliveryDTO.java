package com.componentprocessing.microservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PackagingAndDeliveryDTO {

	@JsonProperty
	private Double charge;

	@JsonIgnore
	public PackagingAndDeliveryDTO(Double charge) {
		this.charge = charge;
	}

	@JsonIgnore
	public Double getCharge() {
		return charge;
	}

	@JsonIgnore
	public void setCharge(Double charge) {
		this.charge = charge;
	}

}
