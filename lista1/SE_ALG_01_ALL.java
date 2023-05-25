package lista1;

import java.util.Scanner;
import java.lang.Math;

public class SE_ALG_01_ALL {
	
	public static void main(String[] args) {
		/*
		System.out.println(imprimirEndereco());
		System.out.println(imprimirQlqrEnd("Sofia Effting", "Rua Exemplo", "123", "Fortaleza", "Bnu city", "SC", "89000-000"));
		System.out.println(saudacao());
		System.out.println(calcArea());
		System.out.println(calcMetrosParaHectares());
		System.out.println(reciclaveis());
		System.out.println(contaAlmoco());
		System.out.println(soma());
		System.out.println(bugigangasQuinquilharias());
		System.out.println(jurosCompostos());
		System.out.println(aritmetica());
		System.out.println(distPontosTerra());
		System.out.println(calcAreaVolume());
		System.out.println(calcAreaTriangulo());
		System.out.println(calcAreaTrianguloLados());
		*/
		System.out.println(calcAreaPoligonoRegular());
	}
	
	// Exerc�cio 1
	public static String imprimirEndereco() {
		System.out.println("Ex. 1 - Endere�o");
		return "Sofia Effting \nRua Exemplo, 123 "+
				"\nFortaleza \nBlumenau - SC \n89000-000";
	}
	
	// Exerc�cio 1 com substitui��o de vari�veis
	public static String imprimirQlqrEnd(String nome, String rua,
			String numCasa, String bairro, String cidade, String uf, String cep) {
		System.out.println("Ex. 1 - Endere�o (mas com substitui��o de vari�veis)");
		return String.format("%s\n%s, %s\n%s\n%s - %s\n%s", nome, rua, 
				numCasa, bairro, cidade, uf, cep);
	}
	
