import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OtherClassTest {
    @Test
    fun test() {
        val otherClass = OtherClass(2)
        assertEquals(3, otherClass.increment())
    }
}