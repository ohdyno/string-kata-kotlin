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

    @Test
    internal fun `adding two numbers separated by commas returns the sum`() {
        assertEquals(1, Calculator().add("0,1"))
        assertEquals(1001, Calculator().add("1000,1"))
    }
}

class Calculator {
    fun add(numbers: String): Int {
        return numbers
            .split(",")
            .filterNot(String::isBlank)
            .map(String::toInt)
            .sum()
    }
}
