package model;

public abstract class Person {
	
	public Person(String fio) {
		this.fio = fio;
	}

	private String fio;
	
	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

}
