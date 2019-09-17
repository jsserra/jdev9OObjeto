package cursojava.executavel;



import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Aluno> aluno = new ArrayList<Aluno>();
		
		for(int i=1; i<=2; i++){
		
		String nome = JOptionPane.showInputDialog("Nome:");
		Integer idade = Integer.valueOf((JOptionPane.showInputDialog("Idade: ")));
		/*String dataNasc = JOptionPane.showInputDialog("Data Nascimento:");
		String rg = JOptionPane.showInputDialog("RG:");
		String cpf = JOptionPane.showInputDialog("CPF:");
		String mae = JOptionPane.showInputDialog("Nome da Mãe:");
		String pai = JOptionPane.showInputDialog("Nome da Pai:");
		String matricula = JOptionPane.showInputDialog("Matricula: ");
		String escola = JOptionPane.showInputDialog("escola:");
		String serie = JOptionPane.showInputDialog("serie:");*/
				
		Aluno a = new Aluno();
		
		a.setNome(nome);
		a.setIdade(idade);
		/*a1.setDataNascimento(dataNasc);
		a1.setRg(rg);
		a1.setCpf(cpf);
		a1.setDataMatricula(matricula);
		a1.setEscola(escola);
		a1.setSerie(serie);*/
		
		
		for(int pos=1; pos<=2; pos++){
			Disciplina d = new Disciplina();
			String disc = JOptionPane.showInputDialog(a.getNome() + " Disciplina" + pos + " :");
			d.setDisciplina(disc);
			double nota = Double.valueOf(JOptionPane.showInputDialog(a.getNome() + " Nota: " + pos + " :"));
			d.setN(nota);
			a.getDisciplinas().add(d);
		}
		
		
		/*int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma Disciplina? ");
		
		if( escolha == 0){
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while (continuarRemover == 0){
			String disciplinaRemover = JOptionPane.showInputDialog("Qual: 1,2,3,4");
			a.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao );
			posicao++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover?");
			}
		}*/
		aluno.add(a);
		
		}
		
		for (Aluno a : aluno) {
			if (a.getNome().equals("Juliano")){
				Aluno aa = new Aluno();
				aa.setNome("Moises");
				int pos = aluno.indexOf(a);
				aluno.set(pos,aa);
				//a = aa;
				//aluno.remove(a);
				break;
			}
			/*else {
			System.out.println(a);
			System.out.println("Media Aluno: " + a.media());
			System.out.println("Resultado: " + a.aprovacao());
			}*/
			
		}
		
		for (Aluno a : aluno){
			System.out.println(a.getNome());
			for (Disciplina d : a.getDisciplinas()) {
				System.out.println(d);
				
			}
		}
		
		/*System.out.println(a1);
		
		System.out.println(a1.getDisciplinas().toString());
		
		System.out.println(a1.getNome() + ", Média: " + a1.media() + ", esta: " + a1.aprovacao());
		System.out.println(a1.getNome() + ", Média: " + a1.media() + ", esta: " + (a1.aprovado() ? "Aprovado" : "Reprovado"));
	
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Carlos1");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Carlos");
		
		System.out.println(a1.equals(aluno2));*/
		
	
	}
	

}
