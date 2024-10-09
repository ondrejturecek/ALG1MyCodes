/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohy_03;

/**
 *
 * @author Dagmar Malá
 */
public class rodnecislo {
    public static void main(String[] args) {
        long front = 50316;
        long back = 1604;
        final int POCET_MIST = 10000;
        long all = (front * POCET_MIST) + back;
        System.out.println(all); 
        long del11 = all % 11;
        
        if (del11 == 0){
            System.out.println("je platné rodné číslo");
        }else if (del11 > 0){
            double rc9 = Math.floor(all / 10);
            double div11 = rc9 % 11;
            if (div11 == 10){
                double rc10a = rc9 * 10; 
                if (all == rc10a){
                    System.out.println("rodné čísllo je platné");
                }else{
                    System.out.println("rodné číslo je neplatné");
                }
                
            }else{
                double rc10b = ((rc9 * 10) + div11);
                if (rc10b == all){
                    System.out.println("rodné číslo je platné");
                }else{System.out.println("rodné číslo je neplatné");
                }
            }          
        }     
    }
}
