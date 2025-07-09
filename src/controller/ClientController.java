package controller;

import model.Client;

import java.time.LocalDate;

public class ClientController {

    public static void newClient(String name, String cpf, String address, String cell, String sex, String email, LocalDate birthDate) {
        int id = generateId();
        Client client = new Client(id, name, cpf, address, cell, sex, email, birthDate);
    }
    public void editClient() {
    }
    public void deleteClient() {
    }
    public int[] generateId(){

        int[] previousID = getPreviousID();

        for(int i = 3; i>-1; i--){
            if (previousID[i] < 9 ){
                previousID[i] ++;
                break;
            }
            else{
                previousID[i] = 0;
            }
        }
        return previousID;
        }

}
