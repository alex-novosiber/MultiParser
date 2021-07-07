import java.util.Scanner;

public class Testing {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine();
        String[] substring = temp.split("\\s");
        for (int i = 0; i < substring.length; i++) {
            System.out.println(substring[i]);
        }


    }
}