import java.util.Scanner;

public class shoping_cart_program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String item;
        String sumUp;
        int quantity;
        double price;
        

        System.out.print("You enter the shop. What are you going to buy?: ");
        item = input.nextLine();

        System.out.print("how many?: " );
        quantity = input.nextInt();

        System.out.print("How much for a pice?: ");
        price = input.nextDouble();

        sumUp = (quantity > 1) ? "you are going to buy "+ item+"'s" : "you are going to buy"+ item;
        System.out.print(sumUp+" in quantity of: "+quantity+" this will cost: "+price*quantity);

        input.close();
    }
}
