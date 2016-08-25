/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Empleado {
    private double documento;
    private int horasTrabajadas;
    private double salario;
    private String nombre;
    private String apellido;
    private String genero;
    private String fechaEntrada;
    private String fechaNacimiento;
    private int edad;

    public Empleado(double documento, int horasTrabajadas, double salario, String nombre, String apellido, String genero, String fechaEntrada, String fechaNacimiento, int edad) {
        this.documento = documento;
        this.horasTrabajadas = horasTrabajadas;
        this.salario = salario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaEntrada = fechaEntrada;
        this.edad = edad;
    }

    public void añadirHoras(int horas){
        this.horasTrabajadas += horas;
    }
    public void nombre(String nombre){
        this.nombre = nombre;
    }
    public void mostrarAntiguedad(){
        System.out.println(this.nombre);
    }
    public void mostrarEdad(){
        System.out.println("La edad de" + this + "es" + this.edad);
    }
    public void mostrarHoras(){
        System.out.println(this.horasTrabajadas);
    }
}

class Nomina{
    public static void main(String[] args){
        
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        
        Empleado Hector = new Empleado(85655269, 0, 690000, "Hector", "Vargas", "Masculino", "12/05/2009", "02/05/1983", 33);
        Empleado Martin = new Empleado(31353391, 0, 750000, "Martin", "Hernandez", "Masculino", "11/04/2007", "28/02/1991", 25);
        Empleado Inge = new Empleado(15141869, 0, 1000000, "Inge", "Quadflieg", "Femenino", "30/10/2012", "02/05/1987", 29);
        
        int horasInge = teclado.nextInt();
        int horasHector = teclado.nextInt();
        int horasMartin = teclado.nextInt();
        
        Inge.añadirHoras(horasInge);
        Martin.añadirHoras(horasMartin);
        Hector.añadirHoras(horasHector);
        
        Hector.mostrarAntiguedad();
        Hector.mostrarEdad();
        Hector.mostrarHoras();
        
        Martin.mostrarAntiguedad();
        Martin.mostrarEdad();
        Martin.mostrarHoras();
        
        Inge.mostrarAntiguedad();
        Inge.mostrarEdad();
        Inge.mostrarHoras();
    }
}

