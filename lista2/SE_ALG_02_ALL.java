package lista2;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SE_ALG_02_ALL {
	
	public static void main(String[] args) {
		//converterDHMSParaSegundos();
		//converterSegundosParaDHMS();
		//getDataHoraAtual();
		//ordenarTresNumeros();
		//calcularTroco();
		//somaDosNumerosDeUmInteiro();
		//separarDigitos();
		//inverterNum();
		//inverterData();
		//numMatricula();
	}
	
	// Exercício 1 
	public static void converterDHMSParaSegundos() {
		Scanner input = new Scanner(System.in);
		System.out.print("Quantidade de dias:");
		int dias = input.nextInt();
		System.out.print("Quantidade de horas:");
		int horas = input.nextInt();
		System.out.print("Quantidade de minutos:");
		int minutos = input.nextInt();
		System.out.print("Quantidade de segundos:");
		int segundos = input.nextInt();
		input.close();
		double tempo_total = segundos + minutos * 60 + horas * 3600
				+ dias * 86400;
		System.out.println("Tempo em segundos:" + tempo_total);
	}
	
	// Exercício 2
	public static void converterSegundosParaDHMS() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o tempo em segundos:");
		int segundos = input.nextInt();
		input.close();
		int dia = (int) (segundos / 86400);
	    segundos %= 86400;
	    int hora = (int) (segundos / 3600);
	    segundos %= 3600;
	    int minuto = (int) (segundos / 60);
	    segundos %= 60;
	    System.out.printf("%02d : %02d : %02d : %02d", dia, hora, minuto, segundos);
	}
	
	// Exercício 3
	public static void getDataHoraAtual() {
		LocalDateTime dataHoraAtual = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = dataHoraAtual.format(formatador);
        System.out.println("Data e hora atuais: " + dataHoraFormatada);
	}
	
	// Exercício 4
	public static void ordenarTresNumeros() {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = input.nextInt();
        input.close();

        int menor = Math.min(Math.min(num1, num2), num3);
        int maior = Math.max(Math.max(num1, num2), num3);
        int meio = num1 + num2 + num3 - maior - menor;

        System.out.println("Números ordenados: " + menor + ", " + meio + ", " + maior);
	}
	
	// Exercício 5
	public static void calcularTroco() {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de centavos de troco: ");
        int troco = input.nextInt();
        input.close();

        int moedas50 = troco / 50;
        troco = troco % 50;
        int moedas25 = troco / 25;
        troco = troco % 25;
        int moedas10 = troco / 10;
        troco = troco % 10;
        int moedas5 = troco / 5;
        troco = troco % 5;
        int moedas1 = troco;

        System.out.println("Moedas de 50 centavos: " + moedas50);
        System.out.println("Moedas de 25 centavos: " + moedas25);
        System.out.println("Moedas de 10 centavos: " + moedas10);
        System.out.println("Moedas de 5 centavos: " + moedas5);
        System.out.println("Moedas de 1 centavo: " + moedas1);
	}
	
	//Exercício 6
	public static void somaDosNumerosDeUmInteiro() {
		Scanner input = new Scanner(System.in);
	    System.out.print("Digite um número inteiro de 4 dígitos: ");
        int numero = input.nextInt();
        input.close();
        int digito1 = numero / 1000;
        int digito2 = (numero / 100) % 10;
        int digito3 = (numero / 10) % 10;
        int digito4 = numero % 10;
        int soma = digito1 + digito2 + digito3 + digito4;
        System.out.println("A soma dos dígitos é: " + soma);
	}
	
	// Exercício 7
	public static void separarDigitos() {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite um número de três dígitos: ");
        int numero = input.nextInt();
        input.close();

        int centena = numero / 100;
        int dezena = (numero / 10) % 10;
        int unidade = numero % 10;

        System.out.println("Centena: " + centena);
        System.out.println("Dezena: " + dezena);
        System.out.println("Unidade: " + unidade);
	}
	
	// Exercício 8
	public static void inverterNum() {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite um número de três dígitos: ");
        int numero = input.nextInt();
        input.close();

        int centena = numero / 100;
        int dezena = (numero / 10) % 10;
        int unidade = numero % 10;

        int novoNumero = unidade * 100 + dezena * 10 + centena;
        System.out.println("O número invertido é: " + novoNumero);
	}
	
	// Exercício 9
	public static void inverterData() {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite uma data no formato DDMMAA: ");
        int data = input.nextInt();
        input.close();
        
        int dia = (data / 10000);
        int mes = (data / 100) % 100;
        int ano = data % 100;
   
        int novaData = ano * 10000 + mes * 100 + dia;
        System.out.println("A data invertida é: " + novaData);
	}
	
	// Exercício 10
	public static void numMatricula() {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite o número de matrícula: ");
        int matricula = input.nextInt();
        input.close();
        
        int ano = (matricula / 10000);
        int semestre = (matricula / 1000) % 10;
        
        System.out.println("Ano: " + ano);
        System.out.println("Semestre: " + semestre);

	}
	
}