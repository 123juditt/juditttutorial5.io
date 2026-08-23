class Bird {
    public void fly() {
        System.out.println("Birds fly in different ways.");
    }
}

class Sparrow extends Bird {
    public void fly() {
        System.out.println("Sparrow flies short distances.");
    }
}

class Eagle extends Bird {
    public void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[] {
            new Bird(),
            new Sparrow(),
            new Eagle()
        };

        for (Bird b : birds) {
            b.fly();
        }
    }
}
