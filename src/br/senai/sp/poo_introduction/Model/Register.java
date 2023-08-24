package br.senai.sp.poo_introduction.Model;

import java.util.Scanner;

public class Register {
    public void BothRegister () {
        RegisterAluno();
        RegisterProf();
    }

        public void RegisterAluno () {

            /** Instance Scanner */
            Scanner teclado = new Scanner(System.in);

            /** Instance Aluno */
            Aluno objAluno = new Aluno();


            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
            System.out.println("Hello Aluno, what is your name: ");
            System.out.println("How old age you: ");
            objAluno.age = teclado.nextInt();
            System.out.println("Wat is tour email: ");
            objAluno.email = teclado.next();
            System.out.println("What is your phone number: ");
            objAluno.phoneNumber = teclado.nextLong();
            System.out.println("Your note is: ");
            objAluno.nota1 = teclado.nextInt();
            System.out.println("Your note is: ");
            objAluno.nota2 = teclado.nextInt();
            System.out.println("You note is: ");
            objAluno.frequence = teclado.nextInt();
            /** Print Information */

            System.out.println("Aluno's name is: " + objAluno.name);
            System.out.println("Your age is: " + objAluno.age);
            System.out.println("Your email: " + objAluno.email);
            System.out.println("Your WhatsApp: " + objAluno.phoneNumber);
            System.out.println("Your note: " + objAluno.nota1);
            System.out.println("Your note: " + objAluno.nota2);
            System.out.println("Your frequence: " + objAluno.frequence);
            /** Print Information */
        }


        public void RegisterProf () {
            /** Instance Scanner */
            Scanner teclado = new Scanner(System.in);

            Teacher objTeacher = new Teacher();

            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
            System.out.println("Hello Teacher, what is your name: ");
            objTeacher.name = teclado.next();
            System.out.println("How old age you: ");
            objTeacher.age = teclado.nextInt();
            System.out.println("Wat is tour email: ");
            objTeacher.email = teclado.next();
            System.out.println("What is your phone number: ");
            objTeacher.phoneNumber = teclado.nextLong();

            System.out.println("Aluno's name is: " + objTeacher.name);
            System.out.println("Your age is: " + objTeacher.age);
            System.out.println("Your email: " + objTeacher.email);
            System.out.println("Your WhatsApp: " + objTeacher.phoneNumber);

            /** Print Information */

        }
    }
