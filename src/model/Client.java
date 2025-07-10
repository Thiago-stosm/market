package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client{
    private final Integer clientId;
    private String name;
    private String cpf;
    private String phone;
    private String email;
    private String sex;
    private String address;
    private final LocalDate birthDate;
    private List<Purchase> registeredPurchases;
}