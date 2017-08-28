/**
 *
 */
package com.boundlessgeo.ps.turbopsapi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * TODO: This class should probably be replaced by an object representing a
 * "user". If replacement is not an option due to the 1:M mapping, this class
 * should contain a reference to the "user" object.
 *
 * @author ssengupta
 */
@SuppressWarnings("serial")
@Entity
@ToString(includeFieldNames = true, exclude = "projects")
public class ProjectManager extends AuditableObject {

	@Getter
	@Setter
	private String firstName;

	@Getter
	@Setter
	private String lastName;

	@Getter
	@Setter
	private String email;

	@Getter
	@Setter
	@OneToMany(mappedBy = "projectManager", cascade = CascadeType.ALL)
	private List<Project> projects;
}
