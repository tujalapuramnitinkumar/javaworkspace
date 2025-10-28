class Sim {
    long simNumber = 9441232115L;

    public void connect() {
        System.out.println("Connecting...");
    }
}

class Mobile {
    Sim sim = new Sim(); // Composition: Mobile HAS-A Sim (created internally)

    public void call() {
        sim.connect();
        System.out.println("Calling using SIM: " + sim.simNumber);
    }
}

class CompositionExample2 {
    public static void main(String[] args) {

        Mobile m = new Mobile();  // No need to pass Sim object
        m.call();                 // Make a call

        System.out.println("Call endig.....");
    }
}
