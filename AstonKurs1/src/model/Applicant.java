package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Applicant extends Person{

	private ArrayList<Department> departmentList;
	
	private Double GPA;
	
	private Boolean isEntered;
	
	public Applicant(String fio, ArrayList<Department> departmentList) {
		super(fio);
		this.departmentList = departmentList;
		isEntered = false;
	}

	public ArrayList<Department> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(ArrayList<Department> departmentList) {
		this.departmentList = departmentList;
	}

	public Double getGPA() {
		return GPA;
	}

	public Boolean getIsEntered() {
		return isEntered;
	}

	public void setIsEntered(boolean isEntered) {
		this.isEntered = isEntered;
	}

	public void addDepartment(Department department)
	{
		departmentList.add(department);
	}

	@Override
	public String toString() {
		return "Applicant " + super.getFio() + ", wants to apply to departments: " + departmentList.toString();
	}
	
	public HashSet<Exam> examsToPass()
	{
		HashSet<Exam> exams = new HashSet<Exam>();
		for (Department dep: departmentList)
		{
			exams.addAll(dep.getExamList());
		}
		return exams;
	}
	
	public void passAllExams()
	{
		Integer marksSum = 0;
		HashSet<Exam> exams = examsToPass();
		
		for (Exam exam: exams)
		{
			marksSum += exam.passExam();
		}
		
		GPA = (marksSum * 1.)/exams.size();
	}
	
}
