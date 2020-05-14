package exercicio018;

/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   Turma 02 - Luciano Antonio Digiampietri                       **/
/**                                                                 **/
/**   Terceiro Exercício-Programa                                   **/
/**                                                                 **/
/**   Vitor Martins Cruz                   Nº USP: 11845410         **/
/**                                                                 **/
/**   <data de entrega>                                             **/
/*********************************************************************/

/*
	Jogo da Velha - programa para verificar o status de um jogo.
	
	Lista de Status calculado:
    0 - Jogo não iniciado: o tabuleiro está 'vazio', isto é sem peças X e O;
    1 - Jogo encerrado1: o primeiro jogador (que usa as peças X) é o ganhador;
    2 - Jogo encerrado2: o segundo jogador (que usa as peças O) é o ganhador;
    3 - Jogo encerrado3: empate - todas as casas do tabuleiro estão preenchidas com X e O, mas nenhum dos jogadores ganhou;
    4 - Jogo já iniciado e em andamento: nenhuma das alternativas anteriores.	
*/
public class Exercicio018 {
    // Declara um arranjo inteiro que armazena a soma dos valores de uma linha.
    static int linha[]; 
    
    // Declara o arranjo inteiro que armazena a soma dos valores de uma coluna.
    static int coluna[];
    
    static int diagonalprincipal;
    
    static int diagonalsecundaria;
    
    static int vazios;
    
    static int verificaStatus(char[][] tabuleiro) { // Início do método.
        // Aloca um arranjo com a mesma quantidade de linhas da matriz de tabuleiro.              
        linha = new int[tabuleiro.length];
        
        // Aloca um arranjo com a mesma quantidade de colunas da matriz de tabuleiro.    
        coluna = new int[tabuleiro.length];
        
        diagonalprincipal = 0;
        
        diagonalsecundaria = 0;
        
        vazios = 0;
        
        for (int i = 0; i<tabuleiro.length; i++) {
            for (int j = 0; j<tabuleiro[i].length; j++) {
                
                if (tabuleiro[i][j] == ' ') tabuleiro[i][j] = 0;
                else if (tabuleiro[i][j] == 'O') tabuleiro[i][j] = 1;
                else  tabuleiro[i][j] = 4;
                
                if (i == j) diagonalprincipal += tabuleiro[i][j];
                
                if (i + j == 2) diagonalsecundaria += tabuleiro[i][j];
                
                if (tabuleiro[i][j] == 0) vazios ++;
                
                
                
                linha[i] += tabuleiro[i][j];
                coluna[j] += tabuleiro[i][j];

                if (linha[i] == 12 || coluna[j] == 12 || diagonalprincipal == 12 || diagonalsecundaria == 12) return 1;
                else if (linha[i] == 3 || coluna[j] == 3 || diagonalprincipal == 3 || diagonalsecundaria == 3) return 2;
                
                                               
            }
            


            
        }
        if (vazios == 9) return 0;
        else if (vazios == 0) return 3;

        return 4;
    }
            
    public static void main(String[] args) {
        	char[][] tab0 = 
                {
                    {'O','X','O'},
                    {'X','O','O'},
                    {'X','O','X'}
                };
                
		char[][] tab1 = 
                {
                    {'O','X',' '},
                    {'O','O',' '},
                    {' ',' ','O'}
                };
                
		char[][] tab2 = 
                {
                    {'X','X','X'},
                    {'X','O','O'},
                    {' ',' ','O'}
                };
                
		char[][] tab3 = 
                {
                    {'O','X','X'},
                    {'O','O','O'},
                    {'O','X','X'}
                };
                
		char[][] tab4 = 
                {
                    {'X','X','O'},
                    {'X','O','X'},
                    {'X','O','O'}
                };

		System.out.println("Status calculado: " + verificaStatus(tab0));
		System.out.println("Status esperado para o tabuleiro0: 0\n");

		System.out.println("Status calculado: " + verificaStatus(tab1));
		System.out.println("Status esperado para o tabuleiro1: 4\n");

		System.out.println("Status calculado: " + verificaStatus(tab2));
		System.out.println("Status esperado para o tabuleiro2: 4\n");
		
		System.out.println("Status calculado: " + verificaStatus(tab3));
		System.out.println("Status esperado para o tabuleiro3: 3\n");
		
		System.out.println("Status calculado: " + verificaStatus(tab4));
		System.out.println("Status esperado para o tabuleiro4: 4\n");
    }
    
}
