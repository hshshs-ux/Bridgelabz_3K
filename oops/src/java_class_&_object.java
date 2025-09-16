//***************************** Level 1 Practice Programs (Rewritten) ****************************************

//1. Program to Display Staff Details
class Staff {
    //non-static variables
    String staffName;
    int staffId;
    double staffSalary;

    Staff(String staffName, int staffId, double staffSalary) {
        this.staffName = staffName;
        this.staffId = staffId;
        this.staffSalary = staffSalary;
    }

    public void showStaffInfo() {
        System.out.println("Staff Name: " + staffName);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff Salary: " + staffSalary);
    }

    public static void main(String[] args) {
        Staff s1 = new Staff("Ananya", 101, 600000);
        s1.showStaffInfo();
    }
}


//2. Program to Compute Area of a Rectangle
class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        System.out.printf("Area of rectangle: %.2f", (length * width));
    }

    public void calculatePerimeter() {
        System.out.printf("\nPerimeter of rectangle: %.2f", (2 * (length + width)));
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        rect.calculateArea();
        rect.calculatePerimeter();
    }
}


//3. Program to Handle Magazine Details
class Magazine {
    String title;
    String editor;
    double cost;

    Magazine(String title, String editor, double cost) {
        this.title = title;
        this.editor = editor;
        this.cost = cost;
    }

    public void printMagazineInfo() {
        System.out.println("Magazine Title: " + title);
        System.out.println("Editor: " + editor);
        System.out.println("Cost: " + cost);
    }

    public static void main(String[] args) {
        Magazine m1 = new Magazine("Tech World", "Ravi Kumar", 250);
        Magazine m2 = new Magazine("Nature Insights", "Pooja Sharma", 300);
        m1.printMagazineInfo();
        m2.printMagazineInfo();
    }
}


//4. Program to Track Store Products
class ProductInventory {
    String[] codes;
    String[] names;
    double[] costs;

    ProductInventory(String[] names, String[] codes, double[] costs) {
        this.codes = codes;
        this.names = names;
        this.costs = costs;
    }

    public void showProduct(int i) {
        System.out.println("Code : " + codes[i]);
        System.out.println("Price : " + costs[i]);
        System.out.println("Name : " + names[i]);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        String[] prodNames = {"Notebook", "Pen", "Bag"};
        String[] prodCodes = {"P01", "P02", "P03"};
        double[] prodCosts = {40, 10, 600};
        ProductInventory inventory = new ProductInventory(prodNames, prodCodes, prodCosts);

        for (int i = 0; i < prodCosts.length; i++) {
            inventory.showProduct(i);
        }
    }
}


//5. Program to Handle Laptop Details
class Laptop {
    String brand;
    String series;
    double cost;

    Laptop(String brand, String series, double cost) {
        this.brand = brand;
        this.series = series;
        this.cost = cost;
    }

    public void showLaptop() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Series: " + series);
        System.out.println("Cost: " + cost);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", "Inspiron 15", 55000);
        Laptop l2 = new Laptop("HP", "Pavilion X360", 62000);
        Laptop l3 = new Laptop("Lenovo", "ThinkPad X1", 98000);

        l1.showLaptop();
        l2.showLaptop();
        l3.showLaptop();
    }
}




//***************************** Level 2 Practice Programs (Rewritten) ****************************************

//1. Program to Simulate Student Marks Report
class ReportCard {
    String studentName;
    String regNo;
    double[] scores;

    ReportCard(String studentName, String regNo, double[] scores) {
        this.studentName = studentName;
        this.regNo = regNo;
        this.scores = scores;
    }

    public String findGrade(double[] scores) {
        double avgMarks = calculateAverage(scores);
        if (avgMarks >= 80 && avgMarks <= 100) {
            return "Grade A";
        } else if (avgMarks >= 60) {
            return "Grade B";
        } else if (avgMarks >= 50) {
            return "Grade C";
        } else if (avgMarks >= 40) {
            return "Grade D";
        } else {
            return "Grade F";
        }
    }

    public void printReport() {
        System.out.println("Name: " + studentName);
        System.out.println("Register No: " + regNo);
        System.out.println("Marks:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + scores[i]);
        }
        System.out.println(findGrade(scores));
    }

    public double calculateAverage(double[] scores) {
        double total = 0;
        for (double s : scores) {
            total += s;
        }
        return total / scores.length;
    }

