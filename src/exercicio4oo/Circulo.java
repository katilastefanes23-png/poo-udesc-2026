package exercicio4oo.classes;

public class Circulo {
    private static final double FATOR_DIAMETRO = 2.0;
    private static final double EXPOENTE_AREA = 2.0;

    private double raio;

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularDiametro() {
        return FATOR_DIAMETRO * this.raio;
    }

    public double calcularPerimetro() {
        return FATOR_DIAMETRO * Math.PI * this.raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, EXPOENTE_AREA);
    }
}