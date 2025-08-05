package model;

import testes.IdGenerator;

public class Admin {

    private final Integer id;
    private final String cpf;
    private String name;
    private String email;
    private final String password;

    public Admin(String name, String cpf, String email, String password){
        this.id = IdGenerator.generateId();
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
