/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzasAutentiaPkg;

import javax.xml.bind.annotation.*;

/**
 *
 * @author SPS_PC
 */
@XmlRootElement 
public class Pizza {
 
    private int     id;
    private String  nombre;
    private String  desc;
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getDesc() {
        return desc;
    }
 
    public void setDesc(String desc) {
        this.desc = desc;
    }
 
    public Pizza()
    {
        // costructor por defecto
        id      = 0;
        nombre  = "defecto";
        desc    = "defecto";
    }
    
    public Pizza(int pid, String pnombre, String pdesc)
    {
        this.id      = pid;
        this.nombre  = pnombre;
        this.desc    = pdesc;
    }
            
    @Override
    public String toString() {
        return new StringBuffer(" id: ").
                append(id).
                append(" nombre: ").
                append(nombre).
                append(" desc: ").
                append(desc).toString();
    }
}
