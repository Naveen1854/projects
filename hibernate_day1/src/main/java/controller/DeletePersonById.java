package controller;

import dao.PersonDao;

public class DeletePersonById {

	public static void main(String[] args) {
		PersonDao pdao = new PersonDao();
		pdao.deletePersonById(1);

	}
}
