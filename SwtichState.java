package CodeWithMosh;

public class SwtichState {
    public static void main(String[] args){
        String role = "moderator";

        switch(role) {
            case "admin":
                System.out.println("You're an admin");
                break;

            case "moderator":
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a guest");
        }

//        Using IF statement
//        if (role == "admin"){
//            System.out.println("You're an admin");
//        } else if (role == "moderator"){
//            System.out.println("You're a moderator");
//        } else {
//            System.out.println("You're a guest");
//        }
    }
}
