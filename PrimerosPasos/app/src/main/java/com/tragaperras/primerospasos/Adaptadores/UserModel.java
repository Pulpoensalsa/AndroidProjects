package com.tragaperras.primerospasos.Adaptadores;

/**
 * Created by JuanPe on 14/02/2018.
 */

public class UserModel {

    private String name;
    private String apellido;

    public UserModel(String name , String apellido) {
        this.name = name;
        this.apellido = apellido;
    }

    public String getName() { return name; }
    public String getSurname() {return apellido; }
}

