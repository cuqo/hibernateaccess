/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateaccess.dao;

import hibernateaccess.domini.Usuarios;
import java.util.List;


/**
 *
 * @author professor
 */
public interface UsuariosDAO {

    public List<Usuarios> getUsuario();
    public Usuarios getUsuarioPerDowId(String dowId);
    public void inserirUsuario(Usuarios usuario);
    public void modificarUsuario(Usuarios usuario);
    public void eliminarUsuario(Usuarios usuario);
}
