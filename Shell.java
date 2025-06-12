import java.io.*;

public class Shell {
    public static class Resultado {
        public long tempoExecucao;
        public int trocas;
        public int iteracoes;

        public Resultado(long tempoExecucao, int trocas, int iteracoes) {
            this.tempoExecucao = tempoExecucao;
            this.trocas = trocas;
            this.iteracoes = iteracoes;
        }
    }

    // Faz o Shell Sort e mede: tempo, trocas e iteracoes
    public static Resultado shellSort(int[] vetor) {
        int trocas = 0;
        int iteracoes = 0;
        int n = vetor.length;

        long inicio = System.currentTimeMillis();

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = vetor[i];
                int j = i;

                while (j >= gap && vetor[j - gap] > temp) {
                    vetor[j] = vetor[j - gap];
                    j -= gap;
                    trocas++;
                    iteracoes++;
                }

                vetor[j] = temp;
                iteracoes++;
            }
        }

        long fim = System.currentTimeMillis();
        return new Resultado(fim - inicio, trocas, iteracoes);
    }

    // Converte uma linha de texto para vetor de inteiros
    public static int[] converterLinhaParaVetor(String linha) {
        String[] partes = linha.split(",");
        int[] vetor = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            vetor[i] = Integer.parseInt(partes[i].trim());
        }
        return vetor;
    }

    // Método principal com leitura SEM try-catch
    public static void main(String[] args) throws IOException {
        String[] arquivosDados = {
                "1000.txt",
                "10000.txt",
                "100000.txt",
                "500000.txt",
                "1000000.txt"
        };

        for (String nomeArquivo : arquivosDados) {
            System.out.println("Processando arquivo: " + nomeArquivo);

            BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));

            long somaTempo = 0;
            long somaTrocas = 0;
            long somaIteracoes = 0;
            int totalRodadas = 0;
            int rodada = 1;

            String linha;
            while ((linha = reader.readLine()) != null) {
                int[] vetor = converterLinhaParaVetor(linha);
                Resultado resultado = shellSort(vetor);

                System.out.printf("Rodada %d - Tempo: %d ms | Trocas: %d | Iterações: %d%n",
                        rodada, resultado.tempoExecucao, resultado.trocas, resultado.iteracoes);

                somaTempo += resultado.tempoExecucao;
                somaTrocas += resultado.trocas;
                somaIteracoes += resultado.iteracoes;
                rodada++;
                totalRodadas++;
            }

            reader.close();

            double mediaTempo = somaTempo / (double) totalRodadas;
            double mediaTrocas = somaTrocas / (double) totalRodadas;
            double mediaIteracoes = somaIteracoes / (double) totalRodadas;

            System.out.printf(">>> MÉDIA (%s) - Tempo: %.2f ms | Trocas: %.2f | Iterações: %.2f%n%n",
                    nomeArquivo, mediaTempo, mediaTrocas, mediaIteracoes);
        }
    }
}
