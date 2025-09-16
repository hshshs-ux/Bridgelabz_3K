import java.util.*;

class Level3Programs {

    // 1. Football team players’ height
    static void analyzeFootballTeamHeights() {
        Random randomizer = new Random();
        int[] playerHeightsCm = new int[11];
        int totalHeightSum = 0;
        int minHeight = Integer.MAX_VALUE;
        int maxHeight = Integer.MIN_VALUE;

        for (int i = 0; i < 11; i++) {
            playerHeightsCm[i] = 150 + randomizer.nextInt(101);
            totalHeightSum += playerHeightsCm[i];
            minHeight = Math.min(minHeight, playerHeightsCm[i]);
            maxHeight = Math.max(maxHeight, playerHeightsCm[i]);
        }
        double meanHeight = (double) totalHeightSum / 11;

        System.out.println("Football Players Heights:");
        System.out.println("Shortest Player Height=" + minHeight + " cm");
        System.out.println("Tallest Player Height=" + maxHeight + " cm");
        System.out.println("Mean Height=" + meanHeight + " cm");
        System.out.println();
    }

    // 2. NumberChecker Part 1
    static void checkNumberProperties1(int number) {
        String numberAsString = Integer.toString(number);
        int[] digits = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            digits[i] = numberAsString.charAt(i) - '0';
        }

        System.out.println("Number Properties Check 1 for " + number + ":");
        System.out.println("Digit Count=" + digits.length);

        // Duck number check
        boolean isDuckNumber = numberAsString.contains("0") && numberAsString.charAt(0) != '0';
        System.out.println("Is Duck Number=" + isDuckNumber);

        // Armstrong number check
        double sumOfPoweredDigits = 0;
        for (int digit : digits) {
            sumOfPoweredDigits += Math.pow(digit, digits.length);
        }
        System.out.println("Is Armstrong Number=" + (sumOfPoweredDigits == number));

