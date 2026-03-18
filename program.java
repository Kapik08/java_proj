import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        //usr type shiii
        Scanner userInput = new Scanner(System.in);
        int c;

        // get 2nums
        System.out.print("Provide int a: ");
        int a = userInput.nextInt();
        System.out.print("Provide int b: ");
        int b = userInput.nextInt();

        //sellect an operator  

        System.out.println("Sellect now opperator:");
        System.out.print("1 = + | 2 = - | 3 = * | 4 = / | : ");
        int opperator = userInput.nextInt();
        switch (opperator) {
          case 1:
            //dodawanie
            c = a+b;
            System.out.print("The sum of: "+ a +" + "+ b +" = "+ c);
            break;
          case 2:
            //odejmowanie
            c = a-b;
            System.out.print("The sum of: "+ a +" - "+ b +" = "+ c);
            break;

          case 3:
            //możenie
            c = a*b;
            System.out.print("The sum of: "+ a +" x "+ b +" = "+ c);
            break;
          case 4:
            //dzielenie
            c = a/b;
            System.out.print("The sum of: "+ a +" / "+ b +" = "+ c);
            break;   
          default:
            System.out.println("to low or to high int");
            break;
        }
        userInput.close();
    }
    
}