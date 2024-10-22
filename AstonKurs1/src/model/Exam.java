package model;

public class Exam {

	private Teacher teacher;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Exam(Teacher teacher, String name) {
		this.teacher = teacher;
		this.name = name;
	}
	
	public Integer passExam()
	{
		return teacher.rateExam();
	}

	
	
}
