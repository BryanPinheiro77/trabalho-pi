import java.util.Objects;
import java.util.Scanner;



public class sistemaStudySurf {
    public static void main(String[] args) {

        login();
        opcoes();

    }


        public static void login () {
            int senha = 1, senhaDigitada;
            String usuario = "s", usuarioDigitado;

            Scanner teclado = new Scanner(System.in);
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
        Scanner teclado = new Scanner(System.in);
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
        while (opcao != 10) {

            System.out.println(menu);
            opcao = teclado.nextInt();

            if (opcao == 1) {
                cadastrarAluno();
            } else if (opcao == 2 ){
                cadastrarProfessor();
            } else if (opcao == 3) {
                listaAlunos();
            } else if (opcao == 4) {
                listaProfessores();
            } else if (opcao == 5) {
                marcarAula();
            }
        }
    }

            public static void cadastrarAluno () {

                Scanner teclado = new Scanner(System.in);
                double alturaAluno;
                int idadeAluno, pesoAluno, opcao;
                String aluno, numeroAluno, conhecimentoAluno, possuiPrancha;


                //if (opcao == 1) {
                    System.out.print("Digite o nome do aluno: ");
                    aluno = teclado.next();

                    System.out.print("Digite a idade do aluno: ");
                    idadeAluno = teclado.nextInt();

                    System.out.print("Digite o número para contato: ");
                    numeroAluno = teclado.next();

                    System.out.print("Qual o nivel de conhecimento do aluno: ");
                    conhecimentoAluno = teclado.next();





                    /*System.out.println("O aluno possui prancha?");
                    possuiPrancha = teclado.next();

                    if (possuiPrancha == "não") {

                        System.out.println("Para recomendarmos o melhor tipo de prancha para o aluno informe:");

                        System.out.println("Qual o peso do aluno?");
                        pesoAluno = teclado.nextInt();

                        System.out.println("Quanto de altura o aluno tem?");
                        alturaAluno = teclado.nextDouble();

                        System.out.println("Analisando as caracteristicas do aluno recomendamos que a prancha seja uma dasdaw");

                    }  else if ( possuiPrancha == "sim") {
                        System.out.println("Aluno cadastrado com sucesso!");
                    }*/


                    System.out.println("Aluno cadastrado com sucesso!");


                    /*System.out.println("Deseja voltar ao menu?");
                    opcao = teclado.nextInt();
                    if (opcao == sim) {

                    } else if (opcao == não){
                    return;
                    }*/


                }

                public static void cadastrarProfessor(){
                    Scanner teclado = new Scanner(System.in);

                    int idadeProfessor, rgProfessor;
                    String nomeProfessor, enderecoProfessor;

                    System.out.print("Qual nome do professor que deseja cadastrar: ");
                    nomeProfessor = teclado.next();

                    System.out.print("Qual a idade do professor ?:  ");
                    idadeProfessor = teclado.nextInt();

                    System.out.print("Qual RG do professor?: ");
                    rgProfessor = teclado.nextInt();

                    System.out.print("Qual o endereço do Professor?: ");
                    enderecoProfessor = teclado.next();

                    System.out.println("Professor cadastrado com sucesso!");
                }

                public static void listaAlunos(){

                    System.out.println("""
                            \n****** Lista de alunos ******
                            1- Bryan
                            2- Marco
                            3- Maylla
                            4- Vanessa
                            5- Weslley
                            """);
                }

                public static void listaProfessores(){

                    System.out.println("""
                            \n****** Lista de professores ******
                            1- Gustavo
                            2- Guilherme
                            3- Pedro
                            """);

                }

                public static void marcarAula(){
                    Scanner teclado = new Scanner(System.in);

                    int dia, hora;
                    String aluno, professor;

                    System.out.println("Qual aluno deseja marcar a aula?");
                    aluno = teclado.next();

                    System.out.println("Qual dia e horário desejado para aula?");
                    dia = teclado.nextInt();
                    hora = teclado.nextInt();

                    System.out.println("Nome do professor que irá dar aula: ");
                    professor = teclado.next();

                }
            }


