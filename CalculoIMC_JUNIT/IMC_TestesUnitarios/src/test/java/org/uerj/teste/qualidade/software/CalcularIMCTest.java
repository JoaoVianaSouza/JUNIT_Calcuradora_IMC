package org.uerj.teste.qualidade.software;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalcularIMCTest {

    @Test
    @DisplayName("Deve calcular o IMC corretamente")
    void testCalcular() {
        assertEquals(20.0, CalcularIMC.calcular(80, 2.0),   0.001);
    }

    @Test
    @DisplayName("Deve classificar corretamente todas as faixas do IMC")
    void testCategorizarTodosOsCasos() {
        assertAll("Verificação de categorias",
                () -> assertEquals("Magreza", CalcularIMC.categorizar(18.4), "Erro na Magreza"),
                () -> assertEquals("Normal", CalcularIMC.categorizar(22.0), "Erro no Normal"),
                () -> assertEquals("Sobrepeso", CalcularIMC.categorizar(27.5), "Erro no Sobrepeso"),
                () -> assertEquals("Obesidade grau I", CalcularIMC.categorizar(32.0), "Erro no Grau I"),
                () -> assertEquals("Obesidade grau II", CalcularIMC.categorizar(37.0), "Erro no Grau II"),
                () -> assertEquals("Obesidade grau III", CalcularIMC.categorizar(42.0), "Erro no Grau III")
        );
    }

    @Test
    @DisplayName("Teste de valor e resposta")
    void testValor() {
        assertEquals("Normal", CalcularIMC.categorizar(24.9));
        assertEquals("Obesidade grau I", CalcularIMC.categorizar(34.9));
        assertEquals("Obesidade grau III", CalcularIMC.categorizar(40.1));
    }
}