package app;

import java.util.ArrayList;
import java.util.HashMap;

import model.Applicant;
import model.Department;
import model.Exam;
import model.Teacher;
import service.RankingService;

public class Main {

	public static void main(String[] args) {

		Teacher mathTeacher = new Teacher("Anna Ivanovna");
		Teacher infTeacher = new Teacher("Roman Grigorievich");
		Teacher physicsTeacher = new Teacher("Alexander Petrovich");
		
		Exam mathExam = new Exam(mathTeacher, "Math exam");
		Exam infExam = new Exam(infTeacher, "Informatics exam");
		Exam physExam = new Exam(physicsTeacher, "Physics exam");
		
		ArrayList<Exam> ammExamList = new ArrayList<>();
		ammExamList.add(infExam);
		ammExamList.add(mathExam);
		
		ArrayList<Exam> fknExamList = new ArrayList<>();
		fknExamList.add(physExam);
		fknExamList.add(mathExam);
		
		Department AMMDepartmant = new Department("amm department", ammExamList);
		Department FKNDepartmant = new Department("fkn departmant", fknExamList);
		
		Applicant app1 = new Applicant("ivan ivanov", new ArrayList<>());
		app1.addDepartment(FKNDepartmant);
		app1.addDepartment(AMMDepartmant);
		Applicant app2 = new Applicant("petr petrov", new ArrayList<>());
		app2.addDepartment(FKNDepartmant);
		Applicant app3 = new Applicant("luda ludina", new ArrayList<>());
		app3.addDepartment(AMMDepartmant);
		
		app1.passAllExams();
		app2.passAllExams();
		app3.passAllExams();
		
//		System.out.print(app1.getFio() + " GPA: " + app1.getGPA());
//		System.out.println("");
//		
//		System.out.print(app2.getFio() + " GPA: " + app2.getGPA());
//		System.out.println("");
//		
//		System.out.print(app3.getFio() + " GPA: " + app3.getGPA());
//		System.out.println("");
		
		ArrayList<Applicant> appList = new ArrayList<>();
		appList.add(app1);
		appList.add(app2);
		appList.add(app3);
		
		RankingService.rankApplicants(appList, 2);
		
		System.out.print(app1.getFio() + " GPA: " + app1.getGPA() + " passed:" + app1.getIsEntered());
		System.out.println("");
		
		System.out.print(app2.getFio() + " GPA: " + app2.getGPA() + " passed:" + app2.getIsEntered());
		System.out.println("");
		
		System.out.print(app3.getFio() + " GPA: " + app3.getGPA() + " passed:" + app3.getIsEntered());
		System.out.println("");
		
		
	}

}
