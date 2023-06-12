package herança;

public class Funcionario{
    String Nome;
    int Idade;
    String Telefone;
    String Email;

    public void setNome(String nome){
        Nome = nome;
    }
    public void setIdade(int idade){
        Idade = idade;
    }
    public void setTelefone(String telefone){
        Telefone= telefone;
    }
    public void setEmail(String email){
        Email=email;
    }
    public String getNome(){
    return Nome;
    }
    public int getIdade(){
        return Idade;
    }
    public String getTelefone(){
        return Telefone;
    }
    public String getEmail(){
        return Email;
    }
    public String Dados(){
        return Nome.toUpperCase();
    }
}