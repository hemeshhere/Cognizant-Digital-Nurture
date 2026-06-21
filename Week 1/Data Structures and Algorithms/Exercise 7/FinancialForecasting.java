import java.util.HashMap;
import java.util.Map;

public class FinancialForecasting {
    private Map<Integer, Double> memoizationCache = new HashMap<>();
    //calculateFutureValue
    public double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years <= 0) {
            return presentValue;
        }
        return (1 + growthRate) * calculateFutureValue(presentValue, growthRate, years - 1);
    }

    public double calculateFutureValueOptimized(double presentValue, double growthRate, int years) {
        if (years <= 0) {
            return presentValue;
        }

        if (memoizationCache.containsKey(years)) {
            return presentValue * memoizationCache.get(years);
        }

        double multiplier = (1 + growthRate) * (calculateFutureValueOptimized(presentValue, growthRate, years - 1) / presentValue);
        
        memoizationCache.put(years, multiplier);

        return presentValue * multiplier;
    }
}