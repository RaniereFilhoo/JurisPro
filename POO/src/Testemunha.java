public class Testemunha extends Pessoa implements Informações{
    String descricao;
    boolean disponibilidade;

    // MÉTODO CONSTRUTOR


    public Testemunha(String nome, String telefone, String email, String cidade, String descricao, boolean disponibilidade) {
        super(nome, telefone, email, cidade);
        this.descricao = descricao;
        this.disponibilidade = disponibilidade;
    }

    // GETTER'S AND SETTER'S
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    // MÉTODO PARA OBTER AS INFORMAÇÕES SOBRE AS TESTESMUNHAS QUE VEIO DA INTERFACE

    @Override
    public String obterInfo() {
        return "Informações da Testemunha:\n" +
                "Nome: " + getNome() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Cidade: " + getCidade() + "\n" +
                "Descrição: " + descricao + "\n" +
                "Disponibilidade: " + (disponibilidade ? "Disponível" : "Indisponível");
    }
}
