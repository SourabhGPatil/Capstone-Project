package com.restapiproject.TopJobs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resume")
public class resumeData {
	@Id
	@GeneratedValue
	private int ApplicantID;
	private String ApplicantName;
	private String JobID;
	private String EmployerName;
	private String EducationCompleted;
	private String Skills;
	private String PhoneNo;
	
	//Constructor
	public resumeData(int applicantID, String applicantName, String jobID, String employerName,
			String educationCompleted, String skills, String phoneNo) {
		super();
		this.ApplicantID = applicantID;
		this.ApplicantName = applicantName;
		this.JobID = jobID;
		this.EmployerName = employerName;
		this.EducationCompleted = educationCompleted;
		this.Skills = skills;
		this.PhoneNo = phoneNo;
	}
	
	//Constructor from Superclass
	public resumeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//--Getter and Setter Methods--//
	public int getApplicantID() {
		return ApplicantID;
	}

	public void setApplicantID(int applicantID) {
		ApplicantID = applicantID;
	}

	public String getApplicantName() {
		return ApplicantName;
	}

	public void setApplicantName(String applicantName) {
		ApplicantName = applicantName;
	}

	public String getJobID() {
		return JobID;
	}

	public void setJobID(String jobID) {
		JobID = jobID;
	}

	public String getEmployerName() {
		return EmployerName;
	}

	public void setEmployerName(String employerName) {
		EmployerName = employerName;
	}

	public String getEducationCompleted() {
		return EducationCompleted;
	}

	public void setEducationCompleted(String educationCompleted) {
		EducationCompleted = educationCompleted;
	}

	public String getSkills() {
		return Skills;
	}

	public void setSkills(String skills) {
		Skills = skills;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	//toString method
	@Override
	public String toString() {
		return "resumeData [ApplicantID=" + ApplicantID + ", ApplicantName=" + ApplicantName + ", JobID=" + JobID
				+ ", EmployerName=" + EmployerName + ", EducationCompleted=" + EducationCompleted + ", Skills=" + Skills
				+ ", PhoneNo=" + PhoneNo + "]";
	}
	
	
	
	
	
	
	
	
	
}




