package exercicio5oo.classes;

public class Circulo {
    private static final double FATOR_DIAMETRO = 2.0;
    private static final double EXPOENTE_AREA = 2.0;
    private static final double RAIO_MINIMO = 0.0;
    private static final double RAIO_MAXIMO = 1000.0;

    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.setRaio(raio);
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        if (raio >= RAIO_MINIMO && raio <= RAIO_MAXIMO) {
            this.raio = raio;
        }
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

    @Override
    public String toString() {
        return String.format("Circulo [raio=%.2f]", this.raio);
    }
}