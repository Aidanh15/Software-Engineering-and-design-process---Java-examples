

public class TestPrototypePattern {

	public static void main(String[] args) {
		AccessControl userAccessControl = AccessControlProvider.getAccessControlObject("USER");
		User user1 = new User("User A", "USER Level", userAccessControl);
		
		System.out.println("************************************");
		System.out.println(user1);
		
		userAccessControl = AccessControlProvider.getAccessControlObject("USER");
		user user2 = new User("User B", "USER Level", userAccessControl);
		System.out.println("Changing access control of: "+user.getUserName());
		user.getAccessControl().setAccess("READ REPORTS");
		System.out.println(user2);
		
		System.out.println("************************************");
		
		AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
		user user3 = new User("User C", "MANAGER Level", managerAccessControl);
		System.out.println(user3);
		
		AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
		user user4 = new User("User D", "SUPERUSER Level", managerAccessControl);
		System.out.println(user4);
	
		ArrayList<User> catalogue1 new ArrayList<USer>();
		catalogue1.add(user1);
		catalogue1.add(user2);
		catalogue1.add(user3);
		catalogue1.add(user4);
		System.out.println(catalogue1.get(0));
		
		for (int)
	}
	
	
	
	
}
