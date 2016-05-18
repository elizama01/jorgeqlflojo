import java.util.*;

public class Partes {

	
	
        Collection<Partes> Sub;
        

        String Nombre="";

   
   public Partes(String n1) {
   this.Nombre=n1;	
   Sub=new ArrayList<>() ;
}
public  void agregarPartes(Partes p1){
 
   Sub.add(p1);
    
}


    public Collection<Partes> getSub() {
        return Sub;
    }

    public void setSub(Collection<Partes> Sub) {
        this.Sub = Sub;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
        
	
}