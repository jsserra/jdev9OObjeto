package cursojava.classes;

public class Disciplina {
	
	private String disciplina;
	private double n;
	
	public Disciplina() {
		super();
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getN() {
		return n;
	}
	public void setN(double n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "disciplina = " + disciplina + " nota=" + n + " " ;
	}


}
