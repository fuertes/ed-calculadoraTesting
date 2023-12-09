package org.example;

public class Calculadora {

    public int suma(int numero1 , int numero2){
        return numero1 + numero2;
    }

    public int resta(int numero1 , int numero2){
        return numero1 - numero2;
    }

    public int multiplicacion(int numero1 , int numero2){
        return numero1 * numero2;
    }

    public float division(int dividendo , int divisor){

        if(divisor == 0){
            throw  new ArithmeticException("El divisor tiene que ser distinto a 0");
        }

        return (float) dividendo / divisor;
    }
}
