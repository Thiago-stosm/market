package controller;
import testes.IdGenerator;

public class AdminController {
    private final Integer admin_id;
    private String name;
    private String cpf;
    private String email;
    private final String password;

    public AdminController(String name, String cpf, String email, String password){
        this.admin_id = IdGenerator.generateId();
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
    }
}
