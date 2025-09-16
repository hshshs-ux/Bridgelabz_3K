//********************************* 1. Animal Hierarchy Example *********************************
class Creature {
    String label;
    int yearsOld;

    Creature(String label, int yearsOld) {
        this.label = label;
        this.yearsOld = yearsOld;
    }

    void produceNoise() {
        System.out.println("This creature makes some sound.");
    }
}

class Canine extends Creature {
    Canine(String label, int yearsOld) {
        super(label, yearsOld);
    }

    @Override
    void produceNoise() {
        System.out.println(label + " says: Bow Bow!");
    }
}

class Feline extends Creature {
    Feline(String label, int yearsOld) {
        super(label, yearsOld);
    }

    @Override
    void produceNoise() {
        System.out.println(label + " says: Mew Mew!");
    }
}

class Sparrow extends Creature {
    Sparrow(String label, int yearsOld) {
        super(label, yearsOld);
    }

    @Override
    void produceNoise() {
        System.out.println(label + " says: Chirp Chirp!");
    }
}

class CreatureDemo {
    public static void main(String[] args) {
        Creature[] beings = {
            new Canine("Rocky", 4),
            new Feline("Luna", 3),
            new Sparrow("Sky", 1)
        };

        for (Creature c : beings) {
            c.produceNoise();
        }
    }
}



//********************************* 2. Employee Management System *********************************
class Staff {
    String fullName;
    int empCode;
    double pay;

    Staff(String fullName, int empCode, double pay) {
        this.fullName = fullName;
        this.empCode = empCode;
        this.pay = pay;
    }

    void showInfo() {
        System.out.println("Name: " + fullName + ", Code: " + empCode + ", Pay: " + pay);
    }
}

class Supervisor extends Staff {
    int groupCount;

    Supervisor(String fullName, int empCode, double pay, int groupCount) {
        super(fullName, empCode, pay);
        this.groupCount = groupCount;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Group Size: " + groupCount);
    }
}

class Programmer extends Staff {
    String techSkill;

    Programmer(String fullName, int empCode, double pay, String techSkill) {
        super(fullName, empCode, pay);
        this.techSkill = techSkill;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Skill: " + techSkill);
    }
}

class Trainee extends Staff {
    int months;

    Trainee(String fullName, int empCode, double pay, int months) {
        super(fullName, empCode, pay);
        this.months = months;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Training Months: " + months);
    }
}

class StaffDemo {
    public static void main(String[] args) {
        Staff s1 = new Supervisor("Neha", 201, 95000, 6);
        Staff s2 = new Programmer("Raj", 202, 65000, "Python");
        Staff s3 = new Trainee("Simran", 203, 22000, 5);

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
    }
}



//********************************* 3. Vehicle and Transport System *********************************
class Transport {
    int topSpeed;
    String energyType;

    Transport(int topSpeed, String energyType) {
        this.topSpeed = topSpeed;
        this.energyType = energyType;
    }

    void showDetails() {
        System.out.println("Speed: " + topSpeed + " km/h | Energy: " + energyType);
    }
}

class Sedan extends Transport {
    int seats;

    Sedan(int topSpeed, String energyType, int seats) {
        super(topSpeed, energyType);
        this.seats = seats;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Seats: " + seats);
    }
}

class Lorry extends Transport {
    int capacity;

    Lorry(int topSpeed, String energyType, int capacity) {
        super(topSpeed, energyType);
        this.capacity = capacity;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Capacity: " + capacity + " tons");
    }
}

class Scooter extends Transport {
    String modelType;

    Scooter(int topSpeed, String energyType, String modelType) {
        super(topSpeed, energyType);
        this.modelType = modelType;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Model Type: " + modelType);
    }
}

class TransportDemo {
    public static void main(String[] args) {
        Transport[] list = {
            new Sedan(200, "Petrol", 4),
            new Lorry(110, "Diesel", 18),
            new Scooter(90, "Electric", "City Scooter")
        };

        for (Transport t : list) {
            t.showDetails();
            System.out.println("------------------");
        }
    }
}


