package br.com.diego.agualuz.utils;

public class Formatador {

    public static String formater(String cpf){
        String part01 = cpf.substring(0,3);
        String part02 = cpf.substring(3,6);
        String part03 = cpf.substring(6,9);
        String part04 = cpf.substring(9,11);
        String cpfFormater = String.format("%s.%s.%s-%s", part01,part02, part03,part04);
        return cpfFormater;
    }
}
