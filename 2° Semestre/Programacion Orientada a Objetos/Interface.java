abstract class figura2D{
 abstract double area();

class Cuadrado extends figura2D{
    
    double area(){
        return 0;
    }
}

class Tringulo extends figura2D{
    
    double area(){
     return 0;
    }
   
    
}
class Esfera extends figura2D implements figura3D{
    
    double area (){
    return 0;
    }
    
}
public double volumen (){
    return 0;
}
}
  
interface figura3D{
    public double volumen();
}
