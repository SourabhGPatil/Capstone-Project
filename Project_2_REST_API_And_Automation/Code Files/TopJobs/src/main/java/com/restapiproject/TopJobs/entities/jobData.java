package com.restapiproject.TopJobs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job")
public class jobData {
	@Id
    @GeneratedValue
	private int JobID;
	private String EmployerID;
	private String EmployerName;
	private String JobTitle;
	private String Qualifications;
	private float Compensation;
	
	public jobData(int JobID, String EmployerID, String EmployerName, String JobTitle, String Qualifications, float Compensation)
	{
		super();
		this.JobID = JobID;
		this.EmployerID = EmployerID;
		this.EmployerName = EmployerName;
		this.JobTitle = JobTitle;
		this.Qualifications = Qualifications;
		this.Compensation = Compensation;
	}

	public jobData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getJobID() {
		return JobID;
	}

	public void setJobID(int jobID) {
		JobID = jobID;
	}

	public String getEmployerID() {
		return EmployerID;
	}

	public void setEmployerID(String employerID) {
		EmployerID = employerID;
	}

	public String getEmployerName() {
		return EmployerName;
	}

	public void setEmployerName(String employerName) {
		EmployerName = employerName;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}

	public String getQualifications() {
		return Qualifications;
	}

	public void setQualifications(String qualifications) {
		Qualifications = qualifications;
	}

	public float getCompensation() {
		return Compensation;
	}

	public void setCompensation(float compensation) {
		Compensation = compensation;
	}

	@Override
	public String toString() {
		return "jobData [JobID=" + JobID + ", EmployerID=" + EmployerID + ", EmployerName=" + EmployerName
				+ ", JobTitle=" + JobTitle + ", Qualifications=" + Qualifications + ", Compensation=" + Compensation
				+ "]";
	}
	
	


	
	
}



