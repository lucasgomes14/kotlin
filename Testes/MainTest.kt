import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO() {

        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("Xxoo"))},
            {Assertions.assertTrue(countXO("XxOo"))},
            {Assertions.assertTrue(countXO("XXOO"))}
        )

        Assertions.assertTrue(countXO("xxoo"))
        Assertions.assertFalse(countXO("xxxo"))
        Assertions.assertEquals(countXO("xxoo"), true)
    }

    @Test
    @Disabled
    fun naoImplementado() {

    }

    @Test
    fun vaiFalhar() {
        fail("método que faz falhar!!")
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xxoo"))
        Assertions.assertTrue(abc()) // só verifica se passar no teste de cima passar

        Assumptions.assumeTrue(countXO("xxo"))
        Assertions.assertTrue(abc())
    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { abc2() }
    }
}