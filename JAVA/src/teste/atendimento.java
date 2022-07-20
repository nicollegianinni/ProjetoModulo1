package teste;

//Bibliotecas importadas para utilização no programa;
import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Thread;


public class atendimento {

	public static void main(String[] args) throws InterruptedException 
 {
		
		Scanner leia = new Scanner(System.in);
		
		passCovid pacienteC = new passCovid();
		
		pacienteC.inicioCadastro();
		
		System.out.println("Digite seu nome e sobrenome:");
		pacienteC.setNome(leia.nextLine());
		
		System.out.println("Digite sua idade:");
		pacienteC.setIdade(leia.nextInt());
		
		System.out.println("Você tem sintomas de Covid? - \nDigite True para Sim e False para não!");
		pacienteC.setSintomasCovid(leia.nextBoolean());
		
		if(pacienteC.getSintomasCovid()==true) {
			
			System.out.println("Verifique na tabela abaixo quais seus sintomas:");
			pacienteC.listaClass();
			System.out.println("Informe o número correspondente aos seus sintomas:");
			pacienteC.setNum(leia.nextInt());
			
			System.out.println("Confirme seus dados abaixo:\n");
			pacienteC.infoSintoma();
			pacienteC.infoPass();
			System.out.println("As informações estão corretas?\nDigite 1 ! \nCaso não!\nDigite 2 !\n");
			int confCad = leia.nextInt();
			
			if(confCad==1) {
				System.out.println("\nSua ordem de chamada está sendo gerada. \nAguarde....\n");
				Thread.sleep(5000);
				System.out.println("***** Classificação de Paciente Covid ******\n");
				pacienteC.classMedica();
				pacienteC.Covid();
			}
			else {
				System.out.println("Cancele o atendimento e corrija o cadastro!\n");
			}
				
		}
		
		else {
			System.out.println("Essa triagem é apenas para pacientes com sintomas de covid!\n");
			System.out.println("Siga para a recepção geral!\n");
		}
		
		System.out.println("____________________Fim de atendimento________________________\n");
		
		System.out.println("PROTOCOLO DE CUIDADOS COVID\n");
		
		Collection<String> protocolo = new ArrayList();
		 protocolo.add("Lavar as mãos constantemente!");
		 protocolo.add("Usar máscara em local fechado!");
		 protocolo.add("Evitar tocar a mucosa dos olhos");
		 System.out.println(protocolo);
		 
		 System.out.println("\nAtendimento 24h - Fone: 81 3000-3030 \n");
	}
		
}	