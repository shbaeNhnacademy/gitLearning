package App;

/**
 * Test entry point
 */
public class AppExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int test1 = 1;
        int test2 = 2;

        int add = calculator.add(test1,test2);
        System.out.println("add = " + add);

        int sub = calculator.sub(test1,test2);
        System.out.println("sub = " + sub);
    }

    static class Calculator{
        public int add(int num1, int num2) {
            return num1+num2;
        }
        public int sub(int num1, int num2) {
            return num1-num2;
        }
    }
}
