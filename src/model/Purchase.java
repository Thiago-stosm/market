package model;

public class Purchase {

    private final Integer id;
    private final Integer client_id;
    private final Integer client_cpf;

    public Purchase(Integer id, Integer client_id, Integer client_cpf){
        this.id = id;
        this.client_id = client_id;
        this.client_cpf = client_cpf;
    }
}
