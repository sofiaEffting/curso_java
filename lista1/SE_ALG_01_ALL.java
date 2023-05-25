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
	
	// Exercício 1
	public static String imprimirEndereco() {
		System.out.println("Ex. 1 - Endereço");
		return "Sofia Effting \nRua Exemplo, 123 "+
				"\nFortaleza \nBlumenau - SC \n89000-000";
	}
	
	// Exercício 1 com substituição de variáveis
	public static String imprimirQlqrEnd(String nome, String rua,
			String numCasa, String bairro, String cidade, String uf, String cep) {
		System.out.println("Ex. 1 - Endereço (mas com substituição de variáveis)");
		return String.format("%s\n%s, %s\n%s\n%s - %s\n%s", nome, rua, 
				numCasa, bairro, cidade, uf, cep);
	}
	
	// Exercício 2
	public static String saudacao() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 2 - Saudação");
		System.out.println("Digite seu nome:");
		String nome = ent.nextLine();
		ent.close();
		return String.format("Olá, %s", nome);
	}
	
	// Exercício 3
	public static String calcArea() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 3 - Calculo da área de uma sala");
		System.out.println("Digite a largura:");
		Double larg = ent.nextDouble();
		System.out.println("Digite a profundidade:");
		Double prof = ent.nextDouble();
		ent.close();
		double area = larg * prof;
		return String.format("A área da sala é %.2f m2.", area);
	}
	
	// Exercício 4
	public static String calcMetrosParaHectares() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 4 - Calculo da área com conversão para hectar");
		System.out.println("Digite a largura em metros:");
		Double larg = ent.nextDouble();
		System.out.println("Digite a profundidade em metros:");
		Double prof = ent.nextDouble();
		ent.close();
		double areaMetros = larg * prof;
		double areaHectares = areaMetros/10000;
		return String.format("A área do terreno em hectares é %f.", areaHectares);
	}
	
	// Exercício 5
	public static String reciclaveis() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 5 - Retorno de recicláveis");
		System.out.println("Digite a quantidade de vasilhames de até 1 litro:");
		int vasilhameAte1L = ent.nextInt();
		System.out.println("Digite a quantidade de vasilhames com mais de 1 litro:");
		int vasilhameMais1L = ent.nextInt();
		ent.close();
		Double creditos = vasilhameAte1L * 0.1 + vasilhameMais1L * 0.25;
		return String.format("Valor total de créditos: R$%.2f.", creditos);
		
	}
	
	// Exercício 6
	public static String contaAlmoco() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 5 - Conta do almoço");
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
	
	// Exercício 7
	public static String soma() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 7 - Soma dos n primeiros números positivos");
		System.out.println("Digite um número inteiro positivo:");
		int num = ent.nextInt();
		ent.close();
		int soma = (num * (num+1))/2;
		return String.format("Soma = %d", soma);
	}
	
	// Exercício 8
	public static String bugigangasQuinquilharias() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ex. 8 - Cálculo peso bugigangas e quinquilharias");
        System.out.println("Digite a quantidade de bugigangas: ");
        int qtdBugigangas = ent.nextInt();
        System.out.println("Digite a quantidade de quinquilharias: ");
        int qtdQuinquilharias = ent.nextInt();
        ent.close();
        int pesoTotal = qtdBugigangas * 75 + qtdQuinquilharias * 112;
        return "O peso total do pedido é: " + pesoTotal + " gramas.";
    }
	
	// Exercício 9
	public static String jurosCompostos() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ex. 9 - Cálculo juros compostos a 12% a.a.");
        System.out.print("Digite o valor inicial depositado na conta: ");
        double valorInicial = ent.nextDouble();
        ent.close();
        double saldoAno1 = valorInicial * Math.pow(1.12, 1);
        double saldoAno2 = valorInicial * Math.pow(1.12, 2);
        double saldoAno3 = valorInicial * Math.pow(1.12, 3);
        return String.format("Saldo após 1 ano: R$ %.2f\nSaldo após 2 anos: R$ %.2f\nSaldo após 3 anos: R$ %.2f\n", 
        saldoAno1, saldoAno2, saldoAno3);
    }
	
	// Exercício 10
	public static String aritmetica() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 10 - Aritmética");
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
		return String.format("Soma %f, \nDiferença %f, \nProduto %f, \nQuociente "
				+ "de a por b %f, \nResto/Módulo %f, \nLogarítmo de a %f,"
				+ "\nExponenciação de a em b %f ", soma, dif, prod, quoc, 
				resto, log, exp);
	}
	
	// Exercício 11
	public static String distPontosTerra() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 11 - Distância entre dois pontos na terra");
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
		return String.format("A distância entre os pontos é de %.2f km", distancia);
	}
	
	// Exercício 12
	public static String calcAreaVolume() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ex. 12 - Cálculo área e volume");
        System.out.println("Digite o valor do raio: ");
        double raio = ent.nextDouble();
        ent.close();
        double area = Math.PI * raio * raio;
        double volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
        return String.format("Volume da esfera: %.2f\nÁrea do círculo: %.2f\n", volume, area);
	}
	
	// Exercício 13
	public static String calcAreaTriangulo() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ex. 13 - Área do Triângulo");
        System.out.print("Digite o valor da base: ");
        double b = ent.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double h = ent.nextDouble();
        ent.close();
        double area = (b * h) / 2.0;
        return String.format("Área do triângulo: %.2f\n", area);
    }	
	
	// Exercício 14
	public static String calcAreaTrianguloLados() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 14 - Cálculo da área de um triângulo pelos lados");
		System.out.println("Digite o tamanho do lado 1:");
		double l1 = ent.nextDouble();
		System.out.println("Digite o tamanho do lado 2:");
		double l2 = ent.nextDouble();
		System.out.println("Digite o tamanho do lado 3:");
		double l3 = ent.nextDouble();
		ent.close();
		double l = (l1+l2+l3)/2;
		double area = Math.sqrt(l*(l-l1)*(l-l2)*(l-l3));
		return String.format("Área do triângulo: %.2f\n", area);
	}
	
	// Exercício 15
	public static String calcAreaPoligonoRegular() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ex. 15 - Cálculo da área de um polígono regular");
		System.out.print("Digite o comprimento do lado:");
		double l = ent.nextDouble();
		System.out.println("Digite o número de lados:");
		double n = ent.nextDouble();
		ent.close();
		double area = (n* Math.pow(l,2))/(4*Math.tan(Math.PI/n));
		return String.format("Área do polígono: %.2f", area);
	}
}
