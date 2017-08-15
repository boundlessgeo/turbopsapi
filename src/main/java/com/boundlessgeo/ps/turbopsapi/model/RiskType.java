/**
 *
 */
package com.boundlessgeo.ps.turbopsapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author ssengupta
 *
 */
@AllArgsConstructor
@ToString
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum RiskType {
	CUSTSAT("Cust Sat"),
	COSTOVERRUN("Cost Overrun"),
	RESOURCEUNAVAILABILITY("Resource Unavailability"),
	POPOVERRUN("PoP Overrun");

	@Getter
	private final String type;
}
