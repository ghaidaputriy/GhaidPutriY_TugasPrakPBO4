/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Kubus extends HasilLuasPermukaan {
    
        public Kubus(int p){
        super (p);
    }
    
    int Luas(){
        return (6*(p*p));
    }
    
    void hasilKubus(){
        System.out.println("Luas Permukaan Kubus = " + Luas());
    }
}
