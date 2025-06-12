import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class GerarNumeros {

    public static void gerarNums(int quant,String nomeArquivo){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))){
            Random rd = new Random(123); // seed é 123

            for (int i = 0; i<5; i++){ // faz 5 linhas pra cada txt, cada linha tem o total de dados
                StringBuilder linha = new StringBuilder();
                for (int j = 0; j<quant;j++){ // o forr da quantia de dados.
                    int numero = rd.nextInt(1_000_000); // deixa o numero maximo como 1.000.000
                    linha.append(numero);
                    if (j < quant -1){
                        linha.append(","); // separacao de numeros por virgula
                    }
                }

                writer.write(linha.toString());
                writer.newLine(); // prox linha é novo um vetor
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        gerarNums(1000, "1000.txt");
        gerarNums(10000, "10000.txt");
        gerarNums(100000, "100000.txt");
        gerarNums(500000, "500000.txt");
        gerarNums(1000000, "1000000.txt");
    }
}