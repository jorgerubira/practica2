/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.p1_app_tunombre;

import com.example.p2_app_tunombre.ServicioConError;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC
 */
public class ServicioConErrorTest {
    
    public ServicioConErrorTest() {
    }

    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 1;
        int b = 2;
        ServicioConError instance = new ServicioConError();
        int expResult = 3;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
    }
    
}
