/**
 *
 */
package com.boundlessgeo.ps.turbopsapi.model.ProjMgmt;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class ConfigDoc extends AuditableObject {
	@Getter
	@Setter
	private String docName;

	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private ConfigDocType docType;

	@Getter
	@Setter
	private long version;

	// TODO: Probably should be replaced by an object representing "user".
	@Getter
	@Setter
	private String owner;

	@Getter
	@Setter
	private String location;

	// TODO: Need to check ConfigDoc JSON serialization
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
