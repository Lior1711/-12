
/**
 * This class CarDriver is answearing the question number 2 of maman 12.
 * Creating a new car objects by default constructor,and using other constructors from Car class to change or compare features by several
  methods by the task instructions. and etc.
 *
 * @author (NAME:Lior Niv , ID:31158139)
 * @version (2.12.2022)
 */
import java.util.Scanner;

public class CarDriver
{   
        final static int DEFAULT_ID = 9999999;
        final static int MAX_ID_VALUE = 9999999;//two finals are the same value but have different uses.
                                                // If we will want to change one of them in the future, it should be different final integers. 
        final static int MIN_ID_VALUE = 1000000;
        final static char DEFAULT_TYPE = 'A';
        final static char MIN_TYPE_VALUE = 'A';//two finals are the same value but have different uses.
                                                // If we will want to change one of them in the future, it should be different final integers.
        final static char MAX_TYPE_VALUE = 'D';
    public static void main(String[] args){
    
        Scanner scan1 = new Scanner(System.in);   // getting the  -id,type,brand,ismanual- from the user by Scanner method for c1 object
        System.out.println("Please enter car -1- properties" + "\n");
        System.out.println("Please enter a 7 digits id number: ");
        int id1 = scan1.nextInt();  
        System.out.println("Please enter type A/B/C/D ");
        char type1 = scan1.next().charAt(0); 
        System.out.println("Please enter brand of car: ");
        String brand1 = scan1.next();
        System.out.println("Please enter car is MAnual? true/false: ");
        boolean isManual1 = scan1.nextBoolean();
            
        Car c1 = new Car(id1,type1,brand1,isManual1); // crating c1 object using constructor.
        
        Scanner scan2 = new Scanner(System.in);   // getting the  -id,type,brand,ismanual- from the user by Scanner method for c2 object
        System.out.println("\n" + "Please enter car -2- properties" + "\n");
        System.out.print(" ");
        System.out.println("Please enter a 7 digits id number : ");
        int id2 = scan2.nextInt();       
        System.out.println("Please enter type A/B/C/D ");
        char type2 = scan2.next().charAt(0); 
        System.out.println("Please enter brand of car: ");
        String brand2 = scan2.next();
        System.out.println("Please enter car is MAnual? true/false: ");
        boolean isManual2 = scan2.nextBoolean();
        
        Car c2 = new Car(id2,type2,brand2,isManual2);  // crating c2 object using constructor.
        
        
        // id1 ,id2 input limits
        if((id1 > MAX_ID_VALUE) || (id1 < MIN_ID_VALUE)) c1.setId(DEFAULT_ID);
        else id1 = id1;
        if((id2 > MAX_ID_VALUE) || (id2 < MIN_ID_VALUE)) c2.setId(DEFAULT_ID);
        else id2 = id2;
        
        // type 1,type 2 input limits
        if ((type1 > MAX_TYPE_VALUE) || (type1 < MIN_TYPE_VALUE)) c1.setType(DEFAULT_TYPE);
        else type1 = type1;
        if ((type2 > MAX_TYPE_VALUE) || (type2 < MIN_TYPE_VALUE)) c2.setType(DEFAULT_TYPE);
        else type2 = type2;
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        // comparison the features of c1,c2 . checking if equals. 
        if (type1 == type2 && (brand1).equals(brand2) && isManual1 == isManual2 )System.out.println("same cars");
        else System.out.println("Different cars" );

        c1.setIsManual(!isManual1);         //change parameter -isManul- to the opposite.
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        // using -better- method 
        if (c1.better(c2)) System.out.println(c1);
        else if(c2.better(c1)) System.out.println(c2);
        

    }
    }

