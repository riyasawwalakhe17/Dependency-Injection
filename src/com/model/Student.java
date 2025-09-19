package com.model;

public class Student {

	int rollNo;
	String name;
	
	
	public Student(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public void m1() {
		System.out.println(rollNo);
		System.out.println(name);
	}
}