//********************************* 4. Single Inheritance *********************************
// Library Management Example (Rewritten)
class Publication {
    String title;
    int year;

    Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    void showPublication() {
        System.out.println("Publication: " + title + " (" + year + ")");
    }
}

class Writer extends Publication {
    String authorName;
    String description;

    Writer(String title, int year, String authorName, String description) {
        super(title, year);
        this.authorName = authorName;
        this.description = description;
    }

    @Override
    void showPublication() {
        super.showPublication();
        System.out.println("Writer: " + authorName + " | Note: " + description);
    }
}

class PublicationDemo {
    public static void main(String[] args) {
        Writer w = new Writer("Clean Code", 2020, "Robert C. Martin", "Software craftsmanship expert");
        w.showPublication();
    }
}


// Smart Home Device Example (Rewritten)
class Gadget {
    String id;
    String state;

    Gadget(String id, String state) {
        this.id = id;
        this.state = state;
    }

    void showState() {
        System.out.println("Gadget ID: " + id + " | State: " + state);
    }
}

class AirConditioner extends Gadget {
    int temp;

    AirConditioner(String id, String state, int temp) {
        super(id, state);
        this.temp = temp;
    }

    @Override
    void showState() {
        super.showState();
        System.out.println("Temperature: " + temp + "°C");
    }
}

class GadgetDemo {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner("AC202", "Running", 22);
        ac.showState();
    }
}



//********************************* 5. Multilevel Inheritance *********************************
// Order Tracking Example (Rewritten)
class Purchase {
    int orderNo;
    String date;

    Purchase(int orderNo, String date) {
        this.orderNo = orderNo;
        this.date = date;
    }

    String status() {
        return "Order created on " + date;
    }
}

class InTransit extends Purchase {
    String trackingId;

    InTransit(int orderNo, String date, String trackingId) {
        super(orderNo, date);
        this.trackingId = trackingId;
    }

    @Override
    String status() {
        return "Package moving, Tracking ID: " + trackingId;
    }
}

class Arrived extends InTransit {
    String reachedDate;

    Arrived(int orderNo, String date, String trackingId, String reachedDate) {
        super(orderNo, date, trackingId);
        this.reachedDate = reachedDate;
    }

    @Override
    String status() {
        return "Delivered on " + reachedDate;
    }
}

class PurchaseDemo {
    public static void main(String[] args) {
        Arrived pkg = new Arrived(5002, "2025-09-11", "T12345", "2025-09-14");
        System.out.println(pkg.status());
    }
}


// Online Course Example (Rewritten)
class Subject {
    String name;
    int weeks;

    Subject(String name, int weeks) {
        this.name = name;
        this.weeks = weeks;
    }
}

class DigitalCourse extends Subject {
    String site;
    boolean recorded;

    DigitalCourse(String name, int weeks, String site, boolean recorded) {
        super(name, weeks);
        this.site = site;
        this.recorded = recorded;
    }
}

class PremiumCourse extends DigitalCourse {
    double cost;
    double off;

    PremiumCourse(String name, int weeks, String site, boolean recorded, double cost, double off) {
        super(name, weeks, site, recorded);
        this.cost = cost;
        this.off = off;
    }

    void showCourse() {
        System.out.println("Course: " + name + " | Weeks: " + weeks);
        System.out.println("Platform: " + site + " | Recorded: " + recorded);
        System.out.println("Price: " + cost + " | Discount: " + off + "%");
    }
}

class SubjectDemo {
    public static void main(String[] args) {
        PremiumCourse pc = new PremiumCourse("DSA Bootcamp", 10, "Coursera", true, 3999, 15);
        pc.showCourse();
    }
}



//********************************* 6. Hierarchical Inheritance *********************************
// Banking Example (Rewritten)
class Account {
    int accNo;
    double amount;

    Account(int accNo, double amount) {
        this.accNo = accNo;
        this.amount = amount;
    }
}

