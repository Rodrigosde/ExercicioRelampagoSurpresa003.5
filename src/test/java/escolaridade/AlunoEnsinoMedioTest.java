package escolaridade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {

    @Test
    void retornarNomeDoAluno(){
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setNome("Pedro");
        assertEquals("Pedro",alunoEnsinoMedio.getNome());
    }


    @Test
    void retornarMatriculaDoAluno(){
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setMatricula(20100121);
        assertEquals(20100121,alunoEnsinoMedio.getMatricula());
    }


    @Test
    void calcularAprovacaoDoAlunoEnsinoMedio() {
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setNota1(6);
        alunoEnsinoMedio.setNota2(6);
        assertEquals("APROVADO", alunoEnsinoMedio.calcularAprovocao());
    }


    @Test
    void calcularReprovacaoDoAlunoEnsinoMedio() {
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setNota1(5f);
        alunoEnsinoMedio.setNota2(5f);
        assertEquals("REPROVADO", alunoEnsinoMedio.calcularAprovocao());
    }
}