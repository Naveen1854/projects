package controller;

import dao.PersonDao;
import dto.Person;

public class SavePerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.setPersonId(4);
		p.setPersonName("Pavan kalyan");
		p.setPersonAge(45);
		p.setPersonAddress("Tamilnadu");
		p.setPersonPhone(123456);
		
		PersonDao pdao = new PersonDao();
		pdao.savePerson(p);
				
	}

}
