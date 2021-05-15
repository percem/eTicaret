package eTicaret.business.concretes;

import eTicaret.business.abstracts.UserValService;



public class UserValManager implements UserValService{
	
	@Override
	public boolean name(String name) {
		if (name.length()<2) {
			System.out.println("�stenilen uzunlukta de�il!");
			return false;
		} else if (name.isEmpty()) {
			System.out.println("Zorunlu alan!");
			return false;
		} else {
			System.out.println("�sim do�ruland�!");
			return true;
		}
		
	}

	@Override
	public boolean lastName(String lastName) {
		if (lastName.length()<2) {
			System.out.println("�stenilen uzunlukta de�il!");
			return false;
		} else if (lastName.isEmpty()) {
			System.out.println("Zorunlu alan!");
			return false;
		} else {
			System.out.println("Soyisim do�ruland�!");
			return true;
		}
	}

	@Override
	public boolean email(String email) {
		if (!EMailValidator.isEmailValid(email)) {
			System.out.println("�stenilen formatta de�il!");
			return false;
		} else {
			System.out.println("Email adresi do�ruland�!");
			return true;
		}
		
	}

	@Override
	public boolean pass(String password) {
		if (password.length()<6) {
			System.out.println("�stenilen uzunlukta de�il!");
			return false;
		} else if (password.isEmpty()) {
			System.out.println("Zorunlu alan!");
			return false;
		} else {
			System.out.println("�ifre do�ruland�!");
			return true;
		}
	}

}