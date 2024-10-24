package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Applicant extends Person{

	private HashMap<Department, Double> departmentList;
	
	private HashMap<Department, Boolean> isEntered;
	
	public Applicant(String fio) {
		super(fio);
		this.departmentList = new HashMap<>();
		isEntered = new HashMap<>();
	}
	
	public Double getGPA(Department departmant)
	{
		return departmentList.get(departmant);
	}
	
	public Double setGPA(Department departmant, Double val)
	{
		return departmentList.put(departmant, val);
	}

	public HashMap<Department, Double> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(HashMap<Department, Double> departmentList) {
		this.departmentList = departmentList;
	}

	public HashMap<Department, Boolean> getIsEntered() {
		return isEntered;
	}

	public void setIsEntered(HashMap<Department, Boolean> isEntered) {
		this.isEntered = isEntered;
	}
	
	public void setEnteredExam(Department departmant, Boolean isEntered) {
		this.isEntered.put(departmant, isEntered);
	}

	public void addDepartment(Department department)
	{
		departmentList.put(department, 0.);
		isEntered.put(department, false);
		department.addApplicant(this);
	}

	@Override
	public String toString() {
		return "Applicant " + super.getFio() + ", wants to apply to departments: " + departmentList.toString();
	}
	
	public void resultOFExams() {
		System.out.println("Applicant " + super.getFio() + ", ");
		System.out.print("Marks: ");
		
		departmentList.forEach((k,v)->{
			System.out.print(k.getName() + ": DPA = ");
			System.out.print(v + ", ");
			});
		
		System.out.println("");
		isEntered.forEach((k,v)->{
			System.out.print(k.getName() + " - ");
			System.out.print(v?"entered, ":"not entered, ");
			});
		
		System.out.println("");
		System.out.println("");
	}
	
	public void passExams()
	{
		departmentList.forEach((k,v)->{
			v = k.passAllExams();
			setGPA(k, k.passAllExams());
			//setEnteredExam(k, );
			});
	}
	
}
