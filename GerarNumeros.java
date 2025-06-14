import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class GerarNumeros {

    public static void gerarNums(int quant,String nomeArquivo){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))){
            Random rd = new Random(123);

            for (int i = 0; i<5; i++){
                StringBuilder linha = new StringBuilder();
                for (int j = 0; j<quant;j++){
                    int numero = rd.nextInt(1_000_000);
                    linha.append(numero);
                    if (j < quant -1){
                        linha.append(",");
                    }
                }

                writer.write(linha.toString());
                writer.newLine();
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
