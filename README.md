# 💻 TDE 03 - Ordenação RA04 📖

ainda não tem vídeo 😊

Link para o Vídeo [TDE 03 - Ordenação RA04](https://www.youtube.com/watch?v=dQw4w9WgXcQ)

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

<br>

## 🐚 Shell

O **Shell Sort** é um algoritmo de ordenação que melhora a eficiência do método de inserção direta, permitindo trocas de elementos distantes. Ele utiliza uma sequência de intervalos (gaps) para comparar e ordenar elementos que estão afastados, reduzindo gradualmente o gap até chegar a 1, quando a lista está praticamente ordenada.

Esse método se mostrou eficiente em ordenar vetores consideravelmente Grandes.

---

### 📋 Resultados Totais

| Arquivo | Tempo médio em ms | Trocas totais | Interações médias |
| ---------------- | ---------------- | ------------- | ----------------- |
| 1.000            | 0.40               | 38.640        | 15.734           |
| 10.000           | 1.00             | 763.469      | 272.298           |
| 100.000          | 10.40           | 14.381.657     | 4.360.337         |
| 500.000          | 60.80           | 102.333.299     | 29.046.666       |
| 1.000.000        | 135.40              | 245.835.740    | 67.047.175       |

### 📊 Gráficos de Comparação
> O tempo não aparece devido ao número elevado de trocas e interações.

![Shell 1_000](https://github.com/user-attachments/assets/27217da8-2a97-4ed7-8378-f646d1214c15)

![Shell 10_000](https://github.com/user-attachments/assets/656f4cda-e1da-44c7-8819-a5e27c273350)

![Shell 100_000](https://github.com/user-attachments/assets/1e7a7a9a-c017-4612-a698-4fa13cb3202a)

![Shell 500_000](https://github.com/user-attachments/assets/e810fe74-2cf1-4996-99fb-2fee486489f5)

![Shell 1_000_000](https://github.com/user-attachments/assets/360aaffd-15c0-4e20-8428-be7632f74234)

---

---

<br>

## 🧌 Gnome

O **Gnome Sort** é um algoritmo de ordenação simples e intuitivo que funciona de maneira semelhante ao Insertion Sort. A ideia é percorrer o vetor, comparando elementos adjacentes e trocando-os se estiverem fora de ordem. Se uma troca for feita, o algoritmo retorna um passo para trás; caso contrário, avança um passo.

Esse método se mostrou pouco eficiente em ordenar vetores consideravelmente Grandes.

---

### 📋 Resultados Totais

| Arquivo | Tempo médio em ms | Trocas totais | Interações médias |
| ---------------- | ---------------- | ------------- | ----------------- |
| 1.000            | 2.60               | 1.241.560        | 497.623           |
| 10.000           | 79.40            | 1.243.112.300      | 497.745.19          |
| 100.000          | 8435.00          | 12.519.008.467    | 500.250.738         |
| 500.000          | 251695.00          | 312.490.683.406     | 125.196.693.361     |
| 1.000.000        | 494553.00              | 1.249.859.243.045    | 499.944.297.617       |

### 📊 Gráficos de Comparação
> O tempo não aparece devido ao número extremamente elevado de trocas e interações.

![Gnome 1_000](https://github.com/user-attachments/assets/0705c7b5-053c-4ab8-bf20-77681d2cfb28)

![Gnome 10_000](https://github.com/user-attachments/assets/d06ccae6-56da-4307-98fc-9bcaccc7afc3)

![Gnome 100_000](https://github.com/user-attachments/assets/a5aad404-0778-4554-9ffb-75dd33bca487)

![Gnome 500_000](https://github.com/user-attachments/assets/d53ed84b-222d-4422-a587-5e8099ebbfef)

![Gnome 1_000_000](https://github.com/user-attachments/assets/43695923-792a-407f-8f78-806d568bc8a6)

---

---

<br>

<br>

## ✅ Conclusão
Shell Sort é mais eficiente e indicado para conjuntos de dados maiores. Sua complexidade é menor e ele reduz o número de operações ao longo da execução.

Gnome Sort é simples de implementar e entender, mas não é eficiente para grandes volumes de dados, sendo mais adequado para listas e vetores pequenos.
