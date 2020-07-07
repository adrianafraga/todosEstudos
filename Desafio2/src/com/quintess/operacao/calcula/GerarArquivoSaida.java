package com.quintess.operacao.calcula;

import com.quintess.operacao.calcula.DadosMercado;
import com.quintess.operacao.calcula.Operacoes;
import com.quintess.operacao.calcula.Resultado;
import com.quintess.operacao.calcula.ResultadoAgrupado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerarArquivoSaida {
	public static void main (String [] args) throws IOException {

		//variáveis
		Boolean teste = false;
		String nomeAnterior = null;
		String nomeAtual = null;
		double soma = 0.00;
		Boolean primeiro = true;

		//caminho do arquivo
		String csvOperacoes = "C://Users//Qintess//Documents//Operacoes.csv";
		BufferedReader conteudoOperacoes = null; //classe que vai ler o arquivo inteiro
		String linha = "";
		String csvSeparadorCampo = ";";


		String csvDadosMercado = "C://Users//Qintess//Documents//DadosMercado.csv" ;
		BufferedReader conteudoDadosMercado = null;
		String linha2 = "";
		String csvSeparadorCampo2 = ";";
		

		DadosMercado dm = new DadosMercado ();
		Operacoes op = new Operacoes ();
		
		String  csvResultadoAgrupado = "C://Users//Qintess//Documents//ResultadoAgrupado.csv";

		
		//criação das listas genéricas;
		List <DadosMercado> listDadosMercado = new ArrayList <>();
		DadosMercado dMer = new DadosMercado();

		List <Operacoes> listOperacoes = new ArrayList <> ();
		Operacoes oper = new Operacoes();

		List <Resultado> listResultado = new ArrayList <Resultado> ();
		
		//criação da lista do resultadoAgrupado		
		List <ResultadoAgrupado> listResultadoAgrupado = new ArrayList <> ();




		try {
			//
			conteudoDadosMercado = new BufferedReader (new FileReader (csvDadosMercado));
			conteudoDadosMercado.readLine();
			while ((linha2 = conteudoDadosMercado.readLine()) != null) {
				String [] colunaVt = linha2.split(csvSeparadorCampo2);

				int idPreco = Integer.parseInt(colunaVt[0]);
				dm.setIdPreco(idPreco);
				int nuPrazoDiasCorridos = Integer.parseInt(colunaVt[1]);
				dm.setNuPrazoDiasCorridos(nuPrazoDiasCorridos);
				float vlPreco = Float.parseFloat(colunaVt[2].replace(',','.'));
				dm.setVlPreco(vlPreco);
				listDadosMercado.add(dm);
				//System.out.println(dm);
			}

			conteudoOperacoes = new BufferedReader (new FileReader (csvOperacoes));
			conteudoOperacoes.readLine();
			while ((linha = conteudoOperacoes.readLine()) != null) {
				String [] colunaVt = linha.split(csvSeparadorCampo);

				//definindo o valor pra variável
				String dtInicio = String.valueOf(colunaVt[1]);
				op.setDtInicio(dtInicio);
				String dtFim = String.valueOf(colunaVt[2]);
				op.setDtFim(dtFim);
				String nmSubproduto =  String.valueOf(colunaVt[9]);
				op.setNmSubproduto(nmSubproduto);
				double quantidade = Double.parseDouble(colunaVt[12].replace(',', '.'));
				op.setQuantidade(quantidade);
				int idPreco = Integer.parseInt(colunaVt[13]);
				op.setIdPreco(idPreco);



				//Declaração das varíaveis data Inicio e Fim , conversão dos dados de String para inteiro
				//calculo do prazo com a função ChronoUnit
				
				
				String dti[] = dtInicio.split("/");
				LocalDate dtInicioLD = LocalDate.of(Integer.parseInt(dti[2]), Integer.parseInt(dti[1]),Integer.parseInt(dti[0]));
				String dtf[] = dtFim.split("/");
				LocalDate dtFimLD  = LocalDate.of(Integer.parseInt(dtf[2]),Integer.parseInt(dtf[1]),Integer.parseInt(dtf[0]));
				//
				long prazo = ChronoUnit.DAYS.between(dtInicioLD, dtFimLD);
				op.setPrazo(prazo);
				listOperacoes.add(op);
				//System.out.println(op);
			}

			//gerar lista resultado
			
			for(Operacoes op1 : listOperacoes) {
				teste = true;
				for (DadosMercado dMer2 : listDadosMercado) {
					if(dMer2.getNuPrazoDiasCorridos()==op1.getPrazo()&& dMer2.getIdPreco()==op1.getIdPreco()) {
						listResultado.add(new Resultado(op1.getNmSubproduto(),op.getQuantidade()*dMer2.getVlPreco()));
						teste = false;
						break;
					} else {
						teste = true;
					}
					
				}
				if (teste == true) {
					listResultado.add(new Resultado(op1.getNmSubproduto(), 0));
				}
				
			}
			
			/*Collections.sort(listResultado);
			for(Resultado resu: listResultado) {
				nomeAnterior = resu.getSuproduto();
				nomeAtual = nomeAnterior;
				soma = resu.getResultado();
				break;
				
			}*/
			//System.out.println(listResultado);
			BufferedWriter escreva = new BufferedWriter(new FileWriter(csvResultadoAgrupado));
			escreva.write("suproduto; resultado\n"); 
			for(Resultado R: listResultado) {
				nomeAtual = R.getSuproduto().toString();
				if(nomeAtual.equals(nomeAnterior)) {
					if(primeiro==false) {
						soma += R.getResultado();
					} else {
						primeiro = false;
					}
				} else {
					escreva.write(nomeAnterior + ";" + String.valueOf(soma)+ "\n");
					soma = R.getResultado();
					nomeAnterior = R.getSuproduto();
				}
			}
			escreva.write(nomeAnterior + ";" + String.valueOf(soma)+ "\n");
			escreva.close();
			
		}catch (Exception e) {
			System.err.printf("Erro: %s.\n", e.getMessage());
		}
	}
			

		/*}
		catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: \n" +e.getMessage());

		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Índice fora dos limites: \n" +e.getMessage());

		}
		catch (IOException e){
			System.out.println("Erro de entrada de dados: \n" +e.getMessage());

		}
		finally {
			if (conteudoOperacoes != null ) {
				try {
					conteudoOperacoes.close();
					conteudoDadosMercado.close();
				}
				catch (IOException e) {
					System.out.println("IO Erro:\n"+e.getMessage());
				}

			}*/
		//}
		
	

		
		
		

	@Override
	public String toString() {
		return "GerarArquivoSaida []";
	}
}

