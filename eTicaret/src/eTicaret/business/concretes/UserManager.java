package eTicaret.business.concretes;

import eTicaret.business.abstracts.UserService;
import eTicaret.business.abstracts.UserValService;
import eTicaret.dataAccess.abstracts.IUserDao;
import eTicaret.entities.concretes.User;

public class UserManager implements UserService{
	private IUserDao _userDao;
	private UserValService valService;
	
	
	public UserManager(IUserDao _userDao, UserValService valService) {
		super();
		this._userDao = _userDao;
		this.valService = valService;
	}

	@Override
	public void signup(User user) {
		if (valService.name(user.getName()) && valService.lastName(user.getLastName()) 
				&& valService.email(user.getEmail()) && valService.pass(user.getPassword())) {
			System.out.println("Kayýt Baþarýlý");
			_userDao.login(user);
			return;
		} else {

		}
	}

	@Override
	public boolean login(String email, String password) {
		for (User users : _userDao.getAll()) {
			if (users.getEmail()==email && users.getPassword()==password) {
				_userDao.login(users);
				System.out.println("Griþ Baþarýlý");
				return true;
			} else {
				System.out.println("Yeniden Deneyiniz!");
				
			}
		}
		return false;
		
	}

}
