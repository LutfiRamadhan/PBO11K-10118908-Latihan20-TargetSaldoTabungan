/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan20;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float saldo = 3500000, bunga = (float)8/100, target = 6000000;
        System.out.println(bunga);
        int bulan = 1, total;
        do {            
            saldo += Math.floor(saldo*bunga);
            total = (int) saldo;
            System.out.printf("Saldo di bulan ke-"+bulan+" Rp. %,9.0f \n", saldo); 
            bulan++;
        } while (saldo<target);
    }
    
}
