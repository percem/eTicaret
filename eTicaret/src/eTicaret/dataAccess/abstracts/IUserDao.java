package eTicaret.dataAccess.abstracts;

import java.util.List;

import eTicaret.entities.concretes.User;

public interface IUserDao {
	void login(User user); //oturum a�
	void signup(User user); //�ye ol
	
	User get(int id); //Verilen id ile olu�turulan hesap bulunsun
	List<User> getAll(); //T�m kullan�c�lar getirilsin
}
