package exer3;

public class Main {
    public static void main(String[] args) {
        Shape retangulo = new Retangulo(4, 6);
        Shape circulo = new Circulo(3);
        Shape triangulo = new Triangulo(3, 4, 5);

        System.out.println("Retângulo");
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());

        System.out.println("\nCírculo");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        System.out.println("\nTriângulo");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
    }
}
