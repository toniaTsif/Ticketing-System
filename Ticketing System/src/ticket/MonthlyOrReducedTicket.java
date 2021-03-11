/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

/**
 *
 * @author Tonia
 */
public class MonthlyOrReducedTicket extends Ticket {
    //Fields
    String username;
    int password;
    int ExpiryDate;

    //Constructor
    public MonthlyOrReducedTicket() {
        super();
    }

    //Methods
    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(int ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }
    
    
}
