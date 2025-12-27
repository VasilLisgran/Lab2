import java.util.Scanner;

public class Lab2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scanner.nextLine();
        char character = str.charAt(0);
        str = str.replace(str.charAt(0), '0');

        int number = Integer.parseInt(str);

        int intRepresentation = (int)(character);
        String result = "";
        result += character;

        for (int i = 0; i < number-1; i++) {
            if (i % 2 == 0) {
                intRepresentation += 33;
                if(intRepresentation == 91 || intRepresentation == 123){
                    intRepresentation = 97;
                }
            }
            else {
                intRepresentation -= 31;
                if(intRepresentation == 91 || intRepresentation == 123){
                    intRepresentation = 65;
                }
            }


            char ch = (char) (intRepresentation);
            result += ch;
        }


        System.out.println(result);
    }
}
