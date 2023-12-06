public class TestClass {
    public static void main(String[] args) {
        String check = "";
        String pass = "Hello1234";
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
        System.out.println(valid);
    }
}
