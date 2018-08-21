
package jobsheet9dany;

import java.util.Scanner;




public class Latihan1 {
    public static void hitung(int a, int b)
    {
        System.out.println("Hasil " + (a + b));
        
    }
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            
            System.out.print("Masukkan bilangan I : ");
            int bil1 = input.nextInt();
            
            System.out.print("Masukkan bilangan II : ");
            int bil2 = input.nextInt();
            
            hitung(bil2, bil1);
            
        }
    }
    
}
