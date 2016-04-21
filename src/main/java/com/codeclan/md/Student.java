package com.codeclan.md;

import java.util.ArrayList;

public class Student extends User {
	
	private double overallGrade;
	private ArrayList<Project> projects;
	
	public Student(){
		super();
	}
	
	public double getOverallGrade(){
		return overallGrade;
	}
	
	public ArrayList<Project> getProjects(){
		return projects;
	}
	
	public boolean addProject(Project p){
		return projects.add(p);
	}
	
	public boolean removeProject(Project p){
		return projects.remove(p);
	}

	public double calculateGrade(){
		double total = 0;
		for( Project p : projects){
			total += p.getGrade();
		}
		total = (total/projects.size());
		overallGrade = total;
		return total;
	}
}