	// Exerc�cio 2
	public static String saudacao() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 2 - Sauda��o");
		System.out.println("Digite seu nome:");
		String nome = ent.nextLine();
		ent.close();
		return String.format("Ol�, %s", nome);
	}
	
	// Exerc�cio 3
	public static String calcArea() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 3 - Calculo da �rea de uma sala");
		System.out.println("Digite a largura:");
		Double larg = ent.nextDouble();
		System.out.println("Digite a profundidade:");
		Double prof = ent.nextDouble();
		ent.close();
		double area = larg * prof;
		return String.format("A �rea da sala � %.2f m2.", area);
	}
	
	// Exerc�cio 4
	public static String calcMetrosParaHectares() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 4 - Calculo da �rea com convers�o para hectar");
		System.out.println("Digite a largura em metros:");
		Double larg = ent.nextDouble();
		System.out.println("Digite a profundidade em metros:");
		Double prof = ent.nextDouble();
		ent.close();
		double areaMetros = larg * prof;
		double areaHectares = areaMetros/10000;
		return String.format("A �rea do terreno em hectares � %f.", areaHectares);
	}
	
	// Exerc�cio 5
	public static String reciclaveis() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 5 - Retorno de recicl�veis");
		System.out.println("Digite a quantidade de vasilhames de at� 1 litro:");
		int vasilhameAte1L = ent.nextInt();
		System.out.println("Digite a quantidade de vasilhames com mais de 1 litro:");
		int vasilhameMais1L = ent.nextInt();
		ent.close();
		Double creditos = vasilhameAte1L * 0.1 + vasilhameMais1L * 0.25;
		return String.format("Valor total de cr�ditos: R$%.2f.", creditos);
		
	}
	
	// Exerc�cio 6
	public static String contaAlmoco() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 5 - Conta do almo�o");
		System.out.println("Digite o valor do prato principal:");
		Double prato = ent.nextDouble();
		System.out.println("Digite o valor do suco:");
		Double suco = ent.nextDouble();
		System.out.println("Digite o valor da sobremesa:");
		Double sobremesa = ent.nextDouble();
		ent.close();
		Double total = prato + sobremesa + suco;
		Double taxa = total * 0.1;
		return String.format("Valor total da conta: R$%.2f", (total+taxa));
	}
	
	// Exerc�cio 7
	public static String soma() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 7 - Soma dos n primeiros n�meros positivos");
		System.out.println("Digite um n�mero inteiro positivo:");
		int num = ent.nextInt();
		ent.close();
		int soma = (num * (num+1))/2;
		return String.format("Soma = %d", soma);
	}
	
	// Exerc�cio 8
	public static String bugigangasQuinquilharias() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ex. 8 - C�lculo peso bugigangas e quinquilharias");
        System.out.println("Digite a quantidade de bugigangas: ");
        int qtdBugigangas = ent.nextInt();
        System.out.println("Digite a quantidade de quinquilharias: ");
        int qtdQuinquilharias = ent.nextInt();
        ent.close();
        int pesoTotal = qtdBugigangas * 75 + qtdQuinquilharias * 112;
        return "O peso total do pedido �: " + pesoTotal + " gramas.";
    }
	
	// Exerc�cio 9
	public static String jurosCompostos() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ex. 9 - C�lculo juros compostos a 12% a.a.");
        System.out.print("Digite o valor inicial depositado na conta: ");
        double valorInicial = ent.nextDouble();
        ent.close();
        double saldoAno1 = valorInicial * Math.pow(1.12, 1);
        double saldoAno2 = valorInicial * Math.pow(1.12, 2);
        double saldoAno3 = valorInicial * Math.pow(1.12, 3);
        return String.format("Saldo ap�s 1 ano: R$ %.2f\nSaldo ap�s 2 anos: R$ %.2f\nSaldo ap�s 3 anos: R$ %.2f\n", 
        saldoAno1, saldoAno2, saldoAno3);
    }
	
	// Exerc�cio 10
	public static String aritmetica() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 10 - Aritm�tica");
		System.out.println("Digite o valor de a:");
		int a = ent.nextInt();
		System.out.println("Digite o valor de b:");
		int b = ent.nextInt();
		ent.close();
		var soma = a+b;
		var dif = a-b;
		var prod = a*b;
		var quoc = a/b;
		var resto = a%b;
		double log = Math.pow(10, a);
		var exp = Math.pow(a, b);
		return String.format("Soma %f, \nDiferen�a %f, \nProduto %f, \nQuociente "
				+ "de a por b %f, \nResto/M�dulo %f, \nLogar�tmo de a %f,"
				+ "\nExponencia��o de a em b %f ", soma, dif, prod, quoc, 
				resto, log, exp);
	}
	
	// Exerc�cio 11
	public static String distPontosTerra() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 11 - Dist�ncia entre dois pontos na terra");
		System.out.print("Digite a latitude do primeiro ponto em graus: ");
        double t1 = ent.nextDouble();
        System.out.print("Digite a longitude do primeiro ponto em graus: ");
        double g1 = ent.nextDouble();
        System.out.print("Digite a latitude do segundo ponto em graus: ");
        double t2 = ent.nextDouble();
        System.out.print("Digite a longitude do segundo ponto em graus: ");
        double g2 = ent.nextDouble();
		ent.close();
		double senT1 = Math.sin(Math.toRadians(t1));
        double senT2 = Math.sin(Math.toRadians(t2));
        double cosT1 = Math.cos(Math.toRadians(t1));
        double cosT2 = Math.cos(Math.toRadians(t2));
        double cosG1G2 = Math.cos(Math.toRadians(g1 - g2));
		double distancia = 6371.01 * Math.acos(senT1 * senT2 + cosT1 * cosT2 * cosG1G2);
		return String.format("A dist�ncia entre os pontos � de %.2f km", distancia);
	}
	
	// Exerc�cio 12
	public static String calcAreaVolume() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ex. 12 - C�lculo �rea e volume");
        System.out.println("Digite o valor do raio: ");
        double raio = ent.nextDouble();
        ent.close();
        double area = Math.PI * raio * raio;
        double volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
        return String.format("Volume da esfera: %.2f\n�rea do c�rculo: %.2f\n", volume, area);
	}
	
	// Exerc�cio 13
	public static String calcAreaTriangulo() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ex. 13 - �rea do Tri�ngulo");
        System.out.print("Digite o valor da base: ");
        double b = ent.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double h = ent.nextDouble();
        ent.close();
        double area = (b * h) / 2.0;
        return String.format("�rea do tri�ngulo: %.2f\n", area);
    }	
	
	// Exerc�cio 14
	public static String calcAreaTrianguloLados() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 14 - C�lculo da �rea de um tri�ngulo pelos lados");
		System.out.println("Digite o tamanho do lado 1:");
		double l1 = ent.nextDouble();
		System.out.println("Digite o tamanho do lado 2:");
		double l2 = ent.nextDouble();
		System.out.println("Digite o tamanho do lado 3:");
		double l3 = ent.nextDouble();
		ent.close();
		double l = (l1+l2+l3)/2;
		double area = Math.sqrt(l*(l-l1)*(l-l2)*(l-l3));
		return String.format("�rea do tri�ngulo: %.2f\n", area);
	}
	
	// Exerc�cio 15
	public static String calcAreaPoligonoRegular() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 15 - C�lculo da �rea de um pol�gono regular");
		System.out.print("Digite o comprimento do lado:");
		double l = ent.nextDouble();
		System.out.println("Digite o n�mero de lados:");
		double n = ent.nextDouble();
		ent.close();
		double area = (n* Math.pow(l,2))/(4*Math.tan(Math.PI/n));
		return String.format("�rea do pol�gono: %.2f", area);
	}
}
