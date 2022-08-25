import org.junit.jupiter.api.*
import kotlin.test.fail

class MainTest {

    @Test
    @DisplayName("Teste método 'xxoo'")
    fun testCountXO(){

        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xXoo"))},
            {Assertions.assertTrue(countXO("xxOo"))},
            {Assertions.assertFalse(countXO("xxooo"))},
        )

    }

    @Test
    @Disabled
    fun naoImplementado(){
    }

    @Test
    fun vaiFalhar(){
        fail("Não posso terminar os testes sem esse método.")
    }

    @Test
    fun assumption(){
        Assumptions.assumeTrue(countXO("xxo"))

        Assertions.assertTrue(abc())
    }

    @Test
    fun exception(){
        assertThrows<NullPointerException> { abc() }
    }

}