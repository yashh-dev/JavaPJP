package com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import com.mile1.bean.*;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
import com.mile1.exception.*;

public class TestAll{
	Student[] s=new Student[10];	
	String[] expectedgrades;
	@Before
	public void init() {
			
		s [0] =new Student ("A1", new int [] {72,73,74});
		s [1] =new Student ("B1", new int [] {75,76,77});
		s [2] =new Student ("C1", new int [] {99,99,99});
		s [3] =new Student ("C3", new int [] {100,100,99});
		s [4] =new Student ("B2", new int [] {13,88,13});
		s[5] =new Student ("C3", new int [] {14,14,99});
		s [6] =new Student ("A2", new int [] {77,55,12});
		s [7] =new Student (null, new int [] {13,88,13});
		s [8] =new Student ("A2", null);
		s[9]=null;
		// this is invalid object --so no grade calculations [9] =null;// this is invalid object –so no grade calculation 
		expectedgrades =new String [] {"A","A","A+","A+","F","F","F","F"};
	}
    @Test
    public void TC1() {
    	assertEquals(expectedgrades[2],StudentReport.findGrade(s[2]));
    }
    @Test
    public void TC2() {
    	assertEquals(expectedgrades[5],StudentReport.findGrade(s[5]));
    }
    @Test(expected=NullStudentException.class)
    public void TC3() throws NullStudentException, NullNameException, NullMarksArrayException {
    	StudentReport.validate(s[9]);
    }
    @Test(expected=NullNameException.class)
    public void TC4() throws NullNameException, NullStudentException, NullMarksArrayException{
    	StudentReport.validate(s[7]);
    }
    @Test(expected=NullMarksArrayException.class)
    public void TC5() throws NullNameException, NullStudentException, NullMarksArrayException{
    	StudentReport.validate(s[8]);
    }
    @Test
    public void TC6() {
    	assertEquals(1,StudentService.findNumberOfNullNames(s));
    }
    @Test
    public void TC7() {
    	assertEquals(1,StudentService.findNumberOfNullObjects(s));
    }
    @Test
    public void TC8() {
    	assertEquals(1,StudentService.findNumberOfNullMarks(s));	
    }
}
