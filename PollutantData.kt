// Non-compliant: Poor naming conventions, missing comments, introduced bug
data class pollutant_data (val CO: Double, val No2: Double, val pm25: Double) {
    fun invalidCalculation() = CO + No2 - pm25 * 2 // Irrelevant function with incorrect logic
}
