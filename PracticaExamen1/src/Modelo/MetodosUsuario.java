/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Moon
 */
public class MetodosUsuario {
    
    private ArrayList <Usuario> array;
    private boolean agregoPrimera=false;
    String arregloDatos[];
    
    public MetodosUsuario()
    {
        array=new ArrayList <Usuario>();
        arregloDatos=new String [2];
    }
    
    public boolean agregar(String arreglo[])
    {
        boolean agrego=false;
        
        Usuario temporal=new Usuario(arreglo[0],arreglo[1],Integer.parseInt(arreglo[2]));
        
        if(agregoPrimera==false)
        {
            array.add(temporal);
            agregoPrimera=true;
            agrego=true;
        }
        else
        {
            for(int conta=0; conta<array.size(); conta++)
            {
                if(array.get(conta).getCodigo().equals(arreglo[0]))
                {
                }
                else
                {
                    array.add(temporal);
                    agrego=true;
                }
            }
        }
        return agrego;
    }
    
    public boolean modificar(String arreglo[])
    {
        boolean modifico=false;
        
        for(int conta=0; conta<array.size(); conta++)
        {
            if(array.get(conta).getCodigo().equals(arreglo[0]))
            {
                array.get(conta).setNombre(arreglo[1]);
                array.get(conta).setPopularidad(Integer.parseInt(arreglo[2]));
                modifico=true;
            }
        }
        return modifico;
    }
    
    public boolean eliminar(String codigo)
    {
        boolean elimino=false;
        
        for(int conta=0; conta<array.size(); conta++)
        {
            if(array.get(conta).getCodigo().equals(codigo))
            {
                array.remove(conta);
                elimino=true;
                if(conta==0);
                {
                 agregoPrimera=false;
                }
            }
        }
        return elimino;
    }
    
    public boolean consultar(String codigo)
    {
        boolean consulto=false;
        
        for(int conta=0; conta<array.size(); conta++)
        {
            if(array.get(conta).getCodigo().equals(codigo))
            {
                arregloDatos[0]=array.get(conta).getNombre();
                arregloDatos[1]=""+array.get(conta).getPopularidad();
                consulto=true;
            }
        }
        return consulto;
    }
    public String[] devolverDatos()
    {
        return this.arregloDatos;
    }
    
}
