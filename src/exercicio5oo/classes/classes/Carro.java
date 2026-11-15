package exercicio5oo.classes;

public class Carro {
    private static final double VARIACAO_VELOCIDADE = 10.0;
    private static final double VELOCIDADE_MINIMA = 0.0;
    private static final double VELOCIDADE_MAXIMA = 300.0;

    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    public Carro() {
    }

    public Carro(String modelo, String marca, int ano, double velocidade) {
        this.setModelo(modelo);
        this.setMarca(marca);
        this.setAno(ano);
        this.setVelocidade(velocidade);
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade < VELOCIDADE_MINIMA || velocidade > VELOCIDADE_MAXIMA) {
            return;
        }
        this.velocidade = velocidade;
    }

    public void acelerar() {
        if (this.velocidade + VARIACAO_VELOCIDADE <= VELOCIDADE_MAXIMA) {
            this.velocidade += VARIACAO_VELOCIDADE;
        } else {
            this.velocidade = VELOCIDADE_MAXIMA;
        }
    }

    public void frear() {
        if (this.velocidade - VARIACAO_VELOCIDADE >= VELOCIDADE_MINIMA) {
            this.velocidade -= VARIACAO_VELOCIDADE;
        } else {
            this.velocidade = VELOCIDADE_MINIMA;
        }
    }

    public void imprimirVelocidade() {
        System.out.printf("Carro: %s %s (%d) | Velocidade atual: %.1f km/h%n",
                this.marca, this.modelo, this.ano, this.velocidade);
    }

    @Override
    public String toString() {
        return String.format("Carro [modelo=%s, marca=%s, ano=%d, velocidade=%.1f]",
                this.modelo, this.marca, this.ano, this.velocidade);
    }
}