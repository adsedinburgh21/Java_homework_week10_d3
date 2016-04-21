package com.codeclan.md;

import java.sql.Date;
import java.util.ArrayList;

public class Module {
	
	private Tutor tutor;
	private String name;
	private Date startDate;
	private ArrayList<Student> students;
	
	
	public Tutor getTutor() {
		return tutor;
	}
	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}


}
