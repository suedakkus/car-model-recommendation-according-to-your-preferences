/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programming.homework.pkg5;
import java.util.Scanner;
/**
 *
 * @author RUKIYE
 */
public class ProgrammingHomework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Which type of vehicle do tou prefer to use? :(car or "
                + "motorcycle)");
        String str=scan.nextLine();
        System.out.println(str);
        
        if(str.equals("car")|| str.equals("Car")){
            System.out.print("Which type of car are you interested in ?\n1-)"
                    + "Sedan\n2-)Hatchback\n3-)Station wagon\nanswer:");
            String answ= scan.nextLine();
            System.out.println(answ);
            if(answ.equals("Sedan")||answ.equals("sedan")){
                System.out.println("BEST SELLING MODELS:\n-FIAT EGEA SEDAN"
                        + "\n-RENAULT Megane\n-VOLKSWAGEN Passat\n-TOYOTA"
                        + " Corolla\n\n\n");
            }
            else if(answ.equals("Hatchback")||answ.equals("hatchback")){
                System.out.println("BEST MODELS:\n-Volkswagen Golf\n-Seat Leon"
                        + "\n-Peugeot 308\n-Skoda Octavia\n\n\n");
            }
            else{
                System.out.println("BEST MODELS:\n-Fiat 500L\n-Volvo V60\n-"
                        + "Ford C-Max\n\n\n");
            }
            return ;
        }
        else if(str.equals("motorcycle")||str.equals("Motorcycle")){
            System.out.print("Which type of motorcycle are you interested in ?"
                    + "\n1. Touring motorcycle \n2. Enduro-Off-road and "
                    + "Asphalt Motorcycle \n3. Cruiser-American Long"
                    + " Distance Motorcycle \n4. Racing motorcycle \n5. Street "
                    + "motorcycle \n6. Commuter motorcycle \n7. Scooter "
                    + "motorcycle\nanswer:");
            String answ2=scan.nextLine();
            System.out.println(answ2);
            
            if(answ2.equals("TOURİNG MOTORCYCLE")||answ2.equals("touring "
                    + "motorcycle")){
                System.out.println("BEST MODELS:\n1. Kawasaki Versys\n2. "
                        + "Suzuki V-Strom\n3. Triumph Tiger 800\n4. BMW "
                        + "F800 GS\n5. Yamaha XT1200Z Super Tenere");
            }
            else if(answ2.equals("ENDURO MOTORCYCLE")||answ2.equals("enduro"
                    + "motorcycle")){
                System.out.println("BEST MODELS:\n1. Ducati Multistrada 1260"
                        + "\n2. Suzuki V-Strom 1000XT SE ABS\n3. Triumph "
                        + "Tiger Explorer XCX");
            }
            else if(answ2.equals("CRUİSER MOTORCYCLE")||answ2.equals("cruiser "
                    + "motorcycle")){
                System.out.println("The most well-known brands in this class "
                        + "are Indian and Harley Davidson. eg:Harley Davidson"
                        + " - Dyna Wide Glide");
            }
            else if(answ2.equals("RACİNG MOTORCYCLE")||answ2.equals("racing"
                    + " motorcycle")){
                System.out.println("BEST MODEL SERİES:"
                        + "\n1. Honda CBR1000\n2. Yamaha"
                        + " R1\n3. BMW S1000RR Ducati Panigale");
            }
            else if(answ2.equals("STREET MOTORCYCLE")||answ2.equals("street "
                    + "motorcycle")){
                System.out.println("The most well-known brand is "
                        + "Ducati and Monster is the Diavel series.");
            }
            else if(answ2.equals("COMMUTER MOTORCYCLE")||answ2.equals(""
                    + "commuter motorcycle")){
                System.out.println("BEST MODELS:\n1. Honda CBF 150\n2."
                        + " Yamaha YBR 125");
            }
            else if(answ2.equals("SCOOTER MOTORCYCLE")||answ2.equals("scooter"
                    + "motorcycle")){
                System.out.println("The most famous brand in this "
                        + "regard is undoubtedly Vespa.");
            }
            else{
                System.out.println("Incorrect entry made.");
                return;
            }
                
        }
        else{
            System.out.println("Incorrect entry made.");
            return;
        }
    }
    
}
