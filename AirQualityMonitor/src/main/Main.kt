	/**
 * Main function for the air quality monitoring system.
 */
fun main() {
    println("Enter pollutant levels (CO, NO2, PM2.5):")

    // User inputs
    val co = readLine()!!.toDouble()
    val no2 = readLine()!!.toDouble()
    val pm25 = readLine()!!.toDouble()

    // Create pollutant data instance
    val data = PollutantData(co, no2, pm25)

    // Instantiate evaluator and generate results
    val evaluator = AirQualityEvaluator()
    val aqi = evaluator.calculateAQI(data)
    val status = evaluator.evaluate(data)
    val alerts = checkThresholds(data)

    // Display results
    println("Air Quality Index (AQI): $aqi")
    println("Air Quality Status: $status")
    if (alerts.isNotEmpty()) {
        println("Threshold Alerts:")
        alerts.forEach { println("- $it") }
    } else {
        println("No threshold alerts.")
    }
}

