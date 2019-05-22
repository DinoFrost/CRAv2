/*
 * Copyright (C) 2019 santi
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package model;

/*imports*/
import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class BaseDatosUsuarios {

    /*Atributos*/
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    
    /**
     *Agregar usuario
     * @param nombre nombre del usuario
     * @param username nombre de la cuenta del usuario
     * @param password contraseña de la cuenta del usuario
     */
    public void agregarUsuario(String nombre, String username, String password) {
        
        /*Asignamos los valores al nuevo usuario*/
        Usuario usuario = new Usuario(username, password, nombre);
        
        /*agregamos el nuevo usuario al arrraylist*/
        this.usuarios.add(usuario);
    }
    
    /**
     *Obtencion del usuario
     * @param indice Indica el indice donde se encuentra el usuario en el arraylist
     * @return Retorna el usuario
     */
    public Usuario obtenerUsuario(int indice) {
        return usuarios.get(indice);
    }

    
    
}
