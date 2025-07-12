package model;

import java.time.LocalDate;

public class Employee{
    private final Integer employeeId;
    private String name;
    private String cpf;
    private String phone;
    private String email;
    private String sex;
    private String address;
    private final LocalDate birthDate;

    //Método construtor inicial para evitar erros de compilação
    public Employee(){
        this.id = 0;
        this.name = "";
        this.cpf = "";
        this.fone = "";
        this.email = "";
        this.birthDate = LocalDate.now();
    }
}
