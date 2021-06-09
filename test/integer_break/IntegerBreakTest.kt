package integer_break

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class IntegerBreakTest {

    @Test
    fun `for min input 2 returns result = 1`() {
        val input = 2
        assertEquals(1, maxProductOfSum(input))
    }

    @Test
    fun `for min input 3 returns result = 2`() {
        val input = 3
        assertEquals(2, maxProductOfSum(input))
    }

    @Test
    fun `for min input 4 returns result = 4`() {
        val input = 4
        assertEquals(4, maxProductOfSum(input))
    }

    @Test
    fun `for min input 7 returns result = 12`() {
        val input = 7
        assertEquals(12, maxProductOfSum(input))
    }

    @Test
    fun `for input 10 returns result = 36`() {
        val input = 10
        assertEquals( 36, maxProductOfSum(input))
    }

    @Test
    fun `for input 9 returns result = 24`() {
        val input = 9
        assertEquals( 27, maxProductOfSum(input))
    }

    @Test
    fun `for input 25 returns result = 8748`() {
        val input = 25
        assertEquals( 8748, maxProductOfSum(input))
    }

    @Test
    fun `for invalid input 1 returns IllegalStateException`() {
        val input = 1
        assertThrows<IllegalStateException> { maxProductOfSum(input)}
    }

    @Test
    fun `for invalid input -1 returns IllegalStateException`() {
        val input = -1
        assertThrows<IllegalStateException> {maxProductOfSum(input)}
    }

    @Test
    fun `for invalid input 59 returns IllegalStateException`() {
        val input = 59
        assertThrows<IllegalStateException> {maxProductOfSum(input)}
    }


}