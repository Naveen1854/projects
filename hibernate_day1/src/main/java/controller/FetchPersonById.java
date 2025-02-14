package controller;

import dao.PersonDao;

public class FetchPersonById {

	public static void main(String[] args) {
		
		PersonDao pdao = new PersonDao();
		pdao.fetchPersonId(1);

	}

}
