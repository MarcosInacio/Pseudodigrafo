package algoritmosGrafos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author MarcosInacio
 *
 */
public class Principal {

	public static void main(String[] args) {
		String aux;
		Pseudodigrafo ps;
		Vertice v;
		
		try {
			FileReader arq = new FileReader("grafos.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			aux = lerArq.readLine();
			ps = new Pseudodigrafo(Integer.parseInt(aux));
			
			while(lerArq.ready())
			{
				String s = lerArq.readLine();
				int valor = 0;
				for(int i = 0; i < s.length(); i++)
				{
					String a = "";
					
					if(s.charAt(i) != 32)
					{
						a += s.charAt(i);
					}
					else
					{
						if(valor == 0){
							v = new Vertice(a,0); // TODO - TEM QUE MUDAR O 0
						}
						else{
							
							v.addSucessores(Integer.parseInt(a));
							a = "";
						}
						
					}
				}
			}
		}
		catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n",
					e.getMessage());
		}
		
		/*Pseudodigrafo ps = new Pseudodigrafo();
		ps.formarVertices();
		ps.adicionarAresta(0, 1);
		ps.adicionarAresta(1, 3);
		System.out.println("Nome do nó selecionado: " + ps.retornarNome(5));
		ps.criarListaAdjacencia();
		System.out.println("lista criada: " + ps.getLista());
		System.out.println(ps.toString());*/
		
		
	}

}