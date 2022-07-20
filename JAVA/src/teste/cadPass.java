package teste;

public abstract class cadPass {

	// atributos de cadPass;
	
	private String nome;
	private int idade;
	private boolean sintomasCovid;	
	private String infoSintoma;
	int num;

	// Contrutor

	public cadPass () 
	{

	}
	
	
	// métodos de cadPass

	public abstract void inicioCadastro();
	public abstract void Covid();
	public abstract void infoPass();
	public abstract void infoSintoma();
	public abstract void listaClass();
	public abstract void classMedica();
	
	
	//gets e setts
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean getSintomasCovid() {
		return sintomasCovid;
	}
	public void setSintomasCovid(boolean sintomasCovid) {
		this.sintomasCovid = sintomasCovid;
	}
	public String getInfoSintoma() {
		return infoSintoma;
	}
	public void setInfoSintoma(String infoSintoma) {
		this.infoSintoma = infoSintoma;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
}