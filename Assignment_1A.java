import java.util.Scanner; //Importing the util package : Scanner
public class Assignment_1A {
    public static void main(String[] args) {
        Scanner myName = new Scanner(System.in); //declaring the scanner
        System.out.println("What is your name"); //Asking the user to input their name.
        String thisuser = myName.nextLine(); //Reads the user's input

        
        System.out.println("What is your number"); //Asking the user to input their number.
        int number = myName.nextInt(); //Scanning the next token of the input data as an integer.
        
        //Printing our results in the console.
        System.out.println("Your name is, " + thisuser); 
        System.out.println(thisuser + " Your number is, " + number);
        
        

        //The use of a loop proves useful to prevent too much lines
        //the use of i++ is required if we want to use our current value and allows us to increment the value of "i" by 1.
        for(double i = 1; i < 11.0;i++ ){ //Integer "i" starts at 1 and is less than 11 meaning it would end at 10. 
        int a = (int) i;
        double totalresult = number / i; //Variable named totalresult which divides the user's inputed number by all of the numbers from 1 to 10
        double roundthis = (double) Math.round(totalresult * 100) / 100; 
        System.out.println(number + " Divided by, " + a + " = " + roundthis);
        }
        myName.close();

    }

}

// 1) Was your program written efficiently? Why or why not? If it wasn’t efficient, can you modify it to use fewer lines of code for the calculations?

//Ans : At first, my program was not written efficiently due to the use of repeated lines, so what I did was using a loop instead which allowed the program to first run more efficiently but also saved a lot of space(lines)

//2) Why are the outputs in the sample printout all rounded off? How do the different data types affect the accuracy of the answers? Research or test out changes that would get more accurate quotients. Can you round your answers to two decimal places?

//Ans : The output are printed all roudned off because we're using "int", if as an example I want to get decimal results I could just uses "double" instead.

