import java.util.Scanner;

//1. Simple Interest Program
class SimpleInterest {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();

        double si = calculateSimpleInterest(p, r, t);
        System.out.println("The Simple Interest is " + si +
                " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
    }
}

//2. Maximum Handshakes
class Handshakes {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int handshakes = calculateHandshakes(students);
        System.out.println("Maximum number of possible handshakes = " + handshakes);
    }
}

//3. Athlete in Triangular Park
class TriangularPark {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km in meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double s1 = sc.nextDouble();
        System.out.print("Enter side2: ");
        double s2 = sc.nextDouble();
        System.out.print("Enter side3: ");
        double s3 = sc.nextDouble();

        double rounds = calculateRounds(s1, s2, s3);
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to finish 5km.");
    }
}

//4. Positive, Negative, or Zero
class NumberCheck {
    public static int checkNumber(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = checkNumber(n);
        if (result == 1) System.out.println("Positive Number");
        else if (result == -1) System.out.println("Negative Number");
        else System.out.println("Zero");
    }
}

//5. Spring Season Check
class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        if (isSpringSeason(month, day))
            System.out.println("It's a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}

//6. Sum of n Natural Numbers
class SumNatural {
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum of first " + n + " natural numbers = " + findSum(n));
    }
}

//7. Smallest and Largest of 3 Numbers
class SmallestLargest {
    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int smallest = Math.min(n1, Math.min(n2, n3));
        int largest = Math.max(n1, Math.max(n2, n3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int[] result = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest = " + result[0] + ", Largest = " + result[1]);
    }
}

//8. Quotient and Remainder
class Division {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter divisor: ");
        int div = sc.nextInt();

        int[] result = findRemainderAndQuotient(num, div);
        System.out.println("Remainder = " + result[0] + ", Quotient = " + result[1]);
    }
}

//9. Chocolate Distribution
class Chocolates {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates % children, chocolates / children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets " + result[1] + " chocolates and remaining = " + result[0]);
    }
}

//10. Wind Chill Calculation
class WindChill {
    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (F): ");
        double t = sc.nextDouble();
        System.out.print("Enter wind speed (mph): ");
        double w = sc.nextDouble();

        System.out.println("Wind Chill Temperature = " + calculateWindChill(t, w));
    }
}


//11. Trigonometric Functions
class Trigonometry {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        return new double[]{Math.sin(rad), Math.cos(rad), Math.tan(rad)};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println("Sine = " + result[0] + ", Cosine = " + result[1] + ", Tangent = " + result[2]);
    }
}