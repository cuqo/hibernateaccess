/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateaccess;

import hibernateaccess.dao.UsuariosDAO;
import hibernateaccess.dao.UsuariosDAOImpl;
import hibernateaccess.domini.Usuarios;

/**
 *
 * @author ND17613
 */
public class HibernateAccess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuariosDAO daoObject = new UsuariosDAOImpl();
        
        Usuarios usuari = daoObject.getUsuarioPerDowId("ND17613");
        System.out.println("Usuari: " +usuari.getNombre() +" " +usuari.getApellidos());
        //usuari = new Usuarios("ND17612","Zoraida","Pedrosa");
        //daoObject.inserirUsuario(usuari);
        //daoObject.eliminarUsuario(usuari);
        System.exit(0);
        
        
    }
    
}
