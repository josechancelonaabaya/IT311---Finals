
PollutantData.kt
/**
 * Data class representing pollutant levels for air quality evaluation.
 *
 * @param co Carbon monoxide level in ppm.
 * @param no2 Nitrogen dioxide level in ppb.
 * @param pm25 Particulate matter (PM2.5) level in µg/m³.
 */
data class PollutantData(
    val co: Double,
    val no2: Double,
    val pm25: Double
)

