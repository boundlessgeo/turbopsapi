/**
 *
 */
package com.boundlessgeo.ps.turbopsapi.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ssengupta
 */
@SuppressWarnings("serial")
@Entity
@ToString(includeFieldNames = true, exclude = "risk")
public class Contingency extends AuditableObject {

	@Getter
	@Setter
	private String trigger;

	@Getter
	@Setter
	private String description;

	// TODO: Need to check Contingency JSON serialization
	// Seems like both the exclude in the @ToString above and the @JsonIgnore
	// below are needed for correct JSON serialization, otherwise stack
	// overflow errors will occur.
	@Getter
	@Setter
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "RISK_ID")
	@JsonIgnore
	private Risk risk;
}
