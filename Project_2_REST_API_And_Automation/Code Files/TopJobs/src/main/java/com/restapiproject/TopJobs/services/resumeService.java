package com.restapiproject.TopJobs.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapiproject.TopJobs.dao.resumeDAO;
import com.restapiproject.TopJobs.entities.resumeData;

@Service
@Transactional
public class resumeService {
	@Autowired
	private resumeDAO resumeDao;
	
	//RETRIEVE
	public List<resumeData> listAllResumes(){
		return resumeDao.findAll();
	}
	
	//CREATE aka Save
	public void saveResume(resumeData resume) {
		resumeDao.save(resume);
	}
	
	//RETRIEVE BY ID
	public resumeData getResume(int ApplicantID) {
		return resumeDao.findById(ApplicantID).get();
	}
	
	//DELETE
	public void deleteResume(int ApplicantID) {
		resumeDao.deleteById(ApplicantID);
	}

}
