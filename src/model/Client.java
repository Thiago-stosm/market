package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {

    // Cadastro básico
    private Integer id;
    private String name;
    private final String cpf;
    private String address;
    private String cell;
    private String sex;
    private String email;
    private LocalDate birthDate;

    // Armazenamento de compras do cliente
    private List<Integer> shoppingIDs = new ArrayList<>();

    public Client(int id, String name, String cpf, String address, String cell, String sex, String email, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.cell = cell;
        this.sex = sex;
        this.email = email;
        this.birthDate = birthdate;
    }
}
