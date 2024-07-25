import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ExercicioTest {

    @Test
    fun idadeTest() {
        Assertions.assertEquals(portaria(17, "luxo", "XT00"), "Negado.")
        Assertions.assertEquals(portaria(10, "comum", "xt00"), "Negado.")
        Assertions.assertEquals(portaria(20, "luxo", "xl00"), "Welcome.")
        Assertions.assertEquals(portaria(21, "premium", "xl00"), "Welcome.")
    }

    @Test
    fun tipoDeConviteTest() {
        Assertions.assertEquals(portaria(19, "", "XT0"), "Negado.")
        Assertions.assertEquals(portaria(19, "comu", "xt00"), "Negado.")
        Assertions.assertEquals(portaria(19, "luxo", "xt00"), "Negado.")
        Assertions.assertEquals(portaria(19, "premium", "xl00"), "Welcome.")
    }

    @Test
    fun codTest() {
        Assertions.assertEquals(portaria(19, "comum", ""), "Negado.")
        Assertions.assertEquals(portaria(19, "comum", "xt00"), "Welcome.")
        Assertions.assertEquals(portaria(19, "comum", "xl00"), "Negado.")

        Assertions.assertEquals(portaria(19, "luxo", "xl00"), "Welcome.")
        Assertions.assertEquals(portaria(19, "luxo", "xt00"), "Negado.")

        Assertions.assertEquals(portaria(19, "premium", "xl00"), "Welcome.")
        Assertions.assertEquals(portaria(19, "premium", "xt00"), "Negado.")
    }
}