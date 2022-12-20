
/**
 * This class DateDriver is answearing the question number 1 of maman 12.
 * Creating a new date by default constructor,and using other constructors from Date class to change or compare dates and etc.
 *
 * @author (NAME:Lior Niv , ID:31158139)
 * @version (02.12.2022)
 */

import java.util.Scanner;

public class DateDriver
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);  // using Scanner method for day,month,year from user

        System.out.println ("This program demonstrates the " 
            + "usage of Date class."); 
        System.out.println ("Please enter the day, month, year"
            + " of the first date");

        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();   

        Date d1 = new Date(day,month,year);
        Date d2 = new Date(d1.getDay(),d1.getMonth(),d1.getYear()); //copying d1 features, to d2
        System.out.println("d1 date is : " + d1.toString() 
            + "\n"+"d2 date is : " + d2.toString());

        //define same or different cars -by equals- method
        if(d1.equals(d2)){System.out.println("Same date");}
        else System.out.println("Different dates");

        // changing month of d1
        int check = 8;   //chosen random number 8 
        d1.setMonth(check);
        if (month == check ) d1.setMonth(4) ;
        System.out.println(d1.toString()); // printing the new d1

        d2.setYear(++year); //  next year
        System.out.println(d2.toString()); // printing the new d2

        //printing d2 without toString method
        if(day < 10 && month >=10) System.out.println("0" + day + "/" + month + "/" + year);
        if(day < 10 && month < 10) System.out.println("0" + day + "/" + "0" + month + "/" + year);
        if(day >= 10 && month >= 10) System.out.println( + day + "/"  + month + "/" + year);
        if(day >= 10 && month < 10) System.out.println( day + "/" + "0" + month + "/" + year);      

        //before & equals methods
        if(d1.equals(d2)){System.out.println("Same date");}
        else if(d1.before(d2)){ System.out.println(d1);
            System.out.println(d2);}
        else{System.out.println(d2);
            System.out.println(d1);}
    }
}

