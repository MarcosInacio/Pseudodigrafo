/**
 * 
 */
package algoritmosGrafos;

import java.util.ArrayList;

/**
 * @author MarcosInacio
 *
 */

/*
 * Pseudodigrafo:
 * 
 * V É UM CONJUNTO DE VERTICES OU NÓS
 * E É UM MULTICONJUNTO DE PARES NÃO-ORDENADOS DE VERTICES
 * LAÇO É UMA ARESTA QUE CONECTA UM VERTICE A ELE MESMO
 * 
 * LISTA DE ADJACÊNCIA É UMA LISTA DE TODOS OS OUTROS VERTICES COM OS QUAIS ELE TEM UMA ARESTA
 */

public class Pseudodigrafo 
{
	private int nos;
	private ArrayList<Integer> vertice;
	private ArrayList<String> nomeVertice;
	private ArrayList<Integer> listaAdjacencia;
	private ArrayList<Integer> lista;
	
	//Para entrada pré-definida de nós
	public Pseudodigrafo()
	{
		nos = 6;
		vertice = new ArrayList<Integer>();
		listaAdjacencia = new ArrayList<Integer>();
		nomeVertice = new ArrayList<String>();
	}
	
	//colocar a quantidade de nós em cada posição do arrayList
	public void formarVertices()
	{
		int contador = 0;
		for(int i = 0; i < nos; i++)
		{
			char c = (char) (97 + i);
			vertice.add(i);
			nomeVertice.add(""+c); //gerando o nome do vertice a partir do caracter 'a' da tabela ascii
			criarListaAdjacencia();
		}
	}
	
	public void criarListaAdjacencia()
	{
		for(int i = 0; i < vertice.size(); i++)
		{
			lista = new ArrayList<Integer>();
			lista.add(vertice.get(i));
		}
	}
	
	public ArrayList<Integer> getLista()
	{
		return lista;
	}
	
	public void adicionarAresta(Integer a, Integer b)
	{
		if(vertice.contains(a) && (vertice.contains(b)))
		{
			listaAdjacencia.add(b);
			
			
		}
	}
	//Função para retornar o nome de um vertice dado
	public String retornarNome(int no)
	{
		return nomeVertice.get(no);
	}

	@Override
	public String toString() 
	{
		return "Vertice=" + vertice + ",\n"
				+ "Quantidade de nós=" + nos + ",\n"
				+ "Lista de Adjacencia=" + listaAdjacencia + ",\n"
				+ "Nome do vertice=" + nomeVertice;
	}
	
	
}