package solucoes_teste_target;

public class Questao4 {
	
	public static void main(String []args) {
		//4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
		//Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;
		double total = sp+rj+mg+es+outros;
		
		double pSp = (sp / total) * 100;
        double pRj = (rj / total) * 100;
        double pMg = (mg / total) * 100;
        double pEs = (es / total) * 100;
        double pOutros = (outros / total) * 100;
		
        System.out.printf("SP = %.2f%%\n", pSp);
        System.out.printf("RJ = %.2f%%\n", pRj);
        System.out.printf("MG = %.2f%%\n", pMg);
        System.out.printf("ES = %.2f%%\n", pEs);
        System.out.printf("Outros = %.2f%%\n", pOutros);
	}
}
