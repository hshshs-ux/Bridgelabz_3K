////****************************Part 1: Constructors Practice**********************************
//
//
////1. Book Class with Default and Parameterized Constructors
//static class Book {
//    String title;
//    String author;
//    double price;
//    Book() {
//        title = "Unknown";
//        author = "Unknown";
//        price = 0.0;
//    }
//    Book(String title, String author, double price) {
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }
//
//    void display() {
//        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
//    }
//
//    public static void main(String[] args) {
//        Book b1 = new Book(); // default
//        Book b2 = new Book("Java Programming", "James Gosling", 599.99); // parameterized
//        b1.display();
//        b2.display();
//    }
//}
//
//
//
////2. Crcl Class with Constructor Chaining
//class Crcl {
//    double radius;
//    Crcl() {
//        this(1.0);
//    }
//
//    Crcl(double radius) {
//        this.radius = radius;
//    }
//
//    void display() {
//        System.out.println("Radius: " + radius);
//    }
//
//    public static void main(String[] args) {
//        Circle c1 = new Circle();
//        Circle c2 = new Circle(5.5);
//        c1.equals();
//        c2.equals();
//    }
//}
//
//
////3. Person Class with Copy Constructor
//class Person {
//    String name;
//    int age;
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    Person(Person p) {
//        this.name = p.name;
//        this.age = p.age;
//    }
//
//    void display() {
//        System.out.println("Name: " + name + ", Age: " + age);
//    }
//
//    public static void main(String[] args) {
//        Person p1 = new Person("John", 25);
//        Person p2 = new Person(p1); // copy
//        p1.display();
//        p2.display();
//    }
//}
//
//
////4. Hotel Booking System
//class HotelBooking {
//    String guestName;
//    String roomType;
//    int nights;
//    HotelBooking() {
//        guestName = "Guest";
//        roomType = "Standard";
//        nights = 1;
//    }
//    HotelBooking(String guestName, String roomType, int nights) {
//        this.guestName = guestName;
//        this.roomType = roomType;
//        this.nights = nights;
//    }
//    HotelBooking(HotelBooking hb) {
//        this.guestName = hb.guestName;
//        this.roomType = hb.roomType;
//        this.nights = hb.nights;
//    }
//
//    void display() {
//        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
//    }
//
//    public static void main(String[] args) {
//        HotelBooking b1 = new HotelBooking();
//        HotelBooking b2 = new HotelBooking("Alice", "Deluxe", 3);
//        HotelBooking b3 = new HotelBooking(b2);
//        b1.display();
//        b2.display();
//        b3.display();
//    }
//}
//
//
////5. Library Book System (Borrow Method)
//class LibraryBook {
//    String title;
//    String author;
//    double price;
//    boolean isAvailable;
//
//    LibraryBook(String title, String author, double price) {
//        this.title = title;
//        this.author = author;
//        this.price = price;
//        this.isAvailable = true;
//    }
//
//    void borrowBook() {
//        if (isAvailable) {
//            isAvailable = false;
//            System.out.println(title + " has been borrowed.");
//        } else {
//            System.out.println(title + " is not available.");
//        }
//    }
//
//    void display() {
//        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
//    }
//
//    public static void main(String[] args) {
//        LibraryBook book = new LibraryBook("Java Basics", "James", 500);
//        book.display();
//        book.borrowBook();
//        book.display();
//    }
//}
//
//
////6. Car Rental System
//class CarRental {
//    String customerName;
//    String carModel;
//    int rentalDays;
//    static final int DAILY_RATE = 1000;
//
//    CarRental(String customerName, String carModel, int rentalDays) {
//        this.customerName = customerName;
//        this.carModel = carModel;
//        this.rentalDays = rentalDays;
//    }
//
//    void display() {
//        int totalCost = rentalDays * DAILY_RATE;
//        System.out.println("Customer: " + customerName + ", Car: " + carModel +
//                ", Days: " + rentalDays + ", Total Cost: ₹" + totalCost);
//    }
//
//    public static void main(String[] args) {
//        CarRental rental = new CarRental("Raj", "Honda City", 5);
//        rental.display();
//    }
//}
//
//
//
//
//
////*******************************Part 2: Instance vs Class Variables and Methods******************************
//
//
////Problem 1: Product Inventory
//class Product {
//    String productName;
//    double price;
//    static int totalProducts = 0;
//
//    Product(String productName, double price) {
//        this.productName = productName;
//        this.price = price;
//        totalProducts++;
//    }
//
//    void displayProductDetails() {
//        System.out.println("Product: " + productName + ", Price: ₹" + price);
//    }
//
//    static void displayTotalProducts() {
//        System.out.println("Total Products: " + totalProducts);
//    }
//
//    public static void main(String[] args) {
//        Product p1 = new Product("Laptop", 50000);
//        Product p2 = new Product("Phone", 20000);
//        p1.displayProductDetails();
//        p2.displayProductDetails();
//        Product.displayTotalProducts();
//    }
//}
//
//
////Problem 2: Online Course Management
//class Course {
//    String courseName;
//    int duration; // in months
//    double fee;
//    static String instituteName = "Tech Institute";
//
//    Course(String courseName, int duration, double fee) {
//        this.courseName = courseName;
//        this.duration = duration;
//        this.fee = fee;
//    }
//
//    void displayCourseDetails() {
//        System.out.println("Course: " + courseName + ", Duration: " + duration +
//                " months, Fee: ₹" + fee + ", Institute: " + instituteName);
//    }
//
//    static void updateInstituteName(String newName) {
//        instituteName = newName;
//    }
//
//    public static void main(String[] args) {
//        Course c1 = new Course("Java", 3, 15000);
//        Course c2 = new Course("Python", 2, 10000);
//        c1.displayCourseDetails();
//        c2.displayCourseDetails();
//        Course.updateInstituteName("Code Academy");
//        c1.displayCourseDetails();
//        c2.displayCourseDetails();
//    }
//}
//
//
////Problem 3: Vehicle Registration
//class Vehicle {
//    String ownerName;
//    String vehicleType;
//    static double registrationFee = 5000;
//
//    Vehicle(String ownerName, String vehicleType) {
//        this.ownerName = ownerName;
//        this.vehicleType = vehicleType;
//    }
//
//    void displayVehicleDetails() {
//        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType +
//                ", Registration Fee: ₹" + registrationFee);
//    }
//
//    static void updateRegistrationFee(double newFee) {
//        registrationFee = newFee;
//    }
//
//    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle("Arun", "Car");
//        Vehicle v2 = new Vehicle("Meera", "Bike");
//        v1.displayVehicleDetails();
//        v2.displayVehicleDetails();
//        Vehicle.updateRegistrationFee(6000);
//        v1.displayVehicleDetails();
//        v2.displayVehicleDetails();
//    }
//}
//
//
//
////****************************Part 3: Access Modifiers (Full Implementation)************************************
////Problem 1: University Management System
//class Student {
//    public int rollNumber;
//    protected String name;
//    private double CGPA;
//
//    // Constructor
//    Student(int rollNumber, String name, double CGPA) {
//        this.rollNumber = rollNumber;
//        this.name = name;
//        this.CGPA = CGPA;
//    }
//
//    // Public methods to access private CGPA
//    public double getCGPA() {
//        return CGPA;
//    }
//
//    public void setCGPA(double CGPA) {
//        this.CGPA = CGPA;
//    }
//
//    public void display() {
//        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
//    }
//}
//
//// Subclass to show protected access
//class PostgraduateStudent extends Student {
//    String thesisTopic;
//
//    PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTopic) {
//        super(rollNumber, name, CGPA);
//        this.thesisTopic = thesisTopic;
//    }
//
//    public void displayPGDetails() {
//        System.out.println("PG Student: Roll No: " + rollNumber + ", Name: " + name +
//                ", Thesis Topic: " + thesisTopic);
//    }
//
//    public static void main(String[] args) {
//        Student s1 = new Student(101, "Amit", 8.5);
//        s1.display();
//        s1.setCGPA(9.0);
//        System.out.println("Updated CGPA: " + s1.getCGPA());
//
//        PostgraduateStudent pg = new PostgraduateStudent(102, "Riya", 9.2, "AI in Education");
//        pg.displayPGDetails();
//    }
//}
//
//
////Problem 2: Book Library System
//class Book1 {
//    public String ISBN;
//    protected String title;
//    private String author;
//
//    Book1(String ISBN, String title, String author) {
//        this.ISBN = ISBN;
//        this.title = title;
//        this.author = author;
//    }
//
//    // Methods for author
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public void display() {
//        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
//    }
//}
//
//// Subclass
//class EBook extends Book {
//    double fileSize;
//    private String ISBN;
//
//    EBook(String ISBN, String title, String author, double fileSize) {
//        super(ISBN, title, Double.parseDouble(author));
//        this.fileSize = fileSize;
//    }
//
//    public void displayEBook() {
//        // Access public ISBN and protected title
//        System.out.println("EBook - ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSize + "MB");
//    }
//
//    public static void main(String[] args) {
//        Book1 book = new Book("12345", "Java Programming", "James Gosling");
//        book.display();
//        book.setAuthor("Oracle");
//        System.out.println("Updated Author: " + book.getAuthor());
//
//        EBook ebook = new EBook("67890", "Python Guide", "Guido van Rossum", 5.2);
//        ebook.displayEBook();
//    }
//}
//
//
////Problem 3: Bank Account Management
//class BankAcc {
//    public String accountNumber;
//    protected String accountHolder;
//    private double balance;
//
//    BankAcc(String accountNumber, String accountHolder, double balance) {
//        this.accountNumber = accountNumber;
//        this.accountHolder = accountHolder;
//        this.balance = balance;
//    }
//
//    // Public methods for balance
//    public double getBalance() {
//        return balance;
//    }
//
//    public void deposit(double amount) {
//        balance += amount;
//        System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
//    }
//
//    public void withdraw(double amount) {
//        if (amount <= balance) {
//            balance -= amount;
//            System.out.println("Withdrew ₹" + amount + ". Remaining Balance: ₹" + balance);
//        } else {
//            System.out.println("Insufficient balance.");
//        }
//    }
//
//    public void display() {
//        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder);
//    }
//}
//
//// Subclass
//class SavingsAccount extends BankAccount {
//    double interestRate;
//
//    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
//        super(accountNumber, accountHolder, balance);
//        this.interestRate = interestRate;
//    }
//
//    public void displaySavingsAccount() {
//        System.out.println("Savings Account - Account Number: " + accountNumber +
//                ", Holder: " + accountHolder + ", Interest Rate: " + interestRate + "%");
//    }
//
//    public static void main(String[] args) {
//        BankAccount acc = new BankAccount("1111", "Amit", 5000);
//        acc.display();
//        acc.deposit(2000);
//        acc.withdraw(1000);
//
//        SavingsAccount sAcc = new SavingsAccount("2222", "Riya", 8000, 4.5);
//        sAcc.displaySavingsAccount();
//    }
//}
//
////Problem 4: Employee Records
//class Employee {
//    public int employeeID;
//    protected String department;
//    private double salary;
//
//    Employee(int employeeID, String department, double salary) {
//        this.employeeID = employeeID;
//        this.department = department;
//        this.salary = salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//        System.out.println("Updated Salary: ₹" + this.salary);
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void display() {
//        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: ₹" + salary);
//    }
//}
//
//// Subclass
//class Manager extends Employee {
//    String teamName;
//
//    Manager(int employeeID, String department, double salary, String teamName) {
//        super(employeeID, department, salary);
//        this.teamName = teamName;
//    }
//
//    public void displayManager() {
//        // Accessing public and protected members
//        System.out.println("Manager - ID: " + employeeID + ", Department: " + department + ", Team: " + teamName);
//    }
//
//    public static void main(String[] args) {
//        Employee emp = new Employee(101, "HR", 30000);
//        emp.display();
//        emp.setSalary(35000);
//
//        Manager mgr = new Manager(201, "IT", 70000, "Development");
//        mgr.displayManager();
//    }
//}
