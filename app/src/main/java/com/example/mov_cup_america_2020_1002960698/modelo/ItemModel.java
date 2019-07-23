package com.example.mov_cup_america_2020_1002960698.modelo;


public class ItemModel {

    private String nombre;
    private String descripcion;
    private String hora;
    private String img;

    public ItemModel() {
    }

    public ItemModel(String nombre, String descripcion, String hora, String img) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.hora = hora;
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(int edad) {
        this.hora = hora;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
