// public class First {
//     public static void main(String args[] ) {
//         System.out.println("Hello USa");
//     }
// }

import java.util.Scanner;

public class First {

     public static void main(String[] args){
        Scanner sca = new Scanner(System.in);

        System.out.print("Enter Your Name :");
        String name = sca.nextLine();

        System.out.print("Enter Your Age : ");
        int age = sca.nextInt();

        System.out.print("Enter Your Height in Meter :");
        double height = sca.nextDouble();

        //! Output the collected data

        System.out.println("My name is "+ name + ".");
        System.out.println("I am "+ age + " years old.");
        System.out.println("My height is "+ height+ " meters.");

        sca.close();
     }
}


