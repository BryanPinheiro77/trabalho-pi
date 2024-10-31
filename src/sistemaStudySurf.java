
import java.util.Objects;
import java.util.Scanner;

public class sistemaStudySurf {

    public static String[] listaAluno = new String[4];
    ;
    public static int[] idadeAluno = new int[4];
    ;
    public static int[] numeroAluno = new int[4];
    public static String[] conhecimentoAluno = new String[4];


    public static String[] listaProfessor = new String[4];
    public static int[] idadeProfessor = new int[4];
    public static float[] rgProfessor = new float[4];
    public static String[] enderecoProfessor = new String[4];


    public static String[] listaAulas = new String[4];
    public static String[] dataAula = new String[4];
    public static String[] horaAula = new String[4];


    public static int[] relatorioAulas = new int[10];
    public static String[] desempenhoAula = new String[10];

    public static String[] devedorAlunos = new String[2];
    public static String [] diaPagmento = new String[2];
    public static double mensalidades;
    public static String FormaPagamento ;

    static Scanner input = new Scanner(System.in);
    static int senha = 1, senhaDigitada, pesoAluno, o = 10, opcaoDirecionar;


    static String usuario = "s", usuarioDigitado, opcao, possuiPrancha,
            professor, escolhaPrancha, formaPagamento, finalCompra;

    static double alturaAluno;

    public static void main(String[] args) {
        int retorno=0;

        while (retorno == 0) {
            retorno = login();
            if (retorno == 1) {
                opcoes();
            }
        }
    }


    public static int login() {

        System.out.println("Seja Bem Vindo ao sistema da Study Surf!");

        System.out.println("\n***** Faça seu login! *****");

        System.out.print("Digite seu nome de usuário: ");
        usuarioDigitado = input.next();

        System.out.print("Digite sua senha: ");
        senhaDigitada = input.nextInt();

        if ((senhaDigitada == senha) && (Objects.equals(usuarioDigitado, usuario))) {

            System.out.println("Login concluido!");
            return 1;

        } else {
            System.out.println("Usuário ou senha invalidos. Tente novamente!");
            return 0;
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
        // "I" para enviar e puxar os alunos
        // "P" para enviar e puxar professores
        // "A" para enviar e puxar aulas
        // "R" para enviar e puxar relatorios
        int i = 0, p = 0, a = 0, r = 0;
        while (opcao != 10) {

            System.out.println(menu);
            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    i = cadastrarAluno(i);
                    break;

                case 2:
                    p = cadastrarProfessor(p);
                    break;

                case 3:
                    listaAlunos(i);
                    break;

                case 4:
                    listaProfessores(p);
                    break;

                case 5:
                    marcarAula(a);
                    break;

                case 6:
                    listaAulas(a);
                    break;

                case 7:
                    r=relatorioAulas(r);
                    break;

                case 8:
                  //  CadastrarMensalidades(c);

                case 10:
                    System.out.println("Finalizando o Sistema...");
                    break;
                default:
                    System.out.println("\nOpção invalida!");
            }
        }
    }

