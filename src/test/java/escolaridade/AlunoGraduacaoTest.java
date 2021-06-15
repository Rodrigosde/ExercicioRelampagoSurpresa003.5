package escolaridade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {

    @Test
    void retornarNomeDoAluno(){
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setNome("Rodrigo");
        assertEquals("Rodrigo",alunoGraduacao.getNome());
    }

    @Test
    void retornarMatriculaDoAluno(){
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setMatricula(201976012);
        assertEquals(201976012,alunoGraduacao.getMatricula());
    }

    @Test
    void calcularAprovacaoDoAlunoGraduacao() {
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setNota1(7f);
        alunoGraduacao.setNota2(7f);
        assertEquals("APROVADO", alunoGraduacao.calcularAprovocao());
    }

    @Test
    void calcularReprovacaoDoAlunoGraduacao() {
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setNota1(6f);
        alunoGraduacao.setNota2(6f);
        assertEquals("REPROVADO", alunoGraduacao.calcularAprovocao());
    }
}