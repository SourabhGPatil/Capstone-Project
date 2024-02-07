package com.restapiproject.TopJobs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapiproject.TopJobs.entities.resumeData;

//<resumeData, Integer> --> resumeData is the Entity file while Integer is the datatype of the PK
public interface resumeDAO extends JpaRepository<resumeData, Integer>{

}
