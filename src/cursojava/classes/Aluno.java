package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;


public class Aluno {

	String nome;
	private Integer idade;
	private String dataNascimento;
	private String rg;
	private String cpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String escola;
	private String serie;
	
	private List<Disciplina> disciplinas = new ArrayList();
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}



	public double media() {
		double sum = 0;
		for(Disciplina d: disciplinas){
			sum += d.getN();
		}
		return sum / disciplinas.size();
	}
	
	public boolean aprovado(){
		return media() >= 7 ? true : false;
	}

	public String aprovacao() {
		if (media() >= 7.0) {
			return StatusAluno.APROVADO;
		} else if (media() >= 5.0 && media() < 7.0) {
			return StatusAluno.RECUPERACAO;

		} else {
			return StatusAluno.REPROVADO;
		}
	}
	
	

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento="
				+ dataNascimento + ", rg=" + rg + ", cpf=" + cpf + ", nomeMae="
				+ nomeMae + ", nomePai=" + nomePai + ", dataMatricula="
				+ dataMatricula + ", escola=" + escola + ", serie=" + serie;
	}



}