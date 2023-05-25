package lista4;

import java.util.Scanner;

public class SE_Alg_04_ALL {

	public static void main(String[] args) {
		//mediaAritmetica();
		//tabelaDescontos();
		//converterTemp();
		//perimetroPoligono();
		valorEntradas();
	}
	
	public static void mediaAritmetica() {
		Scanner input = new Scanner(System.in);
		int i = 0;
		double soma = 0;
		while (true) {
			System.out.println("Digite um número:");
			double num = input.nextDouble();
			if (num == 0) {
				break;
			} else {
				soma += num;
				i++;	
			}
		}
		double media = soma / i;
		System.out.println(media);
		input.close();
	}
	
	public static void tabelaDescontos() {
		double[] precosOriginais = {4.95, 9.95, 14.95, 19.95, 24.95};
        double desconto = 0.6;
        System.out.println("Preço Original\tDesconto\tNovo Preço");
        System.out.println("--------------------------------------------");
        for (double preco : precosOriginais) {
            double valorDesconto = preco * desconto;
            double novoPreco = preco - valorDesconto;

            System.out.printf("%.2f\t\t%.2f\t\t%.2f\n", preco, valorDesconto, novoPreco);
        }
	}
	
	public static void converterTemp() {
		System.out.println("Celsius\t\tFahrenheit");
		for (int i = 0; i <= 100; i+=10) {
			double celsius = i;
			double fahrenheit = (celsius * 9/5) + 32;
			System.out.printf("%.0f\t\t%.0f\n", celsius, fahrenheit);
		}
	}
	
	public static void perimetroPoligono() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a coordenada x de um ponto:");
		double x0 = input.nextDouble();
		System.out.println("Digite a coordenada y de um ponto:");
		double y0 = input.nextDouble();
		
		double x_ant = x0;
		double y_ant = y0;
		
		double perimetro = 0;
		
		input.nextLine(); // consome o /n deixado no buffer pelo nextDouble
		
		while (true) {
			System.out.println("Digite a coordenada x de um ponto (enter para sair):");
			String resp = input.nextLine().trim();

			if (resp.isEmpty()) {
				perimetro += Math.sqrt(Math.pow(x0 - x_ant, 2) + Math.pow(y0-y_ant, 2));
				break;
			}
			
			double x_atual = Double.parseDouble(resp);
			System.out.println("Digite a coordenada y de um ponto: ");
			double y_atual = input.nextDouble();
			
			input.nextLine(); // consome o /n deixado no buffer pelo nextDouble
			
			perimetro += Math.sqrt(Math.pow(x_atual - x_ant, 2) + Math.pow(y_atual-y_ant, 2));
			
			x_ant = x_atual;
			y_ant = y_atual;
		}

		System.out.println(perimetro);
		input.close();
	}
	
	public static void valorEntradas() {
		Scanner input = new Scanner(System.in);

        int idade;
        double precoTotal = 0.0;

        while (true) {
            System.out.println("Digite a idade do visitante (ou deixe em branco para sair):");
            String resp = input.nextLine().trim();

            if (resp.isEmpty()) {
                break;
            }

            idade = Integer.parseInt(resp);
            double precoEntrada;

            if (idade <= 2) {
                precoEntrada = 0.0;
            } else if (idade >= 3 && idade <= 12) {
                precoEntrada = 14.0;
            } else if (idade >= 65) {
                precoEntrada = 18.0;
            } else {
                precoEntrada = 23.0;
            }

            precoTotal += precoEntrada;
        }

        System.out.printf("O preço total das entradas para o grupo é: R$ %.2f%n", precoTotal);
        input.close();
	}
	
	public static void bitParidade() {
		Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Digite uma sequência de 8 bits (ou deixe em branco para sair):");
            String resp = input.nextLine().trim();

            if (resp.isEmpty()) {
                break;
            }

            if (resp.length() != 8 || !validarBits(resp)) {
                System.out.println("Erro: A sequência deve conter exatamente 8 bits (0 ou 1).");
                continue;
            }

            int quantidadeUns = 0;
            for (char c : resp.toCharArray()) {
                if (c == '1') {
                    quantidadeUns++;
                }
            }

            if (quantidadeUns % 2 == 0) {
                System.out.println("Bit de paridade: 0");
            } else {
                System.out.println("Bit de paridade: 1");
            }
        }
	}
	
	private static boolean validarBits(String input) {
        for (char c : input.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
	
	public static void aproximacaoPi() {
		double pi = 3.0; // Primeira aproximação: 3
	
	    for (int i = 2; i <= 30; i += 2) {
	        double termo = 4.0 / (i * (i + 1) * (i + 2));
	        
	        if (i % 4 == 0) {
	            pi += termo;
	        } else {
	            pi -= termo;
	        }
	
	        System.out.printf("Aproximação %2d de π: %.15f%n", i / 2, pi);
	    }
	}
	
	public static void cifraCesar() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a mensagem:");
        String mensagem = scanner.nextLine();

        System.out.println("Digite a distância de deslocamento das letras:");
        int deslocamento = scanner.nextInt();

        String mensagemCodificada = codificarMensagem(mensagem, deslocamento);
        System.out.println("Mensagem codificada: " + mensagemCodificada);

        String mensagemDecodificada = codificarMensagem(mensagemCodificada, -deslocamento);
        System.out.println("Mensagem decodificada: " + mensagemDecodificada);
        
    }
	}
	
	
}