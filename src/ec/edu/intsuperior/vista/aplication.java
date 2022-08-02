package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.automovil;
import java.util.Scanner;
public class aplication {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
    automovil a1 = new automovil();
    automovil a2 = new automovil();
    automovil a3 = new automovil();
         System.out.println("Ingrese Marca del automovil: ");
         a1.setMarca(leer.next());
         System.out.println("Ingrese Modelo del automovil: ");
         a1.setModelo(leer.nextInt());
         System.out.println("Ingrese Motor del automovil: ");
         a1.setMotor(leer.nextInt());
         System.out.println("Ingrese numero de puertas: ");
         a1.setPuertas(leer.nextInt());
         System.out.println("Ingrese numero de asientos: ");
         a1.setAsientos(leer.nextInt());
         System.out.println("Ingrese velocidad maxima: ");
         a1.setVelocidad(leer.nextInt());
         System.out.println("Ingrese velocidad Inicio: ");
         a1.setVelocidadInicio(leer.nextInt());
         a1.setCombustible(automovil.TipoConbustible.DIESEL);
         a1setautomovil(automovil.Tipoautomovil.CIUDAD);
         a1.setColor(automovil.TipoColor.ROJO);
         System.out.println("La Marca del automovil es: " + a1.getMarca());
         System.out.println("El Modelo del automovil es: " + a1.getModelo());
         System.out.println("El Motor Es: " + a1.getMotor());
         System.out.println("El tipo de conbustible que usa es: " + a1.getCombustible());
         System.out.println("El tipo de automovil es: " + a1.getautomovil());
         System.out.println("El numero de puertas es: " + a1.getPuertas());
         System.out.println("El numero de asientos es: " + a1.getAsientos());
         System.out.println("La velocidad maxima es: " + a1.getPVelocidad());
         System.out.println("El color del automovil: " + a1.getColor());
         System.out.println("La velocidad inicial es: " + a1.getVelocidadInicio());
    }

    private static void a1setautomovil(automovil.Tipoautomovil tipoautomovil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
