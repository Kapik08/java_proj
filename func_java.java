import java.util.Random;
import java.util.Scanner;

public class func_java {


        // FUN kcja #1
    static void nextSlide(){
        for(int i = 0; i < 17;i++){
            System.out.print("\n");
        }
    }
        // FUK ja.. #2
    static void rowsMachine(int x,int y, int z){
        String floor = "***********";
        String walls = "*         *";

        System.out.println(floor);
        System.out.println(walls);

        // Main interface *
        System.out.println("*  " +x+" " +y+" " +z+"  *");

        System.out.println(walls);
        System.out.println(floor);  
    }



    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Random ran = new Random();

        while (true) {
            int a = ran.nextInt(1,10);
            int b = ran.nextInt(1,10);
            int c = ran.nextInt(1,10);
            rowsMachine(a, b, c);
            if (a == b && a == c) {
                System.out.println("YOu WON!!");
                break;
            }
            else{
                System.out.println("YOu want A RETRY?! (press return)");
                scan.nextLine();
                nextSlide();
            }    
        }
  
    
        scan.close();
    }
}

/* 


public class Main {
  // Create a method named welcomeMessage

  public static void main(String[] args) {
    // Call the welcome method here
  }
}


*/ 