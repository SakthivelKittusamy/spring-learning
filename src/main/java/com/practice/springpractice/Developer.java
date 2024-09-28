package com.practice.springpractice;

public class Developer {

	private int projectId;
	
	private Computer computer;

	private Tester tester;

	// for constructor injection
	public Developer(Tester tester) {
		System.out.println("for constructor injection");
		this.tester = tester;
	}

	public Developer(int projectId) {
		this.projectId = projectId;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

//	for setter injection
	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public Tester getTester() {
		return tester;
	}

	public void setTester(Tester tester) {
		this.tester = tester;
	}

	public void develop() {
		System.out.println("develop...");
		tester.test();
	}

}
