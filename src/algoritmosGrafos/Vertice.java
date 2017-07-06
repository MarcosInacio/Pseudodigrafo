package algoritmosGrafos;

import java.util.ArrayList;

public class Vertice {
	private String nome;
	private int indice;
	private ArrayList<Integer> sucessores = new ArrayList<Integer>();
	
	public Vertice(String nome, int indice) 
	{
		this.nome = nome;
		this.indice = indice;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public int getIndice() 
	{
		return indice;
	}
	
	public void setIndice(int indice) 
	{
		this.indice = indice;
	}
	
	public ArrayList<Integer> getSucessores() 
	{
		return sucessores;
	}
	
	public void addSucessores(int prox) 
	{
		sucessores.add(prox);
	}
}
