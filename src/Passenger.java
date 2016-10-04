/**
 * Created by lemieszn on 10/4/2016.
 */
public class Passenger {
    public String Destination;
    public String Location;

    public Passenger () {
        Location = "";
        Destination = "";
    }

    public Passenger (String l, String d){
        Location = l;
        Destination = d;
    }

    public void setLocation (String l) {
        Location = l;
    }

    public void setDestination (String d) {
        Destination = d;
    }

    public String getLocation () {
        return Location;
    }

    public String getDestination() {
        return Destination;
    }

    public String toString () {
        return "Location: " + Location + "\n" + "Destination: " + Destination;
    }
}
