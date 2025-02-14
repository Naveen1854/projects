package controller;

import dao.CompanyDao;

public class FetchById {

	public static void main(String[] args) {
		
		CompanyDao companyDao = new CompanyDao();
		companyDao.fetchById(1);
	}

}
