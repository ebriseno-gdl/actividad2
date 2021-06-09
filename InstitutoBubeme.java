/*
 * Programa principal de la actividad 2,
 *
 * Autor: Jose Edmundo Briseño Espinosa
 * Fecha: 08/jun/2021
 */
import java.io.*;

// Clase Principal
public class InstitutoBubeme {

    // Mètodo Principal
    public static void main( String[] args) throws IOException {

        // Crea el objeto alumno
        Alumno student = new Alumno();

        // Asigna el nombre al alumno
        student.Nombre = "Patricia" ;

        // Crea el arreglo con las calificaciones
        double [] califs = new double[5];
        califs[0] = 93.5;
        califs[1] = 100;
        califs[2] = 68.6;
        califs[3] = 81.9;
        califs[4] = 73.4;

        // Calcula el promedio de las calificaciones
        double promedio = student.calcPromedio(califs);

        // Obtiene la califiacacion final
        char califFinal = student.obtieneCalifFinal(promedio);

        //Imprime resultado
        student.imprimeResultado();
    }
}
