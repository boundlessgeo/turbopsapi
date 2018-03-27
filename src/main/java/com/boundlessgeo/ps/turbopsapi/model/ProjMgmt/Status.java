/**
 *
 */
package com.boundlessgeo.ps.turbopsapi.model.ProjMgmt;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author ssengupta
 */
@AllArgsConstructor
@ToString
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Status {
	RED("Red"), YELLOW("Yellow"), GREEN("Green");

	@Getter
	private final String status;
}
