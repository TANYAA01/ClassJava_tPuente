package ec.edu.intsuperior.modelo;

public class automovil {
    public String marca;
    public int modelo;
    public int motor;

    public void setVelocidad(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCombustible(TipoConbustible tipoConbustible) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPuertas(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getautomovil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public enum TipoConbustible{
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }
    TipoCombustible combustible;
    public enum Tipoautomovil{
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO,SUV
    }
    Tipoautomovil automovil;
    int puertas;
    int asientos;
    int velocidad;
    public enum TipoColor{
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
        
    }
    TipoColor color;
    int velocidadInicio = 0;
    public automovil (){
    }
    automovil(String marca, int modelo, int motor, TipoCombustible combustible, Tipoautomovil automovil, 
            int puertas, int asientos, int velocidad, TipoColor color, int velocidadInicio){
    }
    public void setMarca (String marca){
        this.marca = marca;
    }
    public void setModelo (int modelo){
        this.modelo = modelo;
    }
    public void setMotor (int motor){
        this.motor = motor;
    }
    public void setCombustible (TipoCombustible combistible){
        this.combustible = combustible;
    }
    public void setautomovil (Tipoautomovil automovil){
        this.automovil = automovil;
    }
    public void getPuertas (int puertas){
        this.puertas = puertas;
    }
    public void setAsientos (int asientos){
        this.asientos = asientos;
    }
    public void setVelelocidad (int velocidad){
        this.velocidad = velocidad;
    }
    public void setColor (TipoColor color){
        this.color = color;
    }
    public void setVelocidadInicio(int velocidadInicio){
        this.velocidadInicio = velocidadInicio;
    }
    public String getMarca(){
        return marca;
    }
    public int getModelo(){
        return modelo;
    }
    public int getMotor(){
        return motor;
    }
    public TipoCombustible getCombustible(){
        return combustible;
    }
    public int getPuertas(){
        return puertas;
    }
    public int getAsientos(){
        return asientos;
    }
    public int getPVelocidad(){
        return velocidad;
    }
    public TipoColor getColor(){
        return color;
    }
    public int getVelocidadInicio(){
        return velocidadInicio;
    }
}
