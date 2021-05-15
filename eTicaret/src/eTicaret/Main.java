package eTicaret;

import eTicaret.business.abstracts.UserService;
import eTicaret.business.concretes.UserManager;
import eTicaret.business.concretes.UserValManager;
import eTicaret.dataAccess.concretes.UserDao;
import eTicaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User kisi=new User(1,"percem@gmail.com","percem12","Ümmühan","Perçem");
		UserService services=new UserManager(new UserDao(),new UserValManager());
		services.signup(kisi);
		
	}

}
