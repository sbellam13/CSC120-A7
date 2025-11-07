/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements{

    // Instance Variables
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /**
     * Constructor
     * @param name
     * @param address
     * @param nFloors
     * @param coffeeOunces
     * @param sugar
     * @param creams
     * @param cups
     */
    public Cafe(String name, String address, int nFloors, int coffeeOunces, int sugar, int creams, int cups) {
        super(name, address, nFloors);
        nCoffeeOunces = coffeeOunces;
        nSugarPackets = sugar;
        nCreams = creams;
        nCups = cups;
    }
    /**
     * Sells cup of coffee, decreases supplies according to parameters
     * @param size
     * @param sugarPackets
     * @param creams
     */
    public void sellCoffee(int size, int sugarPackets, int creams){
        nCoffeeOunces -= size;
        nSugarPackets -= sugarPackets;
        nCreams -= creams;
        nCups -= 1;
    }

    /**
     * Restocks supplies according to parameters
     * @param coffeeOunces
     * @param sugarPackets
     * @param creams
     * @param cups
     */
    private void restock(int coffeeOunces, int sugarPackets, int creams, int cups){
        nCoffeeOunces += coffeeOunces;
        nSugarPackets += sugarPackets;
        nCreams += creams;
        nCups += cups;
    }

    public static void main(String[] args) {
        Cafe test = new Cafe("Compas Cafe", "ADDRESS", 1, 100, 100, 100, 100);
    }

}
