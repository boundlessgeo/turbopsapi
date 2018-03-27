/**
 *
 */
package com.boundlessgeo.ps.turbopsapi.model.ProjMgmt;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.boundlessgeo.ps.turbopsapi.model.AuditableObject;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ssengupta
 *
 */
@SuppressWarnings("serial")
@Entity
@ToString(includeFieldNames = true, exclude = "project")
public class Risk extends AuditableObject {

	@Getter
	@Setter
	private String riskName;

	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private RiskType riskType;

	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private RiskStatus riskStatus;

	@Getter
	@Setter
	private Double probability;

	@Getter
	@Setter
	private String impact;

	@Getter
	@Setter
	private String rating;

	// TODO: Probably should be replaced by an object representing "user".
	@Getter
	@Setter
	private String owner;

	// TODO: Need to check Risk JSON serialization
	// Seems like both the exclude in the @ToString above and the @JsonIgnore
	// below are needed for correct JSON serialization, otherwise stack
	// overflow errors will occur.
	@Getter
	@Setter
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PROJECT_ID")
	@JsonIgnore
	private Project project;

	@Getter
	@Setter
	@OneToMany(mappedBy = "risk", cascade = CascadeType.ALL)
	private List<Contingency> contingencies;
}
