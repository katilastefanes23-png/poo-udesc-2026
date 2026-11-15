package exercicio5oo.classes;

public class Retangulo {
    private static final double DIMENSAO_MINIMA = 0.0;
    private static final double DIMENSAO_MAXIMA = 1000.0;

    private double largura;
    private double altura;

    public Retangulo() {
    }

    public Retangulo(double largura, double altura) {
        this.setLargura(largura);
        this.setAltura(altura);
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        if (largura < DIMENSAO_MINIMA || largura > DIMENSAO_MAXIMA) {
            return;
        }
        this.largura = largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if (altura < DIMENSAO_MINIMA || altura > DIMENSAO_MAXIMA) {
            return;
        }
        this.altura = altura;
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

    @Override
    public String toString() {
        return String.format("Retangulo [largura=%.2f, altura=%.2f]", this.largura, this.altura);
    }
}