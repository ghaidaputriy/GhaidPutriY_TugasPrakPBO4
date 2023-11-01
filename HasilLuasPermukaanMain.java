/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class HasilLuasPermukaanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Volume v1 = new Volume(10);
        Volume v2 = new Volume(10,5,2);
         Balok b1 = new Balok(8,5,3);
         Kubus b2 = new Kubus(10);
         
         System.out.println("======= Menghitung Volume =======");
         v1.tmplKubus();
         v2.tmplBalok();
         
         System.out.println("======= Menghitung Luas Permukaan =======");
         b1.hasilBalok();
         b2.hasilKubus();
         
        
    }
    
}
