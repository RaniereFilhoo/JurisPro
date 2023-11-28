

public class Advogado extends Pessoa implements Informações{
    int cnpj;
    int oab;
    String area;

    // MÉTODO CONSTRUTOR

    public Advogado(String nome, String telefone, String email, String cidade, int cnpj, int oab, String area) {
        super(nome, telefone, email, cidade);
        this.cnpj = cnpj;
        this.oab = oab;
        this.area = area;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getOab() {
        return oab;
    }

    public void setOab(int oab) {
        this.oab = oab;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    // MÉTODO PARA OBTER AS INFORMAÇÕES SOBRE OS ADVOGADOS QUE VEIO DA INTERFACE
    @Override
    public String obterInfo() {
        // Implementação específica para obter informações sobre o advogado
        return "Informações do Advogado:\n" +
                "Nome: " + getNome() + "\n" +
                "CNPJ: " + getCnpj() + "\n" +
                "OAB: " + getOab() + "\n" +
                "Área: " + getArea() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Cidade: " + getCidade();
    }
}
