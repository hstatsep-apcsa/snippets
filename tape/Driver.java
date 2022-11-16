public class Driver {

    public static void main(String[] args){
        
        Tape roll1 = new Tape(); // new instance
        Tape roll2 = new Tape("red"); // new instance

        roll1.dispenseTape(20); // instance method
        System.out.println("roll1: " + roll1.getYards()); // instance method

        System.out.println("roll2: " + roll2.getYards()); // instance method

        System.out.println("numRolls: " + Tape.getNumRolls()); // static method

    }

}
