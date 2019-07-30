/*
 * Created on Feb 8, 2005
 * author: manuel a. perez-quinones
 * Modified August 2018 
 * author: celine latulipe
 * 
 * Lottery Simulation class
 * 
 */

package lotteryBag;


/**
 * Lottery Simulation class. This class simulates a lottery system
 * By adding a bunch of LotteryTicket objects to a LotteryBag and then
 * simulating pulling out random tickets.
 */
/**
 * @author clatulip
 */


public class LotterySimulation {

    private LotteryBagADT<LotteryTicket> theBag;


    /**
     * Constructor for the LotterySimulation class. 
     */
    public LotterySimulation()  {
        
        // You can use this simulation to see how both your array and ArrayList
        // implementations work, just uncomment one or the other of the two
        // lines below. 
        
      //  theBag = new ArrayLotteryBag<>(); // simulate Array-base lottery
      theBag = new ArrayListLotteryBag<>(); // simulate ArrayList lottery
        
        initializeLottery();
        runLottery();
        
    }

    /**
     * Sets up the initial bag with a bunch of randomly
     * generated LotteryTicket objects
     */
    private void initializeLottery() {
        for (int i = 0; i < 20; i++) {
            int value = 0;
            int typeIndex = (int)(Math.random()*100);
            String s = null;
            switch (typeIndex) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    s = "Daily";
                    value = (int)(Math.random()*100);
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    s = "Scratch-Off";
                    value = (int)(Math.random()*1000);
                    break;
                case 10:
                case 11:
                case 12:
                    s = "Lotto";
                    value = (int)(Math.random()*10000);
                    break;
                case 13:
                case 14:
                    value = (int)(Math.random()*100000);
                    s = "Lucke-Zone";
                    break;
                case 15:
                    value = (int)(Math.random()*1000000);
                    s = "Powerball";
                    break;
                default:
                    s = "Sorry, try again.";
                    
            }
            theBag.add(new LotteryTicket(value,s));
        }
        System.out.println("Added the following tickets to the " + theBag.toString());
    }

    /**
     * Runs the lottery simulation, printing the results 
     * out to the console
     */
    private void runLottery() {
        System.out.println("Let's check tonight's winning lottery numbers!");
        for (int i = 0; i < 3; i++) {
            System.out.println("Let's pull a ticket out of the lottery bag. What do we have?");
            LotteryTicket lt;
            try {
                lt = theBag.remove();
                System.out.println(lt.toString() + "\n");
            } catch (EmptyCollectionException ex) {
                System.out.println("Lottery Bag is empty.");
                return;
            }
            
        }
        System.out.println("And now it's time for our famous Pick3!");
        LotteryTicket p3;
        try {
            p3 = theBag.pick3();
            System.out.println(p3.toString() + "\n");
        } catch (EmptyCollectionException ex) {
            System.out.println("Lottery Bag is empty.");
            return;
        }
        

        LotteryTicket test = new LotteryTicket(25, "test");
        theBag.add(test);
        try {
            if (theBag.contains(new LotteryTicket(25, "test"))) {
                System.out.println("There is a ticket worth $25.");
            } else {
                System.out.println("There is no ticket worth $25.");
            }
        } catch (EmptyCollectionException ex) {
            System.out.println("Lottery Bag is empty.");
        }
        
    }



    /**
     * Main program, just starts the simulation.
     */

    public static void main (String[] args)  {
            LotterySimulation fc = new LotterySimulation();
    }


}
