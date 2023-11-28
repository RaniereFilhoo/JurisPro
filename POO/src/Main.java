import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Advogado> advogados = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Testemunha> testemunhas = new ArrayList<>();
        ArrayList<Processo> processos = new ArrayList<>();

        // Parâmetros predefinidos
        String nome_adv = "João Silva";
        String telefone_adv = "(11) 98765-4321";
        String email_adv = "joaosilva@advogado.com.br";
        String cidade_adv = "São Paulo";
        int cnpj_adv = 123456789;
        int oab_adv = 876543210;
        String area_adv = "Direito Civil";

        // Criar uma instância de Advogado
        Advogado advogado = new Advogado(nome_adv, telefone_adv, email_adv, cidade_adv, cnpj_adv, oab_adv, area_adv);
        advogados.add(advogado);


        // Parâmetros predefinidos
        String nome_cliente = "Maria Santos";
        String telefone_cliente = "(21) 91234-5678";
        String email_cliente = "mariasantos@gmail.com";
        String cidade_cliente = "Rio de Janeiro";
        int cpf_cliente = 123456789;
        int ano_nascimento_cliente = 1975;
        String profissao_cliente = "Engenheira Civil";

        // Criando uma instância de Cliente
        Cliente cliente = new Cliente(nome_cliente, telefone_cliente, email_cliente, cidade_cliente, cpf_cliente, ano_nascimento_cliente, profissao_cliente);
        clientes.add(cliente);

        // Parâmetros predefinidos
        String nome_testemunha = "Carlos Pereira";
        String telefone_testemunha = "(31) 92345-6789";
        String email_testemunha = "carlospereira@gmail.com";
        String cidade_testemunha = "Belo Horizonte";
        String descricao_testemunha = "Carlos viu o incidente ocorrer enquanto estava voltando para casa do trabalho.";
        boolean disposta_testemunhar = true;

        // Criar uma instância de Testemunha
        Testemunha testemunha = new Testemunha(nome_testemunha, telefone_testemunha, email_testemunha, cidade_testemunha, descricao_testemunha, disposta_testemunhar);
        testemunhas.add(testemunha);

        // Parâmetros predefinidos
        int numero = 987654;
        String titulo = "Processo de Teste";
        String tipo = "Processo Civil";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse("15/03/2023", formatter);
        String status = "Em Andamento";
        String parteEnvolvid = "Parte Teste";
        LocalDate dataJulgamento = LocalDate.parse("30/04/2023", formatter);

        // Criar uma instância de Processo
        Processo processo = new Processo(numero, titulo, tipo, data, status, parteEnvolvid, dataJulgamento, advogado, cliente, testemunha);
        processos.add(processo);

        int opcao;

        while (true) {
            System.out.println("                                                        Escolha uma opção de 0 a 17:");
            System.out.println(" ");
            System.out.println("                                                       1 - Mudar profissão do cliente");
            System.out.println(" ");
            System.out.println("2 - Exibir informações do cliente   3 - Exibir informações do advogado   4 - Exibir informações da testemunha   5 - Exibir informações do processo");
            System.out.println(" ");
            System.out.println("6 - Adicionar novo cliente          7 - Adicionar novo advogado          8 - Adicionar nova testemunha          9 - Adicionar novo processo");
            System.out.println(" ");
            System.out.println("10 - Exibir nomes dos clientes      11 - Exibir nomes dos advogados      12 - Exibir nomes das testemunhas      13 - Exibir numeros dos processos");
            System.out.println(" ");
            System.out.println("14 - Remover cliente                15 - Remover advogado                16 - Remover testemunha                17 - Remover processo");
            System.out.println(" ");
            System.out.println("                                                                 0 - Sair");
            System.out.println(" ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(' ');
                    System.out.println("Digite o nome do cliente para mudar a profissão: ");
                    sc.nextLine();
                    String nomeMdn = sc.nextLine();
                    boolean ectMdn = false;

                    for (Cliente mdn : clientes) {
                        if (mdn.getNome().equalsIgnoreCase(nomeMdn)) {
                            System.out.println(' ');
                            System.out.println("Digite a nova profissão: ");
                            mdn.mudarProfissao(sc.nextLine());
                            ectMdn = true;
                            break;
                        }
                    }

                    if (!ectMdn) {
                        System.out.println("Cliente não encontrado.");
                    }

                    System.out.println(' ');
                    break;
                case 2:
                    System.out.println(' ');
                    System.out.println("Digite o nome do cliente que você está procurando: ");
                    sc.nextLine();
                    String nomeClt = sc.nextLine();
                    boolean ectClt = false;

                    for (Cliente clt : clientes) {
                        if (clt.getNome().equalsIgnoreCase(nomeClt)) {
                            System.out.println(clt.obterInfo());
                            ectClt = true;
                            break;
                        }
                    }

                    if (!ectClt) {
                        System.out.println("Cliente não encontrado.");
                    }

                    System.out.println(' ');
                    break;
                case 3:
                    System.out.println(' ');
                    System.out.println("Digite o nome do advogado que você está procurando: ");
                    sc.nextLine();
                    String nomeAdv = sc.nextLine();
                    boolean ectAdv = false;

                    for (Advogado adv : advogados) {
                        if (adv.getNome().equalsIgnoreCase(nomeAdv)) {
                            System.out.println(adv.obterInfo());
                            ectAdv = true;
                            break;
                        }
                    }

                    if (!ectAdv) {
                        System.out.println("Advogado não encontrado.");
                    }

                    System.out.println(' ');
                    break;
                case 4:
                    System.out.println(' ');
                    System.out.println("Digite o nome da testemunha que você está procurando: ");
                    sc.nextLine();
                    String nomeTst = sc.nextLine();
                    boolean ectTst = false;

                    for (Testemunha tst : testemunhas) {
                        if (tst.getNome().equalsIgnoreCase(nomeTst)) {
                            System.out.println(tst.obterInfo());
                            ectTst = true;
                            break;
                        }
                    }

                    if (!ectTst) {
                        System.out.println("Testemunha não encontrado.");
                    }

                    System.out.println(' ');
                    break;
                case 5:
                    System.out.println(' ');
                    System.out.println("Digite o número do processo que você está procurando: ");
                    sc.nextLine();
                    float nomePcp = sc.nextInt();
                    boolean ectPcp = false;

                    for (Processo pcp : processos) {
                        if (pcp.getNumProcesso() == nomePcp) {
                            System.out.println(pcp.obterInfo());
                            ectPcp = true;
                            break;
                        }
                    }

                    if (!ectPcp) {
                        System.out.println("Processo não encontrado.");
                    }

                    System.out.println(' ');
                    break;
                case 6:
                    System.out.println(' ');
                    System.out.println("Qual o nome do cliente? ");
                    sc.nextLine();
                    String nome_cliente1 = sc.nextLine();
                    System.out.println("Telefone do cliente: ");
                    String telefone_cliente1 = sc.nextLine();
                    System.out.println("Email do cliente: ");
                    String email_cliente1 = sc.nextLine();
                    System.out.println("Cidade do cliente: ");
                    String cidade_cliente1 = sc.nextLine();
                    System.out.println("CPF do cliente: ");
                    int cpf_cliente1 = sc.nextInt();
                    System.out.println("Ano de nascimento do cliente: ");
                    int ano_nascimento_cliente1 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Profissão do cliente: ");
                    String profissao_cliente1 = sc.nextLine();

                    // Criar uma instância do segundo Cliente
                    Cliente cliente1 = new Cliente(nome_cliente1, telefone_cliente1, email_cliente1, cidade_cliente1, cpf_cliente1, ano_nascimento_cliente1, profissao_cliente1);
                    clientes.add(cliente1);

                    System.out.println(' ');
                    break;
                case 7:
                    System.out.println(' ');
                    System.out.println("Qual o nome do advogado? ");
                    String nome_adv1 = sc.nextLine();
                    System.out.println("Telefone do advogado: ");
                    String telefone_adv1 = sc.nextLine();
                    System.out.println("Email do advogado: ");
                    String email_adv1 = sc.nextLine();
                    System.out.println("Cidade do advogado: ");
                    String cidade_adv1 = sc.nextLine();
                    System.out.println("Cnpj do advogado: ");
                    int cnpj_adv1 = sc.nextInt();
                    System.out.println("OAB do advogado: ");
                    int oab_adv1 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Área do advogado: ");
                    String area_adv1 = sc.nextLine();

                    // Criar uma instância de Advogado
                    Advogado advogado1 = new Advogado(nome_adv1, telefone_adv1, email_adv1, cidade_adv1, cnpj_adv1, oab_adv1, area_adv1);
                    advogados.add(advogado1);

                    System.out.println(' ');
                    break;
                case 8:
                    System.out.println(' ');
                    System.out.println("Qual o nome da testemunha? ");
                    String nome_testemunha1 = sc.nextLine();
                    System.out.println("Telefone da testemunha: ");
                    String telefone_testemunha1 = sc.nextLine();
                    System.out.println("Email da testemunha: ");
                    String email_testemunha1 = sc.nextLine();
                    System.out.println("Cidade da testemunha: ");
                    String cidade_testemunha1 = sc.nextLine();
                    System.out.println("Descrição do que a testemunha viu: ");
                    String descricao_testemunha1 = sc.nextLine();
                    System.out.println("A testemunha está disposta a testemunhar? (true/false) ");
                    boolean disposta_testemunhar1 = sc.nextBoolean();

                    // Criar uma instância de Testemunha
                    Testemunha testemunha1 = new Testemunha(nome_testemunha1, telefone_testemunha1, email_testemunha1, cidade_testemunha1, descricao_testemunha1, disposta_testemunhar1);
                    testemunhas.add(testemunha1);

                    System.out.println(' ');
                    break;
                case 9:
                    System.out.println(' ');
                    System.out.println("Número do processo: ");
                    int numero2 = sc.nextInt();
                    sc.nextLine(); // Consumir a nova linha pendente

                    System.out.println("Titulo do processo: ");
                    String titulo2 = sc.nextLine();

                    System.out.println("tipo do processo: ");
                    String tipo2 = sc.nextLine();

                    System.out.println("Data de início do processo (formato dd/MM/yyyy): ");
                    String dataInicioStr = sc.nextLine();
                    LocalDate data2 = LocalDate.parse(dataInicioStr, formatter);

                    System.out.println("Status do processo: ");
                    String status2 = sc.nextLine();

                    System.out.println("Partes envolvidas: ");
                    String parteEnvolvid2 = sc.nextLine();

                    System.out.println("Data de julgamento (formato dd/MM/yyyy): ");
                    String dataJulgamentoStr = sc.nextLine();
                    LocalDate dataJulgamento2 = LocalDate.parse(dataJulgamentoStr, formatter);

                    // Criar uma instância de Processo
                    Processo processo2 = new Processo(numero2, titulo2, tipo2, data2, status2, parteEnvolvid2, dataJulgamento2, advogado, cliente, testemunha);
                    processos.add(processo2);

                    System.out.println(' ');
                    break;
                case 10:
                    System.out.println(' ');
                    System.out.println("Lista com clientes registrados");
                    for (Cliente cl : clientes) {
                        System.out.println(' ');
                        System.out.println(cl.getNome());
                    }
                    System.out.println(' ');
                    break;
                case 11:
                    System.out.println(' ');
                    System.out.println("Lista com advogados registrados");
                    for (Advogado ad : advogados) {
                        System.out.println(' ');
                        System.out.println(ad.getNome());
                    }
                    System.out.println(' ');
                    break;
                case 12:
                    System.out.println(' ');
                    System.out.println("Lista com testemunhas registradas");
                    for (Testemunha ts : testemunhas) {
                        System.out.println(' ');
                        System.out.println(ts.getNome());
                    }
                    System.out.println(' ');
                    break;
                case 13:
                    System.out.println(' ');
                    System.out.println("Lista com números dos processos registrados");
                    for (Processo pc : processos) {
                        System.out.println(' ');
                        System.out.println(pc.getNumProcesso());
                    }
                    System.out.println(' ');
                    break;
                case 14:
                    System.out.println(' ');
                    System.out.println("Nome do cliente que você deseja remover: ");
                    sc.nextLine();
                    String rc = sc.nextLine();

                    if (clientes.removeIf(client -> client.getNome().equalsIgnoreCase(rc))) {
                        System.out.println("Nome removido!");
                    }
                    else {
                        System.out.println("Cliente não encontrado.");
                    }
1
                    System.out.println(' ');
                    break;
                case 15:
                    System.out.println(' ');
                    System.out.println("Nome do advogado que você deseja remover: ");
                    sc.nextLine();
                    String ra = sc.nextLine();

                    if (advogados.removeIf(advogad -> advogad.getNome().equalsIgnoreCase(ra))) {
                        System.out.println("Nome removido!");
                    }
                    else {
                        System.out.println("Advogado não encontrado.");
                    }

                    System.out.println(' ');
                    break;
                case 16:
                    System.out.println(' ');
                    System.out.println("Nome da testemunha que você deseja remover: ");
                    sc.nextLine();
                    String rt = sc.nextLine();

                    if (testemunhas.removeIf(testemunh -> testemunh.getNome().equalsIgnoreCase(rt))) {
                        System.out.println("Nome removido!");
                    }
                    else {
                        System.out.println("Testemunha não encontrado.");
                    }

                    System.out.println(' ');
                    break;
                case 17:
                    System.out.println(' ');
                    System.out.println("Numero do processo que você deseja remover: ");
                    sc.nextLine();
                    float rp = sc.nextInt();

                    if (processos.removeIf(process -> process.getNumProcesso() == rp)) {
                        System.out.println("Nome removido!");
                    }
                    else {
                        System.out.println("Processo não encontrado.");
                    }

                    System.out.println(' ');
                    break;
                case 0:
                    System.out.println(' ');
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println(' ');
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println(' ');
            }
        }
    }
}

