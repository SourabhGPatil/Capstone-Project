package com.restapiproject.TopJobs.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapiproject.TopJobs.entities.jobData;
import com.restapiproject.TopJobs.entities.resumeData;
import com.restapiproject.TopJobs.services.jobService;
import com.restapiproject.TopJobs.services.resumeService;

@RestController
//@RequestMapping("/job")
public class Controller {
	
	@Autowired
	jobService jobservice;
	
	@Autowired
	resumeService resumeservice;
	
	@GetMapping("/demo")
	public String demo() {
		return "Works fine.";
	}
	
	//-------JOB TABLE------//
	//GET ALL aka RETRIEVE ALL
	@GetMapping("/job")
	public List<jobData> getJob(){
		return jobservice.listAllJobs();
	}
	
	//GET BY ID aka RETRIEVE BY ID
	@GetMapping("/job/{JobID}")
	public ResponseEntity<jobData> getJob(@PathVariable Integer JobID) {
		try {
			//Object of the JOB Entity Class
			jobData job = jobservice.getJob(JobID);
			return new ResponseEntity<jobData>(job, HttpStatus.OK);
		}
		catch (NoSuchElementException e) {
			return new ResponseEntity<jobData>(HttpStatus.NOT_FOUND);
		}
	}
	
	//POST aka CREATE
	@PostMapping("/job/")
	public jobData addJob(@RequestBody jobData job)
	{
		jobservice.saveJob(job);
		return job;
	}
	
	//PUT aka UPDATE
	@PutMapping("/job/{JobID}")
	public ResponseEntity<?> updateJob(@RequestBody jobData job, @PathVariable Integer JobID) {
		try {
			jobData existJob = jobservice.getJob(JobID);
			job.setJobID(JobID);
			jobservice.saveJob(job);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//DELETE
	@DeleteMapping("/job/{JobID}")
	public void deleteJob(@PathVariable Integer JobID) {
		jobservice.deleteJob(JobID);
	}
	
	
	
	//-------RESUME TABLE------//
	//GET ALL aka RETRIEVE ALL
	@GetMapping("/resume")
	public List<resumeData> getResume(){
		return resumeservice.listAllResumes();
	}
	
	//GET BY ID aka RETRIEVE BY ID
	@GetMapping("/resume/{ApplicantID}")
	public ResponseEntity<resumeData> getResume(@PathVariable Integer ApplicantID) {
		try {
			//Object of the JOB Entity Class
			resumeData resume = resumeservice.getResume(ApplicantID);
			return new ResponseEntity<resumeData>(resume, HttpStatus.OK);
		}
		catch (NoSuchElementException e) {
			return new ResponseEntity<resumeData>(HttpStatus.NOT_FOUND);
		}
	}
	
	//POST aka CREATE
	@PostMapping("/resume/")
	public void addResume(@RequestBody resumeData resume)
	{
		resumeservice.saveResume(resume);
	}
	
	//PUT aka UPDATE
	@PutMapping("/resume/{ApplicantID}")
	public ResponseEntity<?> updateResume(@RequestBody resumeData resume, @PathVariable Integer ApplicantID) {
		try {
			resumeData existResume = resumeservice.getResume(ApplicantID);
			resume.setApplicantID(ApplicantID);
			resumeservice.saveResume(resume);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//DELETE
	@DeleteMapping("/resume/{ApplicantID}")
	public void deleteResume(@PathVariable Integer ApplicantID) {
		resumeservice.deleteResume(ApplicantID);
	}
	
	

	
	

}