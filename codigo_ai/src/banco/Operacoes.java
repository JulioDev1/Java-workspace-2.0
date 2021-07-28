package banco;

public class Operacoes {

	private int cadastro;
	private String nome;
	private double valor;

	public Operacoes(int cadastro, String nome) {
		this.cadastro = cadastro;
		this.nome = nome;
	}
	public Operacoes(int cadastro, String nome, double depositoInicial) {
		this.cadastro = cadastro;
		this.nome = nome;
		deposito(depositoInicial);
}
	public int getCadastro() {
		return cadastro;
	}
	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void deposito(double quantidade) {
		valor+=quantidade;
		
	}
	public void saque(double quantidade) {
		valor-=quantidade + 5;
	} 
	public String toString(){
		return "|Operacoes|"
				+ "|nome:| "
				+ cadastro 
				+"|"
				+ nome
				+"|"
				+String.format("%.2f|", valor);
				
	}
}
	
