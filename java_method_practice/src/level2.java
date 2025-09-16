import java.util.Scanner;

//1. Factors of a Number

class Factors {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[index++] = i;

        return factors;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static int product(int[] arr) {
        int prod = 1;
        for (int x : arr) prod *= x;
        return prod;
    }

    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += Math.pow(x, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] factors = findFactors(n);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum = " + sum(factors));
        System.out.println("Product = " + product(factors));
        System.out.println("Sum of Squares = " + sumOfSquares(factors));
    }
}

//2. Sum of Natural Numbers (Recursion vs Formula)
class SumNatural {
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
            return;
        }

        int rec = recursiveSum(n);
        int formula = formulaSum(n);

        System.out.println("Recursive sum = " + rec);
        System.out.println("Formula sum = " + formula);
        System.out.println("Both are equal? " + (rec == formula));
    }
}

//3. Leap Year Check
class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        if (isLeapYear(y)) System.out.println(y + " is a Leap Year");
        else System.out.println(y + " is NOT a Leap Year");
    }
}

//4. Unit Converter (Km, Miles, Meters, Feet, Inches, Celsius, Pounds, Liters)
class UnitConvertor {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        double km = 10;
        double miles = 6.2;
        double meters = 100;
        double feet = 328;

        System.out.println(km + " km = " + convertKmToMiles(km) + " miles");
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
    }
}


//5. Student Vote Checker
class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            System.out.println("Can vote? " + canStudentVote(ages[i]));
        }
    }
}

//6. Youngest & Tallest Friend
class Friends {
    public static int youngest(int[] ages) {
        int idx = 0;
        for (int i = 1; i < ages.length; i++)
            if (ages[i] < ages[idx]) idx = i;
        return idx;
    }

    public static int tallest(double[] heights) {
        int idx = 0;
        for (int i = 1; i < heights.length; i++)
            if (heights[i] > heights[idx]) idx = i;
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " in cm: ");
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest = " + names[youngest(ages)]);
        System.out.println("Tallest = " + names[tallest(heights)]);
    }
}

//7. Positive/Negative, Even/Odd, Compare
class NumberArray {
    public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            if (isPositive(arr[i])) {
                System.out.print("Positive and ");
                if (isEven(arr[i])) System.out.println("Even");
                else System.out.println("Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(arr[0], arr[4]);
        if (result == 0) System.out.println("First and Last are Equal");
        else if (result == 1) System.out.println("First is Greater");
        else System.out.println("First is Smaller");
    }
}

//8. BMI Calculator
class BMI {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();

            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + " => Weight=" + data[i][0] +
                    "kg, Height=" + data[i][1] + "cm, BMI=" + data[i][2] +
                    ", Status=" + getStatus(data[i][2]));
        }
    }
}

//9. Quadratic Roots
class Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) return new double[] {};
        else if (delta == 0) return new double[]{-b / (2 * a)};
        else {
            double sqrt = Math.sqrt(delta);
            return new double[]{(-b + sqrt) / (2 * a), (-b - sqrt) / (2 * a)};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) System.out.println("No Real Roots");
        else {
            for (double r : roots) System.out.println("Root = " + r);
        }
    }
}

//10. Random Numbers (Average, Min, Max)
class RandomNumbers {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return new double[]{(double)sum / numbers.length, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.print("Numbers: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        double[] result = findAverageMinMax(arr);
        System.out.println("Average = " + result[0] + ", Min = " + result[1] + ", Max = " + result[2]);
    }
}