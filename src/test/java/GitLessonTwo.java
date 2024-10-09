public class GitLessonTwo {
    private static String omg = "Merge conflict!!!!";
    private static String ufc = "Konor vs McFregor";
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("The sum of a and b is " + c + " " + "Hello, Pitter Parker");
    }
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }

    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;

        }
        return result;
    }
}
