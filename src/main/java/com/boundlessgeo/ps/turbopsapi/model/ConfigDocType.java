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
public enum ConfigDocType {
	WORD("MS Word"),
	EXCEL("MS Excel"),
	PDF("PDF");

	@Getter
	private final String docType;
}
