package chapter6;


public class TrabalhandoComStrings {

		public static void main(String[] args) {
			//utilizandoString();
			utilizandoStringBuffer();
			utilizandoStringBuilder();
		}

		private static void utilizandoString() {
			String mensagem = " O dia está claro";
			System.out.println("Mensagem:" + mensagem);
			System.out.println("Quantidade de caracteres na \"mensagem\":" + mensagem.trim().length());
			System.out.println("--------------------------------------------------------------");
			System.out.println("Utilizando as funções:");
			System.out.println("charAt()      - concat()      - equalsIgnoreCase() - length() ");
			System.out.println("replace()     - substring()   - toLowerCase()      - toString()");
			System.out.println("toUpperCase() - trim()");
			System.out.println("--------------------------------------------------------------");
			
			String mensagemPos = "Trabalhando com Strings";
			System.out.println(mensagemPos);

			// charAt()
			System.out.println("Caractere na posição 3 da mensagem acima: " + mensagemPos.charAt(3));
			String mensagemConc = " e concatenando.";

			// concat()
			System.out.println("Concatenando as duas mensagens: " + mensagemPos.concat(mensagemConc));
			
			// equalsIgnoreCase()
			String msg1 = "O DIA ESTA CLARO";
			String msg2 = "o dia esta claro";
			System.out.println("Mensagem 1: " + msg1 + " --- Mensagem 2: " +  msg2);
			System.out.println("Mensagens iguais sem levar em consideração a caixa?: " + msg1.equalsIgnoreCase(msg2));
			
			// length()
			String teste = "Tamanho";
			System.out.println("Testando o tamanho da string: " + teste + " ---- Tamanho: " + teste.length());
			
			// replace()
			String palavra1 = "Para o dia nascer feliz";
			String palavra2 = palavra1.replace('a', 'A');
			System.out.println("String original:" + palavra1 + "--- String nova:" + palavra2);
			
			// substring()
			String string1 = "Fazendo um teste de substring";
			String string2 = string1.substring(2);
			String string3 = string1.substring(2, 6);
			System.out.println("String original: " + string1);
			System.out.println("Utilizando substring(2) na string original:" + string2);
			System.out.println("Utilizando substring(2,6) na string original:" + string3);
			
			// toLowerCase()
			String testeCaixa = "String original";
			String testeCaixaBaixa = testeCaixa.toLowerCase();
			System.out.println("String original: " + testeCaixa + "---String em caixa baixa: " + testeCaixaBaixa);

			// toLowerCase()
			String testeCaixa2 = "String original2";
			String testeCaixaAlta = testeCaixa.toUpperCase();
			System.out.println("String original: " + testeCaixa2 + "---String em caixa alta: " + testeCaixaAlta);

			// trim()
			String testeStringComEspacos = "    teste com espaços    ";
			String novaStringSemEspacos = testeStringComEspacos.trim();
			System.out.println("String original: " + testeStringComEspacos + "--- String sem espaços: " + novaStringSemEspacos);			
						
		}

		private static void utilizandoStringBuffer() {
			StringBuffer sb = new StringBuffer("Testando String Buffer");
			System.out.println(sb);
			sb.append(2);
			System.out.println(sb);
			
			
			StringBuffer sb2 = new StringBuffer("Testando insert.");
			sb2.insert(0, "AQUI");
			System.out.println(sb2);
			
			sb2.delete(0, 4);
			System.out.println(sb2);
			
			sb2.reverse();
			System.out.println(sb2);
			
			StringBuffer sb3 = new StringBuffer("TESTANDO");
			sb3.replace(1,5,"L");
			System.out.println(sb3.toString());
		}

		private static void utilizandoStringBuilder() {
			// idem ao StringBuffer mas é mais rápido pois não é Thread Safe
		}
		
}
