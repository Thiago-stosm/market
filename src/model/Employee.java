package model;

import testes.IdGenerator;


public class Employee{

    private final Integer id;
    private final String cpf;
    private String name;
    private String email;

    public Employee(String cpf, String name, String email){
        this.id = IdGenerator.generateId();
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }
}
