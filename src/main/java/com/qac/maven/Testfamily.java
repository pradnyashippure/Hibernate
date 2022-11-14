package com.qac.maven;

import com.qac.maven.Entity.Familyinfo;
import com.qac.maven.dao.FamilyinfoDAO;

public class Testfamily {
	public static void main(String[] args) {
		FamilyinfoDAO familyinfoDAO = new FamilyinfoDAO();
        familyinfoDAO.getAll();
        
        Familyinfo f = new Familyinfo();
        f.setId(28);
        f.setName("Dinesh");
        f.setAge(26);
        f.setEmail("dinu34@gmail.com");
        
        Familyinfo f1 = new Familyinfo();
        f1.setId(25);
        f1.setName("Neha");
        f1.setAge(21);
        f1.setEmail("neha89@gmail.com");
        
        familyinfoDAO.save(f);
        familyinfoDAO.save(f1);
        familyinfoDAO.delete(f1);
        familyinfoDAO.update("praji00mail.com", 4);
        
        
     }
}
