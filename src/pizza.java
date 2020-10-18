import java.util.Scanner;
//Pizza ordering// Author:David Engholm-Keller//Tester:Andrej
public class pizza
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double pizzaPrice1 = 75;     //variables for prices of pizzas and toppings.
        double pizzaPrice2 = 80;
        double pizzaPrice3 = 90;
        double pizzaPrice4 = 85;
        double pizzaPrice5 = 80;
        double pizzaPrice6 = 85;
        double pizzaPrice7 = 90;
        double pizzaPrice8 = 95;
        double pizzaPrice9 = 100;
        double pizzaPrice10 = 110;

        double extras1 = 5;
        double extras2 = 5;
        double extras3 = 5;
        double extras4 = 5;
        double extras5 = 5;
        double extras6 = 5;
        double extras7 = 5;
        double extras8 = 5;
        double extras9 = 5;
        double extras10 = 5;
        double extras11 = 10;
        double extras12 = 10;
        double extras13 = 15;
        double extras14 = 20;
        double extras15 = 25;

        int extrasToggle = 0; //to use to remove text about toppings in final order confirmation.

        final double multiplierChildPrice = 0.75;   //multipliers to find price of pizza according to size
        final double multiplierFamilyPrice = 1.50;

        int chosenPizza;
        String chosenPizzaName;
        int chosenSizeNo;
        String chosenSizeName;
        int chosenExtraNo;
        String chosenExtra;

        double sumPrice = 0;  //the combined price of the order.

        //do-loop for input validation [1-10]
        do {
            System.out.println("Pizza Menu");
            System.out.printf("1.Burrata - Burrata, Cherry Tomatoes, Basil, Sea Salt. %49s", "PRICE DKK ");
            System.out.printf("%.2f", pizzaPrice1);
            System.out.printf("\n2.Aglio, Olio - Mozzarella, Ricotta, Garlic, Hot Chili Flakes, Basil. %34s", "PRICE DKK ");
            System.out.printf("%.2f", pizzaPrice2);
            System.out.printf("\n3.Tartufata - Mozarella, home-made Truffle Spread, Mushrooms, Prosciutto di Parma, Basil. %14s", "PRICE DKK ");
            System.out.printf("%.2f", pizzaPrice3);
            System.out.printf("\n4.Quattro Formaggi - Mozzarella, Smoked Mozzarella, Parmigiano, Gorgonzola, Basil. %21s", "PRICE DKK ");
            System.out.printf("%.2f", pizzaPrice4);
            System.out.printf("\n5.Verdure - Tomatoes, Mozzarella, Eggplant, Caramelized Onions, Mushrooms, Basil. %22s", "PRICE DKK ");
            System.out.printf("%.2f", pizzaPrice5);
            System.out.printf("\n6.Diavola - Tomatoes, Mozzarella, Hot Soppressata, Olives, Basil. %38s", "PRICE DKK ");
            System.out.printf("%.2f", pizzaPrice6);
            System.out.printf("\n7.Quattro Stagioni - Tomatoes, Mozzarella, Olives, Mushrooms, Italian Ham, Artichokes, Basil. %10s", "PRICE DKK ");
            System.out.printf("%.2f", pizzaPrice7);
            System.out.printf("\n8.Prosciutto Crudo - Tomatoes, Mozzarella, Prosciutto di Parma, Basil. %33s", "PRICE DKK ");
            System.out.printf("%.2f", pizzaPrice8);
            System.out.printf("\n9.Boscaiola - Tomatoes, Mozzarella, Hot Italian Sausage, Gorgonzola, Mushrooms, Basil. %17s", "PRICE DKK ");
            System.out.printf("%.2f", pizzaPrice9);
            System.out.printf("\n10.Calzone - Tomatoes, Mozzarella, Ricotta, Italian Ham, Basil. %40s", "PRICE DKK ");
            System.out.printf("%.2f", pizzaPrice10);
            System.out.println("\nPlease, input [1-10] for ordering your chosen pizza:");
            chosenPizza = in.nextInt();
        }
        while (chosenPizza < 1 || chosenPizza > 10);

        switch (chosenPizza) {
            case 1:
                chosenPizzaName = "Burrata";
                sumPrice = sumPrice + pizzaPrice1;  //add price of specific pizza to sumPrice
                break;
            case 2:
                chosenPizzaName = "Aglio, Olio";
                sumPrice = sumPrice + pizzaPrice2;
                break;
            case 3:
                chosenPizzaName = "Tartufata";
                sumPrice = sumPrice + pizzaPrice3;
                break;
            case 4:
                chosenPizzaName = "Quattro Formaggi";
                sumPrice = sumPrice + pizzaPrice4;
                break;
            case 5:
                chosenPizzaName = "Verdure";
                sumPrice = sumPrice + pizzaPrice5;
                break;
            case 6:
                chosenPizzaName = "Diavola";
                sumPrice = sumPrice + pizzaPrice6;
                break;
            case 7:
                chosenPizzaName = "Quattro Stagioni";
                sumPrice = sumPrice + pizzaPrice7;
                break;
            case 8:
                chosenPizzaName = "Prosciutto Crudo";
                sumPrice = sumPrice + pizzaPrice8;
                break;
            case 9:
                chosenPizzaName = "Boscaiola";
                sumPrice = sumPrice + pizzaPrice9;
                break;
            case 10:
                chosenPizzaName = "Calzone";
                sumPrice = sumPrice + pizzaPrice10;
                break;
            default:
                chosenPizzaName = "Invalid pizza";
                break;
        }

        do {
            System.out.println("You have chosen " + chosenPizzaName + "." +
                    "Would you like to add additional toppings? Enter 16 to skip or enter number to " +
                    "add the corresponding topping: \n");
            System.out.printf("1.Garlic - PRICE DKK " + extras1 + "\n2.Basil - PRICE DKK " + extras2 +
                    "\n3.Parmigiano - Price DKK " + extras3 + "\n" + "4.Anchovies - PRICE DKK " + extras4 +
                    "\n5.Olives - PRICE DKK " + extras5 + "\n6.Capers - PRICE DKK " + extras6 + "\n7.Mushrooms - PRICE DKK "
                    + extras7 + "\n" + "8.Onions - PRICE DKK " + extras8 + "\n9.Eggplant - PRICE DKK " + extras9 +
                    "\n10.Arugula - PRICE DKK " + extras10 + "\n11.Ricotta - Price DKK " + extras11 + "\n" +
                    "12.Hot Italian Sausage - PRICE DKK " + extras12 + "\n13.Italian Ham - PRICE DKK " + extras13 + "\n" +
                    "14.Buffalo Mozzarella - Price DKK " + extras14 + "\n15.Prosciutto di Parma - Price DKK " + extras15 +
                    "\n");
                chosenExtraNo = in.nextInt();
        }
        while (chosenExtraNo < 1 || chosenExtraNo > 16);

        switch (chosenExtraNo)
        {
            case 1:
                chosenExtra = "Garlic";
                extrasToggle++;            // Toggle to choose correct text about chosen toppings in confirm order
                sumPrice = sumPrice + extras1;      // Adds the price of the toppings to sumPrice
                break;
            case 2:
                chosenExtra = "Basil";
                extrasToggle++;
                sumPrice = sumPrice + extras2;
                break;
            case 3:
                chosenExtra = "Parmigiano";
                sumPrice = sumPrice + extras3;
                extrasToggle++;
                break;
            case 4:
                chosenExtra = "Anchovies";
                sumPrice = sumPrice + extras4;
                extrasToggle++;
                break;
            case 5:
                chosenExtra = "Olives";
                sumPrice = sumPrice + extras5;
                extrasToggle++;
                break;
            case 6:
                chosenExtra = "Capers";
                sumPrice = sumPrice + extras6;
                extrasToggle++;
                break;
            case 7:
                chosenExtra = "Mushrooms";
                sumPrice = sumPrice + extras7;
                extrasToggle++;
                break;
            case 8:
                chosenExtra = "Onions";
                sumPrice = sumPrice + extras8;
                extrasToggle++;
                break;
            case 9:
                chosenExtra = "Eggplant";
                sumPrice = sumPrice + extras9;
                extrasToggle++;
                break;
            case 10:
                chosenExtra = "Arugula";
                sumPrice = sumPrice + extras10;
                extrasToggle++;
                break;
            case 11:
                chosenExtra = "Ricotta";
                sumPrice = sumPrice + extras11;
                extrasToggle++;
                break;
            case 12:
                chosenExtra = "Hot Italian Sausage";
                sumPrice = sumPrice + extras12;
                extrasToggle++;
                break;
            case 13:
                chosenExtra = "Italian Ham";
                sumPrice = sumPrice + extras13;
                extrasToggle++;
                break;
            case 14:
                chosenExtra = "Buffalo Mozzarella";
                sumPrice = sumPrice + extras14;
                extrasToggle++;
                break;
            case 15:
                chosenExtra = "Prosciutto di Parma";
                sumPrice = sumPrice + extras15;
                extrasToggle++;
                break;
            case 16:
                chosenExtra = "no extra toppings";
                break;
            default:
                chosenExtra = "no extra toppings chosen.";
                break;
        }

        do {  //do-loop for input validation 1-3
            System.out.println("You have chosen " + chosenPizzaName + " with "+ chosenExtra +". Please, enter [1-3]" +
                    " for choosing size of pizza\n" + "1. standard, 2.child or 3. family \nSize child costs 75% of" +
                    " the standard price. Size family costs 150% of the standard price\n");
            chosenSizeNo = in.nextInt();
        }
        while (chosenSizeNo < 1 || chosenSizeNo > 3);
        switch (chosenSizeNo) {
            case 1:
                chosenSizeName = "Standard";
                break;
            case 2:
                chosenSizeName = "Child";
                sumPrice = sumPrice * multiplierChildPrice;
                break;
            case 3:
                chosenSizeName = "Family";
                sumPrice = sumPrice * multiplierFamilyPrice;
                break;
            default:
                chosenSizeName = "Invalid size";
                break;
        }

        if (extrasToggle != 0)
            {
            System.out.println("Order confirmation\nYou have ordered " + chosenPizzaName + " in size " + chosenSizeName +
            " with the following extra toppings " + chosenExtra + "\n");
            System.out.printf(" for the price of DKK %.2f", sumPrice);
            System.out.println("Thank you for your order!");
            }
        else
            {
            System.out.println("Order confirmation\nYou have ordered " + chosenPizzaName + " in size " + chosenSizeName);
            System.out.printf(" for the price of DKK: %.2f", sumPrice);
            System.out.println("\nThank you for your order!");
            }
    }
}
