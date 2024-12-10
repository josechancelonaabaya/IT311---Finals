/**
 * Checks pollutant thresholds and generates alerts if exceeded.
 *
 * @param data Pollutant data for evaluation.
 * @return A list of alert messages.
 */
fun checkThresholds(data: PollutantData): List<String> {
    val alerts = mutableListOf<String>()

    if (data.co > 20) alerts.add("High Carbon Monoxide (CO)!")
    if (data.no2 > 75) alerts.add("High Nitrogen Dioxide (NO2)!")
    if (data.pm25 > 35) alerts.add("High Particulate Matter (PM2.5)!")
    
    return alerts
}

