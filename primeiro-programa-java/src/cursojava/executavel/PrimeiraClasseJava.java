package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	/*Main � um m�todo auto execut�vel em Java*/
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		 for(int qtd = 1; qtd <= 2; qtd++) {
				
		
		/*Objeto ainda n�o existe na memoria do Java*/
		/*new Aluno() � uma inst�ncia (Cria��o de objeto)*/
		/*Aluno1 � referencia para o objeto aluno*/
		/*Agora temos um objeto real na memoria(criamos um objeto com new)*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno " +qtd+" ?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade do aluno");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno");
		String rg = JOptionPane.showInputDialog("Qual o RG do aluno");
		String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da m�e do aluno");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola aluno");
		
		String dataMatricula = JOptionPane.showInputDialog("Qual a data de matr�cula do aluno");
		String serieMatriculado = JOptionPane.showInputDialog("Qual a serie matriculado do aluno");*/
		
		
		Aluno aluno1 = new Aluno();//Aqui ser� o Jo�o / (new aluno) � uma inst�ncia
		
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);*/
		
		for (int pos = 1; pos <= 4; pos++) {	
			
			String nomeDisciplina = JOptionPane.showInputDialog("Qual � a discipina "+pos+"?");	
			String notaDisciplina = JOptionPane.showInputDialog("Qual � a nota dessa disciplina "+pos+"?");
			
			Disciplina disciplina=new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if(escolha == 0) {/*op��o SIM � zero(0)*/
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while(continuarRemover == 0){
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2 ,3 ou 4? ");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()- posicao);
				posicao ++;/*++ soma +1*/
				continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar remover disciplina?");
				
			}
		}	
		
		alunos.add(aluno1);
		 }
		 
		 for (Aluno aluno : alunos) {
			
			System.out.println(aluno);/*Descri��o do objeto na mem�ria*/
			System.out.println("M�dia do aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("/*---------------------------------------------------------------------*/");
		}
				
						
	}
}
