package controller;

import dao.PersonDao;
import dto.AadharCard;
import dto.Person;

public class SaveBoth {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setPersonName("Ganesh");
		person.setPersonAge(20);
		person.setPersonAddress("hnk");
		person.setPersonPhone(543898765);
		
		AadharCard aadharCard = new AadharCard();
		aadharCard.setAadharNumber(234876523l);
		aadharCard.setAadharauthority("GOI");
		
		person.setAadharCard(aadharCard);
		
//		PersonDao personDao = new PersonDao();
//		personDao.saveBoth(person);
		
	}

}
