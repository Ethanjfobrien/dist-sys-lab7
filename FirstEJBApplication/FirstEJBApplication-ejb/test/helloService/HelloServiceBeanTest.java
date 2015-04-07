/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloService;

import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author puser
 */
public class HelloServiceBeanTest {
    
    public HelloServiceBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of helloName method, of class HelloServiceBean.
     */
    @Test
    public void testHelloName() throws Exception {
        System.out.println("helloName");
        String name = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        HelloServiceBeanLocal instance = (HelloServiceBeanLocal)container.getContext().lookup("java:global/classes/HelloServiceBean");
        String expResult = "";
        String result = instance.helloName(name);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
