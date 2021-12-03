import java.util.Scanner;
public class Pessoa
{
    
    private String Nome; 
    private int Nascimento; 
    private float Altura;
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
        
    public void setNascimento(int Nascimento){
        this.Nascimento = 2021 - Nascimento;
    }
        
    public void setAltura(int Altura){
        this.Altura = Altura;
    }
    
    public String getNome(){
        return this.Nome;
    }
            
    public int getNascimento(){
        return this.Nascimento;
    } 
            
    public float getAltura(){
        return this.Altura;
    }
    
    public static void main(String[] args) {
      
	    Scanner input = new Scanner ( System.in );
	    System.out.println("Digite o nome da pessoa: ");
    	String Name = input.next();
    	
    	
    	Scanner input1 = new Scanner ( System.in );
	    System.out.println("Digite o ano de nascimento da pessoa: ");
    	String Anos = input1.next();
    	int Nascer = Integer.parseInt(Anos);
    	
    
    	Scanner input2 = new Scanner ( System.in );
	    System.out.println("Digite a altura da pessoa: ");
    	String A = input2.next();
    	float height = Integer.parseInt(A);
    	
	    Main pessoa = new Main();
	    pessoa.Nome = Name;
	    pessoa.Nascimento = 2021 - Nascer;
	    pessoa.Altura = height;
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getNascimento());
		System.out.println(pessoa.getAltura());
	}
}
