package cuenta;

public class Cuenta 
        
{ 
   public String titular;
   public double cantidad;
   public double retiro;

    Cuenta() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getRetiro() {
        return retiro;
    }
    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }
    public double getCantidad() {
        return cantidad;    
    }
    public String getTitular() {
        return titular;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
  //constructores
   public Cuenta(String titular){
     this.titular =titular;  
   }
   public Cuenta(double cantidad,String titular) {
        this.cantidad = cantidad;
        this.titular=titular;
    }
   //metodos especiales 
   public void ingresar(float cantidad){
       if(cantidad>0){
       this.cantidad+=cantidad;
       }
   }
   public void retirar(float cantidad){
       
       if(cantidad>this.cantidad){
           this.cantidad = 0;
       }
       else
           this.cantidad-=cantidad;
   }
//aparte
    void setCantidad(String infor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void retirar(String reetiro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRetiro(String reetiro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

