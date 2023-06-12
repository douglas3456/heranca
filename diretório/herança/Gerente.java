package herança;

public class Gerente extends Funcionario{

    String Funcao;
    
    public void setFuncao(String funcao) {
        Funcao = funcao;
    }
    public String getFuncao(){
        return Funcao;
    }
    
    public String Dados(){
        return getNome().toUpperCase()+"- "+getIdade()+"-"+getTelefone()+"-"+getEmail()+" - "+getFuncao().toUpperCase();
        
    }

}