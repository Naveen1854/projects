package controller;

import dao.PersonDao;

public class FetchPersonByAddress {

	public static void main(String[] args) {
		PersonDao pdao = new PersonDao();
		pdao.fetchPersonByAddress("bihar");

	}

}
