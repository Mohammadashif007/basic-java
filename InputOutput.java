import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name = sca.next();

        System.out.print("Enter Your Age : ");
        int age = sca.nextInt();

        System.out.println("Enter Your Height in meter : ");
        double height = sca.nextDouble();

        System.out.println("Your name is "+ name+".");
        System.out.println("Your age is "+ age);
        System.out.println("Your hight is "+ height);

    }
}
