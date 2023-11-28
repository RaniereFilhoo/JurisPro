import java.time.LocalDate;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Processo implements Informações {
    float numProcesso;
    String titulo;
    String tipo;
    LocalDate inicio;
    String status;
    String partesEnvolvidas;
    LocalDate prazo;

    // MÉTODO CONSTRUTOR


    public Processo(float numProcesso, String titulo, String tipo, LocalDate inicio, String status, String partesEnvolvidas, LocalDate prazo, Advogado advogadoTitular, Cliente cliente, Testemunha testemunha) {
        this.numProcesso = numProcesso;
        this.titulo = titulo;
        this.tipo = tipo;
        this.inicio = inicio;
        this.status = status;
        this.partesEnvolvidas = partesEnvolvidas;
        this.prazo = prazo;
        this.advogadoTitular = advogadoTitular;
        this.cliente = cliente;
        this.testemunha = testemunha;
    }

    // ASSOCIAÇÕES
    private Advogado advogadoTitular;
    private Cliente cliente;
    private Testemunha testemunha;


    public Advogado getAdvogadoTitular() {
        return advogadoTitular;
    }

    public void setAdvogadoTitular(Advogado advogadoTitular) {
        this.advogadoTitular = advogadoTitular;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Testemunha getTestemunha() {
        return testemunha;
    }

    public void setTestemunha(Testemunha testemunha) {
        this.testemunha = testemunha;
    }


    // GETTER´S AND SETTER'S
    public float getNumProcesso() {
        return numProcesso;
    }

    public void setNumProcesso(float numProcesso) {
        this.numProcesso = numProcesso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPartesEnvolvidas() {
        return partesEnvolvidas;
    }

    public void setPartesEnvolvidas(String partesEnvolvidas) {
        this.partesEnvolvidas = partesEnvolvidas;
    }

    public LocalDate getPrazo() {
        return prazo;
    }
    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

     public void atualizarStatus(String novoStatus) {
        setStatus(novoStatus);
    }

    // MÉTODO PARA OBTER AS INFORMAÇÕES SOBRE OS PROCESSOS

    @Override
    public String obterInfo() {

        return "Informações do Processo:\n" +
                "Número do Processo: " + numProcesso + "\n" +
                "Título: " + titulo + "\n" +
                "Tipo: " + tipo + "\n" +
                "Início: " + inicio + "\n" +
                "Status: " + status + "\n" +
                "Partes Envolvidas: " + partesEnvolvidas + "\n" +
                "Prazo: " + prazo;
    }
}
