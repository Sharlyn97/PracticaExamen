/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Moon
 */
public class Usuario {
    
    private String codigo;
    private String nombre;
    private int popularidad;

    public Usuario(String codigo, String nombre, int popularidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.popularidad = popularidad;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the popularidad
     */
    public int getPopularidad() {
        return popularidad;
    }

    /**
     * @param popularidad the popularidad to set
     */
    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }
    
    public String devolverInformacion()
    {
        return "Codigo: "+codigo+" nombre: "+nombre+" popularidad: "+popularidad;
    }
    
}
