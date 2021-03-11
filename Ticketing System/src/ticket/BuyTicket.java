/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.Random;
import java.util.Scanner;


public class BuyTicket extends MonthlyOrReducedTicket {
    //Έκδοση-αγορά εισιτηρίου
    //Fields
    private String name;
    private String option;
    MonthlyOrReducedTicket mtic = new MonthlyOrReducedTicket();
    
    //Constructor
    public BuyTicket() {
        super();
    }
    
    //Methods
    //Με την παρακάτω μέθοδο ο χρήστης επιλέγει τον τύπο του εισιτηρίου και δίνει τα απαραίτητα στοιχεία
    public void Type(){
        System.out.println("Choose the type of your ticket:\nA.Regular\nB.Reduced");
        Scanner sc = new Scanner(System.in);
        
        option = mtic.scanner();
        if("A".equals(option)){
            mtic.setType("Regular");
        } else {
            setType("Reduced");
            System.out.println("Please write your name.");
            Scanner sc1 = new Scanner(System.in);
            name = sc1.nextLine();
            mtic.setName(name); 
            Random rand = new Random();
            int n = rand.nextInt(1000) + 1;
            mtic.setPassword(n);
        }
    
        System.out.println("What would you like to buy?\nA.Duration\nB.Itineraries");
        option = mtic.scanner();
        
        if("A".equals(option)){
            mtic.setTime("duration");
            System.out.println("What would you like to buy?\nA.Daily\nB.Weekly\nC.Monthly.");
            Scanner sc6 = new Scanner(System.in);
            option = sc6.nextLine();
            while (!"A".equals(option) && !"B".equals(option) && !"C".equals(option)) {
                System.out.println("Type A,B or C");
                option = sc6.nextLine();
            }
            if(null != option)switch (option) {
                case "A":
                    mtic.setDuration(1);
                    mtic.setExpiryDate(1);
                    break;
                case "B":
                    mtic.setDuration(5);
                    mtic.setExpiryDate(5);
                    break;
                case "C":
                    mtic.setDuration(30);
                    mtic.setExpiryDate(30);
                    break;
                default:
                    break;
            }
        } else {
            mtic.setTime("itineraries");
            System.out.println("How many itineraries would you like to buy?\nA.1\nB.5\nC.11");
            Scanner sc6 = new Scanner(System.in);
            option = sc6.nextLine();
            while (!"A".equals(option) && !"B".equals(option) && !"C".equals(option) && !"D".equals(option)) {
                System.out.println("Type A,B or C");
                option = sc6.nextLine();
            }
            if(null != option)switch (option) {
                case "A":
                    mtic.setNumberOfItineraries(1);
                    break;
                case "B":
                    mtic.setNumberOfItineraries(5);
                    break;
                case "C":
                    mtic.setNumberOfItineraries(11);
                    break;
                default:
                    break;
            }
        }
    }
    
    //Με την παρακάτω μέθοδο παρουσιάζεται η τιμή του εισιτηρίου και ο χρήστης επιλέγει τον τρόπο πληρωμής 
    //και τον τρόπο παραλαβής και δίνει τα απαραίτητα στοιχεία
    public void Price(){
        if("Regular".equals(mtic.getType())){ //Κανονικό
            if("duration".equals(mtic.getTime())){       //Διάρκεια
                switch (mtic.getDuration()) {
                case 1:
                    mtic.setPrice((float) 4.50);
                    break;
                case 5:
                    mtic.setPrice((float) 9);
                    break;
                case 30:
                    mtic.setPrice((float) 30);
                    break;
                default:
                    break;
                }  
            } else {
                    switch (mtic.getNumberOfItineraries()) {      //Δρομολόγια
                     case 1:
                        mtic.setPrice((float) 1.40);
                        break;
                    case 5:
                        mtic.setPrice((float) 6.50);
                        break;
                    case 11:
                        mtic.setPrice((float) 13.50);
                        break;
                    default:
                        break;
                    }  
            }
        } else {                         //Μειωμένο
            if("duration".equals(mtic.getTime())){       //Διάρκεια
                switch (mtic.getDuration()) {
                case 1:
                    mtic.setPrice((float) 4.50);
                    break;
                case 5:
                    mtic.setPrice((float) 9);
                    break;
                case 30:
                    mtic.setPrice((float) 15.0);
                    break;
                default:
                    break;
                }  
            }  else{
                switch (mtic.getNumberOfItineraries()) {      //Δρομολόγια
                case 1:
                    mtic.setPrice((float) 0.60);
                    break;
                case 5:
                    mtic.setPrice((float) 3);
                    break;
                case 11:
                    mtic.setPrice((float) 6);
                    break;
                default:
                    break;
                } 
            }
        }

        System.out.println("The price of your ticket is:" + mtic.getPrice());
        System.out.println("Will you pay with:\nA.Cash\nB.Card");
        option = mtic.scanner();
        
        if("A".equals(option)){
            mtic.setWayOfPaying("Cash");
        } else {
            mtic.setWayOfPaying("Card");
        }
        
        System.out.println("How would you like to get your ticket?\nA.Through email\nB.Printed");
        option = mtic.scanner();
        
        if("A".equals(option)){
            mtic.setWayOfReceiving("Email");
            System.out.println("Please write your email.");
            Scanner sc4 = new Scanner(System.in);
            mtic.setEmail( sc4.nextLine());
        } else {
            mtic.setWayOfReceiving("Printed");
        }
        
    }
}

