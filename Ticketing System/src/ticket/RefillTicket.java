/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tonia
 */
public class RefillTicket extends BuyTicket{
    //Ανανέωση εισιτηρίου
    //Fields
    private String time;
    private String name;
    private String option;
    
    //Constructor
    public RefillTicket() {
        super();
    }
    
    //Methods
    public void Refill() {
        time = mtic.getTime();
        if("Regular".equals(mtic.getType())){
            if("duration".equals(time)){
                System.out.println("What would you like to buy?\nA.Daily\nB.Weekly\nC.Monthly.");
                Scanner sc6 = new Scanner(System.in);
                option = sc6.nextLine();
                while (!"A".equals(option) && !"B".equals(option) && !"C".equals(option)) {
                    System.out.println("Type A,B or C");
                    option = sc6.nextLine();
                }
                if(null != option)switch (option) {
                    case "A":
                        mtic.setDuration(mtic.getDuration()+1);
                        mtic.setExpiryDate(mtic.getExpiryDate()+1);
                        mtic.setPrice((float) 4.50);
                        break;
                    case "B":
                        mtic.setDuration(mtic.getDuration()+5);
                        mtic.setExpiryDate(mtic.getExpiryDate()+5);
                        mtic.setPrice(9);
                        break;
                    case "C":
                        mtic.setDuration(mtic.getDuration()+30);
                        mtic.setExpiryDate(mtic.getExpiryDate()+30);
                        mtic.setPrice(30);
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("How many itineraries would you like to buy?\nA.1\nB.5\nC.11");
                Scanner sc6 = new Scanner(System.in);
                option = sc6.nextLine();
                while (!"A".equals(option) && !"B".equals(option) && !"C".equals(option) && !"D".equals(option)) {
                    System.out.println("Type A,B or C");
                    option = sc6.nextLine();
                }
                //προσθεση καινουριου αριθμου δρομολογιων στα παλια!!!
                if(null != option)switch (option) {
                    case "A":
                        mtic.setNumberOfItineraries(mtic.getNumberOfItineraries()+1);
                        mtic.setPrice((float) 1.40);
                        break;
                    case "B":
                        mtic.setNumberOfItineraries(mtic.getNumberOfItineraries()+5);
                        mtic.setPrice((float) 6.50);
                        break;
                    case "C":
                        mtic.setNumberOfItineraries(mtic.getNumberOfItineraries()+11);
                        mtic.setPrice((float) 13.50);
                        break;
                    default:
                        break;
                }
            }
        } else {
            System.out.println("Please write your name.");
            Scanner sc1 = new Scanner(System.in);
            name = sc1.nextLine();
            mtic.setName(name); 
            Random rand = new Random();
            int n = rand.nextInt(1000) + 1;
            mtic.setPassword(n);
            if("duration".equals(time)){
                System.out.println("What would you like to buy?\nA.Daily\nB.Weekly\nC.Monthly.");
                Scanner sc6 = new Scanner(System.in);
                option = sc6.nextLine();
                while (!"A".equals(option) && !"B".equals(option) && !"C".equals(option)) {
                    System.out.println("Type A,B or C");
                    option = sc6.nextLine();
                }
                if(null != option)switch (option) {
                    case "A":
                        mtic.setDuration(mtic.getDuration()+1);
                        mtic.setExpiryDate(mtic.getExpiryDate()+1);
                        mtic.setPrice((float) 4.50);
                        break;
                    case "B":
                        mtic.setDuration(mtic.getDuration()+5);
                        mtic.setExpiryDate(mtic.getExpiryDate()+5);
                        mtic.setPrice(9);
                        break;
                    case "C":
                        mtic.setDuration(mtic.getDuration()+30);
                        mtic.setExpiryDate(mtic.getExpiryDate()+30);
                        mtic.setPrice((float) 15.0);
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("How many itineraries would you like to buy?\nA.1\nB.5\nC.11");
                Scanner sc6 = new Scanner(System.in);
                option = sc6.nextLine();
                while (!"A".equals(option) && !"B".equals(option) && !"C".equals(option) && !"D".equals(option)) {
                    System.out.println("Type A,B or C");
                    option = sc6.nextLine();
                }
                //προσθεση καινουριου αριθμου δρομολογιων στα παλια!!!
                if(null != option)switch (option) {
                    case "A":
                        mtic.setNumberOfItineraries(mtic.getNumberOfItineraries()+1);
                        mtic.setPrice((float) 0.60);
                        break;
                    case "B":
                        mtic.setNumberOfItineraries(mtic.getNumberOfItineraries()+5);
                        mtic.setPrice(3);
                        break;
                    case "C":
                        mtic.setNumberOfItineraries(mtic.getNumberOfItineraries()+11);
                        mtic.setPrice(6);
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
