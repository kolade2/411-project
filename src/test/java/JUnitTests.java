/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Restuarant_management.RestuarantManagement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author koladeadegbaye
 */
public class JUnitTests {
    
    public JUnitTests() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
     public void test(){  
        System.out.println("This test will always pass");
    }  
    
    @Test
    public void testUsernameLoginPage() {
        RestuarantManagement rm = new RestuarantManagement();
        assertEquals("Kolade", rm.getUsername());
    }
    
    @Test
    public void testPasswordLoginPage() {
        RestuarantManagement rm = new RestuarantManagement();
        assertEquals("1234", rm.getPassword());
    }
}
