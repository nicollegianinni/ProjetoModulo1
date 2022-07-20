package teste;
// Para usar os numeros randomicos devemos importar a biblioteca;

import java.util.Random;

public class passCovid extends cadPass{
	
	//chamando a class random;
	Random random = new Random();
	
	//atributos da classfilha passCovid
	//variavel para guardar e chamar os numeros randomicos.
	
	private int ordemAtend;
	int chamada = random.nextInt(100);
	
	
	// Construtor da classfilha passCovid
	
	public passCovid () 
		{
			
		}

	
	// gets e sett da class filha passCovid

	public int getOrdemAtend() {
		return ordemAtend;
	}


	public void setOrdemAtend(int ordemAtend) {
		this.ordemAtend = ordemAtend;
	}


	// metodo poliformismo da class mãe passCovid
	
	@Override
	public void inicioCadastro() {
		System.out.println("Olá! Essa é a triagem de Covid!\n");
		System.out.println("Por favor digite seus dados para realizarmos a triagem!\n");
		
	}

	@Override
	public void Covid() {
		if(super.getSintomasCovid()==true)
		{
			
			System.out.println("Você será chamado(a) no painel de Covid!\n");
			System.out.println("Seu número de atendimento é: "+chamada);
		}
		
	}


	@Override
	public void infoPass() {
		
		System.out.println("********* Cadatro de Paciente - Triagem ***********\n");
		System.out.println("Nome:"+super.getNome()+"\n");
		System.out.println("Idade:"+super.getIdade()+"\n");
		System.out.println("Sintomas Covid:"+super.getSintomasCovid()+"\n");
		System.out.println("Sintoma(s) do(a) paciente:"+super.getInfoSintoma()+"\n");
	}
	
	@Override
	public void listaClass() {
		
		System.out.println("****************************************************");
		System.out.println("Classificação de acordo com os sintomas do(a) paciente:\n");
		System.out.println("*****  Sintomas  ***********************************\n"+"\n1- Gripe e Tosse.\n2- Gripe, tosse, febre e dor de cabeça.\n3- Gripe, tosse, febre e dor de cabeça e falta de ar.\n");
		System.out.println("****************************************************");
		
	}
	
	@Override
	public void infoSintoma() {
		switch(super.getNum()) {
		 
		 case 1: 
			 super.setInfoSintoma("Gripe e Tosse.");
		 break;
		 
		 case 2: 
			super.setInfoSintoma("Gripe, tosse, febre e dor de cabeça.");
		 break;
		 
		 case 3: 
			 super.setInfoSintoma("Gripe, tosse, febre e dor de cabeça e falta de ar.");
		 break;
		 }
		
	}

	@Override
	public void classMedica() {
		 switch(super.getNum()) {
		 
		 case 1: 
			 System.out.println("Sua classificação é Verde = Baixa emergência.\n");
		 break;
		 
		 case 2: 
			 System.out.println("Sua classificação é Amarela = Média emergência.\n");
		 break;
		 
		 case 3: 
			 System.out.println("Sua classificação é Vermelha = Alta emergência.\n");
		 break;
		 }
		 
		}
		
	
}