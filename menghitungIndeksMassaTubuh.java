
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK TELKOM 05
 */
public class menghitungIndeksMassaTubuh {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Berat Badan: ");
        double berat=input.nextDouble();
        System.out.print("Masukkan Tinggi Badan: ");
        double tinggi=input.nextDouble();
        double konversiBerat=berat*2.205;
        double konversiTinggi=tinggi/2.54;
        double rumusBMI=konversiBerat/konversiTinggi*703;
        System.out.println("BMI= "+rumusBMI);
    }
}