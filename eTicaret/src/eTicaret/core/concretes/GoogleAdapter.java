package eTicaret.core.concretes;

import eTicaret.core.abstracts.GoogleService;
import eTicaret.dataAccess.concretes.UserDao;
import eTicaret.entities.concretes.User;

public class GoogleAdapter implements GoogleService {
	GoogleManager google=new GoogleManager();
	private UserDao _userDao;
	public GoogleAdapter(UserDao _userDao) {
		super();
		this._userDao = _userDao;
	}
	@Override
	public void signUp(String email) {
		for (User users : _userDao.getAll()) {
			if (users.getEmail()==email) {
				System.out.println("Email mevcut");
				return;
			} else {
				google.googleSign(email);
			}
		}
	}

}
