/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jpmon
 */
public class seguntempoc {
    int idtempo;
    String name,fi,fn,direimg;

    public seguntempoc(int idtempo, String name, String fi, String fn, String direimg) {
        this.idtempo = idtempo;
        this.name = name;
        this.fi = fi;
        this.fn = fn;
        this.direimg = direimg;
    }

    public int getIdtempo() {
        return idtempo;
    }

    public String getName() {
        return name;
    }

    public String getFi() {
        return fi;
    }

    public String getFn() {
        return fn;
    }

    public String getDireimg() {
        return direimg;
    }

    public void setIdtempo(int idtempo) {
        this.idtempo = idtempo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFi(String fi) {
        this.fi = fi;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public void setDireimg(String direimg) {
        this.direimg = direimg;
    }
    
   
}
