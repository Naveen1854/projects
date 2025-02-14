package controller;

import dao.PersonDao;

public class FetchAll {

	public static void main(String[] args) {
		PersonDao pdao = new PersonDao();
		pdao.fetchAll();
	}

}
