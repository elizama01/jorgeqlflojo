
import java.util.ArrayList;


public class Vehiculoo {
   ArrayList<Partes>parte;	

    public ArrayList<Partes> getParte() {
        return parte;
    }

    public void setParte(ArrayList<Partes> parte) {
        this.parte = parte;
    }
     
	public Vehiculoo() {
	       parte=new ArrayList<>();
       
        }

  public  void agregarParteVehiculo(Partes partevehiculo){
  parte.add(partevehiculo);
  
  }
        
        

}