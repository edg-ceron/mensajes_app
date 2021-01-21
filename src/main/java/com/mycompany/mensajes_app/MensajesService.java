/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author eceron
 */
public class MensajesService {
    public static void crearMensaje (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje"); 
        String mensaje = sc.nextLine();
        
        System.out.println("Autor del mensaje");
        String nombre = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        
        MensajesDAO.CrearMensajeDB(registro);
        
       
    }
    
    public static void listarMensajes() {
        MensajesDAO.leerMensajesDB();
    }
    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el id del mensaje a eliminar");
        int id_mensaje_eliminar = sc.nextInt();
        
        MensajesDAO.borrarMensajesDB(id_mensaje_eliminar);
    }
    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el nuevo mensaje");
        String mansaje = sc.nextLine();
        
        System.out.println("Escribe el ID del mensaje a editar");
        int id_mensaje = sc.nextInt();
        
        Mensajes actualizar_mensaje = new Mensajes();
        actualizar_mensaje.setId_mensaje(id_mensaje);
        actualizar_mensaje.setMensaje(mansaje);
        
        MensajesDAO.actualizarMensajeDB(actualizar_mensaje);
    }
}
