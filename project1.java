/*
 * Ashton Chavez
 * project1.java
 * October 29, 2024
 * 
 * Command-line driven menu that allows users to construct various shapes and compute their area or volume.
 */

import java.util.Scanner;

public class project1 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        boolean loop = true;

        //Selection Menu
        while(loop){
            System.out.println("*********Welcome to the Java OO Shapes Program ********** \r\n" + //
                        "Select from the menu below: \r\n" + //
                        "1. Construct a Circle \r\n" + //
                        "2. Construct a Rectangle \r\n" + //
                        "3. Construct a Square \r\n" + //
                        "4. Construct a Triangle [Equilateral Triangle]\r\n" + //
                        "5. Construct a Sphere \r\n" + //
                        "6. Construct a Cube \r\n" + //
                        "7. Construct a Cone \r\n" + //
                        "8. Construct a Cylinder \r\n" + //
                        "9. Construct a Torus \r\n" + //
                        "10. Exit the program");

            //User Interaction
            System.out.print("\nSelect Number: ");
            int selection = scan.nextInt();

            if(selection == 1){
                System.out.print("You have selected a Circle\nWhat is the Radius?: ");
                double radius = scan.nextDouble();
                circle circle = new circle(radius);
                System.out.println("The area of the " + circle.getName() + " is " + circle.getArea() + ".\n");
            }
            else if(selection == 2){
                System.out.print("You have selected a Rectangle\nWhat is the Length?: ");
                double length = scan.nextDouble();
                System.out.print("What is the Width?: ");
                double width = scan.nextDouble();
                rectangle rectangle = new rectangle(length, width);                   
                System.out.println("The area of the " + rectangle.getName() + " is " + rectangle.getArea() + ".\n");
            }
            else if(selection == 3){
                System.out.print("You have selected a Square\nWhat is the Length?: ");
                double side = scan.nextDouble();
                square square = new square(side);
                System.out.println("The area of the " + square.getName() + " is " + square.getArea() + ".\n");
            }
            else if(selection == 4){
                System.out.print("You have selected a Triangle\nWhat is the Length?: ");
                double side = scan.nextDouble();
                triangle triangle = new triangle(side);
                System.out.println("The area of the " + triangle.getName() + " is " + triangle.getArea() + ".\n");
            }
            else if(selection == 5){
                System.out.print("You have selected a Sphere\nWhat is the Radius?: ");
                double radius = scan.nextDouble();
                sphere sphere = new sphere(radius);
                System.out.println("The volume of the " + sphere.getName() + " is " + sphere.getVolume() + ".\n");
            }
            else if(selection == 6){
                System.out.print("You have selected a Cube\nWhat is the Length?: ");
                double side = scan.nextDouble();
                cube cube = new cube(side);
                System.out.println("The volume of the " + cube.getName() + " is " + cube.getVolume() + ".\n");
            }
            else if(selection == 7){
                System.out.print("You have selected a Cone\nWhat is the Radius?: ");
                double radius = scan.nextDouble();
                System.out.print("What is the Height?: ");
                double height = scan.nextDouble();
                cone cone = new cone(radius, height);
                System.out.println("The volume of the " + cone.getName() + " is " + cone.getVolume() + ".\n");
            }
            else if(selection == 8){
                System.out.print("You have selected a Cylinder\nWhat is the Radius?: ");
                double radius = scan.nextDouble();
                System.out.print("What is the Height?: ");
                double height = scan.nextDouble();
                cylinder cylinder = new cylinder(radius, height);
                System.out.println("The volume of the " + cylinder.getName() + " is " + cylinder.getVolume() + ".\n");
            }
            else if(selection == 9){
                System.out.print("You have selected a Torus\nWhat is the Major Radius?: ");
                double majorRadius = scan.nextDouble();
                System.out.print("What is the Minor Radius?: ");
                double minorRadius = scan.nextDouble();
                torus torus = new torus(majorRadius, minorRadius);
                System.out.println("The volume of the " + torus.getName() + " is " + torus.getVolume() + ".\n");
            }
            else if(selection == 10){
                loop = false;
                System.out.println("Thanks for using the program. Today is " + java.time.LocalDate.now() + " at " + java.time.LocalTime.now() + ".");
            }
            else{
                System.out.println("Selection Invalid. Try Again.");
            }

            if (loop) {
                System.out.println("Would you like to continue? (Y or N)");
                char loopAns = scan.next().charAt(0);
                if (loopAns == 'N' || loopAns == 'n') {
                    System.out.println("Thanks for using the program. Today is " + java.time.LocalDate.now() + " at " + java.time.LocalTime.now() + ".");
                    loop = false;
                }
                else if(loopAns != 'y' || loopAns != 'Y'){
                    System.out.print("Sorry I do not understand. Enter Y or N:");
                    char loopAns2 = scan.next().charAt(0);
                    
                    if (loopAns2 == 'N' || loopAns2 == 'n') {
                        System.out.println("Thanks for using the program. Today is " + java.time.LocalDate.now() + " at " + java.time.LocalTime.now() + ".");
                        loop = false;
                    }
                    else{
                        loop = true;
                    }
                }
            }
        }
        scan.close();
    }
}
