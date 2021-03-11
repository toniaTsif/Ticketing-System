/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Tonia
 */
public class Menu {

    //Constructor
    public Menu() {
    }
    
    //Method
    void printMenu(){
        System.out.println("What would you like to do?\n1.Buy a ticket\n2.Update your ticket\n3.See informations about your ticket\n4.Quit");
        boolean done = false;
        while (!done) {
            try {
                Scanner sc = new Scanner(System.in);
                int option=0;
                while(option!=4){
                    do{
                      System.out.println("Please type a number from 1 to 4");
                      option = sc.nextInt();
                    } while(option<1 || option>4);
                    
                    AllTickets map = new AllTickets();
                    switch (option) {
                        case 1:
                            //Αγορά
                            BuyTicket buyT = new BuyTicket();
                            buyT.Type();
                            buyT.Price();
                            Ticket t = new Ticket();
                            MonthlyOrReducedTicket mt =new MonthlyOrReducedTicket();
                            map.Add(mt.getPassword(),t);
                            System.out.println("What would you like to do?\n1.Buy a ticket\n2.Update your ticket\n3.See informations about your ticket\n4.Quit");
                            break;
                        case 2:
                            //Ανανέωση
                            RefillTicket ref = new RefillTicket();
                            ref.Refill();
                            System.out.println("What would you like to do?\n1.Buy a ticket\n2.Update your ticket\n3.See informations about your ticket\n4.Quit");
                            break;
                        case 3:
                            //Ενημέρωση
                            Informations info = new Informations();
                            if(null != map.Get(info.Inform())){
                                System.out.println(map.Get(info.Inform()));
                            } else {
                                System.out.println("There aren't any tickets linked to your name.");
                            }
                            System.out.println("What would you like to do?\n1.Buy a ticket\n2.Update your ticket\n3.See informations about your ticket\n4.Quit");
                            break;
                        default:
                            //Quit
                            break;
                    }
                }  
            done = true;
            } catch (InputMismatchException e){
                System.out.println("Please type a number from 1 to 4");
            }
        }
    }
}
