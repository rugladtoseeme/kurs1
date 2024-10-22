package model;

import java.util.ArrayList;

public class Department {

	private String name;
	private ArrayList<Exam> examList;
	
	public Department(String name, ArrayList<Exam> examList) {
		this.name = name;
		this.examList = examList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Exam> getExamList() {
		return examList;
	}

	public void setExamList(ArrayList<Exam> examList) {
		this.examList = examList;
	}

	@Override
	public String toString() {
		return "to apply to " + name + "you need to pass: " + examList.toString();
	}
		
}