package model;

import java.util.ArrayList;

public class Department {

	private String name;
	private ArrayList<Exam> examList;
	
	private ArrayList<Applicant> applicantList;
	
	public Department(String name, ArrayList<Exam> examList) {
		this.name = name;
		this.examList = examList;
		applicantList = new ArrayList<>();
	}

	public ArrayList<Applicant> getApplicantList() {
		return applicantList;
	}

	public void setApplicantList(ArrayList<Applicant> applicantList) {
		this.applicantList = applicantList;
	}
	
	public void addApplicant(Applicant applicant) {
		 applicantList.add(applicant);
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
	
	public Double passAllExams()
	{
		int sum  = 0;
		for (Exam ex: examList)
			sum+=ex.passExam();
		return sum*1./examList.size();

	}
		
}