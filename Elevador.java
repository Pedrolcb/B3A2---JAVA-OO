import java.util.Scanner;
public class Elevador
{
    
    private int andares, capacidade, andar = 0, pessoas = 0;
    Scanner input = new Scanner ( System.in );
	Scanner input1 = new Scanner ( System.in );
    
    public void Inicializa(int quantidade, int total){
        System.out.println("Informe o total de andares do edifício: ");
        String andando = input.next();
        andares = Integer.parseInt(andando);
        this.andares = andares;
        System.out.println(" ");
        
        System.out.println("Informe a capacidade de pessoas que cabem no elevador: ");
        String pessoal = input1.next();
        quantidade = Integer.parseInt(pessoal);
        this.capacidade = quantidade;
    }
    
    public void Entrar(){
        if(this.pessoas < this.capacidade){
            this.pessoas = this.pessoas + 1;
        }else{
            System.out.println("O elevador está cheio!");
        }    
    }
    
    public void Sair(){
        if(this.pessoas > 0){
            this.pessoas = this.pessoas - 1;
        }else{
            System.out.println("Não há pessoas para saírem do elevador.");
        }  
    }
    
    
    public void Descer(){
        if(this.andar > 0){
            this.andar = this.andar - 1;
        }else{
            System.out.println("Você está no térreo.");
        }
        
    }
    
    public void Subir(){
        if(this.andar < this.andares){
            this.andar = this.andar + 1;
        }else{
            System.out.println("Você está no último andar do prédio");
        }
    }
    
    public void Posicao(){
        System.out.println("Quantidade de andares do edifício: ");
        System.out.println(this.andares);
        System.out.println("Capacidade de pessoas no elevador: ");
        System.out.println(this.capacidade);
        System.out.println("Quantas pessoas há no elevador: ");
        System.out.println(this.pessoas);
        System.out.println("Andar atual: ");
        System.out.println(this.andar);

    }
    
    
    public int getAndar(){
        return andar;
    }
    
    public int getCapacidade(){
        return capacidade;
    }
    
    public int getTotal(){
        return andares;
    }
    
    public int getPessoas(){
        return pessoas;
    }
    
    public void setAndar(){
        this.andares = this.andares;
    }
    
    public void setCapacidade(){
        this.capacidade = this.capacidade;
    }
    
    public void setTotal(){
        this.andares = this.andares;
    }
    
    public void setPessoas(){
        this.pessoas = this.pessoas;
    }
    
	public static void main(String[] args) {
	    Main elevador = new Main();
	    System.out.println("Sistema de elevadores do prédio! ");
	    elevador.Inicializa(100, 100);
	    while(true){
    	    Scanner inserircase = new Scanner ( System.in );
    	    System.out.println("Digite o número referente a aperação que você deseja realizar neste edifício por meio do elevador:");
    	    System.out.println("1 - Entrar no elevador. ");
    	    System.out.println("2 - Sair do elevador. ");
    	    System.out.println("3 - Subir andar. ");
    	    System.out.println("4 - Descer andar. ");
    	    System.out.println("5 - Sair do sistema de elevador do prédio. ");
    	    elevador.Posicao();
    	    String operacao = inserircase.next();
    	    int operar = Integer.parseInt(operacao);
    	    switch(operar){
    	        case 1:
    	            elevador.Entrar();
    	            System.out.flush();
    	            break;
    	        case 2:
    	            elevador.Sair();
    	            System.out.flush();
    	            break;
    	        case 3:
    	            elevador.Subir();
    	            System.out.flush();
    	            break;
    	        case 4:
    	            elevador.Descer();
    	            System.out.flush();
    	            break;
    	        case 5:
    	            System.exit(0);
    	            break;
    	    }  
    	    elevador.Posicao();
    	        
	    }
	}
	
}
