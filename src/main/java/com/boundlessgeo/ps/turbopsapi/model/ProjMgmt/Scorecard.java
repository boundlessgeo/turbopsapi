package com.boundlessgeo.ps.turbopsapi.model.ProjMgmt;

import java.util.Date;

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

@SuppressWarnings("serial")
@Entity
@ToString(includeFieldNames = true, exclude = "project")
public class Scorecard extends AuditableObject {
	@Getter
	@Setter
	private Date forMonthYear;

	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private Status scopeStatus;

	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private Trend scopeTrend;

	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private Status budgetStatus;

	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private Trend budgetTrend;

	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private Status resourceStatus;

	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private Trend resourceTrend;

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
}
