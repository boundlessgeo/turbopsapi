/**
 *
 */
package com.boundlessgeo.ps.turbopsapi.repositories.ProjMgmt;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.boundlessgeo.ps.turbopsapi.model.ProjMgmt.ProjectManager;

/**
 * @author ssengupta
 *
 */
@RepositoryRestResource
public interface ProjectManagerRepository
extends PagingAndSortingRepository<ProjectManager, Long> {

}
