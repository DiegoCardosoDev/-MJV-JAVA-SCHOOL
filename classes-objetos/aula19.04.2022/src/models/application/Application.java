package models.application;

import models.Person;

public class Application {

    public static void main(String[] args) throws Exception {

        /*instancia do objeto pessoa*/
        Person person1 = new Person("Diego", "377.222.555-25", "R.Alcantara-120");

        /*instancia do objeto dem parametros*/
        Person person2 = new Person();
        /*ultilizando o metodo set para setar dados a person2*/
        person2.setName("Julia");
        person2.setCpf("375.221.555-25");
        person2.setEndereco("R.Alcantara-122");

        /*obtendo os dados do objeto pelo tostring*/
        System.out.println("pessoa1: " + person1.toString());

        /*obtendo os dados do objeto por get*/
        System.out.println("pessoa2: " + person2.getName() + " - " + person2.getCpf() + " - " + person2.getEndereco());

    }
}
