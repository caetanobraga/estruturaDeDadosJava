package org.dio;

public class Main {
    public static void main(String[] args){
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");
        minhaListaEncadeada.add("teste5");
        minhaListaEncadeada.add("teste6");
        minhaListaEncadeada.add("teste7");
        minhaListaEncadeada.add("teste8");
        minhaListaEncadeada.add("teste9");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));
        System.out.println(minhaListaEncadeada.get(4));
        System.out.println(minhaListaEncadeada.get(5));
        System.out.println(minhaListaEncadeada.get(6));
        System.out.println(minhaListaEncadeada.get(7));
        System.out.println(minhaListaEncadeada.get(8));

        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(3));

        System.out.println(minhaListaEncadeada);


    }
}
