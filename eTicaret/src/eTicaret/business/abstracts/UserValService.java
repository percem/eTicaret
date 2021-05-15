package eTicaret.business.abstracts;

public interface UserValService {
	boolean name(String name);
	boolean lastName(String lastName);
	boolean email(String email);
	boolean pass(String password);
}
