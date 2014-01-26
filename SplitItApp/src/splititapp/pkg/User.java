package splititapp.pkg;

public class User {
	private String name;
	private String pword;
	public User(String n, String p) {
		name = n;
		pword = p;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return pword;
	}
	public void setName(String n) {
		name = n;
	}
	public void setPassword(String p) {
		pword = p;
	}
	
	public String toString() {
		String str = "Username: "+ name + "\n" + "Password: " + pword;
		return str;
	}
}