    public static void main(String[] args) {
        double[] marks1 = {85, 90, 88};
        double[] marks2 = {55, 60, 58};
        ReportCard r1 = new ReportCard("Sneha", "CSE101", marks1);
        ReportCard r2 = new ReportCard("Arjun", "ECE205", marks2);
        r1.printReport();
        r2.printReport();
    }
}


//2. Program to Simulate Bank ATM
class Account {
    private String holder;
    private String accNumber;
    private double balance;

    public Account(String holder, String accNumber, double balance) {
        this.holder = holder;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public static void showBankInfo() {
        System.out.println("\t\tWelcome to National Bank\t\t");
    }

    public void depositMoney(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited: " + amt);
        } else {
            System.out.println("Deposit must be positive");
        }
    }

    public void withdrawMoney(double amt) {
        if (amt <= balance && amt > 0) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else if (amt <= 0) {
            System.out.println("Amount must be greater than zero");
        } else {
            System.out.println("Not enough balance");
        }
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Account acc1 = new Account("Ramesh", "ACC89012", 1000.00);
        showBankInfo();
        acc1.showBalance();
        acc1.depositMoney(500.00);
        acc1.showBalance();
        acc1.withdrawMoney(200.00);
        acc1.showBalance();
        acc1.withdrawMoney(2000.00);
    }
}


//3. Program to Check Palindrome String
class StringMirror {
    String phrase;

    StringMirror(String phrase) {
        this.phrase = phrase;
    }

    public boolean checkPalindrome() {
        String clean = phrase.replaceAll("\\s", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    public void printResult() {
        if (checkPalindrome()) {
            System.out.println(phrase + " is a Palindrome");
        } else {
            System.out.println(phrase + " is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        StringMirror sm1 = new StringMirror("Never odd or even");
        sm1.printResult();
        StringMirror sm2 = new StringMirror("Java Programming");
        sm2.printResult();
    }
}


//4. Program to Model a Concert Ticket Booking
class ConcertTicket {
    private String concertName;
    private String seat;
    private double ticketCost;
    private boolean booked;

    ConcertTicket(String concertName) {
        this.concertName = concertName;
        this.seat = "None";
        this.ticketCost = 0.0;
        this.booked = false;
    }

    public void reserveTicket(String seat, double ticketCost) {
        if (booked) {
            System.err.println("Sorry, ticket already booked!");
        } else {
            this.seat = seat;
            this.ticketCost = ticketCost;
            this.booked = true;
            System.out.println("Ticket booked for concert: " + concertName);
            System.out.println("Seat: " + this.seat);
            System.out.println("Cost: $" + this.ticketCost);
        }
    }

    public void showTicket() {
        if (booked) {
            System.out.println("Concert: " + concertName);
            System.out.println("Seat: " + seat);
            System.out.println("Cost: $" + ticketCost);
        } else {
            System.out.println("Ticket not booked yet.");
        }
    }

    public static void main(String[] args) {
        ConcertTicket t1 = new ConcertTicket("Rock Night");
        t1.showTicket();
        t1.reserveTicket("C12", 150.0);
        t1.reserveTicket("D15", 200.0);
        t1.showTicket();
    }
}


//5. Program to Simulate Shopping Basket
class BasketItem {
    private String product;
    private double cost;
    private int qty;

    public BasketItem(String product, double cost, int qty) {
        this.product = product;
        this.cost = cost;
        this.qty = qty;
    }

    public void increaseQty(int add) {
        this.qty += add;
        System.out.println("Added " + add + " of " + product + " to basket.");
    }

    public void decreaseQty(int remove) {
        if (remove > this.qty) {
            System.out.println("Cannot remove " + remove + " as only " + qty + " available.");
        } else {
            this.qty -= remove;
            System.out.println("Removed " + remove + " of " + product + " from basket.");
        }
    }

    public double calcTotal() {
        return cost * qty;
    }

    public void printItem() {
        System.out.println("Product: " + product + ", Price: $" + cost + ", Quantity: " + qty);
    }

    public static void main(String[] args) {
        BasketItem b1 = new BasketItem("Headphones", 1500.00, 2);
        b1.printItem();
        b1.increaseQty(1);
        b1.decreaseQty(2);
        System.out.println("Total Cost: $" + b1.calcTotal());
    }
}
