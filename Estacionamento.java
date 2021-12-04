import java.util.Scanner;
public class Estacionamento
{
    private double entrada = 0, horasaida = 0, c = 0, x = 0; 
    private double preco = 0;
    private int placadocarro = 0;
    private String modelo = "Car";
    Scanner input = new Scanner ( System.in );
    
    public void setplacadocarro(int placa){
        System.out.println("Por favor, informe a placa de seu veículo: ");
        String placas = input.next();
        int p = Integer.parseInt(placas);
        this.placadocarro = p;
    }
    
    public void setmodelo(String modelo){
        System.out.println("Informe também o modelo de seu veículo: ");
        String modelos = input.next();
        this.modelo = modelos;
    }
    
    public void setCalcularHora(double entrada, double horariodesaida, double c, double preco, double x){
        System.out.println(" ");
        System.out.println("Excelente! ");
        System.out.println("Por favor, agora preencha algumas informações referentes ao tempo que você utilizou o estacionamento: ");
        System.out.println("Horário de entrada do seu veículo no estacionamento: ");
        String horariodeentrada = input.next();
        int horae = Integer.parseInt(horariodeentrada);
        this.entrada = horae;
        System.out.println("Horário de saída do seu veículo do estacionamento: ");
        String horasaida = input.next();
        int horas = Integer.parseInt(horasaida);
        this.horasaida = horas;
        if(this.entrada > 23 || this.horasaida > 23){
            System.out.println("Não é possível informar um horário maior que o sistema de 24 horas do horário local. ");
        }
        if(this.entrada < this.horasaida){
            this.c = this.horasaida - this.entrada;
            this.preco = this.c * 1.5;
        }else{
            this.x = 24 - this.entrada;
            this.c = this.x + this.horasaida;
            this.preco = this.c * 1.5;
        }
        
    }
    
    
    public int getplacadocarro(){
        return this.placadocarro;
    }
    
    public String getmodelo(){
        return this.modelo;
    }
    
    public double getentrada(){
        return this.entrada;
    }
    
    public double gethorasaida(){
        return this.horasaida;
    }
    
    public double gethoras(){
        return this.c;
    }
    
    public double getpreco(){
        return this.preco;
    }
    
	public static void main(String[] args) {
	    System.out.println("Bem-vindo ao sistema de estacionamentos!");
		Main estacionamento = new Main();
		estacionamento.setplacadocarro(1);
		estacionamento.setmodelo("Car");
		estacionamento.setCalcularHora(1,2,3,4,5);
		System.out.println(" ");
		System.out.println("Informações sobre o seu veículo e total a ser pago pelo estacionamento ( 1 hora é equivalente a R$1.5 ) : ");
		System.out.println("Placa: " + estacionamento.getplacadocarro());
		System.out.println("Modelo: " + estacionamento.getmodelo());
		System.out.println("Horário de entrada: " + estacionamento.getentrada());
		System.out.println("Horário de saída: " + estacionamento.gethorasaida());
		System.out.println("Horas que o carro ficou estacionado dentro do estacionamento: " + estacionamento.gethoras());
		System.out.println(" ");
		System.out.println("Valor total a ser pago: " + estacionamento.getpreco() + " reais");
	}
}
