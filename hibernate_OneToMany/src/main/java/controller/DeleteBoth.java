package controller;

import dao.CompanyDao;

public class DeleteBoth {

	public static void main(String[] args) {
		
		CompanyDao companyDao = new CompanyDao();
		companyDao.deleteBoth(3);
	}

}
