package controller;

import dao.PersonDao;
import dto.Person;

public class UpdateaPersonById {

	public static void main(String[] args) {
		Person newPerson = new Person();
//		newPerson.setPersonId(5);
		newPerson.setPersonName("prabhas");
		newPerson.setPersonAge(48);
		newPerson.setPersonAddress("Andhra");
		newPerson.setPersonPhone(5678987);
		
		PersonDao pdao = new PersonDao();
		pdao.updatePersonById(5,newPerson);
	}

}
