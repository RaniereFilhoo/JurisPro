import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class JurisTest {

    @Test
    public void PerfilTestCliente() {
        // CRIANDO C1 PARA DAR INICIO AOS TESTES
        Cliente c1 = new Cliente("Arthur", "98765",
                "arthur01@gmail.com", "Patos", 1777,
                2001, "Estudante");
        Assertions.assertEquals("Arthur", c1.nome);
        Assertions.assertEquals("98765", c1.telefone);
        Assertions.assertEquals("arthur01@gmail.com", c1.email);
        Assertions.assertEquals("Patos", c1.cidade);
        Assertions.assertEquals(1777, c1.cpf);
        Assertions.assertEquals(2001, c1.anoNascimento);
        Assertions.assertEquals("Estudante", c1.profissao);

    }

    @Test
    public void PerfilTestAdvogado() {
        // CRIANDO ADVOGADO PARA DAR INICIO AOS TESTES
        Advogado a1 = new Advogado("Bruno", "92355",
                "brunoadv5@hotmail.com", "Patos", 00431,
                01015, "Direito Civil");
        Assertions.assertEquals("Bruno", a1.nome);
        Assertions.assertEquals("92355", a1.telefone);
        Assertions.assertEquals("brunoadv5@hotmail.com", a1.email);
        Assertions.assertEquals("Patos", a1.cidade);
        Assertions.assertEquals(00431, a1.cnpj);
        Assertions.assertEquals(01015, a1.oab);
        Assertions.assertEquals("Direito Civil", a1.area);

    }


    @Test
    public void PerfilTestTestemunha() {
        // CRIANDO TESTEMUNHA PARA DAR INICIO AOS TESTES
        Testemunha t1 = new Testemunha("Sandro", "98817",
                "sandro03@gmail.com", "Patos",
                "Alto, moreno", true);
        Assertions.assertEquals("Sandro", t1.nome);
        Assertions.assertEquals("98817", t1.telefone);
        Assertions.assertEquals("sandro03@gmail.com", t1.email);
        Assertions.assertEquals("Patos", t1.cidade);
        Assertions.assertEquals("Alto, moreno", t1.descricao);
        Assertions.assertEquals(true, t1.disponibilidade);

    }


    @Test
    public void TestProcesso() {

        // É NECESSÁRIO CRIAR OUTROS OBJETOS POIS PROCESSO NÃO EXISTE SEM ELES

        // CRIANDO C1 POIS C1.NOME SERÁ UTILIZADO EM PROCESSO
        Cliente c1 = new Cliente("Arthur", "98765",
                "arthur01@gmail.com", "Patos", 1777,
                2001, "Estudante");
        // CRIANDO A1 POIS A1.NOME SERÁ UTILIZADO EM PROCESSO
        Advogado a1 = new Advogado("Bruno", "92355",
                "brunoadv5@hotmail.com", "Patos", 00431,
                01015, "Direito Civil");
        // CRIANDO T1 POIS A1.NOME SERÁ UTILIZADO EM PROCESSO
        Testemunha t1 = new Testemunha("Sandro", "98817",
                "sandro03@gmail.com", "Patos",
                "Alto, moreno", true);
        // CRIANDO P1 PARA DAR INICIO AOS TESTES
        Processo p1 = new Processo(11155, "Furto01",
                "Condenatório", LocalDate.of(2023, 11, 30), "Em análise",
                "Abc", LocalDate.of(2023, 12, 25), a1,
                c1, t1);
        Assertions.assertEquals(11155, p1.numProcesso);
        Assertions.assertEquals("Furto01", p1.titulo);
        Assertions.assertEquals("Condenatório", p1.tipo);
        Assertions.assertEquals(LocalDate.of(2023, 11, 30), p1.inicio);
        Assertions.assertEquals("Em análise", p1.status);
        Assertions.assertEquals("Abc", p1.partesEnvolvidas);
        Assertions.assertEquals(LocalDate.of(2023, 12, 25), p1.prazo);
        Assertions.assertEquals("Bruno", a1.nome);
        Assertions.assertEquals("Arthur", c1.nome);
        Assertions.assertEquals("Sandro", t1.nome);

    }


}
