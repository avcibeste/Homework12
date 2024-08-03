public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            System.out.println(calculator.divide(10, 2)); // Bu başarılı bir bölme işlemi
            System.out.println(calculator.divide(10, 0)); // Bu hatalı bir bölme işlemi, exception fırlatacak
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}