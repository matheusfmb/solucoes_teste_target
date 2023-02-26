package solucoes_teste_target;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Questao3 {
	/*
	 * 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
		•O menor valor de faturamento ocorrido em um dia do mês;
		•O maior valor de faturamento ocorrido em um dia do mês;
		•Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
	 */
	
	public static void main(String[] args)  {
        JSONArray dadosfaturamento = new JSONArray();
        try {
            JSONParser parser = new JSONParser();
            dadosfaturamento = (JSONArray) parser.parse(new FileReader("src\\dados.json"));
        } catch (Exception e) {
           e.printStackTrace();
        }
     
        // Calcula o menor e o maior valor de faturamento diário
        double menor = 0d;
        double maior = 0d;
        double total = 0d;
        for (Object dados : dadosfaturamento) {
            JSONObject dia = (JSONObject) dados;
            double valor = Double.parseDouble(dia.get("valor").toString());
            if (valor < menor) {
                menor = valor;
            }
            if (valor > maior) {
                maior = valor;
            }
            total += valor;
        }
   
        // Calcula a média mensal de faturamento diário
        double media = total /dadosfaturamento.size();
        
        // Conta o número de dias em que o faturamento foi superior à média mensal
        int cont = 0;
        for (Object dados : dadosfaturamento) {
            JSONObject dia = (JSONObject) dados;
            double valor = Double.parseDouble(dia.get("valor").toString());
            if (valor > media) {
                cont++;
            }
        }
        
        // Imprime os resultados
        System.out.println("Menor valor de faturamento diário: " + menor);
        System.out.println("Maior valor de faturamento diário: " + maior);
        System.out.println("Número de dias com faturamento acima da média mensal: " + cont);
    }
}
