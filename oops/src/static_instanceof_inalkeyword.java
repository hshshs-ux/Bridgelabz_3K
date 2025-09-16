////Program 1: Bank Account System (Fresh Version)
class SavingsAccount {
    private static String centralBank = "Reserve Bank of India";
    private static int totalAccounts = 0;

    private final String accountId;
    private String customerName;
    private double balanceAmount;

    public SavingsAccount(String customerName, String accountId, double balanceAmount) {
        this.customerName = customerName;
        this.accountId = accountId;
        this.balanceAmount = balanceAmount;
        totalAccounts++;
    }

    public static void displayTotalAccounts() {
        System.out.println("Accounts Created: " + totalAccounts);
    }

    public void showAccountDetails() {
        System.out.println("Bank: " + centralBank);
        System.out.println("Holder: " + customerName);
        System.out.println("Account ID: " + accountId);
        System.out.println("Balance: ₹" + balanceAmount);
    }

    public void addFunds(double amount) {
        if (amount > 0) {
            balanceAmount += amount;
            System.out.println("Deposited: ₹" + amount);
        }
    }

    public void takeOutFunds(double amount) {
        if (amount > 0 && amount <= balanceAmount) {
            balanceAmount -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount("Ishaan Gupta", "ACC5001", 18000.00);
        SavingsAccount acc2 = new SavingsAccount("Tanvi Sharma", "ACC5002", 32000.00);

        acc1.showAccountDetails();
        acc2.showAccountDetails();

        SavingsAccount.displayTotalAccounts();

        acc1.addFunds(7000);
        acc1.takeOutFunds(2500);
        acc1.showAccountDetails();
    }
}


////Program 2: Library Management System (Fresh Version)
class ReadingMaterial {
    private static String libraryTitle;
    private String title;
    private String writer;
    private final String isbnCode;

    public ReadingMaterial(String title, String writer, String isbnCode) {
        this.title = title;
        this.writer = writer;
        this.isbnCode = isbnCode;
    }

    public static void updateLibraryTitle(String name) {
        libraryTitle = name;
    }

    public static void printLibraryTitle() {
        System.out.println("Library: " + libraryTitle);
    }

    public void showMaterialDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + writer);
        System.out.println("ISBN: " + isbnCode);
    }
}

class ReadingCenter {
    public static void main(String[] args) {
        ReadingMaterial.updateLibraryTitle("Global Knowledge Hub");
        ReadingMaterial.printLibraryTitle();

        ReadingMaterial m1 = new ReadingMaterial("Effective Java", "Joshua Bloch", "ISBN-999888777");
        ReadingMaterial m2 = new ReadingMaterial("Spring in Action", "Craig Walls", "ISBN-222333444");

        m1.showMaterialDetails();
        System.out.println();
        m2.showMaterialDetails();
    }
}


////Program 3: Employee Management System (Fresh Version)
class StaffMember {
    private static String companyTitle;
    private static int headcount = 0;

    private String staffName;
    private final int staffId;
    private String position;

    public StaffMember(String staffName, int staffId, String position) {
        this.staffName = staffName;
        this.staffId = staffId;
        this.position = position;
        headcount++;
    }

    public static void updateCompanyTitle(String title) {
        companyTitle = title;
    }

    public static void displayHeadcount() {
        System.out.println("Total Employees: " + headcount);
    }

    public void printStaffDetails() {
        System.out.println("Company: " + companyTitle);
        System.out.println("ID: " + staffId);
        System.out.println("Name: " + staffName);
        System.out.println("Role: " + position);
    }

    public static void main(String[] args) {
        StaffMember.updateCompanyTitle("Tech Mahindra");

        StaffMember s1 = new StaffMember("Pranav Nair", 501, "Backend Developer");
        StaffMember s2 = new StaffMember("Simran Kaur", 502, "Project Manager");

        StaffMember.displayHeadcount();

        s1.printStaffDetails();
        s2.printStaffDetails();
    }
}


////Program 4: Shopping Cart System (Fresh Version)
class StoreProduct {
    private static double defaultDiscount = 10.0;

    private final String code;
    private String label;
    private double rate;
    private int quantity;

    public StoreProduct(String code, String label, double rate, int quantity) {
        this.code = code;
        this.label = label;
        this.rate = rate;
        this.quantity = quantity;
    }

    public static void adjustDiscount(double newValue) {
        defaultDiscount = newValue;
    }

