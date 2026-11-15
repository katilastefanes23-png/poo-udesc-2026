package exercicio5oo.classes;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private boolean emprestado;

    public Livro() {
    }

    public Livro(String titulo, String autor, String genero, boolean emprestado) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setGenero(genero);
        this.setEmprestado(emprestado);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEmprestado() {
        return this.emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void emprestar() {
        if (!this.emprestado) {
            this.emprestado = true;
        }
    }

    public void devolver() {
        if (this.emprestado) {
            this.emprestado = false;
        }
    }

    public boolean verificarDisponibilidade() {
        return !this.emprestado;
    }

    @Override
    public String toString() {
        return String.format("Livro [titulo=%s, autor=%s, genero=%s, emprestado=%b]",
                this.titulo, this.autor, this.genero, this.emprestado);
    }
}