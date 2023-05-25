package lista3;

import java.util.Scanner;
import java.lang.Math;

public class SE_ALG_03_ALL {

	public static void main(String[] args) {
		anoBissexto();
	}
	
	// Exerc�cio 1
	public static void verificarImparOuPar() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		int num = input.nextInt();
		input.close();
		if (num % 2 == 0) {
			System.out.println("O n�mero � par");
		} else {
			System.out.println("O n�mero � �mpar");
		}
	}
	
	// Exerc�cio 2
	public static void calcularAnosCaninos() {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite a idade do cachorro em anos cronol�gicos: ");
        int idade = input.nextInt();
        input.close();

        if (idade < 0) {
            System.out.println("Erro: idade inv�lida.");
        } else if (idade == 0) {
            System.out.println("A idade do cachorro em anos caninos � 0 anos.");
        } else if (idade == 1) {
            System.out.println("A idade do cachorro em anos caninos � 10.5 anos.");
        } else if (idade == 2) {
            System.out.println("A idade do cachorro em anos caninos � 21 anos.");
        } else {
            int anosCaninos = 21;
            anosCaninos += (idade - 2) * 4;
            System.out.println("A idade do cachorro em anos caninos � " + anosCaninos + " anos.");
        }
	}
	
	// Exerc�cio 3
	public static void vogalOuConsoante() {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite uma letra do alfabeto: ");
        char letra = input.next().charAt(0);
        input.close();
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra digitada � uma vogal.");
        } else {
            System.out.println("A letra digitada � uma consoante.");
        }
	}
	
	// Exerc�cio 4
	public static void nomePoligonoRegular() {
		Scanner input = new Scanner(System.in);
        System.out.print("Informe a quantidade de lados do pol�gono (de 3 a 10): ");
        int numLados = input.nextInt();
        input.close();

        String nomePoligono;
        switch(numLados) {
            case 3:
                nomePoligono = "Tri�ngulo";
                break;
            case 4:
                nomePoligono = "Quadrado";
                break;
            case 5:
                nomePoligono = "Pent�gono";
                break;
            case 6:
                nomePoligono = "Hex�gono";
                break;
            case 7:
                nomePoligono = "Hept�gono";
                break;
            case 8:
                nomePoligono = "Oct�gono";
                break;
            case 9:
                nomePoligono = "Ene�gono";
                break;
            case 10:
                nomePoligono = "Dec�gono";
                break;
            default:
                System.out.println("N�mero inv�lido de lados.");
                return;
        }
        
        System.out.println("O pol�gono � um " + nomePoligono + ".");
	}
	
	// Exerc�cio 5
	public static void qtdeDiasMes() {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do m�s: ");
        String mes = input.nextLine().toLowerCase(); 
        input.close();
        int dias;
        switch(mes) {
            case "janeiro":
            case "mar�o":
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
                dias = -1; // valor inv�lido
        }
        
        if(dias == -1) {
            System.out.println("M�s inv�lido.");
        } else if(dias == 28) {
        	System.out.println("Fevereiro tem 28 ou 29 dias.");
        } else {
            System.out.println(mes + " tem " + dias + " dias.");
        }
	}
	
	// Exerc�cio 6
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
            System.out.println("O tri�ngulo � equil�tero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O tri�ngulo � is�inputeles");
        } else {
            System.out.println("O tri�ngulo � einputaleno");
        }

	}
	
	// Exerc�cio 7
	public static void classificarDecibeis() {
		
		int decibeis;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o n�vel de volume em decib�is: ");
        decibeis = input.nextInt();
        input.close();

        if (decibeis < 40) {
            System.out.println("O n�vel de volume est� abaixo do limite de uma sala silenciosa.");
        } else if (decibeis >= 40 && decibeis < 70) {
            System.out.println("O n�vel de volume est� entre uma sala silenciosa e um despertador.");
        } else if (decibeis == 70) {
            System.out.println("O n�vel de volume corresponde a um despertador.");
        } else if (decibeis > 70 && decibeis < 106) {
            System.out.println("O n�vel de volume est� entre um despertador e um cortador de grama.");
        } else if (decibeis == 106) {
            System.out.println("O n�vel de volume corresponde a um cortador de grama.");
        } else if (decibeis > 106 && decibeis < 130) {
            System.out.println("O n�vel de volume est� entre um cortador de grama e uma britadeira.");
        } else if (decibeis == 130) {
            System.out.println("O n�vel de volume corresponde a uma britadeira.");
        } else {
            System.out.println("O n�vel de volume est� acima do limite de uma britadeira.");
        }
	}
	
	// Exerc�cio 8
	public static void freqNotaOitava() {
	
		Scanner input = new Scanner(System.in);
	    System.out.print("Digite o nome da nota musical (ex: C4): ");
	    String nomeNota = input.nextLine();
	    input.close();
	
	    // extrai o caractere da nota e da oitava
	    char nota = nomeNota.charAt(0);
	    int oitava = Integer.parseInt(nomeNota.substring(1));
	
	    // obt�m a frequ�ncia da nota da oitava 4
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
	            System.out.println("Nota inv�lida.");
	            return;
	    }
	
	    // calcula a frequ�ncia da nota na oitava desejada
	    double frequencia = freqNotaOitava4 / Math.pow(2, 4 - oitava);
	
	    System.out.println("A frequ�ncia da nota " + nomeNota + " � " + frequencia + " Hz.");
	}
	
	// Exerc�cio 9
	public static void feriadosNacionais() {
		Scanner input = new Scanner(System.in);
	    
	    System.out.print("Digite o m�s (em n�mero): ");
	    int mes = input.nextInt();
	    
	    System.out.print("Digite o dia: ");
	    int dia = input.nextInt();
	    
	    if (mes == 1 && dia == 1) {
	        System.out.println("Confraterniza��o Universal");
	    } else if (mes == 4 && dia == 21) {
	        System.out.println("Tiradentes");
	    } else if (mes == 5 && dia == 1) {
	        System.out.println("Dia do Trabalho");
	    } else if (mes == 9 && dia == 7) {
	        System.out.println("Independ�ncia do Brasil");
	    } else if (mes == 10 && dia == 12) {
	        System.out.println("Nossa Senhora Aparecida");
	    } else if (mes == 11 && dia == 2) {
	        System.out.println("Finados");
	    } else if (mes == 11 && dia == 15) {
	        System.out.println("Proclama��o da Rep�blica");
	    } else if (mes == 12 && dia == 25) {
	        System.out.println("Natal");
	    } else {
	        System.out.println("O dia e o m�s informados n�o correspondem a um feriado nacional.");
	    }
	    
	    input.close();
	}
	
	// Exerc�cio 10 
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
				System.out.println("O quadrado � branco");
			} else {
				System.out.println("O quadrado � preto");
			}
		} else {
			if (linha % 2 == 0) {
				System.out.println("O quadrado � preto");
			} else {
				System.out.println("O quadrado � branco");
			}
		}
	}
	
	// Exerc�cio 11
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
			System.out.printf("A equa��o tem 2 ra�zes:", Double.toString(raiz1), " e ", Double.toString(raiz2));
		} else if (delta == 0) {
			double raiz1 = (-b + Math.sqrt(delta))/(2*a);
			System.out.printf("A equa��o tem 1 ra�z:", Double.toString(raiz1));
		} else {
			System.out.println("A equa��o n�o tem ra�zes");
		}
	}
	
	// Exerc�cio 12
	public static void anoBissexto() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um ano:");
		int ano = input.nextInt();
		if (ano % 400 == 0) {
			System.out.println("� ano bissexto");		
		} else if (ano % 100 == 0) {
			System.out.println("N�o � ano bissexto");
		} else if (ano % 4 == 0) {
			System.out.println("� ano bissexto");
		} else {
			System.out.println("N�o � ano bissexto");
		}
		input.close();
	}
}