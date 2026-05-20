package main;

public class Circulo {
    private double raio;

    public Circulo(double r) {
        this.raio = r;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double v) {
        this.raio = v;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}