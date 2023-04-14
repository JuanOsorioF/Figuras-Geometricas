package Model; // paquete model

/**
 * Esta clase define objetos de tipo circulo con su radio como atributo
 * 
 * @version 1.0/2023
 * @author Juan David Osorio Forero
 * Define un atributo llamado radio de tipo entero
 * variable global en la clase...
 */
public class Circulo{ 
    private int radio;

    /**
     * Constructor de la clase Círculo
     * @param radio Parámetro que define el radio de un círculo
     */
    public Circulo(int radio) {
        this.radio = radio; 
}

/**
 * Constructor de la clase Círculo sin parametro o esta vacio
 */
public Circulo(){ 

}

/**
 * Método que calcula y devuelve el área de un circulo como pi multiplicado por
 * el radio al cuadrado
 * @return Área de un círculo
 */
public double calcularArea(){ 
        return Math.PI * Math.pow(radio, 2);
    }

    /**
    * Método que calcula y devuelve el perímetro de un círculo como la
    * multiplicación de pi po el radio por 2
    * @return Perímetro de un círculo
    */
    public double calcularPerimetro(){ 
    return 2 * Math.PI * radio;
}

}