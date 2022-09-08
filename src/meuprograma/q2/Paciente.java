package meuprograma.q2;

public class Paciente {
	
	private String nome;
	private String cpf;
	private byte idade;
	private float peso;
	private float altura;
		
	public Paciente(String nome, String cpf, byte idade, float peso, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Paciente(String nome, String cpf, byte idade) {
		this(nome, cpf, idade, 0, 0);
	}
	
	public Paciente() {
		// TODO Auto-generated constructor stub
	}
	
	public float getImc() {
		return this.peso / (this.altura * this.altura);
	}
	
	public boolean maiorDeIdade() {
		return this.idade >= 18;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Paciente [Nome: " + this.nome + 
				", Idade: "+ this.idade +
				", CPF: " + this.cpf + 
				" ,Altura: " + this.altura +
				", Peso: " + this.peso;
	}
	
	
	

}


