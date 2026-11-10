package P13_Java_Booleans;
public class A13_2_Java_Booleans {
    public static void main(String[] args) {
        int edad = 17;
        int edadMinima = 18;
        boolean cumpleEdad = edad >= edadMinima;

        System.out.println(cumpleEdad);
        if (cumpleEdad) {
            System.out.println("Se cumple la edad mínima.");
        } else {
            System.out.println("La edad es inferior a la mínima.");
        }
    }
}