/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.Scanner;

/**
 *
 * @author Tonia
 */
public class Ticket {
    //Fields
    private String type; //τύπος
    private int duration; //διάρκεια (αριθμός μερών)
    //Έχω αφαιρέσει τα 90' από τις τιμές που μπορεί να πάρει η duration, καθώς ουσιαστικά είναι το ίδιο με τη μία διαδρομή
    //Ως τιμές του μειωμένου ημερήσιου και μειωμένου εβδομαδιαίου έχω βάλει αυτές των κανονικών, αφού μειωμένα δεν υπάρχουν
    private int NumberOfItineraries; //διαδρομές
    private float price; //τιμή
    private String WayOfPaying; //τρόπος πληρωμής
    private String WayOfReceiving; //είδος/τρόπος παραλαβής
    private String email;
    private String time; //μπορεί να πάρει δύο τιμές: duration αν ο χρήστης έχει αγοράσει εισιτήριο 90',
    //ημερήσιο, εβδομαδιαίο και μηνιαίο και itineraries αν ο χρήστης έχει αγοράσει εισιτήριο 1, 5 ή 11 διαδρομών
    
    //Constructor
    public Ticket() {
        
    }
    
    
    //Methods
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public int getNumberOfItineraries() {
        return NumberOfItineraries;
    }
    
    public void setNumberOfItineraries(int NumberOfItineraries) {
        this.NumberOfItineraries = NumberOfItineraries;
    }

    public float getPrice() {
        return price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWayOfPaying() {
        return WayOfPaying;
    }

    public void setWayOfPaying(String WayOfPaying) {
        this.WayOfPaying = WayOfPaying;
    }

    public String getWayOfReceiving() {
        return WayOfReceiving;
    }

    public void setWayOfReceiving(String WayOfReceiving) {
        this.WayOfReceiving = WayOfReceiving;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    //Μέθοδος που παίρνει είσοδο από τον χρήστη και ελέγχει αν αυτή είναι Α ή Β
    public String scanner(){
        String option;
        Scanner sc = new Scanner(System.in);
        option = sc.nextLine();
        
        while (!"A".equals(option) && !"B".equals(option)) {
            System.out.println("Type A or B");
            option = sc.nextLine();
        }
        return option;
    }

    
    
    
}
