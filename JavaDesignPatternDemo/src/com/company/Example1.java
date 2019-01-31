package com.company;

public class Example1 {

    public static void main(String[] args) {
        System.out.println(ClientRequest.getInstance());
        System.out.println(ClientRequest.getInstance());
    }

}

class ClientRequest{

    private static ClientRequest obj;

    int clientId;
    String description;

    private ClientRequest(){

        this.clientId= 110;
        this.description="Facebook Search";

    }
public static ClientRequest getInstance(){

        if (obj ==null){
            obj =new ClientRequest();
        }
        return obj;
}

    @Override
    public String toString() {
        return "ClientRequest{" +
                "clientId=" + clientId +
                ", description='" + description + '\'' +
                '}';
    }
}