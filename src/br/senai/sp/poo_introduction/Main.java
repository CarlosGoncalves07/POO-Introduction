package br.senai.sp.poo_introduction;


import br.senai.sp.poo_introduction.Model.Aluno;
import br.senai.sp.poo_introduction.Model.Register;
import br.senai.sp.poo_introduction.Model.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** Instance Register */
        Register objRegister = new Register();

        /** Instance Scanner */
        Scanner teclado = new Scanner(System.in);

        System.out.println("O que quer cadastrar [1- Prof 2- Alunos 3- Ambos] ");
        int opcao = teclado.nextInt();

        if (opcao == 1) {
            objRegister.RegisterProf();

        } else if (opcao == 2) {
            objRegister.RegisterAluno();
        } else if (opcao == 3) {
            objRegister.BothRegister();
        } else {
            System.out.println("Opção Invalida !!");
        }

    }
}
