/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.HashMap;
//import java.util.List;

/**
 *
 * @author Tonia
 */
public class AllTickets extends MonthlyOrReducedTicket {
    MonthlyOrReducedTicket mtic = new MonthlyOrReducedTicket();
    HashMap<Integer, Ticket> tickets = new HashMap<>();
    
    public void Add(int a ,Ticket t){
        tickets.put(mtic.getPassword(), t);
    }
    
    public Ticket Get(int password){
        
        return tickets.get(password);
    }
}       
