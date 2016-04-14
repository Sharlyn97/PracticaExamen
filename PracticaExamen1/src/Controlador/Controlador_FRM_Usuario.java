/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosUsuario;
import Vista.FRM_Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Moon
 */
public class Controlador_FRM_Usuario implements ActionListener{

    FRM_Usuario frm_usuario;
    MetodosUsuario metodos;
    
    public Controlador_FRM_Usuario(FRM_Usuario frm_usuario)
    {
        this.frm_usuario=frm_usuario;
        metodos=new MetodosUsuario();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
     
        if(e.getActionCommand().equals("Agregar"))
        {
            if(metodos.agregar(frm_usuario.devolverInformacion()))
            {
                frm_usuario.mensaje("Se agregó correctamente");
                frm_usuario.limpiarVentana();
            }
            else
            {
             frm_usuario.mensaje("No se agregó");
             frm_usuario.limpiarVentana();
            }
            //System.out.println("Agregar");
        }
        
        if(e.getActionCommand().equals("Modificar"))
        {
            if(metodos.modificar(frm_usuario.devolverInformacion()))
            {
                frm_usuario.mensaje("Se modificó correctamente");
                frm_usuario.limpiarVentana();
            }
            else
            {
                frm_usuario.mensaje("No se pudo modificar");
                frm_usuario.limpiarVentana();
            }
            //System.out.println("modificar");
        }
        if(e.getActionCommand().equals("Consultar"))
        {
            if(metodos.consultar(frm_usuario.devolverCodigo()))
            {
                frm_usuario.mensaje("Se encontró al usuario");
                frm_usuario.mostrarInformacion(metodos.devolverDatos());
            }
            else
            {
                frm_usuario.mensaje("No se encontró al usuario");
                frm_usuario.limpiarVentana();
            }
            //System.out.println("consultar");
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            if(metodos.eliminar(frm_usuario.devolverCodigo()))
            {
                frm_usuario.mensaje("Se eliminó correctamente");
                frm_usuario.limpiarVentana();
            }
            else
            {
                frm_usuario.mensaje("No se pudo eliminar");
                frm_usuario.limpiarVentana();
            }
            //System.out.println("Eliminar");
        }
    }
    
    
}
