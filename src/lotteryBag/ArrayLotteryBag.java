package lotteryBag;

import java.util.Arrays;

/**
 * Assignment 1, Fall 2018 UNC Charlotte ITIS 2214 Data Structures and
 * Algorithms
 *
 * @author clatulip
 */
public class ArrayLotteryBag<E extends Comparable> implements LotteryBagADT<E> {

    private E[] bag;
    private int numE;

    public ArrayLotteryBag() {
        bag = (E[]) (new Comparable[10]);
        numE = 0;
    }

    /**
     * If the bag is at capacity run expandCapacity Adds an element to the bag
     * Increment numE
     *
     * @param element
     */
    @Override
    public void add(E element) {
        if (numE == bag.length) {
            expandCapacity();
        }
        bag[numE] = element;
        numE++;
    }

    @Override
    public E remove() throws EmptyCollectionException {
        //TODO!
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(E target) throws EmptyCollectionException {
        //TODO!
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return numE == 0;
    }

    @Override
    public int size() {
        return numE;
    }

    @Override
    public String toString() {
        String s = "LotteryBag: \n";
        for (int i = 0; i < numE; i++) {
            s = s.concat("\t" + bag[i].toString() + "\n");
        }
        return s;
    }

    /**
     * Remove 3 elements from the collection Determine which of the 3 elements
     * is the largest using compareTo Put the two smaller elements back in the
     * collection Return the largest element
     *
     * @return E
     * @throws EmptyCollectionException
     */
    public E pick3() throws EmptyCollectionException {

        if (this.size() < 3) {
            throw new EmptyCollectionException("pick3 has less than 3 elements");
        }

        E highElement = null;
        E e1 = this.remove();
        E e2 = this.remove();
        E e3 = this.remove();

        // compare elements removed
        // largest is stored in highElement
        if (e1.compareTo(e2) == 1) {
            highElement = e1;
            if (e3.compareTo(e1) == 1) {
                highElement = e3;
            }
        } else {
            if (e2.compareTo(e3) == 1) {
                highElement = e2;
            } else {
                highElement = e2;
            }
        }

        // Removed elements that are not the highest are added back into the collection
        // Return highest value ticket
        if (!highElement.equals(e1)) {
            this.add(e1);
        }
        if (!highElement.equals(e2)) {
            this.add(e2);
        }
        if (!highElement.equals(e3)) {
            this.add(e3);
        }
        
        return highElement;

    }

    private void expandCapacity() {
        bag = Arrays.copyOf(bag, bag.length * 2);
    }

}
