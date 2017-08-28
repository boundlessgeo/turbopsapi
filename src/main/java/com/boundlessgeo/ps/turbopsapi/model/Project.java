/**
 *
 */
package com.boundlessgeo.ps.turbopsapi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	private long periodOfPerformance;

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
