////***************************** Level 1 Practice Programs ****************************************

//1. Program to Display Worker Details
class Worker {
    String workerName;
    int workerId;
    double wage;

    Worker(String wName, int wId, double wWage) {
        this.workerName = wName;
        this.workerId = wId;
        this.wage = wWage;
    }

    public void showWorkerInfo() {
        System.out.println("Worker Name: " + workerName);
        System.out.println("Worker ID: " + workerId);
        System.out.println("Worker Wage: " + wage);
    }

    public static void main(String[] args) {
        Worker emp = new Worker("Raghav", 101, 45000);
        emp.showWorkerInfo();
    }
}


//2. Program to Compute Area of a Disk
class Disk {
    double radius;

    Disk(double r) {
        this.radius = r;
    }

    public void printArea() {
        System.out.printf("Disk Area: %.4f", (Math.PI * radius * radius));
    }

    public void printPerimeter() {
        System.out.printf("\nDisk Circumference: %.4f", (2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        Disk d = new Disk(3.2);
        d.printArea();
        d.printPerimeter();
    }
}


//3. Program to Handle Novel Details
class Novel {
    String novelName;
    String writer;
    double cost;

    Novel(String name, String writer, double price) {
        this.novelName = name;
        this.writer = writer;
        this.cost = price;
    }

    public void printNovelInfo() {
        System.out.println("Novel: " + novelName);
        System.out.println("Writer: " + writer);
        System.out.println("Cost: " + cost);
    }

    public static void main(String[] args) {
        Novel n1 = new Novel("The Alchemist", "Paulo Coelho", 400);
        Novel n2 = new Novel("Half Girlfriend", "Chetan Bhagat", 350);
        n1.printNovelInfo();
        n2.printNovelInfo();
    }
}


//4. Program to Track Products
class ProductStock {
    String[] codes;
    String[] names;
    double[] costs;

    ProductStock(String[] names, String[] codes, double[] costs) {
        this.codes = codes;
        this.names = names;
        this.costs = costs;
    }

    public void printProduct(int index) {
        System.out.println("Code: " + codes[index]);
        System.out.println("Name: " + names[index]);
        System.out.println("Cost: " + costs[index]);
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        String[] n = {"Pen", "Notebook", "Bag"};
        String[] c = {"P01", "N02", "B03"};
        double[] p = {10, 50, 800};
        ProductStock stock = new ProductStock(n, c, p);

        for (int i = 0; i < p.length; i++) {
            stock.printProduct(i);
        }
    }
}


//5. Program to Handle Smartphone Details
class Smartphone {
    String brand;
    String modelName;
    double cost;

    Smartphone(String b, String m, double c) {
        this.brand = b;
        this.modelName = m;
        this.cost = c;
    }

    public void showPhone() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelName);
        System.out.println("Cost: " + cost);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Smartphone p1 = new Smartphone("Samsung", "Galaxy S23", 75000);
        Smartphone p2 = new Smartphone("Xiaomi", "Redmi Note 13", 15000);
        Smartphone p3 = new Smartphone("Apple", "iPhone 15", 120000);

        p1.showPhone();
        p2.showPhone();
        p3.showPhone();
    }
}



////***************************** Level 2 Practice Programs ****************************************

//1. Program to Simulate Report Card
class ReportCard {
    String studentName;
    String rollNo;
    double[] subjectMarks;

    ReportCard(String name, String roll, double[] marks) {
        this.studentName = name;
        this.rollNo = roll;
        this.subjectMarks = marks;
    }

    public String assignGrade(double[] marks) {
        double avg = computeAverage(marks);
        if (avg >= 80) return "Grade A";
        else if (avg >= 60) return "Grade B";
        else if (avg >= 50) return "Grade C";
        else if (avg >= 40) return "Grade D";
        else return "Grade F";
    }

