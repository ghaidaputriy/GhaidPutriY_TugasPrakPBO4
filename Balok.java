/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Balok extends HasilLuasPermukaan{
    
    public Balok(int p, int l, int t){
        super (p,l,t);
    }
    
    int Luas(){
        return 2 * ((p*l)+(p*t)+(l*t));
    }
    
    void hasilBalok(){
        System.out.println("Luas Oermukaan Balok = " +Luas());
    }
    
}
