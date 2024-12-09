
/**
 * Evaluates air quality based on pollutant levels.
 */
class AirQualityEvaluator {

    /**
     * Determines air quality status based on pollutant data.
     *
     * @param data Pollutant data for evaluation.
     * @return A string representing the air quality status.
     */
    fun evaluate(data: PollutantData): String {
        return if (data.co > 50 || data.no2 > 100 || data.pm25 > 50) {
            "Unhealthy"
        } else if (data.co > 30 || data.no2 > 75 || data.pm25 > 35) {
            "Moderate"
        } else {
            "Good"
        }
    }

    /**
     * Calculates the Air Quality Index (AQI) based on pollutant levels.
     *
     * @param data Pollutant data for evaluation.
     * @return An integer representing the AQI.
     */
    fun calculateAQI(data: PollutantData): Int {
        return (data.co * 1.5 + data.no2 * 1.2 + data.pm25 * 2).toInt()
    }
}

