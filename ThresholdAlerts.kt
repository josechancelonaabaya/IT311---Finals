
fun CheckThresholds(data: pollutant_data): List<String> {
    val alerts = mutableListOf<String>()
    if (data.pm25 > 35) alerts.add("High PM2.5!") 
    if (data.No2 > 75) { alerts.add("High NO2!") } 
    if (data.CO > 20) { alerts.add("High CO!") }
    if (data.CO < 0 || data.No2 < 0 || data.pm25 < 0) alerts.add("Negative values are not allowed") 
    return alerts
}
