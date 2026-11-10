package P11_Java_Strings;
public class A11_1_Java_Strings {
    public static void main(String[] args) {
        String sede = "Santo Domingo";
        System.out.println(sede.length());
        System.out.println(sede.toUpperCase());
        System.out.println(sede.toLowerCase());
        System.out.println(sede.indexOf("Domingo"));
        System.out.println(sede.charAt(0));
        System.out.println(sede.equals("Santo Domingo"));

        String textoConEspacios = "  ESPE  ";
        System.out.println(textoConEspacios.trim());
    }
}