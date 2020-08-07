package com.mdsacra;

public class ClientBuilder {

    private String name;
    private String cpf;
    private Boolean postitivo;

    public static class Builder {

        private String name;
        private String cpf;
        private Boolean postitivo;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder cpf(String cpf){
            this.cpf = cpf;
            return this;
        }

        public Builder postivo(){
            this.postitivo = true;
            return this;
        }

        public ClientBuilder build(){
            return new ClientBuilder(this);
        }

    }

    private ClientBuilder(Builder builder){
        name = builder.name;
        cpf = builder.cpf;
        postitivo = builder.postitivo;
    }

    @Override
    public String toString() {
        if(postitivo == null) {
            return name + " " + cpf + " - Nome Sujo!";
        } else {
            return name + " " + cpf + " - Nome Limpo!";
        }

    }
}
