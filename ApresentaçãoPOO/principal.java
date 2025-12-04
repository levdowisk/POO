
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class principal {
    private static List<Aluno> alunos = new ArrayList<>();
    private static List<Professor> professores = new ArrayList<>();
    private static List<Terceirizado> terceirizados = new ArrayList<>();
    
    public static void main(String[] args) {
        // Inicializar dados
        inicializarDados();
        
        Scanner sc = new Scanner(System.in);
        boolean sistemaAtivo = true;
        
        while (sistemaAtivo) {
            System.out.println("\n=== SISTEMA SUAP ===");
            System.out.println("Digite A) Aluno, B) Professor ou C) Terceirizado (S para Sair)");
            String escolha = sc.nextLine().trim().toUpperCase();
            
            switch (escolha) {
                case "A":
                    menuAluno(sc);
                    break;
                case "B":
                    menuProfessor(sc);
                    break;
                case "C":
                    menuTerceirizado(sc);
                    break;
                case "S":
                    sistemaAtivo = false;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
    
    private static void inicializarDados() {
        // Alunos
        alunos.add(new Aluno("Lucas Gusmão", 1));
        alunos.add(new Aluno("Kalondra Avaroma", 2));
        alunos.add(new Aluno("Levi Oliveira", 3));
        alunos.add(new Aluno("Will Guilherme", 4));
        
        // Professores
        professores.add(new Professor("Felipe Balem", 1));
        
        // Terceirizados
        terceirizados.add(new Terceirizado("João Silva", 1, "Limpeza Express", "Zelador"));
        terceirizados.add(new Terceirizado("Maria Santos", 2, "Segurança Total", "Vigilante"));
    }
    
    private static void menuAluno(Scanner sc) {
        System.out.println("\n=== MENU DO ALUNO ===");
        System.out.println("1) Ver minhas notas");
        System.out.println("2) Ver horários de aula");
        System.out.println("3) Ver materiais");
        System.out.println("4) Voltar");
        System.out.print("Escolha: ");
        
        String opcao = sc.nextLine().trim();
        switch (opcao) {
            case "1":
                System.out.println("Notas do aluno:");
                System.out.println("- Matemática: 8.5");
                System.out.println("- Português: 9.0");
                System.out.println("- História: 7.5");
                break;
            case "2":
                System.out.println("Horários de aula:");
                System.out.println("- Segunda: 08:00 - 10:00");
                System.out.println("- Quarta: 10:00 - 12:00");
                System.out.println("- Sexta: 14:00 - 16:00");
                break;
            case "3":
                System.out.println("Materiais disponíveis:");
                System.out.println("- Apostila de Matemática");
                System.out.println("- Livro de Português");
                System.out.println("- Slides de História");
                break;
            case "4":
                System.out.println("Voltando ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
    
    private static void menuProfessor(Scanner sc) {
        boolean sair = false;
        while (!sair) {
            System.out.println("\n=== MENU DO PROFESSOR ===");
            System.out.println("1) Lançar nota");
            System.out.println("2) Registrar aula");
            System.out.println("3) Adicionar Horário de atendimento");
            System.out.println("4) Notificar Alunos");
            System.out.println("5) Acessar salas de aula");
            System.out.println("6) Listar Alunos");
            System.out.println("7) Abrir Chamado");
            System.out.println("8) Adicionar Projeto");
            System.out.println("9) Assinar documentos");
            System.out.println("0) Voltar");
            System.out.print("Escolha: ");
            String op = sc.nextLine().trim();
            
            switch (op) {
                case "1":
                    System.out.println("Lançando nota...");
                    System.out.print("Nome do aluno: ");
                    String aluno = sc.nextLine();
                    System.out.print("Nota: ");
                    String nota = sc.nextLine();
                    System.out.println("Nota " + nota + " lançada para " + aluno);
                    break;
                case "2":
                    System.out.println("Aula registrada com sucesso!");
                    break;
                case "3":
                    System.out.print("Digite o horário de atendimento: ");
                    String horario = sc.nextLine();
                    System.out.println("Horário " + horario + " adicionado!");
                    break;
                case "4":
                    System.out.println("Notificação enviada para todos os alunos!");
                    break;
                case "5":
                    System.out.println("Acessando salas de aula...");
                    break;
                case "6":
                    System.out.println("\n=== LISTA DE ALUNOS ===");
                    for (Aluno a : alunos) {
                        System.out.println("- " + a.getNome() + " (Nº " + a.getNumero() + ")");
                    }
                    break;
                case "7":
                    System.out.print("Digite o chamado: ");
                    String chamado = sc.nextLine();
                    System.out.println("Chamado aberto: " + chamado);
                    break;
                case "8":
                    System.out.print("Nome do projeto: ");
                    String projeto = sc.nextLine();
                    System.out.println("Projeto " + projeto + " adicionado!");
                    break;
                case "9":
                    System.out.println("Documentos assinados com sucesso!");
                    break;
                case "0":
                    sair = true;
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    
    private static void menuTerceirizado(Scanner sc) {
        boolean sair = false;
        while (!sair) {
            System.out.println("\n=== MENU DO TERCEIRIZADO ===");
            System.out.println("1) Registrar ocorrência");
            System.out.println("2) Solicitar materiais");
            System.out.println("3) Ver escalas de trabalho");
            System.out.println("4) Listar Terceirizados");
            System.out.println("5) Acessar áreas comuns");
            System.out.println("0) Voltar");
            System.out.print("Escolha: ");
            String op = sc.nextLine().trim();
            
            switch (op) {
                case "1":
                    System.out.print("Descreva a ocorrência: ");
                    String ocorrencia = sc.nextLine();
                    System.out.println("Ocorrência registrada: " + ocorrencia);
                    break;
                case "2":
                    System.out.print("Materiais necessários: ");
                    String materiais = sc.nextLine();
                    System.out.println("Solicitação de " + materiais + " enviada!");
                    break;
                case "3":
                    System.out.println("Escalas de trabalho:");
                    System.out.println("- Segunda a Sexta: 07:00 - 16:00");
                    System.out.println("- Plantão: Finais de semana");
                    break;
                case "4":
                    System.out.println("\n=== LISTA DE TERCEIRIZADOS ===");
                    for (Terceirizado t : terceirizados) {
                        System.out.println("- " + t.getNome() + " (" + t.getFuncao() + ") - " + t.getEmpresa());
                    }
                    break;
                case "5":
                    System.out.println("Acessando áreas comuns...");
                    System.out.println("- Biblioteca");
                    System.out.println("- Cantina");
                    System.out.println("- Pátio");
                    System.out.println("- Banheiros");
                    break;
                case "0":
                    sair = true;
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}