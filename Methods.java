package methods;

import java.util.*;

/**
 * May 28th, 2021
 * 10 Calculation Methods 
 * This program can perform 10 different types of calculations based on the number the user enters
 * @author Bonny Chen 
 **/

public class Methods {
    
    // Menu screen procedure
    public static void menuScreen() {

        // Menu screen of the different calculation options
        System.out.println("\n------------- Calculation Options Menu -------------");
        System.out.println("\n1 = GCF Calculator");
        System.out.println("2 = Factorial Calculator");
        System.out.println("3 = Slope of line Calculator");
        System.out.println("4 = Midpoint of a line Calculator");
        System.out.println("5 = Circumference of a Circle Calculator");
        System.out.println("6 = Area of a Circle Calculator");
        System.out.println("7 = Prime Number Checker");
        System.out.println("8 = Percentage Calculator");
        System.out.println("9 = Pythagorean Theorem Calculator");
        System.out.println("10 = Speed, Distance, Time Calculator");
        System.out.println("0 = Exit program");
        System.out.println("\n----------------------------------------------------");
        System.out.println("\nEnter the number of your choice: ");

    }

    // GCF Function
    public static int gcfCalc(int num1, int num2) {

        if (num2 == 0) {
            return num1; // Returns only one of the numbers entered

        } else {

            // Returns the GCF of the two numbers back to main program
            return (gcfCalc(num2, num1 % num2));

        }
    }

    // Factorial Function
    public static long factorialCalc(int num) {

        // Long variable to store large numbers
        long factorial = 1;
        
        // Loop to factorial the number
        for (int i = 2; i <= num; i++) {
            factorial = factorial * i;
            
        }

        // Returns the result of num! back to main program
        return (factorial);

    }

    // Calculates slope of line from two sets of points
    public static double slopeCalc(double x1, double y1, double x2, double y2) {

        // Returns the slope back to main program using the slope formula
        return (y2 - y1) / (x2 - x1);

    }

    // Midpoint of a line procedure
    public static void midpointCalc(double x1, double x2, double y1, double y2) {

        // Returns the midpoint back to main program using midpoint formula
        System.out.print("(" + (x1 + x2) / 2 + " , " + (y1 + y2) / 2 + ")");

    }

    // Circumference of a circle function
    public static double circumferenceCalc(double radius) {

        // Formula of circumference = 2PIr
        double circumference = Math.PI * 2 * radius;

        // Return circumference
        return (circumference);

    }
    
    // Area of a circle function
    public static double circleAreaCalc(double radius) {

        // Area of circle formula = PIr^2
        double circleArea = Math.PI * Math.pow(radius, 2);

        // Return area
        return (circleArea);

    }
    
    // Prime number checker function
    public static boolean checkPrimeNum(int num) {
        
        // Variable sets prime to be true
        boolean prime = true;

        if (num <= 1) {
            
            prime = false;
            return (prime);

        } else {
            
            // Loop to check number
            for (int i = 2; i <= num / 2; i++) {
                
                // Check for remainders
                if ((num % i) == 0) {
                    
                    prime = false;
                    break;
                    
                }
            }
            
            // Returns if the number is prime or not
            return (prime);
            
        }
    }
    
    // Percentage of a number function
    public static double percentOfNumCalc(double num, double percentageOf) {
        
        // Takes the percentage and change it into a decimal and multiplied to the number
        // Returns that value
        return ((percentageOf / 100) * num);

    }
    
    // Pythagorean Theorem function
    public static double hypotenuseCalc(double sideA, double sideB) {
        
        // Returns Pythagorean Theorem to find the hypotenuse --> A^2 + B^2 = C^2
        return (Math.pow(sideA, 2) + Math.pow(sideB, 2));

    }
    
    // Pythagorean Theorem function reversed
    public static double triSideCalc(double sideC, double side) {
        
        // Returns Pythagorean Theorem to find A or B --> A^2 = C^2 - B^2
        return (Math.pow(sideC, 2) - Math.pow(side, 2)); 

    }
    
    // Speed function
    public static double speedCalc(double distance, double time) {
        
        // Returns speed = distance / time
        return (distance / time);
        
    }
    
    // Distance function
    public static double distanceCalc(double speed, double time) {
        
        // Returns distance = speed x time
        return (speed * time);
        
    }
    
