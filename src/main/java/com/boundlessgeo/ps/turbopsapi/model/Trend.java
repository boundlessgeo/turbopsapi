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
public enum Trend {
	UPWARDS("up"), NOCHANGE("none"), DOWNWARDS("down");

	@Getter
	private final String trending;
}
