import org.junit.jupiter.api.*
import kotlin.test.fail

class MainTest {
    @Test
    @DisplayName("Testa os cenários da portaria")
    fun testePortaria(){
        Assertions.assertEquals(portaria(15, "", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "", ""), "Negado.")

        Assertions.assertEquals(portaria(20, "VIP", ""), "Negado.")

        Assertions.assertEquals(portaria(20, "comum", "xt000"), "Welcome.")
        Assertions.assertEquals(portaria(20, "comum", "000"), "Negado.")

        Assertions.assertEquals(portaria(20, "premium", "xl000"), "Welcome.")
        Assertions.assertEquals(portaria(20, "luxo", "xl000"), "Welcome.")
        Assertions.assertEquals(portaria(20, "premium", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "luxo", ""), "Negado.")
    }
}