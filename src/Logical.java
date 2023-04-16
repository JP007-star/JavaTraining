public class Logical {
    public static void main(String[]args){
        boolean hasAccount=true;
        boolean isLoggedIn=false;
        boolean hasPaid=false;

        boolean gmaillogin= true;
        boolean fblogin=true;
        boolean email=false;

        System.out.println(hasAccount && isLoggedIn && hasPaid);
        System.out.println(gmaillogin || fblogin || email);
        System.out.println(!email);


    }
}
