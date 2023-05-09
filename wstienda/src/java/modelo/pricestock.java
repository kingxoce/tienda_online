/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jpmon
 */
public class pricestock {
 int idpro;
 float precio;
 int existencia;
 int idpc;

    public pricestock(int idpro, float precio, int existencia, int idpc) {
        this.idpro = idpro;
        this.precio = precio;
        this.existencia = existencia;
        this.idpc = idpc;
    }

    public int getIdpro() {
        return idpro;
    }

    public float getPrecio() {
        return precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public int getIdpc() {
        return idpc;
    }

    public void setIdpro(int idpro) {
        this.idpro = idpro;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public void setIdpc(int idpc) {
        this.idpc = idpc;
    }
 
 
 
}
