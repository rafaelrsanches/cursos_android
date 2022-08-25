import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
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

}