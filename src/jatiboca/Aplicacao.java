
package jatiboca;
import java.util.Scanner;



public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double estoq1, estoq2,entrada,saida, transfer;
		String loja1 = "jatiboca";
		String loja2 = "pontal";
		
		System.out.println("Entre com o estoque inicial de acucar da empresa 1-jatiboca: ");
		estoq1=sc.nextDouble();
		System.out.println("Entre com o estoque inicial de acucar da empresa 2-pontal: ");
		estoq2=sc.nextDouble();
		
		System.out.println("que opcao deseja realizar? ");
		int option=sc.nextInt();
		
		switch(option) {
			case 1:
				System.out.println("em qual das lojas sera a entrada?");
				String nullo = sc.nextLine();
				String qual = sc.nextLine();
				if("jatiboca".equals(qual)) {
						System.out.println("qual a quantidade de entrada?(kg)");
						entrada=sc.nextDouble();
						estoq1+=entrada;
						System.out.println("o estoque atual da jatiboca e de "+estoq1+" kg");
				} else if("pontal".equals(qual)) {
						System.out.println("qual a quantidade de entrada?(kg)");
						entrada=sc.nextDouble();
						estoq2+=entrada;
						System.out.println("o estoque atual da Pontal e de "+estoq2+" kg");
				}else {
						System.out.println("erro! nome invalido.");
				}
				break;
			case 2:
				System.out.println("de qual loja sera retirado o estoque?");
				 nullo = sc.nextLine();
				 qual = sc.nextLine();
				 if("jatiboca".equals(qual)) {
						System.out.println("qual a quantidade de saida?(kg)");
						entrada=sc.nextDouble();
						estoq1-=entrada;
						System.out.println("o estoque atual da jatiboca e de "+estoq1+" kg");
				} else if("pontal".equals(qual)) {
						System.out.println("qual a quantidade de saida?(kg)");
						entrada=sc.nextDouble();
						estoq2-=entrada;
						System.out.println("o estoque atual da Pontal e de "+estoq2+" kg");
				}else {
						System.out.println("erro! nome invalido.");
				}
				break;
			case 3:
				System.out.println("De qual loja sera transferido o estoque? ");
				nullo = sc.nextLine();
				 qual = sc.nextLine();
				if("jatiboca".equals(qual)) {
						System.out.println("Qual a quantidade sera tranferida da "+qual+" ? (kg)");
						transfer = sc.nextDouble();
						estoq1-=transfer;
						estoq2+=transfer;
						System.out.println("o estoque atual da Jatiboca e de "+estoq1+" e o estoque da Pontal e de "+estoq2);
				}else if("pontal".equals(qual)) {
						System.out.println("Qual a quantidade sera tranferida da "+qual+" ? (kg)");
						transfer = sc.nextDouble();
						estoq2-=transfer;
						estoq1+=transfer;
						System.out.println("o estoque atual da Pontal e de "+estoq2+" e o estoque da Jatiboca e de "+estoq1);
				}else {
						System.out.println("Erro! nome invalido.");
				}
				break;
			
		}
		sc.close();
	}

}
