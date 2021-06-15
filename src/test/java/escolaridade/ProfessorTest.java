package escolaridade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void retornarNomeDoProfessor(){
        Professor professor = new Professor();
        professor.setNome("Marco Antonio");
        assertEquals("Marco Antonio",professor.getNome());
    }

    @Test
    void retornarTitulacaoDoProfessor(){
        Professor professor = new Professor();
        professor.setTitulacaoMaxima("Doutor");
        assertEquals("Doutor",professor.getTitulacaoMaxima());
    }
}