/**
 *
 */
package com.boundlessgeo.ps.turbopsapi.repositories.ProjMgmt;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.boundlessgeo.ps.turbopsapi.model.ProjMgmt.Project;

/**
 * @author ssengupta
 */
@RepositoryRestResource
public interface ProjectRepository
extends PagingAndSortingRepository<Project, Long> {

	List<Project> findByName(@Param("name") String name);

}
