package third;
import java.util.Scanner;

public class ConsoleReadDemo {
    public static void main(String[] args) {
        System.out.println("Molim vas unesite neki broj");
        Scanner nasScanner = new Scanner (System.in);
        int uneseniBroj = nasScanner.nextInt()+5;
        if(uneseniBroj == 9){
        System.out.println("Hej,ti si unio broj: " + uneseniBroj+5);
        }else{
        System.out.println("Hej,Dosadan si");
        }
        
        
    }
    
}
