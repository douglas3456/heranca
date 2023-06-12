package herança;

public class Aplicacao{

    public static void main(String[] args) {
       
        /* 
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Douglas");
         System.out.println(funcionario.Dados() );
    */

    
     Gerente gerente = new Gerente();
     gerente.setNome("Douglas");
     gerente.setIdade(18);
     gerente.setTelefone("00000000");
     gerente.setEmail("louco@luz.com");

     gerente.setFuncao("Gerente Operações");
     System.out.println(gerente.Dados());
    



}
}