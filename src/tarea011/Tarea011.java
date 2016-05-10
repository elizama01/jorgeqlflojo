/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea011;

import java.util.Scanner;

/**
 *
 * @author pcccasd
 */
public class Tarea011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
       int m=0;
       int n=0;
        System.out.println("Ingrese un entero mayor que cero");
       int b=entrada.nextInt();
   
       int z=b;
      
       int i=1;
         
      while(z>0){
             System.out.println("Ingrese entero n°" +i);  
           int c=entrada.nextInt();
            
        if (z==b) {
                m=c;
                n=c;
            }else{
                if (c<m) {
                    m=c;
                }
                if (c>n) {
                    n=c;
                }
                
            }
            z=-1;
            i++; 
       
        }
          
            
        
        System.out.println(" M=" + m);
        System.out.println("N="+n);
           
            
        }
    }
        
            
        
    
   

