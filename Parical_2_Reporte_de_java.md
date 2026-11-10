# FUNDAMENTOS DE PROGRAMACIÓN
En este apartado se presentan los principales fundamentos del lenguaje de programación Java, mediante descripciones sencillas y ejemplos prácticos que permiten conocer su funcionamiento.

# 1 - JAVA HOME (Java Inicio)
Java es un lenguaje de programación que permite crear diferentes aplicaciones y programas. El tutorial comienza con un ejemplo básico que muestra un mensaje en la pantalla y presenta la estructura inicial de un programa.
- Ejemplo:
public class A1_Java_Home {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

------------------------------------------------------------------

# 2 - JAVA INTRO (Introducción a Java)
Java se utiliza en aplicaciones móviles, de escritorio y web, entre otras. El tutorial destaca que Java está orientado a objetos y puede ejecutarse en distintos sistemas que cuenten con un entorno Java compatible.
- Ejemplo:
public class A2_Java_Intro {
    public static void main(String[] args) {
        System.out.println("Fundamentos de Programación");
        System.out.println("Primer semestre de Tecnología de la Información");
    }
}

------------------------------------------------------------------

# 3 - JAVA GET STARTED (Java: Primeros pasos)
Para comenzar, se comprueba la instalación con java -version. El JDK incluye las herramientas necesarias para compilar y ejecutar el código. Con javac A3_Java_Get_Started.java se compila el archivo y con java A3_Java_Get_Started se ejecuta la clase desde la terminal.
- Ejemplo:
public class A3_Java_Get_Started {
    public static void main(String[] args) {
        System.out.println("Java se ejecuta correctamente.");
    }
}

------------------------------------------------------------------

# 4 - JAVA SYNTAX (Sintaxis de Java)
La sintaxis establece cómo se escribe un programa en Java. Este tema presenta la estructura de la clase, las sentencias y una práctica para aplicar lo aprendido.

## 4.1 - Syntax (Sintaxis)
El nombre de una clase pública coincide con el nombre del archivo. Las llaves delimitan sus bloques y el método main es el punto de inicio del programa. Java distingue mayúsculas de minúsculas.
- Ejemplo:
public class A4_Java_Syntax {
    public static void main(String[] args) {
        System.out.println("Ejemplo de sintaxis en Java");
    }
}

## 4.2 - Statements (Declaraciones)
Una sentencia indica una acción. En este ejemplo, la declaración de la variable y las instrucciones de salida terminan con punto y coma. Las instrucciones se ejecutan en el orden en que aparecen.
- Ejemplo:
int semestre = 1;
System.out.println("Inicio del programa");
System.out.println(semestre);
System.out.println("Fin del programa");

## 4.3 - Code Challenge (Desafío de programación)
El desafío consiste en mostrar el mensaje indicado por el tutorial desde el método `main`. La instrucción de salida termina con punto y coma.
- Ejemplo:
System.out.println("Hello, Java!");

------------------------------------------------------------------

# 5 - JAVA OUTPUT (Salida de Java)
La salida permite mostrar textos, números y resultados de operaciones en la consola.

## 5.1 - Print Text (Imprimir texto)
El texto se escribe entre comillas dobles. `println()` añade un salto de línea al final y `print()` deja el cursor en la misma línea.
- Ejemplo:
System.out.println("Fundamentos de Programación");
System.out.print("Sede ");
System.out.println("Santo Domingo");

## 5.2 - Print Text (Imprimir números)
Los números se escriben directamente dentro de println(). También se puede colocar una operación para que se muestre su resultado.
- Ejemplo:
System.out.println(18);
System.out.println(6 + 4);
System.out.println(3 * 5);

## 5.3 - Code Challenge (Desafío de programación)
La práctica muestra un nombre y una edad en líneas separadas.
- Ejemplo:
System.out.println("Ana");
System.out.println(18);

------------------------------------------------------------------

# 6 - JAVA COMMENTS (Comentarios de Java)
Los comentarios sirven para explicar qué hace el código. El compilador los ignora. Se usa // para comentar una línea y / ... / para comentar un bloque.
- Ejemplo:
public class A6_Java_Comments {
    public static void main(String[] args) {
        // Se muestra el nombre de la asignatura.
        System.out.println("Fundamentos de Programación");

        /*
         * Se muestran la carrera
         * y el semestre.
         */
        System.out.println("Tecnología de la Información"); // Nombre de la carrera
        System.out.println("Primer semestre");
    }
}

------------------------------------------------------------------

# 7 - JAVA VARIABLES (Variables de Java)
Una variable tiene un nombre y almacena un dato de un tipo determinado. Su valor puede actualizarse durante la ejecución si la variable admite reasignación.

## 7.1 - Variables 
En una declaración se indica el tipo y el nombre. El valor inicial se puede asignar en la misma declaración o en una instrucción posterior.
- Ejemplo:
String asignatura = "Programación";
int semestre;
semestre = 1;
semestre = 2;
System.out.println(asignatura);
System.out.println(semestre);

## 7.2 - Imprimir variables (Print Variables)
El valor se muestra al colocar el nombre de la variable dentro de println(). El operador (+) une texto con valores y suma números si ambos operandos son numéricos.
- Ejemplo:
String nombre = "Ana";
int edad = 18;
int anios = 2;
System.out.println(nombre);
System.out.println("Edad actual: " + edad);
System.out.println("Edad en dos años: " + (edad + anios));

## 7.3 - Variables múltiples (Multiple Variables)
En una misma línea se pueden declarar varias variables del mismo tipo, separadas por comas. Una asignación encadenada permite colocar el mismo valor en varias variables.
- Ejemplo:
int a = 2, b = 3, c = 4;
System.out.println(a + b + c);
a = b = c = 5;
System.out.println(a + b + c);

## 7.4 - Identificadores (Identifiers)
Un identificador es el nombre de un elemento como una variable. Puede contener letras, dígitos, guiones bajos y signos de dólar. Debe comenzar con un carácter permitido distinto de un dígito, distingue mayúsculas de minúsculas y evita palabras reservadas. Un nombre descriptivo facilita la lectura.
- Ejemplo:
int cantidadEstudiantes = 25;
int cantidadEquipos = 5;
System.out.println(cantidadEstudiantes / cantidadEquipos);

## 7.5 - Constantes con final (Constants (Final))
La palabra final impide reasignar un valor después de su primera asignación. Por convención, una constante se escribe con mayúsculas y guiones bajos.
- Ejemplo:
final int MINUTOS_POR_HORA = 60;
int horas = 2;
System.out.println(horas * MINUTOS_POR_HORA);

## 7.6 - Ejemplos de la vida real (Real-Life Examples)
Las variables permiten guardar datos de un problema, como las medidas de un rectángulo, y calcular su área.
- Ejemplo:
int largo = 8;
int ancho = 3;
int area = largo * ancho;
System.out.println("Área del rectángulo: " + area);

## 7.7 - Desafío de programación (Code Challenge)
La práctica consiste en guardar un nombre y una edad en variables y mostrarlos en la consola.
- Ejemplo:
String name = "Ana";
int age = 18;
System.out.println(name);
System.out.println(age);

------------------------------------------------------------------

# 8 - JAVA DATA TYPES (Tipos de datos de Java)
El tipo de dato indica qué valor puede guardar una variable. Java cuenta con ocho tipos primitivos y con tipos de referencia como las cadenas y los arreglos.

## 8.1 - Data Types (Tipos de datos)
Cada variable se declara con un tipo adecuado para su valor. Los primitivos guardan valores como números, caracteres o valores lógicos.
- Ejemplo: 
int semestre = 1;
double nota = 17.5;
char paralelo = 'A';
boolean matriculado = true;
System.out.println(semestre);
System.out.println(nota);
System.out.println(paralelo);
System.out.println(matriculado);

## 8.2 - Numbers (Números)
byte, short, int y long guardan enteros de distintos rangos. float y double guardan números con decimales. Se usa F en el literal de tipo float y L en literales enteros grandes de tipo long. La letra e indica notación científica.
- Ejemplo:
byte nivel = 3;
short cupos = 300;
int poblacion = 250000;
long visitas = 3_000_000_000L;
float estatura = 1.65F;
double nota = 18.75;
double notacionCientifica = 2.5e3;
System.out.println(nivel);
System.out.println(cupos);
System.out.println(poblacion);
System.out.println(visitas);
System.out.println(estatura);
System.out.println(nota);
System.out.println(notacionCientifica);

## 8.3 - Booleanos (Tipos booleanos)
El tipo boolean solo admite true y false. Se puede usar para representar si una tarea está entregada.
- Ejemplo:
boolean tareaEntregada = true;
boolean tareaPendiente = false;
System.out.println(tareaEntregada);
System.out.println(tareaPendiente);

## 8.4 - Characteres (Personajes)
El tipo char guarda un carácter entre comillas simples. También puede recibir un código numérico válido. Un String guarda texto entre comillas dobles.
- Ejemplo:
char paralelo = 'B';
char letra = 65;
String carrera = "Tecnología de la Información";
System.out.println(paralelo);
System.out.println(letra); // A
System.out.println(carrera);

## 8.5 - Real-Life Example (Ejemplo de la vida real)
En una compra, un entero representa la cantidad de unidades y un decimal representa el precio de cada una.
- Ejemplo:
int cantidad = 4;
double precioUnitario = 1.25;
double costoTotal = cantidad * precioUnitario;
System.out.println("Total de la compra: " + costoTotal);

## 8.6 Tipos dedatos no primitivos (Non-Primitive Data Types)
Los tipos de referencia incluyen clases como String y estructuras como los arreglos. Una variable de referencia puede tener el valor null. En el ejemplo se usa un método de String para medir su longitud.
- Ejemplo:
String sede = "Santo Domingo";
int[] notas = {16, 18, 20};
System.out.println(sede.length());
System.out.println(notas[0]);

## 8.7 - The var Keyword (La palabra clave var)
Desde Java 10, var permite que el compilador deduzca el tipo de una variable local a partir del valor inicial. La variable conserva ese tipo.
- Ejemplo:
var semestre = 1;
var promedio = 17.5;
var sede = "Santo Domingo";
semestre = 2;
System.out.println(semestre);
System.out.println(promedio);
System.out.println(sede);

## 8.8 - Desafío de programación ()
La práctica presenta una ficha con un código entero, un puntaje decimal y una letra de calificación.
- Ejemplo:
int studentID = 204;
double score = 91.25;
char grade = 'A';
System.out.println(studentID);
System.out.println(score);
System.out.println(grade);

------------------------------------------------------------------

# 9 - JAVA TYPE CASTING (Conversión de tipos en Java)
La conversión de tipos permite pasar un valor numérico a otro tipo. Java convierte automáticamente un int a double. Para convertir un double a int se usa (int), que descarta la parte decimal.

## 9.1 - Conversión automática
El valor entero se guarda en una variable decimal.
- Ejemplo:
int cantidad = 8;
double cantidadDecimal = cantidad;
System.out.println(cantidadDecimal); // 8.0

## 9.2 - Conversión explícita
El valor de tipo double se convierte a entero mediante (int).
- Ejemplo:
double nota = 17.9;
int notaEntera = (int) nota;
System.out.println(notaEntera); // 17

## 9.3 - Ejemplo con un porcentaje
Al convertir uno de los valores antes de dividir, Java calcula el cociente con decimales.
- Ejemplo:
int ejerciciosResueltos = 7;
int ejerciciosTotales = 8;
double porcentaje = (double) ejerciciosResueltos / ejerciciosTotales * 100;
System.out.println(porcentaje + "%"); // 87.5%

------------------------------------------------------------------

# 10 - JAVA OPERATORS (Operadores de Java)
Los operadores realizan cálculos, asignan valores y permiten evaluar comparaciones o condiciones.

## 10.1 - Operators (Operadores)
Un operador actúa sobre valores o variables. Por ejemplo, `+` suma dos operandos numéricos.
- Ejemplo:
int puntosIniciales = 12;
int puntosExtra = 3;
int puntosTotales = puntosIniciales + puntosExtra;
System.out.println(puntosTotales);

## 10.2 - Arithmetic (Aritméticos)
Se usan `+`, `-`, `*`, `/` y `%` para sumar, restar, multiplicar, dividir y hallar el residuo. La división de enteros descarta los decimales. `++` y `--` aumentan o disminuyen una unidad. Si se usan dentro de una expresión, la forma prefija cambia el valor antes de utilizarlo y la posfija utiliza el valor previo.
- Ejemplo:
int a = 10;
int b = 3;
System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
System.out.println(a++); // Muestra 10 y luego a vale 11.
System.out.println(--a); // Primero a vuelve a 10 y luego se muestra.

## 10.3 - Assignment (Asignación)
El operador = guarda un valor. Una asignación compuesta como (+=) suma al valor actual y vuelve a guardar el resultado en la misma variable.
- Ejemplo:
int ahorro = 20;
ahorro += 5;
ahorro -= 3;
System.out.println(ahorro); // 22

## 10.4 - Comparison (Comparación)
Los operadores (==), (!=), (>), (<), (>=) y (<=) comparan valores y producen un resultado booleano.
- Ejemplo:
int nota = 16;
int notaMinima = 14;
System.out.println(nota == notaMinima);
System.out.println(nota != notaMinima);
System.out.println(nota >= notaMinima);

## 10.5 - Logical (Lógicos)
(&&) exige que ambas condiciones sean verdaderas. (||) exige que al menos una se cumpla. (!) invierte un valor lógico.
- Ejemplo:
boolean matriculado = true;
boolean tieneCredencial = false;
System.out.println(matriculado && tieneCredencial);
System.out.println(matriculado || tieneCredencial);
System.out.println(!tieneCredencial);

## 10.6 - Precedence (Precedencia)
La multiplicación se evalúa antes que la suma. Los paréntesis permiten cambiar ese orden.
- Ejemplo:
System.out.println(4 + 3 * 2); // 10
System.out.println((4 + 3) * 2); // 14

## 10.7 - Code Challenge (Desafío de programación)
La práctica calcula el costo total al sumar el precio de un artículo y el costo de envío.
- Ejemplo:
int itemPrice = 35;
int shippingCost = 4;
int sum = itemPrice + shippingCost;
System.out.println(sum);

------------------------------------------------------------------

# 11 - JAVA STRINGS (Cadenas de Java)
El tipo (String) representa texto. Sus métodos permiten consultar, comparar o transformar una cadena.

## 11.1 - Strings (Cadenas de texto)
El texto se escribe entre comillas dobles. length() obtiene la longitud, indexOf() busca una posición desde el índice cero y equals() compara el contenido. toUpperCase() y toLowerCase() cambian el uso de mayúsculas. charAt() obtiene un carácter y trim() elimina espacios de los extremos.
- Ejemplo:
String sede = "Santo Domingo";
System.out.println(sede.length());
System.out.println(sede.toUpperCase());
System.out.println(sede.toLowerCase());
System.out.println(sede.indexOf("Domingo"));
System.out.println(sede.charAt(0));
System.out.println(sede.equals("Santo Domingo"));
String textoConEspacios = "  ESPE  ";
System.out.println(textoConEspacios.trim());

## 11.2 - Concatenació (Concatenación)
Concatenar significa unir cadenas. Se puede usar + o el método concat(). El espacio se agrega de forma explícita si se necesita separar palabras.
- Ejemplo:
String institucion = "ESPE";
String sede = "Santo Domingo";
System.out.println(institucion + " " + sede);
System.out.println(institucion.concat(" ").concat(sede));

## 11.3 - Adding Numbers and Strings (Números y cadenas)
Con dos números, (+) suma. Si uno de los valores de la operación es texto, (+) concatena. Los paréntesis permiten realizar la suma antes de unir el resultado al mensaje.
- Ejemplo:
int a = 4;
int b = 6;
System.out.println(a + b); // 10
System.out.println("4" + "6"); // 46
System.out.println("Resultado: " + a + b); // Resultado: 46
System.out.println("Resultado: " + (a + b)); // Resultado: 10

## 11.4 - Special Characters (Caracteres especiales)
Una barra invertida inicia una secuencia de escape. En el ejemplo se muestran comillas dobles, una ruta con barras invertidas y un salto de línea dentro de un texto.
- Ejemplo:
System.out.println("La asignatura es \"Programación\".");
System.out.println("C:\\Java\\Ejemplos");
System.out.println("ESPE\nSanto Domingo");

## 11.5 - StringBuilder (Constructor de cadenas)
StringBuilder permite modificar texto en el mismo objeto. append() añade texto, insert() lo inserta en una posición, replace() lo sustituye, delete() lo elimina y reverse() invierte su orden. Con toString() se obtiene una cadena.
- Ejemplo:
StringBuilder texto = new StringBuilder("Java");
texto.append(" básico");
texto.insert(0, "Curso: ");
texto.replace(0, 5, "Tema");
texto.delete(0, 6);
System.out.println(texto.toString()); // Java básico
texto.reverse();
System.out.println(texto.toString());

## 11.6 - Code Challenge (Desafío de programación)
La práctica guarda un saludo en una variable de tipo String y muestra su contenido.
- Ejemplo:
String message = "Hola, ESPE";
System.out.println(message);

------------------------------------------------------------------

# 12 - JAVA MATH (Matemáticas en Java)
La clase Math ofrece métodos para hallar el máximo y el mínimo, calcular raíces y potencias, obtener valores absolutos, redondear y generar números aleatorios.
Math.random() devuelve un decimal desde 0 inclusive hasta 1 exclusivo. En el ejemplo, la multiplicación por 6, la conversión a entero y la suma de 1 permiten simular un dado.
- Ejemplo:
public class A12_Java_Math {
    public static void main(String[] args) {
        System.out.println(Math.max(8, 12)); // 12
        System.out.println(Math.min(8, 12)); // 8
        System.out.println(Math.sqrt(49)); // 7.0
        System.out.println(Math.abs(-9)); // 9
        System.out.println(Math.pow(3, 2)); // 9.0
        System.out.println(Math.round(4.6)); // 5
        System.out.println(Math.ceil(4.2)); // 5.0
        System.out.println(Math.floor(4.8)); // 4.0

        double aleatorio = Math.random();
        int dado = (int) (aleatorio * 6) + 1;
        System.out.println("Resultado del dado: " + dado);
    }
}

------------------------------------------------------------------

# 13 - JAVA BOOLEANS (Valores booleanos)
Los valores booleanos representan dos estados, verdadero o falso. Las comparaciones también generan valores booleanos y sirven para evaluar condiciones.

## 13.1 - Booleanos
Un boolean se puede inicializar con true o false. También se puede guardar o imprimir directamente el resultado de una comparación.
- Ejemplo:
boolean tareaEntregada = true;
boolean tareaAtrasada = false;
boolean cumplePuntaje = 18 >= 14;
System.out.println(tareaEntregada);
System.out.println(tareaAtrasada);
System.out.println(cumplePuntaje);
System.out.println(8 == 7);

## 13.2 - Real-Life Example (Ejemplo de la vida real)
Se compara una edad con un mínimo para comprobar si se cumple el requisito. El resultado también se puede usar en un if para mostrar un mensaje.
- Ejemplo:
int edad = 17;
int edadMinima = 18;
boolean cumpleEdad = edad >= edadMinima;
System.out.println(cumpleEdad);

if (cumpleEdad) {
    System.out.println("Se cumple la edad mínima.");
} else {
    System.out.println("La edad es inferior a la mínima.");
}

## 13.3 - Code Challenge (Desafío de programación)
La práctica declara dos variables enteras y muestra el resultado de comprobar si la edad alcanza el mínimo.
- Ejemplo:
int age = 19;
int minAge = 18;
System.out.println(age >= minAge);

## 13.4 Ejecución en Visual Studio Code
El ZIP se descomprime y la carpeta Parical_2_Reporte_de_java se abre desde **Archivo > Abrir carpeta**. Con el JDK 21 y la extensión de Java de VS Code instalados, cada clase puede ejecutarse mediante **Run** sobre el método main. En la vista previa de Markdown, los enlaces llevan al archivo de cada tema.

Los fragmentos de los subtemas aparecen juntos dentro del método main del archivo correspondiente. En los desafíos se presenta una versión para ejecutarse localmente con los nombres de archivo del reporte.

------------------------------------------------------------------