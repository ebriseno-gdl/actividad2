/*
 * Clase Alumno,
 *
 * Autor: Jose Edmundo Briseño Espinosa
 * Fecha: 08/jun/2021
 */
public class Alumno {

    //ATRIBUTOS
    public String Nombre;
    private double[] Calificaciones;
    private double Promedio ;
    private char CalificacionFinal;

    //METODOS

    //Calcula Promedio
    public double calcPromedio( double[] califs) {
        double suma = 0;
        for ( int contador= 0; contador < califs.length; contador++ ) {
            suma += califs[contador];
        }
        Calificaciones = califs;
        Promedio = suma/ califs.length;
        return Promedio;
    }

    //Obtiene Calificacion final
    public char obtieneCalifFinal(double promedio) {
        if (promedio <= 50 )
            CalificacionFinal = 'F';
        else if (promedio >= 51 && promedio <= 60)
            CalificacionFinal = 'E';
        else if (promedio >= 61 && promedio <= 70)
            CalificacionFinal = 'D';
        else if (promedio >= 71 && promedio <= 80)
            CalificacionFinal = 'C';
        else if (promedio >= 81 && promedio <= 90)
            CalificacionFinal = 'B';
        else if (promedio >= 91 && promedio <= 100)
            CalificacionFinal = 'A';
        else
            CalificacionFinal = 'x';
        return CalificacionFinal;
    }

    //Imprime resultado
    public void imprimeResultado() {
        System.out.println("Nombre del Estudiante: " + Nombre);
        for ( int contador= 0; contador < Calificaciones.length; contador++ ) {
            System.out.println("Califiaciòn " + (contador+1) + ": " + Calificaciones[contador]);
        }
        System.out.println("Promedio del Estudiante: " + Promedio);
        System.out.println("Califiaciòn Final del Estudiante: " + CalificacionFinal);
    }
}
