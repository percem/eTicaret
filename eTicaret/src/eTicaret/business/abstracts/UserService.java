package eTicaret.business.abstracts;

import eTicaret.entities.concretes.User;

public interface UserService {
	void signup(User user); //yeni �ye
	boolean login(String email, String password);
}
