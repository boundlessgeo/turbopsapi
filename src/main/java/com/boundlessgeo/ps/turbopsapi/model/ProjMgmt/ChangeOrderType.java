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
 *
 */
@AllArgsConstructor
@ToString
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ChangeOrderType {
	SCOPE("Scope"), COST("Cost"), POP("PoP");

	@Getter
	private final String changeOrderType;
}
