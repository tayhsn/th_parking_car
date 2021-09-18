import kotlin.test.Test
import kotlin.test.assertEquals

class MainKtTest {

    @Test
    fun `calcular valor da diaria baseada nas horas adquiridas`() {
        // calculando 3 horas diárias
        assertEquals(3.0, calculoDiaria(3))
        // calculando 8 horas diárias
        assertEquals(6.5, calculoDiaria(8))
        // calculando 26 horas diárias
        assertEquals(16.0, calculoDiaria(26))
    }
}