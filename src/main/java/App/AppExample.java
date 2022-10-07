package App;

/**
 * Test entry point
 */
public class AppExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int test1 = 1;
        int test2 = 2;

        int add = calculator.add(test1, test2);
        System.out.println("add = " + add);

        //
    }

    static class Calculator{
        public int add(int num1, int num2) {
            System.out.println(num1 + num2);
            return num1 + num2;
        }

        //TODO impl sub, multiple, divide
    }
}
