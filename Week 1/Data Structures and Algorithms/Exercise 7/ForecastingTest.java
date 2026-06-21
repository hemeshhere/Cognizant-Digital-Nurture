public class ForecastingTest {
    public static void main(String[] args) {
        System.out.println(" Testing Financial Forecasting (Recursion) ");

        FinancialForecasting forecaster = new FinancialForecasting();

        double initial = 10000.0; 
        double annualGrowth = 0.05;    
        int forecastingYears = 10;          

        double futureValue = forecaster.calculateFutureValue(initial, annualGrowth, forecastingYears);
        
        System.out.println("\nStandard Recursion:");
        System.out.println("Initial Value: ₹" + initial);
        System.out.println("Growth Rate: " + (annualGrowth * 100) + "%");
        System.out.println("Predicted Value after " + forecastingYears + " years: ₹" + String.format("%.2f", futureValue));

        double optimizedValue = forecaster.calculateFutureValueOptimized(initial, annualGrowth, forecastingYears);
        
        System.out.println("\nOptimized Recursion (Memoized):");
        System.out.println("Predicted Value after " + forecastingYears + " years: ₹" + String.format("%.2f", optimizedValue));
    }
}