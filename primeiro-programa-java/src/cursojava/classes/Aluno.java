package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

/*esta ? a classe/objeto que representa aluno*/

public class Aluno {
/*esses s?o os atributos da classe do Aluno, caracteristicas da lista*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
		
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
		
	public Aluno() {/*cria os dados na mem?ria*/
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao; 
	}
	//veremos os metodos getters and setters do objeto
	//SET ? para dicionar ou receber dados para os atributos
	//GET ? PARA RSGATAR OU OBTER o valor do atributo
	/*Recebe dados/set*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
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

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

		
	/*M?todo que retorna a m?dia do aluno*/
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina:disciplinas) {
		
			somaNotas += disciplina.getNota();
		}
		return somaNotas/disciplinas.size();
	}
	/*M?todo que retorna True para aprovado e False para Reprovado*/
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 70) {/*Aprovado*/
			return true;
		}else {
			return false;
		}
	}
	/*M?todo que retorna String para aprovado e para Reprovado*/	
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if(media >= 50) {
			if (media >= 70){
				return "aluno est? aprovado";
			}else {
			return "O Aluno est? em recupera??o";
		}
		}else {
			return "O Aluno foi Reprovado";
		}	
	}
		
	
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		return result;
	}

	@Override
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
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		return true;
	}

	
	
	
}
