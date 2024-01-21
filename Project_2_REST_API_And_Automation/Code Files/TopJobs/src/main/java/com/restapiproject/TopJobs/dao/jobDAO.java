package com.restapiproject.TopJobs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapiproject.TopJobs.entities.jobData;

//<jobData, Integer> --> jobData is the Entity file while Integer is the datatype of the PK
public interface jobDAO extends JpaRepository<jobData, Integer> {

}
