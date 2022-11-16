public class Tape {

    private String color; // each instance gets a copy
    private int yards; // each instance gets a copy

    private static int numRolls; // belongs to class

    // constructors
    public Tape(){
        color = "black";
        yards = 100;
        numRolls++;
    }
    public Tape(String c){
        this();
        color = c;
    }

    public void dispenseTape(int amount){ // instance method
        yards -= amount;
    }

    public int getYards(){ // instance method
        return yards;
    }

    public static int getNumRolls(){ // static method (belongs to class)
        return numRolls;
    }

}
