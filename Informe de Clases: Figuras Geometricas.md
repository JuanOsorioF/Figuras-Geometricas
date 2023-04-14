INFORME DE CLASES

La estructura del programa consta de una clase principal App y cuatro clases modelo para cada una de las figuras geométricas que se trabajan: Circulo, Cuadrado, Rectangulo y TrianguloRectangulo. A continuación, se detalla la funcionalidad de cada una de ellas:

App

La clase App es la clase principal del programa. Se encarga de crear un objeto para cada una de las figuras geométricas y de mostrar por consola el resultado de calcular el área y perímetro de cada una de ellas.

La clase App tiene el siguiente método:

public static void main(String args[]): es el método principal del programa. Se encarga de crear un objeto para cada una de las figuras geométricas y de mostrar por consola el resultado de calcular el área y perímetro de cada una de ellas.

Circulo

La clase Circulo es una clase modelo para representar un círculo. Se encarga de realizar los cálculos necesarios para obtener su área y perímetro.

La clase Circulo tiene los siguientes métodos:

public Circulo(double radio): constructor que recibe el valor del radio del círculo.
public double calcularArea(): devuelve el valor del área del círculo.
public double calcularPerimetro(): devuelve el valor del perímetro del círculo.

Cuadrado

La clase Cuadrado es una clase modelo para representar un cuadrado. Se encarga de realizar los cálculos necesarios para obtener su área y perímetro.

La clase Cuadrado tiene los siguientes métodos:

public Cuadrado(double lado): constructor que recibe el valor del lado del cuadrado. 

public double calcularArea(): devuelve el valor del área del cuadrado. 

public double calcularPerímetro(): devuelve el valor del perímetro del cuadrado.

Rectangulo

La clase Rectangulo es una clase modelo para representar un rectángulo. Se encarga de realizar los cálculos necesarios para obtener su área y perímetro.

La clase Rectangulo tiene los siguientes métodos:

public Rectangulo(double base, double altura): constructor que recibe el valor de la base y la altura del rectángulo.

public double calcularArea(): devuelve el valor del área del rectángulo. 

public double calcularPerímetro(): devuelve el valor del perímetro del rectángulo.

TrianguloRectangulo 


La clase TrianguloRectangulo es una clase modelo para representar un triángulo rectángulo. Se encarga de realizar los cálculos necesarios para obtener su área y perímetro, así como determinar su tipo de triángulo.

La clase TrianguloRectangulo tiene los siguientes métodos:

public TrianguloRectangulo(double base, double altura): constructor que recibe el valor de la base y la altura del triángulo rectángulo.

public double calcularArea(): devuelve el valor del área del triángulo rectángulo.

public double calcularPerímetro(): devuelve el valor del perímetro del triángulo rectángulo. 

public void determinarTipoTriángulo(): determina el tipo de triángulo rectángulo (escaleno, isósceles o equilátero) y lo muestra por consola.
