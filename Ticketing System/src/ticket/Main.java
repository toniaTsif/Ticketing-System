/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;
import java.util.Random;

/**
 *
 * @author Tonia
 */
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.printMenu();
        
        //Δημιουργια 3 εισιτηριων
        AllTickets map = new AllTickets();
        
        Ticket myTicket1 = new Ticket();
        myTicket1.setWayOfReceiving("Email");
        myTicket1.setType("Regular");
        myTicket1.setDuration(5);
        myTicket1.setPrice(9);
              
        MonthlyOrReducedTicket myTicket2 = new MonthlyOrReducedTicket();
        myTicket2.setWayOfReceiving("Printed");
        myTicket2.setType("Reduced");
        myTicket2.setNumberOfItineraries(11);
        myTicket1.setPrice(6);
        Random rand = new Random();
        int n = rand.nextInt(1000) + 1;
        myTicket2.setPassword(n);
        
        MonthlyOrReducedTicket myTicket3 = new MonthlyOrReducedTicket();
        myTicket3.setWayOfReceiving("Email");
        myTicket3.setType("Regular");
        myTicket3.setDuration(30);
        myTicket3.setPrice(30);
        Random rand1 = new Random();
        int m = rand1.nextInt(1000) + 1;
        myTicket3.setPassword(m);
        }
}
