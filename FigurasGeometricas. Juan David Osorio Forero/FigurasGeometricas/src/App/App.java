package App;

/**
 * Se importan los modelos de las Figuras Geométricas Trabajadas
 */

import Model.Circulo;
import Model.Cuadrado;
import Model.Rectangulo;
import Model.TrianguloRectangulo;

/**
* Esta clase prueba diferentes acciones realizadas en diversas figuras geométricas.
* @version 1.0/2023
* @author Juan David Osorio Forero
* Método main que crea un círculo,un cuadrado, un rectángulo, y un triángulo rectángulo.
* Para cada uno de estas figuras geométricas, se tendra como resultado su área y perímetro.
*/
public class App {
public static void main(String args[]) {

    Circulo objCirculo = new Circulo(6);

    Cuadrado objCuadrado = new Cuadrado(8);

    Rectangulo objRectangulo = new Rectangulo(19,2);

    TrianguloRectangulo objTrianguloRectangulo = new TrianguloRectangulo(1,3);

    System.out.println("El área del círculo es = " + objCirculo.calcularArea());

    System.out.println("El perímetro del círculo es= " + objCirculo.calcularPerimetro());

    System.out.println();

    System.out.println("El área del cuadrado es = " + objCuadrado.calcularArea());
  
    System.out.println("El perímetro del cuadrado es= " + objCuadrado.calcularPerímetro());

    System.out.println();

    System.out.println("El área del rectángulo es = " + objRectangulo.calcularArea());
    
    System.out.println("El perímetro del rectángulo es= " + objRectangulo.calcularPerímetro());

    System.out.println();

    System.out.println("El área del TriánguloRectángulo es = " + objTrianguloRectangulo.calcularArea());

    System.out.println("El perímetro del TriánguloRectángulo es = " + objTrianguloRectangulo.calcularPerímetro());

    objTrianguloRectangulo.determinarTipoTriángulo();
    
    System.out.println();

    }
}