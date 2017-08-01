/**
 *
 */
package com.boundlessgeo.ps.turbopsapi.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.boundlessgeo.ps.turbopsapi.model.Project;

/**
 * @author ssengupta
 */
public interface ProjectRepository
		extends PagingAndSortingRepository<Project, Long> {

	List<Project> findByName(@Param("name") String name);

	List<Project> findByMavenLinkId(@Param("mlid") String mlid);

}
