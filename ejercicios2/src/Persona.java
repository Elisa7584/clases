import java.util.Random;:
public class Persona {

     private String nombre;
     private double peso;
     private String genero;
     private int edad;
     private String DNI;
     private double altura;

     public Persona(){
        this.altura = 1.65;
        this.edad = 21;
        this.nombre = "Elisa";
        this.genero = "F";
        this.peso = 50;
     }
     public Persona(String nombre, String DNI, int edad, double altura, String genero){
        this.altura = altura;
        this.edad = edad;
        this.nombre = nombre;
        this.DNI = generaDNI();
        this.genero = genero;
        this.altura = altura;
     }

     public boolean esMayorDeEdad(){
        return edad > 18;
     }
     public boolean comprobarSexo(){
        return genero != "F" || genero != "M" || genero != "NB";
     }


    public String generaDNI(){
        String[] lista = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        String dni = "";
        int posLetra;
        // int posLetra;

        for(int i = 0 ; i <= 8 ; i++){
            dni += Math.random() * 10; 
        }
        
        int numerosDni = Integer.parseInt(dni);
        posLetra = numerosDni % 23; 

        for (int i = 0 ; i < lista.length ; i++){
            if( i == posLetra ){
                dni += lista[i];
            }
        }
        return dni;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString() {
        return "Persona [nombre=" + nombre + ", peso=" + peso + ", genero=" + genero + ", edad=" + edad + ", DNI=" + DNI
                + ", altura=" + altura + "]";
    }

}
