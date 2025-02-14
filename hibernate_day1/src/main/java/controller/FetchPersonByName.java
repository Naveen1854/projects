package controller;

import dao.PersonDao;

public class FetchPersonByName {

	public static void main(String[] args) {
		PersonDao pdao = new PersonDao();
		pdao.fetchPersonByName("Ram Charan");

	}

}
