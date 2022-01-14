package com.pm.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pm.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

	public Project findByProjectIdentifier(String projectIdentifier);
	
}