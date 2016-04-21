package com.codeclan.md;

import org.junit.*;
import static org.junit.Assert.*;


public class ProjectTest {
	
	@Test
	public void testName(){
		Project p = new Project();
		p.setName("Java");
		assertEquals("Java", p.getName());
	}
	
	@Test
	public void testGrade(){
		Project p = new Project();
		p.setGrade(95.21);
		assertEquals( "95.21", p.getGrade());
	}

}
