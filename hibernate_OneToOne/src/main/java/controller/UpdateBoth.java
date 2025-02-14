package controller;

import dao.PersonDao;
import dto.AadharCard;
import dto.Person;

public class UpdateBoth {

	public static void main(String[] args) {
		
		Person newPerson = new Person();
		newPerson.setPersonName("Charan");
		newPerson.setPersonAge(28);
		newPerson.setPersonAddress("Delhi");
		newPerson.setPersonPhone(94904541);
		
		AadharCard newAadharCard = new AadharCard();
		newAadharCard.setAadharNumber(234567243l);
		newAadharCard.setAadharauthority("GOI");
		
		newPerson.setAadharCard(newAadharCard);
		
		PersonDao personDao = new PersonDao();
		personDao.updateBoth(2, newPerson);

	}

}
