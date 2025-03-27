public class Operators {
    public static void main(String[] args) {
        // Assignment operator (=)
        int num1 = 13;
        int num2 = 5;
		
		num1 += num2;

        // ARITHMETIC OPERATORS (+, *, -, /, %)
        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        int quotient = num1 / num2;
        double result = (double) num1 / num2;
        int remainder = num1 % num2;

        // Relational operators (>, <, >=, ==, !=)
        boolean isLessThan = num1 < num2;
        boolean isGreaterThan = num1 > num2;
        boolean isGreaterThanOrEqualTo = num1 >= num2;
        boolean isEqualTo = num1 == num2;
        boolean isNotEqualTo = num1 != num2;

        // Logical operators (&&, ||, !)
        boolean isAndOperator = num1 > num2 && num1 >= num2;
        boolean isOrOperator = num1 == num2 || num1 > num2;
        boolean isNotOperator = !(num1 == num2 || num1 > num2);

        // Output results
        System.out.printf("The sum of the numbers is %d%n", sum);
        System.out.printf("The product of the numbers is %d%n", product);
        System.out.printf("The difference between %d and %d is %d%n", num1, num2, difference);
        System.out.printf("The quotient of the numbers is %d%n", quotient);
        System.out.printf("The result of the numbers is %.2f%n", result);
        System.out.printf("The remainder is %d%n", remainder);
        System.out.println("==========================================================");
        System.out.printf("is %d < %d? %b%n", num1, num2, isLessThan);
        System.out.printf("is %d > %d? %b%n", num1, num2, isGreaterThan);
        System.out.printf("is %d >= %d? %b%n", num1, num2, isGreaterThanOrEqualTo);
        System.out.printf("is %d == %d? %b%n", num1, num2, isEqualTo);
        System.out.printf("is %d != %d? %b%n", num1, num2, isNotEqualTo);
        System.out.println("==========================================================");
        System.out.printf("is %d > %d && %d >= %d? %b%n", num1, num2, num1, num2, isAndOperator);
        System.out.printf("is %d == %d || %d > %d? %b%n", num1, num2, num1, num2, isOrOperator);
        System.out.printf("is !(%d == %d || %d > %d)? %b%n", num1, num2, num1, num2, isNotOperator);
    }
}