    public static void voltarMenu() {
        System.out.println("\nDeseja voltar ao menu?");
        opcao = input.next();
        if (Objects.equals(opcao, "sim")) {

        } else if (opcao.equalsIgnoreCase("não") || opcao.equalsIgnoreCase("nao")) {
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
        escolhaPrancha = input.next();

        switch (escolhaPrancha) {
            case "1":
                System.out.println("forma de pagamento: ");
                formaPagamento = input.next();

                System.out.println("Desejar finalizar ou cancelar a compra?");
                finalCompra = input.next();

                if (Objects.equals(finalCompra, "sim") || (Objects.equals(finalCompra, "finalizar"))){
                    System.out.println("Obrigado pela compra, volte sempre!");
                } if (finalCompra.equalsIgnoreCase("cancelar") || finalCompra.equalsIgnoreCase("não")) {
                    System.out.println("Compra cancelada!");
                } else {
                    System.out.println("Opção digitada invalida!");
                    return;
                }

            case "2":
                System.out.println("forma de pagamento: ");
                formaPagamento = input.next();

                System.out.println("Desejar finalizar ou cancelar a compra?");
                finalCompra = input.next();

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
                formaPagamento = input.next();

                System.out.println("Desejar finalizar ou cancelar a compra?");
                finalCompra = input.next();

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

    public static void direcionamento() {
        String direcionar = """
                *** Selecione uma opção ***
                1- Ir para loja de pranchas
                2- Ir para o menu inicial
                3- sair
                """;
        System.out.println(direcionar);
        opcaoDirecionar = input.nextInt();

        if (opcaoDirecionar == 1) {
            lojaPranchas();
        } else if (opcaoDirecionar == 2) {
            return;
        } else if (opcaoDirecionar == 3) {
            System.out.println("Obrigado por utilizar o sistema, volte sempre!");
            System.exit(o);
        }
    }

    public static int cadastrarAluno(int i) {


        //for (i = 0; i < listaAluno.length; i++) {

        System.out.print("Digite o nome do aluno: ");
        listaAluno[i] = input.next();

        System.out.print("Digite a idade do aluno: ");
        idadeAluno[i] = input.nextInt();

        System.out.print("Digite o número para contato: ");
        numeroAluno[i] = input.nextInt();

        System.out.print("Qual o nivel de conhecimento do aluno: ");
        conhecimentoAluno[i] = input.next();

        //}


        System.out.println("O aluno possui prancha?");
        possuiPrancha = input.next();

        if (Objects.equals(possuiPrancha.toUpperCase(), "não") || Objects.equals(possuiPrancha, "nao")) {

            System.out.println("Para recomendarmos o melhor tipo de prancha para o aluno informe:");

            System.out.println("Qual o peso do aluno?");
            pesoAluno = input.nextInt();
            System.out.println("Quanto de altura o aluno tem?");
            alturaAluno = input.nextDouble();

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


        } else if (Objects.equals(possuiPrancha.toUpperCase(), "SIM")) {
            System.out.println("Aluno cadastrado com sucesso!");
            voltarMenu();
        }


        i++;
        return (i);
    }

    public static int cadastrarProfessor(int p) {

        System.out.println("Qual nome do professor que deseja cadastrar: ");
        listaProfessor[p] = input.next();

        System.out.println("Qual a idade do professor ? ");
        idadeProfessor[p] = input.nextInt();

        System.out.println("Qual RG do professor? ");
        rgProfessor[p] = input.nextInt();

        System.out.println("Qual o endereço do Professor? ");
        enderecoProfessor[p] = input.nextLine();

        System.out.println("Professor cadastrado com sucesso!");

        voltarMenu();
        p++;
        return (p);

    }


    public static void listaAlunos(int i) {

        System.out.println("\n****** Lista de alunos ******\n");
        for (int j = 0; j < i; j++) {
            System.out.println(listaAluno[j]);
        }
        voltarMenu();

    }

    public static void listaProfessores(int p) {

        System.out.println("""
                \n****** Lista de professores ******
                Bryan
                Marco
                Weslley
                """);

        for (int k = 0; k < p; k++) {
            System.out.println(listaProfessor[k]);
        }

        voltarMenu();

    }

    public static int marcarAula(int a) {


        System.out.println("Qual aluno deseja marcar a aula?");
        listaAulas[a] = input.next();

        System.out.println("Qual é o dia desejado para aula?");
        dataAula[a] = input.next();

        System.out.println("Qual é o horario desejado para aula?");
        horaAula[a] = input.next();


        System.out.println("Nome do professor que irá dar aula: ");
        professor = input.next();


        voltarMenu();
        a++;
        return (a);

    }

    public static void listaAulas(int a) {

        System.out.println("""
                \n****** Lista de professores ******
                Bryan
                Marco
                Weslley
                """);
        for (int l = 0; l < a; l++) {
            System.out.println(listaProfessor[l]);
        }

        voltarMenu();


    }

    public static int relatorioAulas(int r) {

        System.out.println("Quantos alunos estavam na aula?");
        relatorioAulas[r] = input.nextInt();

        System.out.println("Como foi o desempenho dos alunos?");
        desempenhoAula[r] = input.next();

        System.out.println("Relatório criado com sucesso!");

        System.out.println("Deseja visualizar os relatórios?");
        String relatorios = input.next();
        System.out.println(r);
        if (Objects.equals(relatorios.toUpperCase(), "SIM")) {

            System.out.println("""
                    Qual relatorio deseja visualizar?
                    1
                    2
                    3
                    4
                    5
                    """);
            int opcaoRelatorio = input.nextInt();
            r++;

            if (opcaoRelatorio == 1) {
                for (int relatorio = 0; relatorio < r; relatorio++) {
                    System.out.println(relatorioAulas[relatorio] + desempenhoAula[relatorio]);

                }
            }

        }
        return r;
    }
    public static void CadastrarMensalidades(int c){


        System.out.println("Qual nome do aluno que deseja cadastrar a mensalidade : ");
        String devedorAluno = devedorAlunos[c];
        input.next();

    }
}