    public void showStudentReport() {
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
        for (int i = 0; i < subjectMarks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + subjectMarks[i]);
        }
        System.out.println(assignGrade(subjectMarks));
    }

    private double computeAverage(double[] marks) {
        double sum = 0;
        for (double m : marks) sum += m;
        return sum / marks.length;
    }

    public static void main(String[] args) {
        double[] m1 = {85, 90, 80};
        double[] m2 = {55, 60, 65};
        ReportCard s1 = new ReportCard("Arjun", "CSE101", m1);
        ReportCard s2 = new ReportCard("Meera", "ECE102", m2);
        s1.showStudentReport();
        s2.showStudentReport();
    }
}


//2. Program to Simulate ATM
class Account {
    private String holder;
    private String accNumber;
    private double balance;

    public Account(String h, String acc, double bal) {
        this.holder = h;
        this.accNumber = acc;
        this.balance = bal;
    }

    public static void showBankHeader() {
        System.out.println("\tWelcome to National Bank\t");
    }

    public void depositMoney(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited: " + amt);
        }
    }

    public void withdrawMoney(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Invalid or insufficient funds");
        }
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Account acc = new Account("Kiran", "AC1234", 1000);
        showBankHeader();
        acc.showBalance();
        acc.depositMoney(500);
        acc.showBalance();
        acc.withdrawMoney(400);
        acc.showBalance();
        acc.withdrawMoney(2000);
    }
}


//3. Program to Check Palindrome
class MirrorWord {
    String input;

    MirrorWord(String txt) {
        this.input = txt;
    }

    public boolean checkMirror() {
        String clean = input.replaceAll("\\s", "").toLowerCase();
        String rev = new StringBuilder(clean).reverse().toString();
        return clean.equals(rev);
    }

    public void showResult() {
        if (checkMirror()) System.out.println(input + " is a Palindrome");
        else System.out.println(input + " is not a Palindrome");
    }

    public static void main(String[] args) {
        MirrorWord m1 = new MirrorWord("Madam");
        MirrorWord m2 = new MirrorWord("Hello");
        m1.showResult();
        m2.showResult();
    }
}


//4. Program to Model Movie Booking
class CinemaTicket {
    private String film;
    private String seat;
    private double rate;
    private boolean booked;

    CinemaTicket(String film) {
        this.film = film;
        this.seat = "None";
        this.rate = 0.0;
        this.booked = false;
    }

    public void reserveTicket(String seatNo, double price) {
        if (booked) {
            System.out.println("Already booked!");
        } else {
            this.seat = seatNo;
            this.rate = price;
            this.booked = true;
            System.out.println("Booked for: " + film + " Seat: " + seat + " Price: " + rate);
        }
    }

    public void showTicket() {
        if (booked) {
            System.out.println("Ticket confirmed: " + film + ", Seat: " + seat + ", Price: " + rate);
        } else {
            System.out.println("Not booked yet.");
        }
    }

    public static void main(String[] args) {
        CinemaTicket t = new CinemaTicket("Avatar");
        t.showTicket();
        t.reserveTicket("B12", 250);
        t.reserveTicket("C10", 250);
        t.showTicket();
    }
}


//5. Program to Simulate Shopping Cart
class BasketItem {
    private String item;
    private double unitCost;
    private int qty;

    public BasketItem(String item, double cost, int q) {
        this.item = item;
        this.unitCost = cost;
        this.qty = q;
    }

    public void addQuantity(int add) {
        this.qty += add;
        System.out.println("Added " + add + " " + item);
    }

    public void reduceQuantity(int rem) {
        if (rem > qty) {
            System.out.println("Not enough items to remove");
        } else {
            this.qty -= rem;
            System.out.println("Removed " + rem + " " + item);
        }
    }

    public double calcTotal() {
        return unitCost * qty;
    }

    public void showItem() {
        System.out.println("Item: " + item + ", Cost: " + unitCost + ", Qty: " + qty);
    }

    public static void main(String[] args) {
        BasketItem b = new BasketItem("Headphones", 2000, 1);
        b.showItem();
        b.addQuantity(2);
        b.reduceQuantity(1);
        System.out.println("Total: " + b.calcTotal());
    }
}
