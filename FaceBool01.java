class FaceBookOl
 {
   public static void main(String[] args)
 {
	System.out.println("Welcome to FaceBook");
	login("suryam.xworkz@gmail.com", "password123");
    login(4623262838938, "password456");
 }	
 public static void login( String emailId, String password)              // FaceBookOl class has a main method and two overloaded login methods.
 {
 System.out.println("Login with emialId");
 }
 public static void login( long phoneNumber, String password)
 {
 System.out.println("Login with phoneNumber");
  }	
 }