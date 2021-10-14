package baitap;
import java.util.Scanner;
public class console_input {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = kb.nextInt();
        kb.nextLine();
        System.out.print("Enter your name: ");
        String name = kb.nextLine();
        System.out.println(name + ", you are " + age + " year old.");
        kb.close();
    }
}