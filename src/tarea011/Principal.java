
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pcccasd
 */
public class Principal {
    public static void main(String[] args) {
        Vehiculoo v=new Vehiculoo();
      Scanner e=new Scanner(System.in);
        Partes p;
        String n1;
      int opc;
        boolean salir=true;
        do { 
            System.out.println("Ingrese Nombre de parte");
        n1=e.next();
         
         p= new Partes(n1);
        
          p.agregarPartes(p);
        
       
      
        System.out.println("Ingresar Un SubComponente 1=si , 2=No");
            opc=e.nextInt();
       if (opc==1){
       salir=true;
       v.agregarParteVehiculo(p);
       }else{
       if(opc==2){
       salir=false;
           
       }
       }
       
              
            
        } while (salir==true);
       
        for (int i = 0; i <v.getParte().size(); i++) {
            System.out.println(""+v.getParte().get(i));
        }
    }
}
