/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Volume {
    int p,l,t;
    
    public Volume(int p){
        this.p = p;
    }
    
    public Volume(int p, int l, int t){
        this.p = p;
        this.l = l;
        this.t = t;
    }
    
    int vKubus(){
        return p*p*p;
    }
    
    int vBalok(){
        return p*l*t;
    }
    
    void tmplKubus(){
        System.out.println("Volume Kubus = " + vKubus());
    }
    
    void tmplBalok(){
        System.out.println("Volume Balok = " + vBalok());
    }
    
}
