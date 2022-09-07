package meuprograma.q1;

public class Estudante {

	private String name;
	private byte idade;
	private String matricula;
	private String curso;
	private boolean matriculaAtiva;
	

	private static int CONTADOR_INSTANCIAS;
	
	
	public Estudante(String name, byte idade, String matricula, String curso) {
		CONTADOR_INSTANCIAS++;
		
		this.name = name;
		this.idade = idade;
		this.matricula = matricula;
		this.curso = curso;
		this.matriculaAtiva = true;
	}
	
	
	public Estudante() {
		
	}
	
	public void alterarStatusrMatricula() {
		this.matriculaAtiva = !this.matriculaAtiva;
	}
	
	public static int quantidadeDeMatriculasFeitas() {
		return CONTADOR_INSTANCIAS;
	}
	
	@Override
	public String toString() {
		
		return "Estudante [Nome: " + this.name +
				", Idade: "+ this.idade + ", Matricula: "+ this.matricula + 
				", Curso: " + this.curso + ", MatriculaAtiva: " 
				+ this.matriculaAtiva + "]";
	}
	
	
	
	
}
