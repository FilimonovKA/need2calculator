import calculatorapp.CalculatorApp;

public class Main {
    public static void main(String[] args) {
        try {
            CalculatorApp app = new CalculatorApp();
            app.run();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Ошибка при работе приложения!");
        }
    }
}