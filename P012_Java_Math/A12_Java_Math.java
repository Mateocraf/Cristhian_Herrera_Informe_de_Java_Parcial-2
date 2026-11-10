package P012_Java_Math;
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