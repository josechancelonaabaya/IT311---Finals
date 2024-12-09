
import kotlin.test.Test
import kotlin.test.assertEquals

class PollutantDataTest {
    @Test
    fun test1() { 
        val data = pollutant_data(25.0, 50.0, 75.0)
        assertEquals(25.0, data.CO) 
    }
}

class AirQualityEvaluatorTest {
    @Test
    fun testAQI() {
        val evaluator = air_quality_evaluator()
        val data = pollutant_data(25.0, 50.0, 75.0)
        assertEquals(100, evaluator.CalculateAQI(data)) 
    }
}