class Savings extends Account {
    double rate;

    Savings(int accNo, double amount, double rate) {
        super(accNo, amount);
        this.rate = rate;
    }

    void type() {
        System.out.println("Savings | Interest: " + rate + "%");
    }
}

class Current extends Account {
    double limit;

    Current(int accNo, double amount, double limit) {
        super(accNo, amount);
        this.limit = limit;
    }

    void type() {
        System.out.println("Current | Limit: " + limit);
    }
}

class Deposit extends Account {
    int years;

    Deposit(int accNo, double amount, int years) {
        super(accNo, amount);
        this.years = years;
    }

    void type() {
        System.out.println("Fixed Deposit | Period: " + years + " years");
    }
}

class AccountDemo {
    public static void main(String[] args) {
        Savings s = new Savings(301, 7000, 4.2);
        Current c = new Current(302, 12000, 3000);
        Deposit d = new Deposit(303, 60000, 3);

        s.type();
        c.type();
        d.type();
    }
}


// School Example (Rewritten)
class Individual {
    String fullName;
    int years;

    Individual(String fullName, int years) {
        this.fullName = fullName;
        this.years = years;
    }
}

class Mentor extends Individual {
    String field;

    Mentor(String fullName, int years, String field) {
        super(fullName, years);
        this.field = field;
    }

    void role() {
        System.out.println("Mentor: " + fullName + " | Field: " + field);
    }
}

class Learner extends Individual {
    int level;

    Learner(String fullName, int years, int level) {
        super(fullName, years);
        this.level = level;
    }

    void role() {
        System.out.println("Learner: " + fullName + " | Level: " + level);
    }
}

class Helper extends Individual {
    String duty;

    Helper(String fullName, int years, String duty) {
        super(fullName, years);
        this.duty = duty;
    }

    void role() {
        System.out.println("Helper: " + fullName + " | Duty: " + duty);
    }
}

class SchoolDemo {
    public static void main(String[] args) {
        Mentor m = new Mentor("Dr. Verma", 45, "Physics");
        Learner l = new Learner("Anita", 16, 11);
        Helper h = new Helper("Mukesh", 38, "Lab Assistant");

        m.role();
        l.role();
        h.role();
    }
}



//********************************* 7. Hybrid Inheritance (Using Interfaces) *********************************
// Restaurant Example (Rewritten)
interface Duty {
    void work();
}

class Human {
    String personName;
    int code;

    Human(String personName, int code) {
        this.personName = personName;
        this.code = code;
    }
}

class Cook extends Human implements Duty {
    Cook(String personName, int code) {
        super(personName, code);
    }

    @Override
    public void work() {
        System.out.println(personName + " is preparing dishes.");
    }
}

class Server extends Human implements Duty {
    Server(String personName, int code) {
        super(personName, code);
    }

    @Override
    public void work() {
        System.out.println(personName + " is attending guests.");
    }
}

class RestaurantDemo {
    public static void main(String[] args) {
        Duty d1 = new Cook("Arjun", 401);
        Duty d2 = new Server("Meena", 402);

        d1.work();
        d2.work();
    }
}


// Hybrid Vehicle Example (Rewritten)
interface Fuelable {
    void fill();
}

class Machine {
    int speed;
    String model;

    Machine(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }
}

class EV extends Machine {
    EV(int speed, String model) {
        super(speed, model);
    }

    void plugIn() {
        System.out.println(model + " is charging at station.");
    }
}

class PetrolCar extends Machine implements Fuelable {
    PetrolCar(int speed, String model) {
        super(speed, model);
    }

    @Override
    public void fill() {
        System.out.println(model + " is filling petrol.");
    }
}

class MachineDemo {
    public static void main(String[] args) {
        EV ev = new EV(160, "Tata Nexon EV");
        PetrolCar pc = new PetrolCar(190, "Maruti Swift");

        ev.plugIn();
        pc.fill();
    }
}
