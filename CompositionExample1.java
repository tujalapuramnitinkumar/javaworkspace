class Sim {
    long simNumber = 9441232115L;

    public void connect() {
        System.out.println("Connecting...");
    }
}
class Mobile {
    Sim sim; // Composition: Mobile HAS-A Sim 
    public Mobile(Sim sim) {
        this.sim = sim;
    }
    public void call() {
        sim.connect();
        System.out.println("Calling using SIM: " + sim.simNumber);
    }
}
class CompositionExample1 {
    public static void main(String[] args) {
        Sim s = new Sim();       // Create SIM object
        Mobile m = new Mobile(s); // Pass SIM to Mobile
       m.call(); // Make a call
}
}
// code ends..