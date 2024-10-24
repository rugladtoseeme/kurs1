package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.Applicant;
import model.Department;

public class RankingService {

	public static void rankApplicants(Department department, int numberOfPassed)
	{
		Collections.sort(department.getApplicantList(), new Comparator<Applicant>() {
			public int compare(Applicant o1, Applicant o2) {
				return o2.getGPA(department).compareTo(o1.getGPA(department));
			}
		});
		
		int counter = 0;
		for (Applicant app: department.getApplicantList())
		{
			if (counter == numberOfPassed)
				break;
			app.setEnteredExam(department, true);
			counter++;
		}
	}
}
