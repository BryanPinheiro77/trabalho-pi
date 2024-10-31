package Marcola;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class pi {

        public static String[] listaAluno = new String[2];;
        public static int[] idadeAluno = new int[2];;
        public static int[] numeroAluno = new int[2];
        public static String[] conhecimentoAluno = new String[2];

        public static String[] devedorAlunos = new String[2];
        public static String [] diaPagmento = new String[2];
        public static double mensalidades;
        public static String FormaPagamento ;



    public static String[] listaProfessor;
    public static int[] idadeProfessor;
    public static float[] rgProfessor;
    public static String[] enderecoProfessor;

    static Scanner teclado = new Scanner(System.in);
    static int senha = 1, senhaDigitada, pesoAluno, o = 10, diaEHora, opcaoDirecionar;

    static String usuario = "s", usuarioDigitado, aluno, opcao, possuiPrancha,
            professor, escolhaPrancha, formaPagamento, finalCompra;

    static double alturaAluno;

    public static void main(String[] args) {

        login();
        opcoes();

    }


    public static void login () {

        System.out.println("Seja Bem Vindo ao sistema da Study Surf!");

        System.out.println("\n***** Faça seu login! *****");

        System.out.print("Digite seu nome de usuário: ");
        usuarioDigitado = teclado.next();

        System.out.print("Digite sua senha: ");
        senhaDigitada = teclado.nextInt();

        if ((senhaDigitada == senha) & (Objects.equals(usuarioDigitado, usuario))) {

            System.out.println("Login concluido!");

        } else {
            System.out.println("Usuário ou senha invalidos. Tente novamente!");
            return;
        }
    }

    public static void opcoes() {
        String menu = """
                \n*** Selecione uma opção ***
                1 - Cadastrar aluno
                2 - Cadastrar professor
                3 - Lista de alunos
                4 - Lista de professores
                5 - Marcar aulas
                6 - Lista de aulas
                7 - Relatório de aulas
                8 - Cadastrar mensalidades
                9 - Dados devedores
                10 - Encerrar sistema
                """;

        int opcao = 0;
        int i = 0;
        int c = 0;
        while (opcao != 10) {

            System.out.println(menu);
            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:
                    i=cadastrarAluno(i);
                    break;

                case 2:
                    cadastrarProfessor();
                    break;

                case 3:
                    listaAlunos(i);
                    break;

                case 4:
                    listaProfessores();
                    break;

                case 5:
                    marcarAula();
                    break;

                case 6:
                    listaAulas();
                    break;

                case 8:
                    CadastrarMensalidades(c);
            }
        }
    }

    public static void voltarMenu(){
        System.out.println("\nDeseja voltar ao menu?");
        opcao = teclado.next();
        if (Objects.equals(opcao, "sim")) {

        } else if (opcao.equalsIgnoreCase("não") || opcao.equalsIgnoreCase("nao")){
            System.out.println("Obrigado por utilizar o sistema, volte sempre!");
            System.exit(o);
        }
    }

    public static void lojaPranchas() {
        System.out.println("Bem vindo a loja de pranchas da Study surf!\n");

        String pranchas = """
                *** Escolha um tipo de prancha disponivel! ***
                1- Long - R$3,000,00
                2- Fan - R$1,200,00
                3- Speed - R$1,000,00
                """;
        System.out.println(pranchas);
        escolhaPrancha = teclado.next();

        switch (escolhaPrancha) {
            case "1":
                System.out.println("forma de pagamento: ");
                formaPagamento = teclado.next();

                System.out.println("Desejar finalizar ou cancelar a compra?");
                finalCompra = teclado.next();

                if (Objects.equals(finalCompra, "finalizar")) {
                    System.out.println("Obrigado pela compra, volte sempre!");
                } else if (Objects.equals(finalCompra, "cancelar")) {
                    System.out.println("Compra cancelada!");
                } else {
                    System.out.println("Opção digitada invalida!");
                    return;
                }

            case "2":
                System.out.println("forma de pagamento: ");
                formaPagamento = teclado.next();

                System.out.println("Desejar finalizar ou cancelar a compra?");
                finalCompra = teclado.next();

                if (Objects.equals(finalCompra, "finalizar")) {
                    System.out.println("Obrigado pela compra, volte sempre!");
                } else if (Objects.equals(finalCompra, "cancelar")) {
                    System.out.println("Compra cancelada!");
                } else {
                    System.out.println("Opção digitada invalida!");
                    return;
                }
            case "3":
                System.out.println("forma de pagamento: ");
                formaPagamento = teclado.next();

                System.out.println("Desejar finalizar ou cancelar a compra?");
                finalCompra = teclado.next();

                if (Objects.equals(finalCompra, "finalizar")) {
                    System.out.println("Obrigado pela compra, volte sempre!");
                } else if (Objects.equals(finalCompra, "cancelar")) {
                    System.out.println("Compra cancelada!");
                } else {
                    System.out.println("Opção digitada invalida!");
                    return;
                }
        }
    }

    public static void direcionamento(){
        String direcionar = """
                *** Selecione uma opção ***
                1- Ir para loja de pranchas
                2- Ir para o menu inicial
                3- sair
                """;
        System.out.println(direcionar);
        opcaoDirecionar = teclado.nextInt();

        if (opcaoDirecionar == 1) {
            lojaPranchas();
        } else if (opcaoDirecionar == 2) {
            return;
        } else if (opcaoDirecionar == 3) {
            System.out.println("Obrigado por utilizar o sistema, volte sempre!");
            System.exit(o);
        }
    }

    public static int cadastrarAluno (int i) {


        //for (i = 0; i < listaAluno.length; i++) {

            System.out.print("Digite o nome do aluno: ");
            listaAluno[i] = teclado.next();

            System.out.print("Digite a idade do aluno: ");
            idadeAluno[i] = teclado.nextInt();

            System.out.print("Digite o número para contato: ");
            numeroAluno[i] = teclado.nextInt();

            System.out.print("Qual o nivel de conhecimento do aluno: ");
            conhecimentoAluno[i] = teclado.next();

        //}


        System.out.println("O aluno possui prancha?");
        possuiPrancha = teclado.next();

        if (Objects.equals(possuiPrancha, "não"))

        {

            System.out.println("Para recomendarmos o melhor tipo de prancha para o aluno informe:");

            System.out.println("Qual o peso do aluno?");
            pesoAluno = teclado.nextInt();
            System.out.println("Quanto de altura o aluno tem?");
            alturaAluno = teclado.nextDouble();

            if (pesoAluno >= 70 && pesoAluno <= 80) {
                if (alturaAluno >= 1.40 && alturaAluno <= 1.80 ) {
                System.out.println("Analisando as caracteristicas do aluno recomendamos que a prancha seja uma Speed ");
            }
        }
            if(pesoAluno > 81 && pesoAluno< 92){
            }
            if (alturaAluno>1.81 && alturaAluno < 1.90){
                System.out.println("Analisando as caracteristicas do aluno recomendamos que a prancha seja uma Fan");

            }
            if(pesoAluno >93 && pesoAluno < 120){

            }
            if (alturaAluno>1.82 && alturaAluno<2.30)
                System.out.println("Analisando as caracteristicas do aluno recomendamos que a prancha seja uma Long ");

            System.out.println("Aluno cadastrado com sucesso!\n");

            direcionamento();






        }  else if ( possuiPrancha == "sim") {
            System.out.println("Aluno cadastrado com sucesso!");
            voltarMenu();
        }



        i++;
        return(i);
    }

    public static void cadastrarProfessor(){
        listaProfessor = new String[2];
        idadeProfessor = new int[2];
        rgProfessor = new float[2];
        enderecoProfessor = new String[2];

        /*.out.print("Qual nome do professor que deseja cadastrar: ");
        listaProfessor = teclado.next();

        System.out.print("Qual a idade do professor ?:  ");
        idadeProfessor = teclado.nextInt();

        System.out.print("Qual RG do professor?: ");
        rgProfessor = teclado.nextInt();

        System.out.print("Qual o endereço do Professor?: ");
        enderecoProfessor = teclado.next();

        System.out.println("Professor cadastrado com sucesso!");

        voltarMenu();*/
    }

    public static void listaAlunos(int i){

        /*System.out.println("""
                            \n****** Lista de alunos ******
                            1- Bryan
                            2- Marco
                            3- Maylla
                            4- Vanessa
                            5- Weslley
                            """);*/
        for (int j = 0; j < i; j++) {
            System.out.println(listaAluno[j]);
        }
            voltarMenu();

    }

    public static void listaProfessores(){

        System.out.println("""
                            \n****** Lista de professores ******
                            1- Gustavo
                            2- Guilherme
                            3- Pedro
                            """);

        voltarMenu();

    }

    public static void marcarAula(){


        System.out.println("Qual aluno deseja marcar a aula?");
        aluno = teclado.next();

        System.out.println("Qual dia e horário desejado para aula?");
        diaEHora = teclado.nextInt();


        System.out.println("Nome do professor que irá dar aula: ");
        professor = teclado.next();


        voltarMenu();

    }

    public static void listaAulas(){

    }

    public static void CadastrarMensalidades(int c){


        System.out.println("Qual nome do aluno que deseja cadastrar a mensalidade : ");
        String devedorAluno = devedorAlunos[c];
        teclado.next();

    }



}
