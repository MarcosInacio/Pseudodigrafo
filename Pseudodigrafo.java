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
 * V � UM CONJUNTO DE VERTICES OU N�S
 * E � UM MULTICONJUNTO DE PARES N�O-ORDENADOS DE VERTICES
 * LA�O � UMA ARESTA QUE CONECTA UM VERTICE A ELE MESMO
 * 
 * LISTA DE ADJAC�NCIA � UMA LISTA DE TODOS OS OUTROS VERTICES COM OS QUAIS ELE TEM UMA ARESTA
 */

public class Pseudodigrafo 
{
	private int nos;
	private ArrayList<Integer> vertice;
	private ArrayList<String> nomeVertice;
	private ArrayList<Integer> listaAdjacencia;
	private ArrayList<Integer> lista;
	
	//Para entrada pr�-definida de n�s
	public Pseudodigrafo()
	{
		nos = 6;
		vertice = new ArrayList<Integer>();
		listaAdjacencia = new ArrayList<Integer>();
		nomeVertice = new ArrayList<String>();
	}
	
	//colocar a quantidade de n�s em cada posi��o do arrayList
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
	//Fun��o para retornar o nome de um vertice dado
	public String retornarNome(int no)
	{
		return nomeVertice.get(no);
	}

	@Override
	public String toString() 
	{
		return "Vertice=" + vertice + ",\n"
				+ "Quantidade de n�s=" + nos + ",\n"
				+ "Lista de Adjacencia=" + listaAdjacencia + ",\n"
				+ "Nome do vertice=" + nomeVertice;
	}
	
	
}