package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	/*Main é um método auto executável em Java*/
	public static void main(String[] args) {
		/*Objeto ainda não existe na memoria do Java*/
		
		/*new Aluno() é uma instância (Criação de objeto)*/
		/*Aluno1 é referencia para o objeto aluno*/
		/*Agora temos um objeto real na memoria(criamos um objeto com new)*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno");
		String rg = JOptionPane.showInputDialog("Qual o RG do aluno");
		String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola aluno");
		
		String dataMatricula = JOptionPane.showInputDialog("Qual a data de matrícula do aluno");
		String serieMatriculado = JOptionPane.showInputDialog("Qual a serie matriculado do aluno");
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1? ");
		String note1 = JOptionPane.showInputDialog("Nota 1 ");
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2? ");
		String note2 = JOptionPane.showInputDialog("Nota 2 ");
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3? ");
		String note3 = JOptionPane.showInputDialog("Nota 3 ");
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4? ");
		String note4 = JOptionPane.showInputDialog("Nota 4 ");
		
		Aluno aluno1 = new Aluno();//Aqui será o João / (new aluno) é uma instância
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		
				
		System.out.println(aluno1.toString());/*Descrição do objeto na memória*/
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
				
			
		
		
		/*----------------------------------------------------------------------------------*/
		
		/*System.out.println("Nome é: " + aluno1.getNome());		
		System.out.println("Idade é: " + aluno1.getIdade());
		System.out.println("Data de nascimento é: " + aluno1.getDataNascimento());
		System.out.println("Registro geral(RG)é: " + aluno1.getRegistroGeral());
		System.out.println("Numero CPF é: " + aluno1.getNumeroCpf());
		System.out.println("Nome da mãe é: " + aluno1.getNomeMae());
		System.out.println("Nome do pai é: " + aluno1.getNomePai());
		System.out.println("Nome da Escola é: " + aluno1.getNomeEscola());
		System.out.println("Data da matrícula é: " + aluno1.getDataMatricula());
		System.out.println("Série é: " + aluno1.getSerieMatriculado());
		System.out.println("Média da nota é: " + aluno1.getMediaNota());
		System.out.println("Resutado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2: " + aluno1.getAlunoAprovado2());
		
		
		
		
		System.out.println("=================================================");
		
		
		/*Aluno aluno2 = new Aluno();//Aqui será o Pedro*/
		
		/*aluno2.setNome("Pedro Ramon");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("14/10/1990");
		aluno2.setRegistroGeral("44488555");
		aluno2.setNumeroCpf("125481555-00");
		aluno2.setNomeMae("Marta");
		aluno2.setNomePai("Joel");
		aluno2.setNomeEscola("Cesusc");
		aluno2.setDataMatricula("12/08/2000");
		aluno2.setSerieMatriculado("8A");
		aluno2.setNota1(90);
		aluno2.setNota2(70.8);
		aluno2.setNota3(70.9);
		aluno2.setNota4(90.7);
		
		/*----------------------------------------------------------------------------------*/
		
		/*System.out.println("nome é: " + aluno2.getNome());		
		System.out.println("Idade é: " + aluno2.getIdade());
		System.out.println("Data de nascimento é: " + aluno2.getDataNascimento());
		System.out.println("Registro é: " + aluno2.getRegistroGeral());
		System.out.println("Numero CPF é: " + aluno2.getNumeroCpf());
		System.out.println("Nome da mãe é: " + aluno2.getNomeMae());
		System.out.println("Nome do pai é: " + aluno2.getNomePai());
		System.out.println("Nome da Escola é: " + aluno2.getNomeEscola());
		System.out.println("Data da matrícula é: " + aluno2.getDataMatricula());
		System.out.println("Série é: " + aluno2.getSerieMatriculado());
		System.out.println("Média da nota é: " + aluno2.getMediaNota());

		
		System.out.println("=================================================");
		
		Aluno aluno3 = new Aluno();//Aqui será o Alex*/
		
		/*aluno3.setNome("Alex Victor");
		aluno3.setIdade(30);
		aluno3.setDataNascimento("24/06/1990");
		aluno3.setRegistroGeral("6599998555");
		aluno3.setNumeroCpf("125488885-00");
		aluno3.setNomeMae("Maria");
		aluno3.setNomePai("Eliseu");
		aluno3.setNomeEscola("Cesusc");
		aluno3.setDataMatricula("12/08/2010");
		aluno3.setSerieMatriculado("8A");
		aluno3.setNota1(90);
		aluno3.setNota2(50.8);
		aluno3.setNota3(70.9);
		aluno3.setNota4(60.7);
		
		/*----------------------------------------------------------------------------------*/
		
		/*System.out.println("nome é: " + aluno3.getNome());		
		System.out.println("Idade é: " + aluno3.getIdade());
		System.out.println("Data de nascimento é: " + aluno3.getDataNascimento());
		System.out.println("Registro é: " + aluno3.getRegistroGeral());
		System.out.println("Numero CPF é: " + aluno3.getNumeroCpf());
		System.out.println("Nome da mãe é: " + aluno3.getNomeMae());
		System.out.println("Nome do pai é: " + aluno3.getNomePai());
		System.out.println("Nome da Escola é: " + aluno3.getNomeEscola());
		System.out.println("Data da matrícula é: " + aluno3.getDataMatricula());
		System.out.println("Série é: " + aluno3.getSerieMatriculado());
		System.out.println("Média da nota é: " + aluno3.getMediaNota());*/

		
		/*System.out.println("=================================================");*/

		
		/*Aluno aluno4 = new Aluno("Maria");
		
		/*Aluno aluno5 = new Aluno("José, 50");*/
		
					
				
	}
}
