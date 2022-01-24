//salvar como Prog08.java
import javax.swing.*;

class Prog08
{
	public static void soma (int vet[])
	{
		int s=0;
		for (int i = 0; i<vet.length; i++)
		{
			s =s + vet[i];
		}
		JOptionPane.showMessageDialog(null, "A soma e "+ s);
	}
	
	public static int produto (int vet[])
	{
		int p=10;
		
		for (int i = 0; i<vet.length; i++)
		{
			p = p * vet[i];
		}
		
		return p;
	}
	
	public static void main (String entrada[])
	{
		int s=0, vetor[] = {25, 16, 64, 4, 12};
		int r;
		
		soma(vetor);
		r = produto(vetor);
		JOptionPane.showMessageDialog(null, "O produto e "+ r);
		System.exit(0);
	}
}