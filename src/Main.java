import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "";
        int goodCount = 0;
        boolean valid = false;
        String upper = "";



        do {
            System.out.println("Enter your password: ");
            if(scan.hasNextLine()){
                password = scan.nextLine();
            }else{
                System.out.println("Your input is invalid");
            }
            if(password.length() >= 12){
                goodCount += 1;
            }else{
                System.out.println("Your password needs to be atleast 12 character.");
            }
            String lower = lowercaseCheck(scan, password);
            if(lower.equals("true")){
                goodCount += 1;
            }else{
                System.out.println("Your password should include a lowercase letter. ");
            }
            upper = uppercaseCheck(scan, password);
            if(upper.equals("true")){
                goodCount += 1;
            }else{
                System.out.println("Your password needs to include an uppercase letter.");
            }
            String number = numberCheck(scan, password);
            if(number.equals("true")){
                goodCount += 1;
            }else{
                System.out.println("Your password needs to atleast one number.");
            }

        }while (!valid);
    }
    public static String uppercaseCheck(Scanner in, String pass){
        String check = "";
        boolean valid = false;
        String validS = "";

        for (int i = 0; i < pass.length(); i++) {
            check = pass.substring(i, i + 1);
            if (check.matches("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]")) {
                valid = true;
            }
        }
        if(valid){
            validS = "true";
        }else{
            validS = "false";
        }

        return validS;
    }
    public static String lowercaseCheck(Scanner in, String pass){
        String check = "";
        boolean valid = false;
        String validS = "";

        for (int i = 0; i < pass.length(); i++) {
            check = pass.substring(i, i + 1);
            if (check.matches("[abcdefghijklmnopqrstuvwxyz]")) {
                valid = true;
            }
        }
        if(valid){
            validS = "true";
        }else{
            validS = "false";
        }

        return validS;
    }
    public static String numberCheck(Scanner in, String pass){
        String check = "";
        boolean valid = false;
        String validS = "";

        for (int i = 0; i < pass.length(); i++) {
            check = pass.substring(i, i + 1);
            if (check.matches("[0123456789]")) {
                valid = true;
            }
        }
        if(valid){
            validS = "true";
        }else{
            validS = "false";
        }

        return validS;
    }
}