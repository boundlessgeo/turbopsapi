/**
 *
 */
package com.boundlessgeo.ps.turbopsapi.model.ProjMgmt;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class ProjectNote extends AuditableObject {
	@Getter
	@Setter
	private String note;

	// TODO: Need to check ProjectNote JSON serialization
	// Seems like both the exclude in the @ToString above and the @JsonIgnore
	// below are needed for correct JSON serialization, otherwise stack
	// overflow errors will occur.
	@Getter
	@Setter
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PROJECT_ID")
	@JsonIgnore
	private Project project;
}
