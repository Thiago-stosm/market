package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Purchase {

    private final Integer id;
    private final Integer client_id;
    private final Integer client_cpf;
    private final BigDecimal total_price;
    private final List<Map> prod_id_price = new ArrayList<>();

    public Purchase(Integer id, Integer client_id, Integer client_cpf, BigDecimal total_price){
        this.id = id;
        this.client_id = client_id;
        this.client_cpf = client_cpf;
        this.total_price = total_price;
    }

}
