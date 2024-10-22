package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.Applicant;

public class RankingService {

	public static void rankApplicants(ArrayList<Applicant> applicantsList, int numberOfPassed)
	{
		Collections.sort(applicantsList, new Comparator<Applicant>() {
			public int compare(Applicant o1, Applicant o2) {
				return o2.getGPA().compareTo(o1.getGPA());
			}
		});
		
		int counter = 0;
		for (Applicant app: applicantsList)
		{
			if (counter == numberOfPassed)
				break;
			app.setIsEntered(true);
			counter++;
		}
	}
}
