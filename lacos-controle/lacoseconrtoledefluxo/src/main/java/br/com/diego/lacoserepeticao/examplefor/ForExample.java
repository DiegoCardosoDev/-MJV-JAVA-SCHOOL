package br.com.diego.lacoserepeticao.examplefor;

public class ForExample {

    public static void main(String[] args) {

        /*variavel de controle;condição;ação*/
        for(int i = 0; i <= 10; ++i){
            System.out.println( i );

        }

        System.out.println("for encadeado");
        for(int i = 1; i <= 3; i++) {
            //loop de j
            for(int j = 1; j <=3; j++) {
                System.out.println("i:" + i + " j:" + j);
            } // fim de j
        } // fim de i
    }
}

