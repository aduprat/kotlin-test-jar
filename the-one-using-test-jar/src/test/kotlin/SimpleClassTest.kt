import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SimpleClassTest {

    @Test
    fun test() {
        val simpleCalss = SimpleClass("World")
        assertEquals("Hello, World!", simpleCalss.sayHello())
    }

    @Test
    fun testWithClassFromTestJar() {
        MySharedHelper().someKotlinCode()
    }
}