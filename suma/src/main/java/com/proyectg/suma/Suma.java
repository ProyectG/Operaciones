/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectg.suma;

/**
 *
 * @author Marco
 */
public class Suma {
    
    public int suma(String valorA, String valorB)
    {
        try {
            int a = Integer.parseInt(valorA);
        int b = Integer.parseInt(valorB);
        int resultado = a+b;
        return resultado;
        }
        catch(Exception ex)
        {
            return 0;
        }
    }
    
}