    // Time function
    public static double timeCalc(double distance, double speed) {
        
        // Returns time = speed x distance
        return (speed * distance);
        
    }

    // Main program
    public static void main(String[] args) {

        // Loops the whole program 
        while (true) {

            Scanner reader = new Scanner(System.in);

            // Calls the procedure to output the menu screen 
            menuScreen();

            // Get choice of operation from user
            int choice = reader.nextInt();
            
            if (choice == 1) { 

                // Excecutes the operation 
                System.out.println("\n------------- Greatest Common Factor  -------------");

                System.out.println("\nEnter the first number: ");
                int num1 = reader.nextInt(); // Get first number

                System.out.println("\nEnter the second number: ");
                int num2 = reader.nextInt();  // Get second number

                int gcf; // Variable to store the GCF of the two numbers

                // Calculates GCF in the method
                gcf = gcfCalc(num1, num2);

                // Outputs GCF from function
                System.out.println("\nThe greatest common factor of " + num1 + " and " + num2 + " is: " + gcf);

            }

            if (choice == 2) {

                // Executes the operation
                System.out.println("\n--------- Factorial of a Number Calculator ---------");

                System.out.println("\nEnter a number: ");
                int number = reader.nextInt(); // Get the number 

                long facOfNum; // Variable to store the factorial of the number

                // Calculates the factorial of the number in the method
                facOfNum = factorialCalc(number);

                // Outputs the factorial of the number
                System.out.println("\nThe factorial of " + number + " is: " + facOfNum);

            }

            if (choice == 3) {

                // Executes the operation
                System.out.println("\n------------- Slope of Line Calculator -------------");

                System.out.println("\nEnter the point of x1: ");
                double x1 = reader.nextFloat(); // Get the x value of the first point

                System.out.println("\nEnter the point of x2: ");
                double x2 = reader.nextFloat(); // Get the x value of the second point

                System.out.println("\nEnter the point of y1: ");
                double y1 = reader.nextFloat(); // Get the y value of the first point

                System.out.println("\nEnter the point of y2: ");
                double y2 = reader.nextFloat(); // Get the y value of the second point

                // Outputs the slope from the method
                System.out.println("\nThe slope of the line is: " + slopeCalc(x1, y1, x2, y2));

            }

            if (choice == 4) {

                // Executes the operation
                System.out.println("\n----------- Midpoint of a Line Calculator -----------");

                System.out.println("\nEnter the point of x1: ");
                double x1 = reader.nextDouble(); // Get the x value of the first point

                System.out.println("\nEnter the point of x2: ");
                double x2 = reader.nextDouble(); // Get the x value of the second point

                System.out.println("\nEnter the point of y1: ");
                double y1 = reader.nextDouble(); // Get the y value of the first point

                System.out.println("\nEnter the point of y2: ");
                double y2 = reader.nextDouble(); // Get the y value of the second point

                System.out.println("\nThe midpoint of the line is: ");
                midpointCalc(x1, x2, y1, y2); // Outputs the midpoint of the slope from the method

            }

            if (choice == 5) {

                // Executes the operation
                System.out.println("\n-------- Circumference of a Circle Calculator --------");

                System.out.println("\nEnter the radius of the circle: ");
                double radiusC = reader.nextDouble(); // Get the radius of the circle

                // Round the result from the method
                double resultC = Math.round(circumferenceCalc(radiusC) * 1000) / 1000.0;

                // Output the circumference of the circle
                System.out.println("\nThe circumference of the circle is: " + resultC);
                
            }

            if (choice == 6) {

                // Executes the operation              
                System.out.println("\n----------- Area of a Circle Calculator -----------");

                System.out.println("\nEnter the radius of the circle: ");

                double radiusA = reader.nextDouble(); // Get the radius of the circle
                double resultA = Math.round(circleAreaCalc(radiusA) * 1000) / 1000.0; // Rounds answer to 3 decimal places

                System.out.println("\nThe area of the circle is: " + resultA);
                
            }

            if (choice == 7) {

                // Executes the operation
                System.out.println("\n--------------- Prime Number Checker ----------------");
                
                System.out.println("\nEnter a positive integer: ");
                int number = reader.nextInt(); // Get a number from the user

                boolean prime = checkPrimeNum(number); // Check if the number meets the conditions to be a prime

                if (prime) { // Outputs based on the result of the function
                    
                    System.out.println("\n" + number + " is a prime number"); // True
                    
                } else {
                    
                    System.out.println("\n" + number + " is not a prime number"); // False 
                    
                }

            }

            if (choice == 8) {
                
                // Executes the operation
                System.out.println("\n--------- Percentage of Number Calculator ----------");

                System.out.println("\nEnter a number: ");
                double number = reader.nextInt(); // Get a number from the user

                System.out.println("\nEnter the percentage as a whole number: ");
                double percentageOf = reader.nextInt(); // Get percentage from the user
                
                // Outputs the percentage of the number
                System.out.println("\n" + percentageOf + "% of " + number + " is " + percentOfNumCalc(number, percentageOf));

            }

            if (choice == 9) {
                
                // Executes the operation              
                System.out.println("\n---------- Pythagorean Theorem Calculator -----------");
                System.out.println("\nNote: This can only calculate the sides of right triangles");
                System.out.println("\nEnter the side you want to find: \n1 = Opposite or Adjacent \n2 = Hypotenuse\n");
                int side = reader.nextInt(); // User can choose which side of a right triangle to find

                if (side == 2) {
                    
                    System.out.println("\nEnter the length of side A: ");
                    double sideA = reader.nextInt(); // Get the base from user

                    System.out.println("\nEnter the length of side B: ");
                    double sideB = reader.nextInt(); // Get the height from user
                    
                    // Outputs hypotenuse using pythagorean theorem function
                    System.out.println("\nThe length of the hypotenuse is: " + String.format("%.3f", (Math.sqrt(hypotenuseCalc(sideA, sideB))))); 
           
                    
                } else {
                    
                    System.out.println("\nEnter the length of the hypotenuse: ");
                    double hypotenuse = reader.nextInt(); // Get the hypotenuse from the user

                    System.out.println("\nEnter the length of the other side: ");
                    double otherSide = reader.nextInt(); // Get the other known side from the user
                    
                    // Outputs the length of the missing side using pythagorean theorem function
                    System.out.println("\nThe length of the missing side is: " + String.format("%.3f", (Math.sqrt(triSideCalc(hypotenuse, otherSide)))));
                    
                }

            }

            if (choice == 10) {
                
                // Executes the operation
                System.out.println("\n--------- Speed, Distance, Time Calculator ---------");
                
                System.out.println("\n Enter the option you would like to calculate: ");
                System.out.println("\n1 = Speed \n2 = Distance \n3 = Time travelled\n");
                int option = reader.nextInt(); // Get choice of calculation from user
                
                // Variables
                double speed, distance, timeTravelled;

                if (option == 1) {
                    
                    System.out.println("\nEnter the amount of distance travelled (km):");
                    distance = reader.nextDouble(); // Get the km travelled from user
                    
                    System.out.println("\nEnter the amount of hours travelled (hr):");
                    timeTravelled = reader.nextDouble(); // Get the amount of time travelled from user
                    
                    // Outputs the speed of travel
                    System.out.println("\nThe calculated speed is: " + speedCalc(distance, timeTravelled) + " km/hr");

                }

                if (option == 2) {

                    System.out.println("\nEnter the speed of travel (km / hr):");
                    speed = reader.nextDouble(); // Gets the speed of travel from user
                    
                    System.out.println("\nEnter the amount of hours travelled (hr):");
                    timeTravelled = reader.nextDouble(); // Get the amount of time travelled from user
                    
                    // Outputs the distance travelled
                    System.out.println("\nThe calculated distance is: " + distanceCalc(speed, timeTravelled) + " km");

                }

                if (option == 3) {

                    System.out.println("\nEnter the speed of travel (km / hr):");
                    speed = reader.nextDouble(); // Gets the speed of travel from user
                    
                    System.out.println("\nEnter the amount of distance travelled (km):");
                    distance = reader.nextDouble(); // Get the km travelled from user
                    
                    // Outputs the time travelled
                    System.out.println("\nThe calculated time travelled (hr) is: " + distanceCalc(speed, distance) + " hr");

                }

            } else if (choice == 0) {
                
                // Executes the operation             
                System.out.println("\nThe program will now exit");
                System.out.println("\n----------------------------------------------------\n");  

                // Exits the program
                break;

            }

        }
    }
}
