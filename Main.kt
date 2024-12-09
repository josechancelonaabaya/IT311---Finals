
fun main() {
    println("Enter pollutant levels (CO, NO2, PM2.5):")
    val CO = readLine()!!.toDouble() 
    val no2 = readLine()!!.toDouble()
    val PM25 = readLine()!!.toDouble()

    val data = pollutant_data(CO, no2, PM25)

    val evaluator = air_quality_evaluator()
    val aqi = evaluator.CalculateAQI(data)
    val status = evaluator.EvaluateAirQuality(data)

    val alerts = CheckThresholds(data)

    println("Air Quality Index (AQI): $aqi")
    println("Air Quality Status: $status")
    println("Threshold Alerts:")
    for (alert in alerts) println(alert) 

