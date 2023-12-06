import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "";
        int goodCount = 0;
        boolean valid = true;
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
                System.out.println("Your password needs to include a lowercase letter. ");
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
            String special = specialCharacterCheck(scan, password);
            if(special.equals("true")){
                goodCount += 1;
            }else{
                System.out.println("Your password needs to atleast one special character[!#$%].");
            }
            System.out.println();
            if(goodCount <= 2){
                System.out.println("Your password passed " + goodCount + "/5 tests.");
                System.out.println("Your password strength is weak.");
            }else if(goodCount == 3){
                System.out.println("Your password passed " + goodCount + "/5 tests.");
                System.out.println("Your password strength is medium.");
            }else if(goodCount == 4 || goodCount == 5){
                System.out.println("Your password passed " + goodCount + "/5 tests.");
                System.out.println("Your password strength is strong.");
            }
            String yn = Input_Helper.getYNConfirm(scan,"Would you like to check another password? [Y/N]");
            if(yn.equals("true")){
                valid = false;
            }
            goodCount = 0;
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
    public static String specialCharacterCheck(Scanner in, String pass){
        String check = "";
        boolean valid = false;
        String validS = "";

        for (int i = 0; i < pass.length(); i++) {
            check = pass.substring(i, i + 1);
            if (check.matches("[!#$%]")) {
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