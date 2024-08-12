package estrutura_de_dados;

public class Recursividade_3 
{
	
	public Recursividade_3()
	{
		super();
	}
	
	public int fatorial(int n)
	{
		//Quando n for igual a 1, deve retornar o próprio valor para finalizar o fatorial e realizar as multiplicações.
		if (n == 1 || n == 0)
		{
			return 1;
		}
		
		//A variável n mutiplica (n - 1) e retorna o valor até chegar na condição acima.
		else 
		{
			return n * fatorial(n - 1);
		}
	}
}
