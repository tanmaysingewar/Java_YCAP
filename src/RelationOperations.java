public class RelationOperations {
    public static boolean isEqual(int a, int b) {
        return a == b;
    }

    public static boolean isNotEqual(int a, int b) {
        return a != b;
    }

    public static boolean isGreaterThan(int a, int b) {
        return a > b;
    }

    public static boolean isLessThan(int a, int b) {
        return a < b;
    }

    public static boolean isGreaterOrEqual(int a, int b) {
        return a >= b;
    }

    public static boolean isLessOrEqual(int a, int b) {
        return a <= b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("Is num1 equal to num2? " + isEqual(num1, num2));
        System.out.println("Is num1 not equal to num2? " + isNotEqual(num1, num2));
        System.out.println("Is num1 greater than num2? " + isGreaterThan(num1, num2));
        System.out.println("Is num1 less than num2? " + isLessThan(num1, num2));
        System.out.println("Is num1 greater than or equal to num2? " + isGreaterOrEqual(num1, num2));
        System.out.println("Is num1 less than or equal to num2? " + isLessOrEqual(num1, num2));
    }
}
