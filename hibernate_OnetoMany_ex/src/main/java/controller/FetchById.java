package controller;

import dao.SchoolDao;

public class FetchById {

	public static void main(String[] args) {
		SchoolDao schoolDao = new SchoolDao();
		schoolDao.fetchById(1);
	}
}
