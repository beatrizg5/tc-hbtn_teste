public class Person {
    public String checkUser(String user, String neilArms2){
        if(!user.matches("(?=.[}{,.^?~=+\\-_\\/\\-+.\\|])(?=.*[0-9]).{8,}"));
        return user;
    }

    public String checkPassword(String password){
         if(password.matches("(?=.[}{,.^?~=+\\-_\\/\\-+.\\|])(?=.[a-zA-Z])(?=.[0-9]).{8,}"));
        return password;
    }
}