        // Finding largest, second largest, smallest, second smallest
        Arrays.sort(digits);
        System.out.println("Largest Digit=" + digits[digits.length - 1] + ", Second Largest=" + digits[digits.length - 2]);
        System.out.println("Smallest Digit=" + digits[0] + ", Second Smallest=" + digits[1]);
        System.out.println();
    }

    // 3. NumberChecker Part 2
    static void checkNumberProperties2(int number) {
        String numberAsString = Integer.toString(number);
        int sumOfDigits = 0;
        int sumOfDigitSquares = 0;
        int[] digitFrequencies = new int[10];

        for (int i = 0; i < numberAsString.length(); i++) {
            int digit = numberAsString.charAt(i) - '0';
            sumOfDigits += digit;
            sumOfDigitSquares += digit * digit;
            digitFrequencies[digit]++;
        }

        System.out.println("Number Properties Check 2 for " + number + ":");
        System.out.println("Digit Count=" + numberAsString.length() + ", Sum=" + sumOfDigits + ", Sum of Squares=" + sumOfDigitSquares);
        System.out.println("Is Harshad Number=" + (number % sumOfDigits == 0));

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (digitFrequencies[i] > 0) {
                System.out.println("Digit " + i + " appears " + digitFrequencies[i] + " time(s)");
            }
        }
        System.out.println();
    }

    // 4. NumberChecker Part 3
    static void checkNumberProperties3(int number) {
        String numberAsString = Integer.toString(number);
        String reversedNumber = new StringBuilder(numberAsString).reverse().toString();

        System.out.println("Number Properties Check 3 for " + number + ":");
        System.out.println("Reversed Number=" + reversedNumber);
        System.out.println("Is Palindrome=" + numberAsString.equals(reversedNumber));

        boolean isDuckNumber = numberAsString.contains("0") && numberAsString.charAt(0) != '0';
        System.out.println("Is Duck Number=" + isDuckNumber);
        System.out.println();
    }

    // 5. NumberChecker Part 4
    static void checkNumberProperties4(int number) {
        System.out.println("Number Properties Check 4 for " + number + ":");

        // Prime
        boolean isPrimeNumber = number > 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        System.out.println("Is Prime Number=" + isPrimeNumber);

        // Neon
        int numberSquared = number * number;
        int sumOfSquaredDigits = 0;
        int tempSquared = numberSquared;
        while (tempSquared > 0) {
            sumOfSquaredDigits += tempSquared % 10;
            tempSquared /= 10;
        }
        System.out.println("Is Neon Number=" + (sumOfSquaredDigits == number));

        // Spy
        int sumOfDigits = 0;
        long productOfDigits = 1;
        int tempNumber = number;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            tempNumber /= 10;
        }
        System.out.println("Is Spy Number=" + (sumOfDigits == productOfDigits));

        // Automorphic
        String numberString = Integer.toString(number);
        String squaredNumberString = Integer.toString(number * number);
        System.out.println("Is Automorphic=" + squaredNumberString.endsWith(numberString));

        // Buzz
        System.out.println("Is Buzz Number=" + (number % 10 == 7 || number % 7 == 0));
        System.out.println();
    }

    // 6. NumberChecker Part 5
    static void checkNumberProperties5(int number) {
        System.out.println("Number Properties Check 5 for " + number + ":");
        int sumOfProperDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfProperDivisors += i;
            }
        }

        System.out.println("Is Perfect Number=" + (sumOfProperDivisors == number));
        System.out.println("Is Abundant Number=" + (sumOfProperDivisors > number));
        System.out.println("Is Deficient Number=" + (sumOfProperDivisors < number));

        // Strong number
        long factorialSum = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            long factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            factorialSum += factorial;
            tempNumber /= 10;
        }
        System.out.println("Is Strong Number=" + (factorialSum == number));
        System.out.println();
    }

    // 7. Factors Array Program
    static void findAndAnalyzeFactors(int number) {
        System.out.println("Factors of " + number + ":");
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsList.add(i);
            }
        }

        long sumOfFactors = 0;
        long productOfFactors = 1;
        long productOfFactorCubes = 1;
        int greatestFactor = 0;

        for (int factor : factorsList) {
            sumOfFactors += factor;
            productOfFactors *= factor;
            productOfFactorCubes *= Math.pow(factor, 3);
            greatestFactor = Math.max(greatestFactor, factor);
        }

        System.out.println("Factors=" + factorsList);
        System.out.println("Greatest Factor=" + greatestFactor);
        System.out.println("Sum of Factors=" + sumOfFactors);
        System.out.println("Product of Factors=" + productOfFactors);
        System.out.println("Product of Cubes of Factors=" + productOfFactorCubes);
        System.out.println();
    }

    // 8. Six-digit OTP Generator
    static void generateUniqueOTPs() {
        Random rand = new Random();
        Set<Integer> uniqueOTPs = new HashSet<>();
        while (uniqueOTPs.size() < 10) {
            uniqueOTPs.add(100000 + rand.nextInt(900000));
        }

        System.out.println("10 Unique Six-digit OTPs:");
        System.out.println(uniqueOTPs);
        System.out.println();
    }

    // 9. Calendar Program
    static void displayCalendar(int month, int year) {
        String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            daysInMonth[1] = 29;
        }

        System.out.println("Calendar for " + monthNames[month - 1] + " " + year + ":");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Zeller's congruence to find first day of the month
        int q = 1;
        int m = month;
        int Y = year;
        if (m < 3) {
            m += 12;
            Y -= 1;
        }
        int K = Y % 100;
        int J = Y / 100;
        int dayIndex = (q + 13 * (m + 1) / 5 + K + K / 4 + J / 4 + 5 * J) % 7;

        dayIndex = (dayIndex + 6) % 7;

        for (int i = 0; i < dayIndex; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= daysInMonth[month - 1]; i++) {
            System.out.printf("%3d ", i);
            if ((i + dayIndex) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }

    // 10. Collinear Points
    static void checkCollinearity(int x1, int y1, int x2, int y2, int x3, int y3) {
        int triangleAreaFormula = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        System.out.println("Collinear Points (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + "), (" + x3 + "," + y3 + "):");
        System.out.println("Are the points collinear? " + (triangleAreaFormula == 0));
        System.out.println();
    }

    // 11. Employee Bonus
    static void calculateEmployeeBonuses() {
        Random rand = new Random();
        double totalOriginalSalary = 0;
        double totalFinalSalary = 0;
        double totalBonusAmount = 0;

        System.out.println("Employee Bonus Calculation:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "EmpID", "Salary", "Years", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            int employeeSalary = 10000 + rand.nextInt(90001);
            int yearsOfService = 1 + rand.nextInt(20);
            double bonusAmount = (yearsOfService > 5) ? (0.05 * employeeSalary) : (0.02 * employeeSalary);
            double finalSalary = employeeSalary + bonusAmount;

            totalOriginalSalary += employeeSalary;
            totalFinalSalary += finalSalary;
            totalBonusAmount += bonusAmount;

            System.out.printf("%-10d %-10d %-10d %-10.2f %-10.2f\n", i, employeeSalary, yearsOfService, bonusAmount, finalSalary);
        }

        System.out.println("---------------------------------------------------");
        System.out.printf("Totals:    %-10.2f %-10s %-10.2f %-10.2f\n", totalOriginalSalary, "", totalBonusAmount, totalFinalSalary);
        System.out.println();
    }

    // 12. Distance and Line Equation
    static void analyzeLineAndDistance(int x1, int y1, int x2, int y2) {
        System.out.println("Analyzing Line for Points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + "):");
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Euclidean Distance=" + distance);

        if (x2 - x1 == 0) {
            System.out.println("Line Equation: x = " + x1 + " (Vertical line)");
        } else {
            double slope = (double) (y2 - y1) / (x2 - x1);
            double yIntercept = y1 - slope * x1;
            System.out.println("Line Equation: y = " + slope + "x + " + yIntercept);
        }
        System.out.println();
    }

    // 13. Student Marks Scorecard
    static void generateStudentScorecard() {
        Random rand = new Random();
        int numberOfStudents = 5;

        System.out.println("Student Marks Scorecard:");
        System.out.printf("%-10s %-5s %-5s %-5s %-5s %-8s %-8s\n", "Student", "Phy", "Chem", "Math", "Total", "Avg", "Per(%)");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < numberOfStudents; i++) {
            int physicsMarks = rand.nextInt(101);
            int chemistryMarks = rand.nextInt(101);
            int mathMarks = rand.nextInt(101);

            int totalMarks = physicsMarks + chemistryMarks + mathMarks;
            double averageScore = totalMarks / 3.0;
            double percentageScore = (totalMarks / 300.0) * 100;

            System.out.printf("Student %-2d %-5d %-5d %-5d %-5d %-8.2f %-8.2f\n", i + 1, physicsMarks, chemistryMarks, mathMarks, totalMarks, averageScore, percentageScore);
        }
        System.out.println();
    }

    // 14. Matrix Part 1
    static void performMatrixOperations() {
        Random rand = new Random();
        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixA[i][j] = rand.nextInt(10);
                matrixB[i][j] = rand.nextInt(10);
            }
        }

        System.out.println("Matrix A:\n" + Arrays.deepToString(matrixA));
        System.out.println("Matrix B:\n" + Arrays.deepToString(matrixB));

        int[][] additionResult = new int[2][2];
        int[][] subtractionResult = new int[2][2];
        int[][] multiplicationResult = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                additionResult[i][j] = matrixA[i][j] + matrixB[i][j];
                subtractionResult[i][j] = matrixA[i][j] - matrixB[i][j];
                for (int k = 0; k < 2; k++) {
                    multiplicationResult[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println("Matrix Addition:\n" + Arrays.deepToString(additionResult));
        System.out.println("Matrix Subtraction:\n" + Arrays.deepToString(subtractionResult));
        System.out.println("Matrix Multiplication:\n" + Arrays.deepToString(multiplicationResult));
        System.out.println();
    }

    // 15. Matrix Part 2
    static void analyzeMatrixProperties() {
        Random rand = new Random();
        int[][] inputMatrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                inputMatrix[i][j] = rand.nextInt(10);
            }
        }
        System.out.println("Input Matrix:\n" + Arrays.deepToString(inputMatrix));

        int[][] transposedMatrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transposedMatrix[j][i] = inputMatrix[i][j];
            }
        }
        System.out.println("Transposed Matrix:\n" + Arrays.deepToString(transposedMatrix));

        int determinant = inputMatrix[0][0] * inputMatrix[1][1] - inputMatrix[0][1] * inputMatrix[1][0];
        System.out.println("Determinant=" + determinant);

        if (determinant != 0) {
            double[][] inverseMatrix = new double[2][2];
            inverseMatrix[0][0] = (double) inputMatrix[1][1] / determinant;
            inverseMatrix[0][1] = (double) -inputMatrix[0][1] / determinant;
            inverseMatrix[1][0] = (double) -inputMatrix[1][0] / determinant;
            inverseMatrix[1][1] = (double) inputMatrix[0][0] / determinant;
            System.out.println("Inverse Matrix:\n" + Arrays.deepToString(inverseMatrix));
        } else {
            System.out.println("Inverse does not exist (determinant is 0).");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("--- Level 3 Programs: Human-Readable Version ---");
        System.out.println();

        analyzeFootballTeamHeights();
        checkNumberProperties1(153);
        checkNumberProperties2(126);
        checkNumberProperties3(121);
        checkNumberProperties4(25);
        checkNumberProperties5(28);
        findAndAnalyzeFactors(12);
        generateUniqueOTPs();
        displayCalendar(2, 2024);
        checkCollinearity(1, 1, 2, 2, 3, 3);
        calculateEmployeeBonuses();
        analyzeLineAndDistance(1, 2, 3, 4);
        generateStudentScorecard();
        performMatrixOperations();
        analyzeMatrixProperties();
    }
}