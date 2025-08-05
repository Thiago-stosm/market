package model;

import testes.IdGenerator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client{

    private final Integer id;
    private final String cpf;
    private String name;
    private String email;
    private List<Purchase> registeredPurchases;

    public Client(String cpf, String name, String email){
        this.id = IdGenerator.generateId();
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }
}