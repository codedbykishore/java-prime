
public class AbstractDemo {

    public static void main(String[] args) {
        // Car c = new Car();
        // c.complyRegls();
        // c.capacityCheck();
        // c.show();

        Vehicle v = new Vehicle() {
            @Override
            public void complyRegls() {
                System.out.println("Anonymous complyRegls");
            }

            @Override
            public void capacityCheck() {
                System.out.println("Anonymous capacityCheck");
            }
        };
        v.complyRegls();
        v.capacityCheck();
        v.show();
    }

}

abstract class Vehicle {
    int vehId;
    String name;

    public abstract void complyRegls();

    public abstract void capacityCheck();

    public void show() {
        System.out.println("show");
    }
}

class Car extends Vehicle {
    @Override
    public void complyRegls() {
        System.out.println("complyRegls");
    }

    @Override
    public void capacityCheck() {
        System.out.println("capacityCheck");
    }
}

interface location {
    public void cleanLocation();

    public void hourlyMessage();
}

interface defaultUser {
    public void showIdCard();

    public void hourlyMessage();
}

class serviceManager implements location, defaultUser {
    @Override
    public void cleanLocation() {
        System.out.println("cleanLocation");
    }

    @Override
    public void showIdCard() {
        System.out.println("showIdCard");
    }

    @Override
    public void hourlyMessage() {
        System.out.println("hourlyMessage");
    }
}
