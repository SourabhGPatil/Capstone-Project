package com.restapiproject.TopJobs.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapiproject.TopJobs.dao.jobDAO;
import com.restapiproject.TopJobs.entities.jobData;


@Service
@Transactional
public class jobService {
	@Autowired
	private jobDAO jobDao;
	
	//RETRIEVE
	public List<jobData> listAllJobs(){
		return jobDao.findAll();
	}
	
	//CREATE aka Save
	public void saveJob(jobData job) {
		jobDao.save(job);
	}
	
	//RETRIEVE BY ID
	public jobData getJob(int JobID) {
		return jobDao.findById(JobID).get();
	}
	
	//DELETE
	public void deleteJob(int JobID) {
		jobDao.deleteById(JobID);
	}

}
