# 💻 TDE 03 - Ordenação RA 04 📖

# GerarNumeros
Esse programa cria arquivos txts separados em 1000.txt | 10000.txt | 100000.txt | 500000.txt | 1000000.txt e vetores que vão ser ordenados;

Gera também aleatóriamente diversos dados com a seed *123*;

Cada txt possui 5 linhas e cada linha possui uma quantidade de dados igual ao nome do arquivo;

Cada vez que a ordenação for rodada usa essas linhas como vetor.

<br>

> [!NOTE]
> Antes de rodar os algoritmos Shell e Gnome, é necessário rodar apenas uma vez o programa **GerarNumeros** para criar os arquivos em txt.

<br>

# 📈 Desenpenho: Shell x Gnome

Este projeto implementa os algoritmos `Shell.java` e `Gnome.java`. Além disso o programa mede e registra três métricas durante a execução do algoritmo:

- **Tempo de execução** (em milissegundos)
- **Número de trocas** realizadas
- **Número de iterações** feitas no processo de ordenação

## 🐚 Shell

  O **Shell Sort** é um algoritmo de ordenação que melhora a eficiência do método de inserção direta, permitindo trocas de elementos distantes. Ele utiliza uma sequência de intervalos (gaps) para comparar e ordenar elementos que estão afastados, reduzindo gradualmente o gap até chegar a 1, quando a lista está praticamente ordenada.

Esse método se mostrou eficiente em ordenar vetores consideravelmente Grandes.

---

### Resultados Totais

| Arquivo | Tempo médio em ms | Trocas totais | Interações médias |
| ---------------- | ---------------- | ------------- | ----------------- |
| 1.000            | 0.40               | 38.640        | 15.734           |
| 10.000           | 1.00             | 763.469      | 272.298           |
| 100.000          | 10.40           | 14.381.657     | 4.360.337         |
| 500.000          | 60.80           | 102.333.299     | 29.046.666       |
| 1.000.000        | 135.40              | 245.835.740    | 67.047.175       |
