import java.time.LocalDate;

public class Cliente extends Pessoa implements Informações{
    int cpf;
    int anoNascimento;
    String profissao;

    // MÉTODO CONSTRUTOR


    public Cliente(String nome, String telefone, String email, String cidade, int cpf, int anoNascimento, String profissao) {
        super(nome, telefone, email, cidade);
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
        this.profissao = profissao;
    }

    // GETTER'S AND SETTER'S

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getAnoDeNascimento() {
        return anoNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoNascimento = anoDeNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    // MÉTODO PARA CALCULAR A IDADE DOS CLIENTES
    public int calcularIdade() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - anoNascimento;
    }

    public void mudarProfissao(String novaProfissao) {
        setProfissao(novaProfissao);
    }

    // MÉTODO PARA OBTER AS INFORMAÇÕES SOBRE OS CLIENTES QUE VEIO DA INTERFACE
    @Override
    public String obterInfo() {
        return "Informações do Cliente:\n" +
                "Nome: " + getNome() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Cidade: " + getCidade() + "\n" +
                "CPF: " + cpf + "\n" +
                "Ano de Nascimento: " + anoNascimento + "\n" +
                "Profissão: " + profissao + "\n" +
                "Idade: " + calcularIdade() + " anos";
    }
}
