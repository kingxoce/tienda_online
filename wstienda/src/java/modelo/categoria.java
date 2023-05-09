/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jpmon
 */
public class categoria {
    private int idcategoria;
    private String nombre;
    private int idcategoria2;
    private String direccionimg;

    public categoria(int idcategoria, String nombre, int idcategoria2, String direccionimg) {
        this.idcategoria = idcategoria;
        this.nombre = nombre;
        this.idcategoria2 = idcategoria2;
        this.direccionimg = direccionimg;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdcategoria2() {
        return idcategoria2;
    }

    public String getDireccionimg() {
        return direccionimg;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdcategoria2(int idcategoria2) {
        this.idcategoria2 = idcategoria2;
    }

    public void setDireccionimg(String direccionimg) {
        this.direccionimg = direccionimg;
    }
    
    
  
    
}
