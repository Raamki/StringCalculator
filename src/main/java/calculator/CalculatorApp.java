package calculator;

public class CalculatorApp {
    public int calculate(String number) {
        String[] numArray = number.split("\\n|,");
        int sum = 0;
        for (String num: numArray) {
            if (!num.isBlank())
                sum+=Integer.valueOf(num);
        }
        return sum;
    }
}
