/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteryBag;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author clatulip, <add your name here>
 */
public class ArrayListLotteryBagTest {
    
    /**
     * Test of add method, of class ArrayListLotteryBag.
     */
    @Test
    public void testAdd() {
        System.out.println("testing add");
        ArrayListLotteryBag<LotteryTicket> instance = new ArrayListLotteryBag<>();
        // lottery bag should initially be empty
        assertEquals(0, instance.size());
        assertTrue(instance.isEmpty());
        instance.add(new LotteryTicket(500, "lotto"));
        // after adding, size should be incremented
        assertEquals(1, instance.size());
        assertFalse(instance.isEmpty());
        // add another
        instance.add(new LotteryTicket(2500, "lotto"));
        // after adding, size should be incremented
        assertEquals(2, instance.size());
        assertFalse(instance.isEmpty());
    }

    /**
     * Test of remove method, of class ArrayListLotteryBag.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("testing remove");
        ArrayListLotteryBag<LotteryTicket> instance = new ArrayListLotteryBag<>();
        // lottery bag should initially be empty
        assertEquals(0, instance.size());
        assertTrue(instance.isEmpty());
        
        // if we try to remove from an empty lottery bag, 
        try {
            instance.remove();
            fail("Should not get here.");
        } catch (Exception e) {
            assertTrue(e instanceof EmptyCollectionException);
            System.out.println("expected exception.");
        }
        
        // add a few items
        instance.add(new LotteryTicket(500, "lotto"));
        instance.add(new LotteryTicket(0, "sorry"));
        // now size should be 2
        assertEquals(2, instance.size());
        
        // now try to remove an item, result should not be null
        try {
            assertNotNull(instance.remove());
        } catch (EmptyCollectionException e) {
            fail("should not throw exception.");
        }
        
        // after removing, size should be decremented
        assertEquals(1, instance.size());
        assertFalse(instance.isEmpty());
        
        // remove another 
        assertNotNull(instance.remove());
        // after removing last item, size should be 0
        assertEquals(0, instance.size());
        assertTrue(instance.isEmpty());
    }

    /**
     * Test of contains method, of class ArrayListLotteryBag.
     */
    @Test
    public void testContains() throws Exception {

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class ArrayListLotteryBag.
     */
    @Test
    public void testIsEmpty() {

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class ArrayListLotteryBag.
     */
    @Test
    public void testSize() {
        System.out.println("testing size");
        ArrayListLotteryBag<LotteryTicket> instance = new ArrayListLotteryBag<>();
        // lottery bag should initially be empty
        assertEquals(0, instance.size());
        
        // add a few items
        instance.add(new LotteryTicket(500, "lotto"));
        instance.add(new LotteryTicket(0, "sorry"));
        // now size should be 2
        assertEquals(2, instance.size());
    }


    /**
     * Test of pick3 method, of class ArrayListLotteryBag.
     */
    @Test
    public void testPick3() throws Exception {

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    
}
