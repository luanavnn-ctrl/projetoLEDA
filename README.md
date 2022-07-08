# Projeto de Laboratório de Análise de Algoritmos

## Classificação e ordenação de base de dados de passwords

Após os estudos de análise de algoritmos de ordenação vistos em sala de aula na turma de Laboratório de Estrutura de Dados (LEDA), foi apresentado aos alunos a criação de um projeto de disciplina que visa implementar seis algoritmos (BubbleSort, MergeSort,HeapSort, QuickSort, InsertionSort, SelectionSort). O projeto possibilita análise a prática do funcionamento e desempenho de cada um desses algoritmos, considerando os melhores, médios e piores casos. Para este estudo será utilizado o banco de dados 10k Passwords, fornecido pelo professor da disciplina, onde serão aplicados os algoritmos de ordenação em dados do tipo Strings e Inteiros. Os resultados obtidos foram descritos [neste relatório](https://docs.google.com/document/d/12F8pTblzYzY5a7Xt21ZtICBKxmBmt156QIr4bwoFNXg/edit?usp=sharing).

## Como rodar o projeto?

1. Certifique-se de estar com uma versão do Java instalado na sua maquina com o JDK 17.0.1 ou superior [site oficial da Oracle.](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

2. A ide utilizada foi o VSCode, mas poderá ser escolhida a que o programador tenha melhor afinidade, contanto que seja adequada para compilação programas em JAVA.

3. Salvar arquivo [passwords.csv](https://docs.google.com/document/d/12F8pTblzYzY5a7Xt21ZtICBKxmBmt156QIr4bwoFNXg/edit?usp=sharing) no diretório "proj-leda\proj-leda\db", para o correto funcionamento da implementação

4. Na pasta "db" perceba que existe um arquivo chamado "passwords.csv". Este arquivo é o CSV do banco de dados fornecido pelo professor, e  pode utiliza-lo seguindo o seguinte diretório  "db\passwords.csv" do projeto.

5. No diretório "db/outroscasos" é onde ficará os arquivos gerados pela formatação da data e classificação das senhas: passwords_formated_data.csv e passwords_classifier.csv, respectivamente.

6. Só será possível rodar o projeto utilizando uma IDE. Para isso, roda através da IDE o arquivo "Main.java".

7. Realize a execução do arquivo "app/main.java" o mesmo irá gerar arquivos conforme os diretorios e informações no item a seguir.

8. O código deve gerar na pasta "db/casos" vários arquivos CSV para melhor, pior e médio caso e em "db\ordenados" teremos os arquivos ordenados pelos algoritmos de ordenação. Cada arquivo trata-se de uma execução de um dos seis algotimos de ordenação (BubbleSort, MargeSort, HeapSort, QuickSort, InsertionSort, SelectionSort) para cada um dos 4 parâmetros (tamanho, data e mês).
