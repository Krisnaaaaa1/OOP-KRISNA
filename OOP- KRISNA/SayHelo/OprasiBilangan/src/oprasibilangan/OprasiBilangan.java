/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oprasibilangan;

/**
 *
 * @author INSTIKI
 */
public class OprasiBilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int jml1,b1,b2,b3,jml2,jml3;
       float bgi;
       b1 = 10;
       b2 = 20;
       b3 = 7;
       jml1 = b1 + b2 -b3;
       jml2= b1 + b2 +b3;
       jml3=b3+b2-b3;
       bgi=b1/b3/b2;
        System.out.println(b1+"+"+ b2 +"-" +b3+"="+jml1);
        System.out.println(b1+"+"+ b2 +"+" +b3+"="+jml2);
        System.out.println(b1+"+"+ b3 +"+" +b2+"="+bgi);
        
        
       
       
    }
    
}
