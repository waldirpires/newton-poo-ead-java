package u6.stack;

public class Livro implements Comparable<Livro> {

    private String isbn;

    private String titulo;

    private String autor;

    public Livro(String isbn, String titulo, String autor) {
        super();
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return String.format("ISBN: %s\t Título: %s \t Autor: %s", isbn, titulo, autor);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Livro)) {
            return false;
        }

        return this.toString().equals(((Livro) obj).toString());
    }

    @Override
    public int compareTo(Livro o) {
        return this.toString().compareTo(o.toString());
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}
