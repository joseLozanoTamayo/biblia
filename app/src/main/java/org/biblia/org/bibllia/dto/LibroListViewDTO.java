package org.biblia.org.bibllia.dto;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by jose on 28/11/17.
 * <p>
 * Clase DTO para implementar los libros de la biblia en
 * el list tanto para antiguo como nuevo testamento
 */
public class LibroListViewDTO implements Serializable {

    private String id;
    private String nombreLibro;
    private int imagen;

    public LibroListViewDTO(String id, String nombreLibro, int imagen) {
        this.id = id;
        this.nombreLibro = nombreLibro;
        this.imagen = imagen;
    }

    public LibroListViewDTO(String nombreLibro, int imagen) {
        this.id = String.valueOf(System.currentTimeMillis());
        this.nombreLibro = nombreLibro;
        this.imagen = imagen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Lead{" +
                "ID='" + id + '\'' +
                ", Nombre='" + nombreLibro + '\'' +
                '}';
    }

}
