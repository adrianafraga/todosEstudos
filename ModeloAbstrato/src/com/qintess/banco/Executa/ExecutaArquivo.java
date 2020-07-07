package com.qintess.banco.Executa;

import java.io.File;
import java.io.FileNotFoundException;

// import relacionado ao Scanner
import java.util.Scanner;

// imports dos pacotes
import com.qintess.banco.modelo.Cliente;
import com.qintess.banco.modelo.ContaCorrente;

public class ExecutaArquivo {
	
	public static void main (String [] args) throws FileNotFoundException {

		
		// Exemplo  do uso do scanner para digitar
//		Scanner teclado = new Scanner (System.in);
//		
//		System.out.println("Digitar idade do usuário:");
//		int idade = teclado.nextInt(); //bug next, tem que por o nextline
//		sc.nextLine();
//		System.out.println("Idade do usuário é" + idade +  "anos");
		
		File arquivo =  new File ("C:\\Users\\Qintess\\eclipse-workspace\\ModeloAbstrato\\contas.txt"); ///file relacionado ao java.io
		try (Scanner arq = new Scanner (arquivo)) {
			while (arq.hasNextLine()) {
				System.out.println(arq.nextLine()); //imprimir a leitura
				//String[] colunas = arq.nextLine().split(";");
				
					
			//TAREFA: transformar cada uma das linhas em conta corrente
			// não está funcionando

/*	String nome = colunas[4];
			String cpf = colunas [5];
			Cliente clinte = new Cliente (nome,cpf);
			ContaCorrente cc = new ContaCorrente(cliente, 0.0);
			cc.setAgencia(Integer.parseInt(colunas[0]));
			cc.setNumero(Integer.parseInt(colunas[1]));
			cc.setDigito(Integer.parseInt(colunas[2]));
			cc.setSaldo(Double.parseDouble(colunas[3].replace(',', '.')));
			
			*/
			
			//while (true) não para
			}
			//vetor - for (indexadores) - 
			//são imutáveis
		}
		
		//int[ idades = {,1,2,3,4,5}
		
		//lenght quantas casas ele tem]
}		//for (int i = 0; i < idades.length; i++) {
	
	//split recebe o delimitador
	
	
	//TAREFA: transformar cada uma das linhas em conta corrente
	
	//ContaCorrente cc = new ContaCorrente (new Cliente ("", ""), 0.0);
	
	
	//transformar String em sua variável declarada
	//cc.setAgencia (colunas[0]);
	//Double.parseDouble(s);
	//Integer.parseInt(s);
	//colunas
	
	
}


