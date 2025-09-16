////Program 1: Bank Account System (Modified)
//class BankAccount {
//    private static String bankTitle = "Reserve Bank of India";
//    private static int accountCounter = 0;
//
//    private final String accNo;
//    private String holderName;
//    private double accBalance;
//
//    public BankAccount(String holderName, String accNo, double accBalance) {
//        this.holderName = holderName;
//        this.accNo = accNo;
//        this.accBalance = accBalance;
//        accountCounter++;
//    }
//
//    public static void showTotalAccounts() {
//        System.out.println("Total Accounts Opened: " + accountCounter);
//    }
//
//    public void printAccountInfo() {
//        if (this instanceof BankAccount) {
//            System.out.println("Bank: " + bankTitle);
//            System.out.println("Account Holder: " + holderName);
//            System.out.println("Account Number: " + accNo);
//            System.out.println("Balance: ₹" + accBalance);
//        }
//    }
//
//    public void depositAmount(double amount) {
//        if (amount > 0) {
//            accBalance += amount;
//            System.out.println("Deposited: ₹" + amount);
//        }
//    }
//
//    public void withdrawAmount(double amount) {
//        if (amount > 0 && amount <= accBalance) {
//            accBalance -= amount;
//            System.out.println("Withdrawn: ₹" + amount);
//        } else {
//            System.out.println("Insufficient Funds!");
//        }
//    }
//
//    public static void main(String[] args) {
//        BankAccount a1 = new BankAccount("Aarav Mehta", "BNK1001", 15000.00);
//        BankAccount a2 = new BankAccount("Riya Kapoor", "BNK1002", 25000.00);
//
//        a1.printAccountInfo();
//        a2.printAccountInfo();
//
//        BankAccount.showTotalAccounts();
//
//        a1.depositAmount(5000);
//        a1.withdrawAmount(2000);
//        a1.printAccountInfo();
//    }
//}
//
////Program 2: Library Management System (Modified)
//class Book {
//    private static String libName;
//    private String bookTitle;
//    private String bookAuthor;
//    private final String bookCode;
//
//    public Book(String bookTitle, String bookAuthor, String bookCode) {
//        this.bookTitle = bookTitle;
//        this.bookAuthor = bookAuthor;
//        this.bookCode = bookCode;
//    }
//
//    public static void setLibName(String name) {
//        libName = name;
//    }
//
//    public static void showLibName() {
//        System.out.println("Library: " + libName);
//    }
//
//    public void showBookInfo() {
//        if (this instanceof Book) {
//            System.out.println("Title: " + bookTitle);
//            System.out.println("Author: " + bookAuthor);
//            System.out.println("ISBN Code: " + bookCode);
//        }
//    }
//}
//
//class Library {
//    public static void main(String[] args) {
//        Book.setLibName("National Digital Library");
//        Book.showLibName();
//
//        Book b1 = new Book("Clean Code", "Robert C. Martin", "ISBN-111223344");
//        Book b2 = new Book("Java Concurrency in Practice", "Brian Goetz", "ISBN-555888999");
//
//        b1.showBookInfo();
//        System.out.println();
//        b2.showBookInfo();
//    }
//}
//
////Program 3: Employee Management System (Modified)
//class Employee {
//    private static String orgName;
//    private static int empCount = 0;
//
//    private String empName;
//    private final int empId;
//    private String role;
//
//    public Employee(String empName, int empId, String role) {
//        this.empName = empName;
//        this.empId = empId;
//        this.role = role;
//        empCount++;
//    }
//
//    public static void setOrgName(String name) {
//        orgName = name;
//    }
//
//    public static void showTotalEmployees() {
//        System.out.println("Employees in Company: " + empCount);
//    }
//
//    public void showEmployeeDetails() {
//        if (this instanceof Employee) {
//            System.out.println("Organization: " + orgName);
//            System.out.println("ID: " + empId);
//            System.out.println("Name: " + empName);
//            System.out.println("Role: " + role);
//        }
//    }
//
//    public static void main(String[] args) {
//        Employee.setOrgName("Infosys Ltd");
//
//        Employee e1 = new Employee("Kavya Sharma", 201, "Data Analyst");
//        Employee e2 = new Employee("Rohan Singh", 202, "Team Lead");
//
//        Employee.showTotalEmployees();
//
//        e1.showEmployeeDetails();
//        e2.showEmployeeDetails();
//    }
//}
//
////Program 4: Shopping Cart System (Modified)
//class Item {
//    private static double globalDiscount = 5.0;
//
//    private final String itemCode;
//    private String itemName;
//    private double unitPrice;
//    private int stockQty;
//
//    public Item(String itemCode, String itemName, double unitPrice, int stockQty) {
//        this.itemCode = itemCode;
//        this.itemName = itemName;
//        this.unitPrice = unitPrice;
//        this.stockQty = stockQty;
//    }
//
//    public static void changeDiscount(double newDisc) {
//        globalDiscount = newDisc;
//    }
//
//    public double calcDiscountedPrice() {
//        return unitPrice - (unitPrice * globalDiscount / 100);
//    }
//
//    public void displayItem() {
//        if (this instanceof Item) {
//            System.out.println("Item Code: " + itemCode);
//            System.out.println("Name: " + itemName);
//            System.out.println("Price: ₹" + unitPrice);
//            System.out.println("Stock: " + stockQty);
//            System.out.println("Discount: " + globalDiscount + "%");
//            System.out.println("Final Price: ₹" + calcDiscountedPrice());
//        }
//    }
//
//    public static void main(String[] args) {
//        Item.changeDiscount(15.0);
//
//        Item it1 = new Item("I101", "Gaming Mouse", 2500.00, 20);
//        Item it2 = new Item("I102", "Mechanical Keyboard", 4500.00, 15);
//
//        it1.displayItem();
//        System.out.println();
//        it2.displayItem();
//    }
//}
//
////Program 5: University Student Management (Modified)
//class Learner {
//    private static String collegeName;
//    private static int studentCount = 0;
//
//    private final int rollId;
//    private String studName;
//    private char studGrade;
//
//    public Learner(String studName, int rollId, char studGrade) {
//        this.studName = studName;
//        this.rollId = rollId;
//        this.studGrade = studGrade;
//        studentCount++;
//    }
//
//    public static void setCollegeName(String name) {
//        collegeName = name;
//    }
//
//    public static void showTotalStudents() {
//        System.out.println("Total Enrolled Students: " + studentCount);
//    }
//
//    public void showStudentDetails() {
//        if (this instanceof Learner) {
//            System.out.println("College: " + collegeName);
//            System.out.println("Roll ID: " + rollId);
//            System.out.println("Name: " + studName);
//            System.out.println("Grade: " + studGrade);
//        }
//    }
//
//    public void updateGrade(char newGrade) {
//        this.studGrade = newGrade;
//        System.out.println("Grade Updated for " + studName + " -> " + newGrade);
//    }
//
//    public static void main(String[] args) {
//        Learner.setCollegeName("Amity University");
//
//        Learner s1 = new Learner("Ananya Verma", 301, 'A');
//        Learner s2 = new Learner("Siddharth Nair", 302, 'B');
//
//        Learner.showTotalStudents();
//
//        s1.showStudentDetails();
//        s2.showStudentDetails();
//
//        s2.updateGrade('A');
//        s2.showStudentDetails();
//    }
//}
//
////Program 6: Vehicle Registration System (Modified)
//class Automobile {
//    private static double regFee = 200.0;
//
//    private final String regId;
//    private String ownerFullName;
//    private String autoType;
//
//    public Automobile(String ownerFullName, String autoType, String regId) {
//        this.ownerFullName = ownerFullName;
//        this.autoType = autoType;
//        this.regId = regId;
//    }
//
//    public static void modifyFee(double newFee) {
//        regFee = newFee;
//    }
//
//    public void showAutoDetails() {
//        if (this instanceof Automobile) {
//            System.out.println("Owner: " + ownerFullName);
//            System.out.println("Type: " + autoType);
//            System.out.println("Reg ID: " + regId);
//            System.out.println("Registration Fee: ₹" + regFee);
//        }
//    }
//
//    public static void main(String[] args) {
//        Automobile.modifyFee(250.0);
//
//        Automobile v1 = new Automobile("Neha Gupta", "Hatchback", "MH12AB1234");
//        Automobile v2 = new Automobile("Manoj Yadav", "Motorbike", "UP16XY5678");
//
//        v1.showAutoDetails();
//        v2.showAutoDetails();
//    }
//}
//
////Program 7: Hospital Management System (Modified)
//class Patient {
//    private static String hospName;
//    private static int admittedCount = 0;
//
//    private final String patId;
//    private String patName;
//    private int patAge;
//    private String disease;
//
//    public Patient(String patName, int patAge, String disease, String patId) {
//        this.patName = patName;
//        this.patAge = patAge;
//        this.disease = disease;
//        this.patId = patId;
//        admittedCount++;
//    }
//
//    public static void setHospName(String name) {
//        hospName = name;
//    }
//
//    public static int totalAdmitted() {
//        return admittedCount;
//    }
//
//    public void showPatientInfo() {
//        if (this instanceof Patient) {
//            System.out.println("Hospital: " + hospName);
//            System.out.println("Patient ID: " + patId);
//            System.out.println("Name: " + patName);
//            System.out.println("Age: " + patAge);
//            System.out.println("Disease: " + disease);
//        }
//    }
//
//    public static void main(String[] args) {
//        Patient.setHospName("Apollo Hospitals");
//
//        Patient p1 = new Patient("Arjun Malhotra", 28, "Asthma", "PAT1001");
//        Patient p2 = new Patient("Meera Joshi", 52, "Diabetes", "PAT1002");
//
//        System.out.println("Total Patients: " + Patient.totalAdmitted());
//
//        p1.showPatientInfo();
//        p2.showPatientInfo();
//    }
//}
