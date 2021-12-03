import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        System.out.print("Please enter your height in meters: ");
        double height = sc.nextDouble();
        System.out.println("Your name: " + name);
        System.out.println("your age: " + age);
        System.out.println("Your height: " + height);    }
    }