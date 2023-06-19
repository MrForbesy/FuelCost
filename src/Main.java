import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Let me calculate the cost of driving your car for the next 100 miles and how far you will be able to drive with your current gas level.");

        Scanner in = new Scanner(System.in);
        double gallons; //gallons in tank//
        double miles; //miles the car can go per gallon//
        double price; //price of gas//

        //User inputs the number of gallons in tank//
        do
        {
            System.out.println("Please enter the number of gallons that you have in your tank.");
            gallons = in.nextDouble();
        }
        while (gallons <= 0);

        //User inputs the number of miles the car can go on a gallon of gas//
        do
        {
            System.out.println("How many miles can your car go on a gallon of gas?");
            miles = in.nextDouble();
        }
        while (miles <= 0);

        //User inputs the price of gas//
        do
        {
            System.out.println("What is the price of a gallon of gas in your area?");
            price = in.nextDouble();
        }
        while (price <= 0);

        //Calculate the cost per 100 miles//
        double costPer100 = (100 / miles) * price;
        //Calculate the distance//
        double distance = gallons * miles;

        //Print results//
        System.out.println("The cost per 100 miles is: $" + costPer100);
        System.out.println("You can travel " + distance + " miles with the your gas tank currently.");
    }
}