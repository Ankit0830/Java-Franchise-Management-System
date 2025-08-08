package franchise;

abstract class FrinchiseApp
{
    protected String location;
    protected String franchiseOwner;

        public FrinchiseApp (String location, String franchiseOwner) 
        {
            this.location = location;
            this.franchiseOwner = franchiseOwner;
        }
        public abstract void showMenu();
        public abstract void takeOrder();
        public abstract void calculateRevenue();
        
        public void displayFranchiseDetails() 
        {
            String brand = this.getClass().getSimpleName(); // KFC or Porches
            System.out.println(brand + " Owner: " + franchiseOwner);
            System.out.println(brand + " Location: " + location);
        }
}

// KFC class
class KFC extends FrinchiseApp
{
    public KFC(String location, String franchiseOwner) {
            super(location, franchiseOwner);
        }
     @Override
        public void showMenu() {
            System.out.println("KFC Menu: Chicken Bucket, Zinger Burger, Fries, Pepsi");
        }

        @Override
        public void takeOrder() {
            System.out.println("Order taken at KFC counter.");
        }

        @Override
        public void calculateRevenue() {
            System.out.println("Calculating daily revenue for KFC...");
    }
}

// Porches class
    class Porches extends FrinchiseApp {
        public Porches(String location, String franchiseOwner) {
            super(location, franchiseOwner);
        }

        @Override
        public void showMenu() {
            System.out.println("Porches Menu: Loaded Burgers, Smoky Wings, Tandoori Fries, Mocktails");
        }

        @Override
        public void takeOrder() {
            System.out.println("Order placed via Porches digital system.");
        }

        @Override
        public void calculateRevenue() {
            System.out.println("Porches franchise daily revenue calculated via dashboard.");
        }
    }

public class Franchise 
{

    public static void main(String[] args) 
    {
        FrinchiseApp kfc = new KFC("Mumbai", "Mr. Sharma");
        System.out.println("---- KFC Franchise ----");
        kfc.displayFranchiseDetails();
        kfc.showMenu();
        kfc.takeOrder();
        kfc.calculateRevenue();
        
        System.out.println();

        FrinchiseApp porches = new Porches("Indore", "Mr. Yadav");
        System.out.println("---- Porches Franchise ----");
        porches.displayFranchiseDetails();
        porches.showMenu();
        porches.takeOrder();
        porches.calculateRevenue();
    }
    
}
