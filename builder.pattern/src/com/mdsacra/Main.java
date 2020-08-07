package com.mdsacra;

public class Main {

    public static void main(String[] args){

        ClientBuilder client1 = new ClientBuilder.Builder()
                                                .name("Matheus")
                                                .cpf("02102191060")
                                                .postivo().build();

        ClientBuilder client2 = new ClientBuilder.Builder()
                .name("Aline")
                .cpf("03594956728")
                .build();

        System.out.println(client1);

        System.out.println(client2);

    }
}
