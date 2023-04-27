public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade){
        System.out.println("Criei uma nova pessoa");
        this.nome = nome;
        this.idade = idade;
    }

    public void apresenta(){
        System.out.println("Olá! Meu nome é " + nome + " e tenho " + idade + " anos");
    }
}

