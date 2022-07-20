package teste;

import java.util.Random;

public class passOutros extends cadPass{
	
	//chamando a class random;
	Random random = new Random();
	
	//atributos da classfilha passOutos.
	//variavel para guardar e chamar os numeros randomicos.
	
	private int ordemAtend;
	int chamada = random.nextInt(100);
	
	// Construtor da classfilha passOutos
	
		public passOutros () 
			{
				
			}
		
	// gets e sett da class filha passOutros

		public int getOrdemAtend() {
			return ordemAtend;
		}

		public void setOrdemAtend(int ordemAtend) {
			this.ordemAtend = ordemAtend;
		}
		
		// metodo poliformismo da class mãe passCovid

		@Override
		public void inicioCadastro() {
			System.out.println("Olá, essa é a triagem geral!\n");
			System.out.println("Por favor digite seus dados para realizarmos a triagem!\n");
			
		}


		@Override
		public void Covid() {
			if(super.getSintomasCovid()==false)
			{
				
				System.out.println("Você será chamado(a) no painel Geral!\n");
				System.out.println("Seu numero de atendimento é: "+chamada);
			}
		}

		@Override
		public void infoPass() {
			
			System.out.println("********* Cadatro de Paciente - Triagem ***********\n");
			System.out.println("Nome:"+super.getNome()+"\n");
			System.out.println("Idade:"+super.getIdade()+"\n");
			System.out.println("Sintomas Covide:"+super.getSintomasCovid()+"\n");
			System.out.println("Sintoma da paciente:"+super.getInfoSintoma()+"\n");
			
			
		}

		@Override
		public void listaClass() {
			
			System.out.println("****************************************************");
			System.out.println("Classificação de acordo com os sintomas do paciente:\n");
			System.out.println("*****  Sintomas  ***********************************\n"+"\n1- Dorleve.\n2-Dor média e pressão alta.\n3-Dor aguda, pressão alta e diabetes.\n");
			System.out.println("****************************************************");
			
		}
		
		@Override
		public void infoSintoma() {
			switch(super.getNum()) {
			 
			 case 1: 
				 super.setInfoSintoma("Dorleve.");
			 break;
			 
			 case 2: 
				super.setInfoSintoma("Dor média e pressão alta.");
			 break;
			 
			 case 3: 
				 super.setInfoSintoma("Dor aguda, pressão alta e diabetes.");
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
