package forecasting;

public class Main {
    public static void main(String[] args) {
        double initialAmount = 1000;       
        double growthRate = 0.10;          
        int years = 5;

        double futureValue = ForecastCalculator.forecast(initialAmount, growthRate, years);

        System.out.println("Future Value after " + years + " years: ₹" + String.format("%.2f", futureValue));
    }
}
