package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void setUp() throws Exception {
        this.calculadora = new Calculadora();
    }

    @Test
    public void suma() {
        int resultado = calculadora.suma(1, 4);
        assertEquals(5, resultado);
    }

    @Test
    public void resta() {
        int resultado = calculadora.resta(1, 4);
        assertEquals(-3, resultado);
    }

    @Test
    public void multiplicacion() {
        int resultado = calculadora.multiplicacion(1, 4);
        assertEquals(4, resultado);
    }

    @Test
    public void division() {
        float resultado = calculadora.division(10, 2);
        assertEquals(5, resultado, 0);
    }

    @Test
    public void exceptionDivision()
    {
        String mensajeEsperado = "El divisor tiene que ser distinto a 0";
        Throwable exception = assertThrows(ArithmeticException.class,
                ()->{calculadora.division(5,0);} );

        assertEquals(mensajeEsperado, exception.getMessage());
    }
}