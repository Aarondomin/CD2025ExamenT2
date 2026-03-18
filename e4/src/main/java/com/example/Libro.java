package com.example;

public class Libro {

    /** titulo del libro*/
    private String titulo;
    /** autor del libro*/
    private String autor;
    /** numero de paginas del libro*/
    private int paginas;

    /**
     * Constructor para crear un nuevo Libro
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @param paginas numero de paginas del libro
     */
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    /**
     * Determina si un libro es largo o no
     * @return devuelve true si el libro tiene mas de 300 paginas y false si tiene menos
     */
    public boolean esLargo() {
        return paginas > 300;
    }

    /**
     * Obtiene el titulo del libro
     * @return Devuelve el titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtine el autor del libro
     * @return devuelve el autor del libro
     */
    public String getAutor() {
        return autor;
    }
}