/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacional.singleton;
/**
 *
 * @author WinUser
 */
public class Institucion {
private static Institucion instance;
private String Nombre;
private Institucion(){
}   
    public static Institucion getInstance() {
        if(instance==null){
            instance=new Institucion();
        }
        return instance;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
}
