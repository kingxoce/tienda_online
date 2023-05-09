/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jpmon
 */
public class producto {
 private int idp;
 private String nombre,desc;
 private int idcat;
 private String img;

    public producto(int idp, String nombre, String desc, int idcat, String img) {
        this.idp = idp;
        this.nombre = nombre;
        this.desc = desc;
        this.idcat = idcat;
        this.img = img;
    }

    public int getIdp() {
        return idp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDesc() {
        return desc;
    }

    public int getIdcat() {
        return idcat;
    }

    public String getImg() {
        return img;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setIdcat(int idcat) {
        this.idcat = idcat;
    }

    public void setImg(String img) {
        this.img = img;
    }
         
}
