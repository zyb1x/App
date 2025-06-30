/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author dluis
 */
public class Propuesta {
    
    String nombre;
    String correo;
    String titulo;
    String descripcion;
    String resolucion;
    String beneficio;
    String comentarios;
    String nivelInnovacion;
    String etapa;

    public Propuesta(String nombre, String correo, String titulo, String descripcion, String resolucion,
            String beneficio, String comentarios, String nivelInnovacion, String etapa) {
        this.nombre = nombre;
        this.correo = correo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.resolucion = resolucion;
        this.beneficio = beneficio;
        this.comentarios = comentarios;
        this.nivelInnovacion = nivelInnovacion;
        this.etapa = etapa;
    }

    @Override
    public String toString() {
        return "Propuesta:{" 
                + "\nNombre: " + nombre + 
                "\nCorreo: " + correo + 
                "\nTitulo: " + titulo + 
                "\nDescripcion: " + descripcion +
                "\nResolucion: " + resolucion + 
                "\nbeneficio: " + beneficio + 
                "\nComentarios: " + comentarios + 
                "\nNivelInnovacion: " + nivelInnovacion +
                "\nEtapa=" + etapa + '}';
    }
    
    
    
}
