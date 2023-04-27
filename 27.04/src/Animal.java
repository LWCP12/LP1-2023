public class Animal {

    public String nome;
    public int idade;
    public String barulho;

    public Animal(String nome,String barulho, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.barulho = barulho;

    }
    public void fazerBarulho(){
        System.out.println("o animal faz " + barulho);

    }
    public int envelhece(){
        idade++;
        System.out.println("O animal ficou mais velho agora essa é sua idade: " + idade );
        return idade;
    }
}