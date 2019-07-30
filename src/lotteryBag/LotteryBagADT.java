// ********************************************************************
// LotteryBagADT.java
// Assignment 1, Fall 2018
// UNC Charlotte ITIS 2214
// Data Structures and Algorithms
// Author: Celine Latulipe
// 
//********************************************************************
package lotteryBag;

public interface LotteryBagADT<E> extends BagADT<E> {

    /**
     * Picks 3 items from bag, evaluate them and return highest value item
     * Highest value item is removed from the LotteryBag
     * Other two items are returned to the LotteryBag
     * @return highest value element of 3 picked
     * @throws EmptyCollectionException 
     */
    public E pick3() throws EmptyCollectionException;
    
    
    
}

