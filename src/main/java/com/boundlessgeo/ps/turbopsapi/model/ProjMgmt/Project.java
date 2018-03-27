/**
 *
 */
package com.boundlessgeo.ps.turbopsapi.model.ProjMgmt;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.boundlessgeo.ps.turbopsapi.model.AuditableObject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ssengupta
 */
@SuppressWarnings("serial")
@Entity
@ToString(includeFieldNames = true)
public class Project extends AuditableObject {

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private String periodOfPerformance;

	@Getter
	@Setter
	private String description;

	@Getter
	@Setter
	private long budget;

	// TODO: Change to ProgramManager class when ready or use an "user" object
	@Getter
	@Setter
	private String programManager;

	// TODO: Change to class if necessary
	@Getter
	@Setter
	private String props;
	
	@Getter
	@Setter
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date startDate;
	
	@Getter
	@Setter
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date projectedEndDate;

	@Getter
	@Setter
	@OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
	private List<Risk> risks;

	@Getter
	@Setter
	@OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
	private List<ConfigDoc> configDocs;

	@Getter
	@Setter
	@OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
	private List<Scorecard> scoreCards;

	@Getter
	@Setter
	@OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
	private List<ChangeOrder> changeOrders;

	@Getter
	@Setter
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PM_ID")
	private ProjectManager projectManager;
}
