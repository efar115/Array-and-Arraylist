
package lotteryBag;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Data Structures & Algorithms Class
 * Assignment 1, Fall 2018
 * Testing harness for ArrayLotteryBag class
 * @author clatulip, <add your name here> 
 */
public class ArrayLotteryBagTest {
    

    /**
     * Test of add method, of class ArrayLotteryBag.
     */
    @Test
    public void testAdd() {
        System.out.println("testing add");
        ArrayLotteryBag<LotteryTicket> instance = new ArrayLotteryBag<>();
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
     * Test of remove method, of class ArrayLotteryBag.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("testing remove");
        ArrayLotteryBag<LotteryTicket> instance = new ArrayLotteryBag<>();
        // lottery bag should initially be empty
        assertEquals(0, instance.size());
        assertTrue(instance.isEmpty());
        // if we try to remove from an empty lottery bag, 
        //assertNull(instance.remove());
        
        // add a few items
        instance.add(new LotteryTicket(500, "lotto"));
        instance.add(new LotteryTicket(0, "sorry"));
        // now size should be 2
        assertEquals(2, instance.size());
        
        // now try to remove an item, result should not be null
        assertNotNull(instance.remove());
        
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
     * Test of contains method, of class ArrayLotteryBag.
     */
    @Test
    public void testContains() throws Exception {

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class ArrayLotteryBag.
     */
    @Test
    public void testIsEmpty() {

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class ArrayLotteryBag.
     */
    @Test
    public void testSize() {
        System.out.println("testing size");
        ArrayLotteryBag<LotteryTicket> instance = new ArrayLotteryBag<>();
        // lottery bag should initially be empty
        assertEquals(0, instance.size());
        
        // add a few items
        instance.add(new LotteryTicket(500, "lotto"));
        instance.add(new LotteryTicket(0, "sorry"));
        // now size should be 2
        assertEquals(2, instance.size());

    }


    /**
     * Test of pick3 method, of class ArrayLotteryBag.
     */
    @Test
    public void testPick3() throws Exception {

        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }



    
}
