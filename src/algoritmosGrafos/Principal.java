package algoritmosGrafos;

import algoritmosGrafos.Pseudodigrafo;

/**
 * @author MarcosInacio
 *
 */
public class Principal {

	public static void main(String[] args) {
				
		Pseudodigrafo ps = new Pseudodigrafo();
		ps.formarVertices();
		ps.adicionarAresta(0, 1);
		ps.adicionarAresta(1, 3);
		System.out.println("Nome do nó selecionado: " + ps.retornarNome(5));
		ps.criarListaAdjacencia();
		System.out.println("lista criada: " + ps.getLista());
		System.out.println(ps.toString());
		
		
	}

}