import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculatorTests {
    @Test
    internal fun `adding empty string returns 0`() {
        assertEquals(0, Calculator().add(""))
    }

    @Test
    internal fun `adding one number returns that number`() {
        assertEquals(1, Calculator().add("1"))
        assertEquals(10, Calculator().add("10"))
    }
}

class Calculator {
    fun add(numbers: String): Int {
        return if (numbers.isBlank()) 0 else numbers.toInt()
    }
}
