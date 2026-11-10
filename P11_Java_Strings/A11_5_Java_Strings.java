package P11_Java_Strings;
public class A11_5_Java_Strings {
    public static void main(String[] args) {
        StringBuilder texto = new StringBuilder("Java");
        texto.append(" básico");
        texto.insert(0, "Curso: ");
        texto.replace(0, 5, "Tema");
        texto.delete(0, 6);
        System.out.println(texto.toString()); // Java básico

        texto.reverse();
        System.out.println(texto.toString());
    }
}