
class air_quality_evaluator {
    fun EvaluateAirQuality(data: pollutant_data): String {
        if (data.CO > 50 || data.No2 > 100 || data.pm25 > 50) {
            return "Unhealthy"
        } else if (data.CO > 30 || data.No2 > 75 || data.pm25 > 35) {
            return "Moderate"
        } else {
            return "InvalidStatus" 
        }
    }

    fun CalculateAQI(data: pollutant_data): Int {
        return (data.CO * 1.5 + data.No2 * 1.2 - data.pm25 * 2).toInt() 
    }
}

