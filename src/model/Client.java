package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private final String cpf;
    private String address;
    private String cell;
    private String sex;
    private String email;
    private LocalDate birthDate;
    private List<Integer> shoppingIDs = new ArrayList<>();

}
