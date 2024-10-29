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
		Teacher historyTeacher = new Teacher("Xenofont Abramovich");
		Teacher russianTeacher = new Teacher("Maria Petrovna");
		Teacher biologyTeacher = new Teacher("Elena Dmitrievna");
		
		Exam mathExam = new Exam(mathTeacher, "Math exam");
		Exam infExam = new Exam(infTeacher, "Informatics exam");
		Exam physExam = new Exam(physicsTeacher, "Physics exam");
		Exam histExam = new Exam(historyTeacher, "History exam");
		Exam rusExam = new Exam(russianTeacher, "Russian exam");
		Exam bioExam = new Exam(biologyTeacher, "Biology exam");
		
		ArrayList<Exam> ammExamList = new ArrayList<>();
		ammExamList.add(infExam);
		ammExamList.add(mathExam);
		ammExamList.add(rusExam);
		
		ArrayList<Exam> fknExamList = new ArrayList<>();
		fknExamList.add(physExam);
		fknExamList.add(mathExam);
		fknExamList.add(rusExam);
		
		ArrayList<Exam> histExamList = new ArrayList<>();
		histExamList.add(histExam);
		histExamList.add(rusExam);
		
		ArrayList<Exam> bioExamList = new ArrayList<>();
		bioExamList.add(bioExam);
		bioExamList.add(rusExam);
		bioExamList.add(mathExam);
		
		Department AMMDepartmant = new Department("amm department", ammExamList);
		Department FKNDepartmant = new Department("fkn departmant", fknExamList);
		Department HistoryDepartmant = new Department("history departmant", histExamList);
		Department BiologyDepartmant = new Department("biology departmant", bioExamList);
		
		Applicant app1 = new Applicant("ivan ivanov");
		app1.addDepartment(FKNDepartmant);
		app1.addDepartment(AMMDepartmant);
		app1.addDepartment(BiologyDepartmant);
		Applicant app2 = new Applicant("petr petrov");
		app2.addDepartment(FKNDepartmant);
		app2.addDepartment(HistoryDepartmant);
		Applicant app3 = new Applicant("luda ludina");
		app3.addDepartment(AMMDepartmant);
		app3.addDepartment(HistoryDepartmant);
		app3.addDepartment(BiologyDepartmant);
		Applicant app4 = new Applicant("sofia popova");
		app4.addDepartment(AMMDepartmant);
		app4.addDepartment(HistoryDepartmant);
		
		app1.passExams();
		app2.passExams();
		app3.passExams();
		app4.passExams();
		
		RankingService.rankApplicants(AMMDepartmant, 2);
		RankingService.rankApplicants(FKNDepartmant, 2);
		RankingService.rankApplicants(BiologyDepartmant, 2);
		RankingService.rankApplicants(HistoryDepartmant, 2);
		
		app1.resultOFExams();
		app2.resultOFExams();
		app3.resultOFExams();
		app4.resultOFExams();	
		
	}

}
