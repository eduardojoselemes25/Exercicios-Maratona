import java.util.Scanner;
import java.util.Locale;

public class volume {

  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
        int v = sc.nextInt();
        int ca = sc.nextInt();

        while (ca!=0) {
           v+=ca;
           if (v > 100) {
             v = 100;
           }
           else if (v < 0) {
             v = 0;
           }
           System.out.println(v);
           ca = sc.nextInt();
           
        }
    
  }

}