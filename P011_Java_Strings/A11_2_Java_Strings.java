package P011_Java_Strings;
public class A11_2_Java_Strings {
    public static void main(String[] args) {
        String institucion = "ESPE";
        String sede = "Santo Domingo";

        System.out.println(institucion + " " + sede);
        System.out.println(institucion.concat(" ").concat(sede));
    }
}