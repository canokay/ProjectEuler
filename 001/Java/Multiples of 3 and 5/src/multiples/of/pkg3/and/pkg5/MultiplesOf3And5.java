/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples.of.pkg3.and.pkg5;

/**
 *
 * @author can
 */
public class MultiplesOf3And5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,x=0;
         for (i = 1; i <= 10; i++) {
            if(i%3 == 0 | i%5 == 0){
                x += i;
            }
        }
        System.out.println(x);
             
    }
    
}
