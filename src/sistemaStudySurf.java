package Marcola;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class pi {

    public static String[] listaAluno = new String[4];
    public static int[] idadeAluno = new int[4];
    public static int[] numeroAluno = new int[4];
    public static String[] conhecimentoAluno = new String[4];

    public static String[] listaProfessor = new String[4];
    public static int[] idadeProfessor = new int[4];
    public static float[] rgProfessor = new float[4];
    public static String[] enderecoProfessor = new String[4];

    public static String[] listaAulas = new String[4];
    public static String[] dataAula = new String[4];
    public static String[] horaAula = new String[4];

    public static String[] listaDevedores = new String[10];
    public static double[] valoresMensalidade = new double[10];
    public static String[] datasPagamento = new String[10];
    public static int contDevedores = 0;

    public static int[] quantidadeAlunosSeg = new int[10];
    public static String[] desempenhoAulaSeg = new String[10];
    public static int[] quantidadeAlunosTer = new int[10];
    public static String[] desempenhoAulaTer = new String[10];
    public static int[] quantidadeAlunosQuar = new int[10];
    public static String[] desempenhoAulaQuar = new String[10];
    public static int[] quantidadeAlunosQuin = new int[10];
    public static String[] desempenhoAulaQuin = new String[10];
    public static int[] quantidadeAlunosSex = new int[10];
    public static String[] desempenhoAulaSex = new String[10];

    public static int contSeg = 0, contTer = 0, contQuar = 0, contQuin = 0, contSex = 0;

    public static String[] devedores = new String[10];
    public static double[] mensalidades = new double[10];
    public static String[] diaPagamento = new String[10];

    static Scanner input = new Scanner(System.in);
    static int senha = 1, senhaDigitada, pesoAluno, o = 10, opcaoDirecionar;

    static String usuario = "s", usuarioDigitado, opcao, possuiPrancha,
            professor, escolhaPrancha, formaPagamento, finalCompra;

    static double alturaAluno;

    public static void main(String[] args) {
        int retorno = 0;

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
        try {
            senhaDigitada = input.nextInt();
        } catch (Exception e) {
            System.out.println("Erro na digitação da senha! Tente novamente.");
            input.nextLine(); // Limpar o buffer de entrada
            return 0;
        }

        if ((senhaDigitada == senha) && (Objects.equals(usuarioDigitado, usuario))) {
            System.out.println("Login concluído!");
            return 1;
        } else {
            System.out.println("Usuário ou senha inválidos. Tente novamente!");
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
        int i = 0, p = 0, a = 0, r = 0, c = 0, rp = 0;
        while (opcao != 10) {
            System.out.println(menu);
            try {
                opcao = input.nextInt();
            } catch (Exception e) {
                System.out.println("Erro! Opção inválida. Tente novamente.");
                input.nextLine(); // Limpar o buffer de entrada
                continue;
            }

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
                    r = relatorioAulas(r);
                    break;

                case 8:
                    CadastrarMensalidades(c);
                    break;

                case 9:
                    rp = exibirRelatorioPagamento(rp);
                    break;

                case 10:
                    System.out.println("Finalizando o Sistema...");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
        }
    }

    public static void voltarMenu() {
        System.out.println("\nDeseja voltar ao menu?");
        String opcao = input.next();
        if (opcao.equalsIgnoreCase("sim")) {
        } else if (opcao.equalsIgnoreCase("não") || opcao.equalsIgnoreCase("nao")) {
            System.out.println("Obrigado por utilizar o sistema, volte sempre!");
            System.exit(o);
        }
    }

    public static int cadastrarAluno(int i) {
        System.out.print("Digite o nome do aluno: ");
        listaAluno[i] = input.next();

        System.out.print("Digite a idade do aluno: ");
        try {
            idadeAluno[i] = input.nextInt();
        } catch (Exception e) {
            System.out.println("Erro! Digite uma idade válida.");
            input.nextLine(); // Limpar o buffer de entrada
            return i; // Retorna sem cadastrar
        }

        System.out.print("Digite o número para contato: ");
        try {
            numeroAluno[i] = input.nextInt();
        } catch (Exception e) {
            System.out.println("Erro! Digite um número válido.");
            input.nextLine(); // Limpar o buffer de entrada
            return i; // Retorna sem cadastrar
        }

        System.out.print("Qual o nível de conhecimento do aluno: ");
        conhecimentoAluno[i] = input.next();

        System.out.println("O aluno possui prancha? (sim/não): ");
        possuiPrancha = input.next();

        if (Objects.equals(possuiPrancha.toUpperCase(), "NÃO") || Objects.equals(possuiPrancha, "NAO")) {
            System.out.println("Para recomendarmos o melhor tipo de prancha para o aluno informe:");

            System.out.println("Qual o peso do aluno?");
            try {
                pesoAluno = input.nextInt();
            } catch (Exception e) {
                System.out.println("Erro! Digite um peso válido.");
                input.nextLine(); // Limpar o buffer de entrada
                return i; // Retorna sem cadastrar
            }

            System.out.println("Quanto de altura o aluno tem?");
            try {
                alturaAluno = input.nextDouble();
            } catch (Exception e) {
                System.out.println("Erro! Digite uma altura válida.");
                input.nextLine(); // Limpar o buffer de entrada
                return i; // Retorna sem cadastrar
            }

            if (pesoAluno >= 70 && pesoAluno <= 80) {
                if (alturaAluno >= 1.40 && alturaAluno <= 1.80) {
                    System.out.println("Analisando as características do aluno recomendamos que a prancha seja uma Speed.");
                }
            }
            if (pesoAluno > 81 && pesoAluno < 92) {
                System.out.println("Analisando as características do aluno recomendamos que a prancha seja uma Fan.");
            }
            if (alturaAluno > 1.81 && alturaAluno < 1.90) {
                System.out.println("Analisando as características do aluno recomendamos que a prancha seja uma Long.");
            }

            System.out.println("Aluno cadastrado com sucesso!\n");
        } else if (Objects.equals(possuiPrancha.toUpperCase(), "SIM")) {
            System.out.println("Aluno cadastrado com sucesso!");
        }

        i++;
        voltarMenu();
        return i;
    }

    public static int cadastrarProfessor(int p) {
        System.out.println("Qual nome do professor que deseja cadastrar: ");
        listaProfessor[p] = input.next();

        System.out.println("Qual a idade do professor ?");
        try {
            idadeProfessor[p] = input.nextInt();
        } catch (Exception e) {
            System.out.println("Erro! Digite uma idade válida.");
            input.nextLine(); // Limpar o buffer de entrada
            return p; // Retorna sem cadastrar
        }

        System.out.println("Qual RG do professor?");
        try {
            rgProfessor[p] = input.nextFloat();
        } catch (Exception e) {
            System.out.println("Erro! Digite um RG válido.");
            input.nextLine(); // Limpar o buffer de entrada
            return p; // Retorna sem cadastrar
        }

        input.nextLine(); // Limpar o buffer de entrada

        System.out.println("Qual o endereço do professor?");
        enderecoProfessor[p] = input.nextLine();

        System.out.println("Professor cadastrado com sucesso!");
        voltarMenu();

        p++;
        return p;
    }

    public static void listaAlunos(int i) {
        System.out.println("**** Lista de Alunos cadastrados ****");
        for (int j = 0; j < i; j++) {
            System.out.println("Nome: " + listaAluno[j]);
            System.out.println("Idade: " + idadeAluno[j]);
            System.out.println("Número: " + numeroAluno[j]);
            System.out.println("Nível de conhecimento: " + conhecimentoAluno[j]);
            System.out.println();
        }
    }

    public static void listaProfessores(int p) {
        System.out.println("**** Lista de Professores cadastrados ****");
        for (int j = 0; j < p; j++) {
            System.out.println("Nome: " + listaProfessor[j]);
            System.out.println("Idade: " + idadeProfessor[j]);
            System.out.println("RG: " + rgProfessor[j]);
            System.out.println("Endereço: " + enderecoProfessor[j]);
            System.out.println();
        }
    }

    public static void marcarAula(int a) {
        // Função de marcação de aula
    }

    public static void listaAulas(int a) {
        // Função para listar aulas
    }

    public static int relatorioAulas(int r) {
        // Função para gerar relatório de aulas
        return r;
    }

    public static int CadastrarMensalidades(int c) {
        // Função para cadastrar mensalidades
        return c;
    }

    public static int exibirRelatorioPagamento(int rp) {
        // Função para exibir relatório de pagamento
        return rp;
    }
}
