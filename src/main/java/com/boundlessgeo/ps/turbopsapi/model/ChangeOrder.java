/**
 *
 */
package com.boundlessgeo.ps.turbopsapi.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class ChangeOrder extends AuditableObject {
	@Getter
	@Setter
	private String initiatedBy;

	@Getter
	@Setter
	private String reason;

	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private ChangeOrderType changeOrderType;

	@Getter
	@Setter
	private long cost;

	// TODO: Need to check ChangeOrder JSON serialization
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
