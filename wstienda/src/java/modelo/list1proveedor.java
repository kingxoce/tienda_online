/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jpmon
 */
public class list1proveedor {
    int idpe;
    String nombre;
    int tel;
    String dire;

    public list1proveedor(int idpe, String nombre, int tel, String dire) {
        this.idpe = idpe;
        this.nombre = nombre;
        this.tel = tel;
        this.dire = dire;
    }

    public int getIdpe() {
        return idpe;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTel() {
        return tel;
    }

    public String getDire() {
        return dire;
    }

    public void setIdpe(int idpe) {
        this.idpe = idpe;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }
    
    
}
