
package jobsheet9dany;

import java.util.Scanner;
public class Method2 {
     public static int hitung(int jarak, int waktu)
    {
       
        return jarak / waktu; 
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jarak ( km ) : ");
        int jarak = input.nextInt();
        System.out.print("Masukkan waktu ( jam ): ");
       int  waktu = input.nextInt();
        
        int kecepatan;
        kecepatan = hitung(jarak, waktu);
         System.out.println("Kecepatan : " + kecepatan + "km/h");
    }
        
    
}
