
package escolaridade;

public class AlunoEnsinoMedio extends Aluno{

    public String calcularAprovocao(){
        if ( (this.getNota1()+this.getNota2())/2 >= 6){
            return "APROVADO";
        }else{
            return "REPROVADO";
        }
    }

}