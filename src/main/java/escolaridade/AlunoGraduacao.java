package escolaridade;

public class AlunoGraduacao extends Aluno{
    public String calcularAprovocao(){
        if ((this.getNota1()+getNota2())/2 >= 7){
            return "APROVADO";
        }else{
            return "REPROVADO";
        }
    }
}
