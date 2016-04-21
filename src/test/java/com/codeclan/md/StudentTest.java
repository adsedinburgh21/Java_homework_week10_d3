package com.codeclan.md;

import org.junit.*;
import static org.junit.Assert.*;

public class StudentTest {

	Project p1;
	Project p2;
	Project p3;
	Student s;
	
	@Before
	public void setup(){
		p1 = new Project();
		p1.setName("Java");
		p1.setGrade(34.62);
		
		p2 = new Project();
		p2.setName("Ruby");
		p2.setGrade(64.59);
		
		p3 = new Project();
		p3.setName("JavaScript");
		p3.setGrade(88.43);
		
		s = new Student();
		s.addProject(p1);
		s.addProject(p2);
		s.addProject(p3);	
	}
	
	@Test
	public void testGrade(){
		s.calculateGrade();
		assertEquals( "62.55", s.getOverallGrade());
	}
	
}
