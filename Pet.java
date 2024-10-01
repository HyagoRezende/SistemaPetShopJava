
public class Pet {
	private String codigo, especie, nome, idade;
	private Proprietario dono;
	
	Pet(String codigo, String especie, String nome, String idade, Proprietario dono){
		this.codigo = codigo;
		this.especie = especie;
		this.nome = nome;
		this.idade = idade;
		this.dono = dono;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public Proprietario getDono() {
		return dono;
	}

	public void setDono(Proprietario dono) {
		this.dono = dono;
	}
	
	public String toString() {
		return (codigo+" - Especie: "+especie+" - Nome: "+nome+" - Idade: "+idade+"\nProprietario: "+dono.toString());
	}
	
	
}
