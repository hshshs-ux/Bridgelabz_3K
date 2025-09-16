////Animal Hierarchy
//class Animal {
//    String name;
//    int age;
//
//    Animal(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    void makeSound() {
//        System.out.println("Animal makes a sound.");
//    }
//}
//
//class Dog extends Animal {
//    Dog(String name, int age) {
//        super(name, age);
//    }
//
//    @Override
//    void makeSound() {
//        System.out.println(name + " barks: Woof! Woof!");
//    }
//}
//
//class Cat extends Animal {
//    Cat(String name, int age) {
//        super(name, age);
//    }
//
//    @Override
//    void makeSound() {
//        System.out.println(name + " meows: Meow! Meow!");
//    }
//}
//
//class Bird extends Animal {
//    Bird(String name, int age) {
//        super(name, age);
//    }
//
//    @Override
//    void makeSound() {
//        System.out.println(name + " chirps: Tweet! Tweet!");
//    }
//}
//
//class AnimalTest {
//    public static void main(String[] args) {
//        Animal[] animals = {
//                new Dog("Tommy", 3),
//                new Cat("Kitty", 2),
//                new Bird("Tweety", 1)
//        };
//
//        for (Animal a : animals) {
//            a.makeSound();
//        }
//    }
//}
//
//
//
////Employee Management System
//class Employee {
//    String name;
//    int id;
//    double salary;
//
//    Employee(String name, int id, double salary) {
//        this.name = name;
//        this.id = id;
//        this.salary = salary;
//    }
//
//    void displayDetails() {
//        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: " + salary);
//    }
//}
//
//class Manager extends Employee {
//    int teamSize;
//
//    Manager(String name, int id, double salary, int teamSize) {
//        super(name, id, salary);
//        this.teamSize = teamSize;
//    }
//
//    @Override
//    void displayDetails() {
//        super.displayDetails();
//        System.out.println("Team Size: " + teamSize);
//    }
//}
//
//class Developer extends Employee {
//    String programmingLanguage;
//
//    Developer(String name, int id, double salary, String programmingLanguage) {
//        super(name, id, salary);
//        this.programmingLanguage = programmingLanguage;
//    }
//
//    @Override
//    void displayDetails() {
//        super.displayDetails();
//        System.out.println("Programming Language: " + programmingLanguage);
//    }
//}
//
//class Intern extends Employee {
//    int duration; // months
//
//    Intern(String name, int id, double salary, int duration) {
//        super(name, id, salary);
//        this.duration = duration;
//    }
//
//    @Override
//    void displayDetails() {
//        super.displayDetails();
//        System.out.println("Internship Duration: " + duration + " months");
//    }
//}
//
//class EmployeeTest {
//    public static void main(String[] args) {
//        Employee e1 = new Manager("Alice", 101, 90000, 5);
//        Employee e2 = new Developer("Bob", 102, 60000, "Java");
//        Employee e3 = new Intern("Charlie", 103, 20000, 6);
//
//        e1.displayDetails();
//        e2.displayDetails();
//        e3.displayDetails();
//    }
//}
//
////Vehicle and Transport System
//class Vehicle {
//    int maxSpeed;
//    String fuelType;
//
//    Vehicle(int maxSpeed, String fuelType) {
//        this.maxSpeed = maxSpeed;
//        this.fuelType = fuelType;
//    }
//
//    void displayInfo() {
//        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel: " + fuelType);
//    }
//}
//
//class Car extends Vehicle {
//    int seatCapacity;
//
//    Car(int maxSpeed, String fuelType, int seatCapacity) {
//        super(maxSpeed, fuelType);
//        this.seatCapacity = seatCapacity;
//    }
//
//    @Override
//    void displayInfo() {
//        super.displayInfo();
//        System.out.println("Seat Capacity: " + seatCapacity);
//    }
//}
//
//class Truck extends Vehicle {
//    int loadCapacity;
//
//    Truck(int maxSpeed, String fuelType, int loadCapacity) {
//        super(maxSpeed, fuelType);
//        this.loadCapacity = loadCapacity;
//    }
//
//    @Override
//    void displayInfo() {
//        super.displayInfo();
//        System.out.println("Load Capacity: " + loadCapacity + " tons");
//    }
//}
//
//class Motorcycle extends Vehicle {
//    String type; // e.g. sports, cruiser
//
//    Motorcycle(int maxSpeed, String fuelType, String type) {
//        super(maxSpeed, fuelType);
//        this.type = type;
//    }
//
//    @Override
//    void displayInfo() {
//        super.displayInfo();
//        System.out.println("Motorcycle Type: " + type);
//    }
//}
//
//class VehicleTest {
//    public static void main(String[] args) {
//        Vehicle[] vehicles = {
//                new Car(180, "Petrol", 5),
//                new Truck(120, "Diesel", 15),
//                new Motorcycle(200, "Petrol", "Sports")
//        };
//
//        for (Vehicle v : vehicles) {
//            v.displayInfo();
//            System.out.println("---------------");
//        }
//    }
//}
//
//
////******************************************2. Single Inheritance*************************************
////Library Management (Book → Author)
//class Book {
//    String title;
//    int publicationYear;
//
//    Book(String title, int publicationYear) {
//        this.title = title;
//        this.publicationYear = publicationYear;
//    }
//
//    void displayInfo() {
//        System.out.println("Book: " + title + " (" + publicationYear + ")");
//    }
//}
//
//class Author extends Book {
//    String name;
//    String bio;
//
//    Author(String title, int publicationYear, String name, String bio) {
//        super(title, publicationYear);
//        this.name = name;
//        this.bio = bio;
//    }
//
//    @Override
//    void displayInfo() {
//        super.displayInfo();
//        System.out.println("Author: " + name + " | Bio: " + bio);
//    }
//}
//
//public class LibraryTest {
//    public static void main(String[] args) {
//        Author a = new Author("Effective Java", 2018, "Joshua Bloch", "Expert in Java programming");
//        a.displayInfo();
//    }
//}
//
////Smart Home Devices (Device → Thermostat)
//class Device {
//    String deviceId;
//    String status;
//
//    Device(String deviceId, String status) {
//        this.deviceId = deviceId;
//        this.status = status;
//    }
//
//    void displayStatus() {
//        System.out.println("Device ID: " + deviceId + ", Status: " + status);
//    }
//}
//
//class Thermostat extends Device {
//    int temperatureSetting;
//
//    Thermostat(String deviceId, String status, int temperatureSetting) {
//        super(deviceId, status);
//        this.temperatureSetting = temperatureSetting;
//    }
//
//    @Override
//    void displayStatus() {
//        super.displayStatus();
//        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
//    }
//}
//
//public class SmartHomeTest {
//    public static void main(String[] args) {
//        Thermostat t = new Thermostat("TH101", "Active", 24);
//        t.displayStatus();
//    }
//}
//
////******************************3. Multilevel Inheritance***************************************
////Online Retail Order Management
//class Order {
//    int orderId;
//    String orderDate;
//
//    Order(int orderId, String orderDate) {
//        this.orderId = orderId;
//        this.orderDate = orderDate;
//    }
//
//    String getOrderStatus() {
//        return "Order placed on " + orderDate;
//    }
//}
//
//class ShippedOrder extends Order {
//    String trackingNumber;
//
//    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
//        super(orderId, orderDate);
//        this.trackingNumber = trackingNumber;
//    }
//
//    @Override
//    String getOrderStatus() {
//        return "Order shipped with tracking number: " + trackingNumber;
//    }
//}
//
//class DeliveredOrder extends ShippedOrder {
//    String deliveryDate;
//
//    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
//        super(orderId, orderDate, trackingNumber);
//        this.deliveryDate = deliveryDate;
//    }
//
//    @Override
//    String getOrderStatus() {
//        return "Order delivered on " + deliveryDate;
//    }
//}
//
//public class OrderTest {
//    public static void main(String[] args) {
//        DeliveredOrder d = new DeliveredOrder(1001, "2025-09-10", "TRK123", "2025-09-13");
//        System.out.println(d.getOrderStatus());
//    }
//}
//
////Educational Course Hierarchy
//class Course {
//    String courseName;
//    int duration; // in weeks
//
//    Course(String courseName, int duration) {
//        this.courseName = courseName;
//        this.duration = duration;
//    }
//}
//
//class OnlineCourse extends Course {
//    String platform;
//    boolean isRecorded;
//
//    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
//        super(courseName, duration);
//        this.platform = platform;
//        this.isRecorded = isRecorded;
//    }
//}
//
//class PaidOnlineCourse extends OnlineCourse {
//    double fee;
//    double discount;
//
//    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
//        super(courseName, duration, platform, isRecorded);
//        this.fee = fee;
//        this.discount = discount;
//    }
//
//    void displayCourseDetails() {
//        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
//        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
//        System.out.println("Fee: " + fee + ", Discount: " + discount + "%");
//    }
//}
//
//public class CourseTest {
//    public static void main(String[] args) {
//        PaidOnlineCourse poc = new PaidOnlineCourse("Java Mastery", 12, "Udemy", true, 4999, 20);
//        poc.displayCourseDetails();
//    }
//}
//
////******************************4. Hierarchical Inheritance**************************************
////Bank Account Types
//class BankAccount {
//    int accountNumber;
//    double balance;
//
//    BankAccount(int accountNumber, double balance) {
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//}
//
//class SavingsAccount extends BankAccount {
//    double interestRate;
//
//    SavingsAccount(int accountNumber, double balance, double interestRate) {
//        super(accountNumber, balance);
//        this.interestRate = interestRate;
//    }
//
//    void displayAccountType() {
//        System.out.println("Savings Account | Interest Rate: " + interestRate + "%");
//    }
//}
//
//class CheckingAccount extends BankAccount {
//    double withdrawalLimit;
//
//    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
//        super(accountNumber, balance);
//        this.withdrawalLimit = withdrawalLimit;
//    }
//
//    void displayAccountType() {
//        System.out.println("Checking Account | Withdrawal Limit: " + withdrawalLimit);
//    }
//}
//
//class FixedDepositAccount extends BankAccount {
//    int maturityPeriod;
//
//    FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
//        super(accountNumber, balance);
//        this.maturityPeriod = maturityPeriod;
//    }
//
//    void displayAccountType() {
//        System.out.println("Fixed Deposit Account | Maturity Period: " + maturityPeriod + " years");
//    }
//}
//
//public class BankTest {
//    public static void main(String[] args) {
//        SavingsAccount sa = new SavingsAccount(101, 5000, 4.5);
//        CheckingAccount ca = new CheckingAccount(102, 10000, 2000);
//        FixedDepositAccount fda = new FixedDepositAccount(103, 50000, 5);
//
//        sa.displayAccountType();
//        ca.displayAccountType();
//        fda.displayAccountType();
//    }
//}
//
////School System (Person → Teacher/Student/Staff)
//class Person {
//    String name;
//    int age;
//
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
//
//class Teacher extends Person {
//    String subject;
//
//    Teacher(String name, int age, String subject) {
//        super(name, age);
//        this.subject = subject;
//    }
//
//    void displayRole() {
//        System.out.println("Teacher: " + name + ", Subject: " + subject);
//    }
//}
//
//class Student extends Person {
//    int grade;
//
//    Student(String name, int age, int grade) {
//        super(name, age);
//        this.grade = grade;
//    }
//
//    void displayRole() {
//        System.out.println("Student: " + name + ", Grade: " + grade);
//    }
//}
//
//class Staff extends Person {
//    String role;
//
//    Staff(String name, int age, String role) {
//        super(name, age);
//        this.role = role;
//    }
//
//    void displayRole() {
//        System.out.println("Staff: " + name + ", Role: " + role);
//    }
//}
//
//public class SchoolTest {
//    public static void main(String[] args) {
//        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
//        Student s = new Student("Rahul", 15, 10);
//        Staff st = new Staff("Suresh", 35, "Librarian");
//
//        t.displayRole();
//        s.displayRole();
//        st.displayRole();
//    }
//}
//
////********************************5. Hybrid Inheritance (Using Interfaces)**********************************
////Restaurant Management System
//interface Worker {
//    void performDuties();
//}
//
//class Person {
//    String name;
//    int id;
//
//    Person(String name, int id) {
//        this.name = name;
//        this.id = id;
//    }
//}
//
//class Chef extends Person implements Worker {
//    Chef(String name, int id) {
//        super(name, id);
//    }
//
//    @Override
//    public void performDuties() {
//        System.out.println(name + " is cooking meals.");
//    }
//}
//
//class Waiter extends Person implements Worker {
//    Waiter(String name, int id) {
//        super(name, id);
//    }
//
//    @Override
//    public void performDuties() {
//        System.out.println(name + " is serving customers.");
//    }
//}
//
//public class RestaurantTest {
//    public static void main(String[] args) {
//        Worker w1 = new Chef("Ramesh", 201);
//        Worker w2 = new Waiter("Sita", 202);
//
//        w1.performDuties();
//        w2.performDuties();
//    }
//}
//
//
//
////Vehicle Management System with Hybrid Inheritance
//interface Refuelable {
//    void refuel();
//}
//
//class Vehicle {
//    int maxSpeed;
//    String model;
//
//    Vehicle(int maxSpeed, String model) {
//        this.maxSpeed = maxSpeed;
//        this.model = model;
//    }
//}
//
//class ElectricVehicle extends Vehicle {
//    ElectricVehicle(int maxSpeed, String model) {
//        super(maxSpeed, model);
//    }
//
//    void charge() {
//        System.out.println(model + " is charging.");
//    }
//}
//
//class PetrolVehicle extends Vehicle implements Refuelable {
//    PetrolVehicle(int maxSpeed, String model) {
//        super(maxSpeed, model);
//    }
//
//    @Override
//    public void refuel() {
//        System.out.println(model + " is refueling with petrol.");
//    }
//}
//
//public class HybridVehicleTest {
//    public static void main(String[] args) {
//        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
//        PetrolVehicle pv = new PetrolVehicle(180, "Honda Civic");
//
//        ev.charge();
//        pv.refuel();
//    }
//}