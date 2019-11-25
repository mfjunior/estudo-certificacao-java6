package chapter6;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

// Crie uma classe que crie 3 diretorios e 3 arquivos com nomes da seguinte forma:
// Diretórios: dir1, dir2, dir3;
// Arquivos: arq1, arq2, arq2.

public class CriarDiretoriosArquivos {

	public static void main(String[] args) {

		// Criar x arquivos dentro dos diretorios
		File[] aDir = criaDiretorios(3);
		criaArquivos(5, aDir);

	}

	private static void criaArquivos(int i, File[] dir) {
		int qtdeArquivos = 0;
		// int varQtdeDiretorios = 0;

		for (File diretorio : dir) {
			while (qtdeArquivos < i) {
				StringBuilder nomeArq = new StringBuilder("arq")
						.append(qtdeArquivos + 1);
				try {
					File file = new File(diretorio, nomeArq.toString());
					file.createNewFile();
				} catch (IOException e) {
					System.out.println("Não foi possível criar arquivo...");
				}
				qtdeArquivos++;
			}
			qtdeArquivos = 0;
		}
	}

	private static File[] criaDiretorios(int i) {
		File[] aFile = new File[i];
		int x = 0;
		while (x < i) {
			StringBuilder nomeDir = new StringBuilder("dir").append(x + 1);

			File file = new File(nomeDir.toString());
			file.mkdir();

			aFile[x] = file;

			x++;
		}
		return aFile;
	}

}
