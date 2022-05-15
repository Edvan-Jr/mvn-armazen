package com.edvan;

import com.edvan.models.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        System.out.println(
                "----------------- ARMAZÉM DO SEU ROBERTO -----------------\n"
                + "Seja bem vind@!\n"
        );

        Scanner s = new Scanner(System.in);
        Integer quantidade = 0, codigo = 1, indice = 1, estoque = 0;
        String opcao, nome;
        ArrayList<Produto> lista = new ArrayList<>();
        Boolean parar = false;

        while(true) {
            System.out.println(
                    "MENU:\n"
                    + "1) Cadastrar produtos\n"
                    + "2) Listar produtos\n"
                    + "S) SAIR"
            );

            opcao = s.next();

            if (opcao.equals("1")) {
                System.out.println("Quantos produtos deseja cadastrar?");

                try {
                    quantidade = s.nextInt();
                    s.nextLine();
                } catch (Exception e) {
                    System.out.println(
                            "Quantidade inválida.\n"
                            + "Para continuar, reinicie o programa."
                    );
                    break;
                }

                for (int i = indice; i < indice + quantidade; i++){
                    System.out.println("Digite o nome do produto " + i);
                    nome = s.nextLine();

                    if (nome.trim().equals("")) {
                        while (nome.trim().equals("")) {
                            System.out.println("Nome vazio.\nPor favor, digite o nome do produto " + i);
                            nome = s.nextLine();
                        }
                    }

                    System.out.println("Digite a quantidade em estoque:");
                    try {
                        estoque = s.nextInt();
                        s.nextLine();
                    } catch (Exception e) {
                        System.out.println(
                                "Quantidade inválida.\n"
                                + "Para continuar, reinicie o programa."
                        );
                        parar = true;
                        break;
                    }

                    Produto produto = new Produto();
                    produto.setCodigo(codigo);
                    produto.setNome(nome);
                    produto.setEstoque(estoque);
                    lista.add(produto);
                    codigo++;
                }
                indice += quantidade;
            } else if (opcao.equals("2")) {
                if (lista.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado.");
                }
                for (Produto item : lista) {
                    System.out.println(item);
                };
            } else if (opcao.equals("S") || opcao.equals("s")) {
                System.out.println("Programa encerrado.");
                break;
            } else {
                System.out.println("Por favor, insira uma opção válida.\n");
            }

            if (parar == true) {
                break;
            }
        }
    }
}