    public double computeDiscountedRate() {
        return rate - (rate * defaultDiscount / 100);
    }

    public void printProductDetails() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + label);
        System.out.println("Rate: ₹" + rate);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + defaultDiscount + "%");
        System.out.println("Final Rate: ₹" + computeDiscountedRate());
    }

    public static void main(String[] args) {
        StoreProduct.adjustDiscount(20.0);

        StoreProduct sp1 = new StoreProduct("P201", "Bluetooth Speaker", 3000.00, 30);
        StoreProduct sp2 = new StoreProduct("P202", "Wireless Earbuds", 6000.00, 25);

        sp1.printProductDetails();
        System.out.println();
        sp2.printProductDetails();
    }
}


////Program 5: University Student Management (Fresh Version)
class Scholar {
    private static String universityTitle;
    private static int totalScholars = 0;

    private final int regNo;
    private String fullName;
    private char performanceGrade;

    public Scholar(String fullName, int regNo, char performanceGrade) {
        this.fullName = fullName;
        this.regNo = regNo;
        this.performanceGrade = performanceGrade;
        totalScholars++;
    }

    public static void setUniversityTitle(String title) {
        universityTitle = title;
    }

    public static void displayTotalScholars() {
        System.out.println("Total Scholars Enrolled: " + totalScholars);
    }

    public void printScholarDetails() {
        System.out.println("University: " + universityTitle);
        System.out.println("Reg No: " + regNo);
        System.out.println("Name: " + fullName);
        System.out.println("Grade: " + performanceGrade);
    }

    public void reviseGrade(char newGrade) {
        this.performanceGrade = newGrade;
        System.out.println("Grade revised for " + fullName + " -> " + newGrade);
    }

    public static void main(String[] args) {
        Scholar.setUniversityTitle("Delhi University");

        Scholar sch1 = new Scholar("Ritika Bansal", 701, 'A');
        Scholar sch2 = new Scholar("Mohit Verma", 702, 'B');

        Scholar.displayTotalScholars();

        sch1.printScholarDetails();
        sch2.printScholarDetails();

        sch2.reviseGrade('A');
        sch2.printScholarDetails();
    }
}


////Program 6: Vehicle Registration System (Fresh Version)
class VehicleRecord {
    private static double serviceCharge = 300.0;

    private final String numberPlate;
    private String driverName;
    private String category;

    public VehicleRecord(String driverName, String category, String numberPlate) {
        this.driverName = driverName;
        this.category = category;
        this.numberPlate = numberPlate;
    }

    public static void updateServiceCharge(double charge) {
        serviceCharge = charge;
    }

    public void printVehicleDetails() {
        System.out.println("Owner: " + driverName);
        System.out.println("Type: " + category);
        System.out.println("Plate No: " + numberPlate);
        System.out.println("Service Charge: ₹" + serviceCharge);
    }

    public static void main(String[] args) {
        VehicleRecord.updateServiceCharge(350.0);

        VehicleRecord v1 = new VehicleRecord("Aditya Jain", "SUV", "DL05AB5678");
        VehicleRecord v2 = new VehicleRecord("Sneha Reddy", "Scooter", "KA09XY1234");

        v1.printVehicleDetails();
        v2.printVehicleDetails();
    }
}


////Program 7: Hospital Management System (Fresh Version)
class InPatient {
    private static String hospitalTitle;
    private static int admittedPatients = 0;

    private final String caseId;
    private String name;
    private int age;
    private String ailment;

    public InPatient(String name, int age, String ailment, String caseId) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.caseId = caseId;
        admittedPatients++;
    }

    public static void setHospitalTitle(String title) {
        hospitalTitle = title;
    }

    public static int getAdmittedCount() {
        return admittedPatients;
    }

    public void showPatientDetails() {
        System.out.println("Hospital: " + hospitalTitle);
        System.out.println("Case ID: " + caseId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    public static void main(String[] args) {
        InPatient.setHospitalTitle("Fortis Healthcare");

        InPatient ip1 = new InPatient("Rahul Khanna", 34, "Migraine", "C1005");
        InPatient ip2 = new InPatient("Sanya Malhotra", 47, "Arthritis", "C1006");

        System.out.println("Total Patients: " + InPatient.getAdmittedCount());

        ip1.showPatientDetails();
        ip2.showPatientDetails();
    }
}
