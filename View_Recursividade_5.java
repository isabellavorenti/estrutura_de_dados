package estrutura_de_dados;

import javax.swing.JOptionPane;

public class View_Recursividade_5 {

	public static void main(String[] args) 
	{
		Recursividade_5 funcao = new Recursividade_5();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		double total = 0;
		double somatoria = funcao.Somatoria(n, total);
		System.out.println(somatoria);
	}

}
