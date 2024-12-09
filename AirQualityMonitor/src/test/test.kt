import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class PollutantDataTest {
    @Test
    fun testPollutantDataInitialization() {
        val data = PollutantData(25.0, 50.0, 75.0)
        assertEquals(25.0, data.co)
        assertEquals(50.0, data.no2)
        assertEquals(75.0, data.pm25)
    }
}

class AirQualityEvaluatorTest {
    @Test
    fun testEvaluateAirQuality() {
        val evaluator = AirQualityEvaluator()
        val data = PollutantData(25.0, 50.0, 75.0)
        assertEquals("Unhealthy", evaluator.evaluate(data))
    }

    @Test
    fun testCalculateAQI() {
        val evaluator = AirQualityEvaluator()
        val data = PollutantData(20.0, 50.0, 30.0)
        assertEquals(125, evaluator.calculateAQI(data))
    }
}

class ThresholdAlertsTest {
    @Test
    fun testCheckThresholds() {
        val data = PollutantData(25.0, 80.0, 40.0)
        val alerts = checkThresholds(data)
        assertTrue(alerts.contains("High Particulate Matter (PM2.5)!"))
        assertTrue(alerts.contains("High Nitrogen Dioxide (NO2)!"))
        assertTrue(alerts.contains("High Carbon Monoxide (CO)!"))
    }
}
