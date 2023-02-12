public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.3 to access the link).
        
        //You picked 500 apples from an apple orchard
        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples+=500;

        //Time for business! You're selling each apple for 40 cents
        System.out.println("Time for business! You're selling each apple for 40 cents");
        double price = 0.40;

        //One customer walked in. He bought 4 apples!
        System.out.println("One customer walked in. He bought 4 apples!");
        numOfCustomers++;
        numOfApples-=4;
        profit += 4*price;

        //Another customer walked in. He bought 20 apples!
        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfCustomers++;
        numOfApples-=20;
        profit+=20*price; 


        //Another customer walked in. She bought 200 apples!
        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfCustomers++;
        numOfApples-=200;
        profit+=200*price;
        
        
        //Wow! So far, you made:
        System.out.println("Wow! So far, you made: "+ profit);
        System.out.println(numOfCustomers + "customers love your apples.");
        System.out.println("You have " + numOfApples + " apples left.");

        // Compare your result to what's on Learn the Part.  
        
    }

}
