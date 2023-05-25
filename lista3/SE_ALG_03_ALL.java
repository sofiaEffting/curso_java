package lista3;

import java.util.Scanner;
import java.lang.Math;

public class SE_ALG_03_ALL {

	public static void main(String[] args) {
		anoBissexto();
	}
	
	// Exercício 1
	public static void verificarImparOuPar() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int num = input.nextInt();
		input.close();
		if (num % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é ímpar");
		}
	}
	
	// Exercício 2
	public static void calcularAnosCaninos() {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite a idade do cachorro em anos cronológicos: ");
        int idade = input.nextInt();
        input.close();

        if (idade < 0) {
            System.out.println("Erro: idade inválida.");
        } else if (idade == 0) {
            System.out.println("A idade do cachorro em anos caninos é 0 anos.");
        } else if (idade == 1) {
            System.out.println("A idade do cachorro em anos caninos é 10.5 anos.");
        } else if (idade == 2) {
            System.out.println("A idade do cachorro em anos caninos é 21 anos.");
        } else {
            int anosCaninos = 21;
            anosCaninos += (idade - 2) * 4;
            System.out.println("A idade do cachorro em anos caninos é " + anosCaninos + " anos.");
        }
	}
	
	// Exercício 3
	public static void vogalOuConsoante() {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite uma letra do alfabeto: ");
        char letra = input.next().charAt(0);
        input.close();
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra digitada é uma vogal.");
        } else {
            System.out.println("A letra digitada é uma consoante.");
        }
	}
	
	// Exercício 4
	public static void nomePoligonoRegular() {
		Scanner input = new Scanner(System.in);
        System.out.print("Informe a quantidade de lados do polígono (de 3 a 10): ");
        int numLados = input.nextInt();
        input.close();

        String nomePoligono;
        switch(numLados) {
            case 3:
                nomePoligono = "Triângulo";
                break;
            case 4:
                nomePoligono = "Quadrado";
                break;
            case 5:
                nomePoligono = "Pentágono";
                break;
            case 6:
                nomePoligono = "Hexágono";
                break;
            case 7:
                nomePoligono = "Heptágono";
                break;
            case 8:
                nomePoligono = "Octógono";
                break;
            case 9:
                nomePoligono = "Eneágono";
                break;
            case 10:
                nomePoligono = "Decágono";
                break;
            default:
                System.out.println("Número inválido de lados.");
                return;
        }
        
        System.out.println("O polígono é um " + nomePoligono + ".");
	}
	
	// Exercício 5
	public static void qtdeDiasMes() {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do mês: ");
        String mes = input.nextLine().toLowerCase(); 
        input.close();
        int dias;
        switch(mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                dias = 31;
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                dias = 30;
                break;
            case "fevereiro":
                dias = 28;
                break;
            default:
                dias = -1; // valor inválido
        }
        
        if(dias == -1) {
            System.out.println("Mês inválido.");
        } else if(dias == 28) {
        	System.out.println("Fevereiro tem 28 ou 29 dias.");
        } else {
            System.out.println(mes + " tem " + dias + " dias.");
        }
	}
	
	// Exercício 6
	public static void classificarTriangulo() {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite o comprimento do lado 1: ");
        double lado1 = input.nextDouble();
        System.out.print("Digite o comprimento do lado 2: ");
        double lado2 = input.nextDouble();
        System.out.print("Digite o comprimento do lado 3: ");
        double lado3 = input.nextDouble();
        input.close();

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("O triângulo é equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triângulo é isóinputeles");
        } else {
            System.out.println("O triângulo é einputaleno");
        }

	}
	
	// Exercício 7
	public static void classificarDecibeis() {
		
		int decibeis;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nível de volume em decibéis: ");
        decibeis = input.nextInt();
        input.close();

        if (decibeis < 40) {
            System.out.println("O nível de volume está abaixo do limite de uma sala silenciosa.");
        } else if (decibeis >= 40 && decibeis < 70) {
            System.out.println("O nível de volume está entre uma sala silenciosa e um despertador.");
        } else if (decibeis == 70) {
            System.out.println("O nível de volume corresponde a um despertador.");
        } else if (decibeis > 70 && decibeis < 106) {
            System.out.println("O nível de volume está entre um despertador e um cortador de grama.");
        } else if (decibeis == 106) {
            System.out.println("O nível de volume corresponde a um cortador de grama.");
        } else if (decibeis > 106 && decibeis < 130) {
            System.out.println("O nível de volume está entre um cortador de grama e uma britadeira.");
        } else if (decibeis == 130) {
            System.out.println("O nível de volume corresponde a uma britadeira.");
        } else {
            System.out.println("O nível de volume está acima do limite de uma britadeira.");
        }
	}
	
	// Exercício 8
	public static void freqNotaOitava() {
	
		Scanner input = new Scanner(System.in);
	    System.out.print("Digite o nome da nota musical (ex: C4): ");
	    String nomeNota = input.nextLine();
	    input.close();
	
	    // extrai o caractere da nota e da oitava
	    char nota = nomeNota.charAt(0);
	    int oitava = Integer.parseInt(nomeNota.substring(1));
	
	    // obtém a frequência da nota da oitava 4
	    double freqNotaOitava4 = 0;
	    switch (nota) {
	        case 'C':
	            freqNotaOitava4 = 261.63;
	            break;
	        case 'D':
	            freqNotaOitava4 = 293.66;
	            break;
	        case 'E':
	            freqNotaOitava4 = 329.63;
	            break;
	        case 'F':
	            freqNotaOitava4 = 349.23;
	            break;
	        case 'G':
	            freqNotaOitava4 = 392.00;
	            break;
	        case 'A':
	            freqNotaOitava4 = 440.00;
	            break;
	        case 'B':
	            freqNotaOitava4 = 493.88;
	            break;
	        default:
	            System.out.println("Nota inválida.");
	            return;
	    }
	
	    // calcula a frequência da nota na oitava desejada
	    double frequencia = freqNotaOitava4 / Math.pow(2, 4 - oitava);
	
	    System.out.println("A frequência da nota " + nomeNota + " é " + frequencia + " Hz.");
	}
	
	// Exercício 9
	public static void feriadosNacionais() {
		Scanner input = new Scanner(System.in);
	    
	    System.out.print("Digite o mês (em número): ");
	    int mes = input.nextInt();
	    
	    System.out.print("Digite o dia: ");
	    int dia = input.nextInt();
	    
	    if (mes == 1 && dia == 1) {
	        System.out.println("Confraternização Universal");
	    } else if (mes == 4 && dia == 21) {
	        System.out.println("Tiradentes");
	    } else if (mes == 5 && dia == 1) {
	        System.out.println("Dia do Trabalho");
	    } else if (mes == 9 && dia == 7) {
	        System.out.println("Independência do Brasil");
	    } else if (mes == 10 && dia == 12) {
	        System.out.println("Nossa Senhora Aparecida");
	    } else if (mes == 11 && dia == 2) {
	        System.out.println("Finados");
	    } else if (mes == 11 && dia == 15) {
	        System.out.println("Proclamação da República");
	    } else if (mes == 12 && dia == 25) {
	        System.out.println("Natal");
	    } else {
	        System.out.println("O dia e o mês informados não correspondem a um feriado nacional.");
	    }
	    
	    input.close();
	}
	
	// Exercício 10 
	public static void corDaCasaTabuleiro() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor de uma casa: (Ex. a1)");
		String quad = input.nextLine();
		input.close();
		char[] colunas_pretas = {'a', 'c', 'e', 'g'};
		char coluna = quad.charAt(0);
		char linha = quad.charAt(1);
		boolean encontrado = false;
		for (char c : colunas_pretas) {
			if (c == coluna) {
				encontrado = true;
				break;
			}
		}
		if (encontrado) {
			if (linha % 2 == 0) {
				System.out.println("O quadrado é branco");
			} else {
				System.out.println("O quadrado é preto");
			}
		} else {
			if (linha % 2 == 0) {
				System.out.println("O quadrado é preto");
			} else {
				System.out.println("O quadrado é branco");
			}
		}
	}
	
	// Exercício 11
	public static void raizesEquacao() {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close();
		double delta = Math.pow(b, 2)-4*a*c;
		if (delta > 0) {
			double raiz1 = (-b + Math.sqrt(delta))/(2*a);
			double raiz2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.printf("A equação tem 2 raízes:", Double.toString(raiz1), " e ", Double.toString(raiz2));
		} else if (delta == 0) {
			double raiz1 = (-b + Math.sqrt(delta))/(2*a);
			System.out.printf("A equação tem 1 raíz:", Double.toString(raiz1));
		} else {
			System.out.println("A equação não tem raízes");
		}
	}
	
	// Exercício 12
	public static void anoBissexto() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um ano:");
		int ano = input.nextInt();
		if (ano % 400 == 0) {
			System.out.println("É ano bissexto");		
		} else if (ano % 100 == 0) {
			System.out.println("Não é ano bissexto");
		} else if (ano % 4 == 0) {
			System.out.println("É ano bissexto");
		} else {
			System.out.println("Não é ano bissexto");
		}
		input.close();
	}
}