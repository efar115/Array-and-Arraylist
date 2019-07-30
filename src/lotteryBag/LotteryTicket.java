
package lotteryBag;

/**
 * Assignment 1, Fall 2018
 * UNC Charlotte ITIS 2214
 * Data Structures and Algorithms
 * @author clatulip
 */
public class LotteryTicket implements Comparable<LotteryTicket> {
    private int value;
    private String name;

    /**
     * LotteryTicket constructor
     * @param value int: Monetary value of ticket
     * @param name String: ticket type
     */
    public LotteryTicket(int value, String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * Getter for lotteryTicket value
     * @return value int
     */
    public int getValue() {
        return value;
    }

    /**
     * Getter for lotteryTicket type
     * @return name String
     */
    public String getName() {
        return name;
    }

    /**
     * Prints out the lottery ticket
     * @return ticket as string.
     */
    @Override
    public String toString() {
        if (value == 0) {
            return "Sorry, try again.";
        }
        return "It's a " + name + " lottery ticket worth $" + value + "!";
    }

    /**
     * compareTo method required to implement Comparable interface
     * @param o the other LotteryTicket object that we are comparing
     * @return 0 if two are equal value, 1 if this is bigger than 
     * passed in ticket, -1 if passed in ticket has bigger value
     */
    @Override
    public int compareTo(LotteryTicket o) {
        if (this.getValue() == o.getValue()){ 
            return 0;
        }
        if (this.getValue() > o.getValue()) {
            return 1;
        } else {
            return -1;
        }
    }
    
    
    
}
