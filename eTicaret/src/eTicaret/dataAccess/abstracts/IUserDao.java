package eTicaret.dataAccess.abstracts;

import java.util.List;

import eTicaret.entities.concretes.User;

public interface IUserDao {
	void login(User user); //oturum aç
	void signup(User user); //üye ol
	
	User get(int id); //Verilen id ile oluþturulan hesap bulunsun
	List<User> getAll(); //Tüm kullanýcýlar getirilsin
}
