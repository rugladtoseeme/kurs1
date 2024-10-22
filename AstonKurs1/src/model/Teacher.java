package model;

public class Teacher extends Person {

	
	public Teacher(String fio) {
		super(fio);
	}

	public int rateExam()
	{
		double val = Math.ceil(Math.random()*4+1);
		return (int)val;
	}
}
