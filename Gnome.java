import java.io.*;

public class Gnome {

    public static class Resultado {
        public long tempoExecucao;
        public long trocas;
        public long iteracoes;

        public Resultado(long tempoExecucao, long trocas, long iteracoes) {
            this.tempoExecucao = tempoExecucao;
            this.trocas = trocas;
            this.iteracoes = iteracoes;
        }
    }

    static long totalTrocas;
    static long totalIteracoes;

    public static Resultado gnomeSort(int[] vetor) {
        totalTrocas = 0;
        totalIteracoes = 0;

        long inicio = System.currentTimeMillis();

        int pos = 1;
        while (pos < vetor.length) {
            totalIteracoes++;
            if (pos == 0 || vetor[pos] >= vetor[pos - 1]) {
                pos++;
            } else {
                int tmp = vetor[pos];
                vetor[pos] = vetor[pos - 1];
                vetor[pos - 1] = tmp;
                totalTrocas++;
                pos--;
            }
        }

        long fim = System.currentTimeMillis();
        return new Resultado(fim - inicio, totalTrocas, totalIteracoes);
    }

    public static int[] converterLinhaParaVetor(String linha) {
        String[] partes = linha.split(",");
        int[] vetor = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            vetor[i] = Integer.parseInt(partes[i].trim());
        }
        return vetor;
    }

    public static void main(String[] args) throws IOException {
        String[] arquivos = {
                "1000.txt",
                "10000.txt",
                "100000.txt",
                "500000.txt",
                "1000000.txt"
        };

        for (String arquivo : arquivos) {
            System.out.println("Processando arquivo: " + arquivo);

            BufferedReader reader = new BufferedReader(new FileReader(arquivo));

            long somaTempo = 0;
            long somaTrocas = 0;
            long somaIteracoes = 0;
            int totalRodadas = 0;

            String linha;
            int rodada = 1;

            while ((linha = reader.readLine()) != null) {
                int[] vetor = converterLinhaParaVetor(linha);
                Resultado resultado = gnomeSort(vetor);

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
                    arquivo, mediaTempo, mediaTrocas, mediaIteracoes);
        }
    }
}
