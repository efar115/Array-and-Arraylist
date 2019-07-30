package lotteryBag;

import java.util.ArrayList;

/**
 * Assignment 1, Fall 2018 UNC Charlotte ITIS 2214 Data Structures and
 * Algorithms
 *
 * @author clatulip
 */
public class ArrayListLotteryBag<E extends Comparable>
        implements LotteryBagADT<E> {

    private ArrayList<E> bag;

    /**
     * Default constructor
     */
    public ArrayListLotteryBag() {
        bag = new ArrayList<>();
    }

    /**
     * Adds an element to the bag
     *
     * @param element
     */
    @Override
    public void add(E element) {
        bag.add(element);
    }

    /**
     * Selects a random element from the collection and returns it
     *
     * @return E
     * @throws EmptyCollectionException
     */
    @Override
    public E remove() throws EmptyCollectionException {
        int s = bag.size();
        if (s == 0) {
            throw new EmptyCollectionException("Lottery Bag Empty!");
        }
        int i = (int) (Math.random() * s);
        E el = bag.remove(i);
        return el;
    }

    /**
     * Iterates through the collection and returns true if the passed in element
     * exists in the collection If the entire collection is checked and the
     * element is not found then return false
     *
     * @param target - element to be searched for
     * @return boolean - whether or not the target was found
     * @throws EmptyCollectionException
     */
    @Override
    public boolean contains(E target) throws EmptyCollectionException {
        if (bag.size() == 0) {
            throw new EmptyCollectionException("Lottery Bag Empty!");
        }

        for (E el : bag) {
            if (el.compareTo(target) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return bag.size() == 0;
    }

    @Override
    public int size() {
        return bag.size();
    }

    @Override
    public String toString() {
        String s = "LotteryBag: \n";
        for (E el : bag) {
            s = s.concat("\t" + el.toString() + "\n");
        }
        return s;
    }

    public E pick3() throws EmptyCollectionException {
        //TODO!
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
}
