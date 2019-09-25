package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Aluno> aluno = new ArrayList<Aluno>();
		
		/* é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também */
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		List<Aluno> alunosAprovado = new ArrayList<Aluno>();
		List<Aluno> alunoRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunoReprovado = new ArrayList<Aluno>();

		for (int i = 1; i <= 5; i++) {

			String nome = JOptionPane.showInputDialog("Nome:");
			Integer idade = Integer.valueOf((JOptionPane
					.showInputDialog("Idade: ")));
			/*
			 * String dataNasc =
			 * JOptionPane.showInputDialog("Data Nascimento:"); String rg =
			 * JOptionPane.showInputDialog("RG:"); String cpf =
			 * JOptionPane.showInputDialog("CPF:"); String mae =
			 * JOptionPane.showInputDialog("Nome da Mãe:"); String pai =
			 * JOptionPane.showInputDialog("Nome da Pai:"); String matricula =
			 * JOptionPane.showInputDialog("Matricula: "); String escola =
			 * JOptionPane.showInputDialog("escola:"); String serie =
			 * JOptionPane.showInputDialog("serie:");
			 */

			Aluno a = new Aluno();

			a.setNome(nome);
			a.setIdade(idade);
			/*
			 * a1.setDataNascimento(dataNasc); a1.setRg(rg); a1.setCpf(cpf);
			 * a1.setDataMatricula(matricula); a1.setEscola(escola);
			 * a1.setSerie(serie);
			 */

			for (int pos = 1; pos <= 2; pos++) {
				Disciplina d = new Disciplina();
				String disc = JOptionPane.showInputDialog(a.getNome()
						+ " Disciplina" + pos + " :");
				d.setDisciplina(disc);
				double nota = Double.valueOf(JOptionPane.showInputDialog(a
						.getNome() + " Nota: " + pos + " :"));
				d.setN(nota);
				a.getDisciplinas().add(d);
			}

			/*
			 * int escolha = JOptionPane.showConfirmDialog(null,
			 * "Deseja remover alguma Disciplina? ");
			 * 
			 * if( escolha == 0){
			 * 
			 * int continuarRemover = 0; int posicao = 1;
			 * 
			 * while (continuarRemover == 0){ String disciplinaRemover =
			 * JOptionPane.showInputDialog("Qual: 1,2,3,4");
			 * a.getDisciplinas().remove
			 * (Integer.valueOf(disciplinaRemover).intValue() - posicao );
			 * posicao++; continuarRemover = JOptionPane.showConfirmDialog(null,
			 * "Continuar a Remover?"); } }
			 */
			aluno.add(a);
			
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO,new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO,new ArrayList<Aluno>());

		}

		/*
		 * for (Aluno a : aluno) { if (a.getNome().equals("Juliano")){ Aluno aa
		 * = new Aluno(); aa.setNome("Moises"); int pos = aluno.indexOf(a);
		 * aluno.set(pos,aa); //a = aa; //aluno.remove(a); break; }
		 * 
		 * else { System.out.println(a); System.out.println("Media Aluno: " +
		 * a.media()); System.out.println("Resultado: " + a.aprovacao()); }
		 * 
		 * }
		 */

		for (Aluno a : aluno) {

			if (a.aprovacao().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(a);
			} else if (a.aprovacao().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(a);
			} else {
				maps.get(StatusAluno.REPROVADO).add(a);
			}
		}
		
		System.out.println("Aprovados = " + maps.get(StatusAluno.APROVADO).size());
		System.out.println("Recuperação = " + maps.get(StatusAluno.RECUPERACAO).size());
		System.out.println("Reprovados = " + maps.get(StatusAluno.REPROVADO).size());
		
		System.out.println("---------- Lista dos Aprovados ----------");
		for (Aluno a : maps.get(StatusAluno.APROVADO)) {
			System.out.println(a.getNome() + " = " + a.media());
		}
		System.out.println("---------- Lista dos Recuperação ----------");
		for (Aluno a : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println(a.getNome() + " = " + a.media());
		}
		System.out.println("---------- Lista dos Reprovados ----------");
		for (Aluno a : maps.get(StatusAluno.REPROVADO)) {
			System.out.println(a.getNome() + " = " + a.media());
		}

		/*
		 * System.out.println(a1);
		 * 
		 * System.out.println(a1.getDisciplinas().toString());
		 * 
		 * System.out.println(a1.getNome() + ", Média: " + a1.media() +
		 * ", esta: " + a1.aprovacao()); System.out.println(a1.getNome() +
		 * ", Média: " + a1.media() + ", esta: " + (a1.aprovado() ? "Aprovado" :
		 * "Reprovado"));
		 * 
		 * Aluno aluno1 = new Aluno(); aluno1.setNome("Carlos1");
		 * 
		 * Aluno aluno2 = new Aluno(); aluno2.setNome("Carlos");
		 * 
		 * System.out.println(a1.equals(aluno2));
		 */

	}

}
