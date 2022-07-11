package app;

import data.Password;
import sort.*;
import util.Array;
import data.CSV;
import util.Resultado;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {

		Array<Password> data;
		QuickSortMedianaDeTres qsort;
		Sort algoritmo;
		long startTime;
		long stopTime;

		/* Comentado, pois os arquivos já foram gerados
		// Passwords melhor caso
		System.out.println("Preparando os arquivos para os piores casos...");

		data = CSV.ler("db/passwords.csv");
		qsort = new QuickSortMedianaDeTres();
		qsort.sortString(data, "getLength");
		CSV.gravar(data, "db/casos/password-melhor-caso.csv");

		data = CSV.ler("db/passwords.csv");
		qsort = new QuickSortMedianaDeTres();
		qsort.sortString(data, "getDia");
		CSV.gravar(data, "db/casos/dia-melhor-caso.csv");

		data = CSV.ler("db/passwords.csv");
		qsort = new QuickSortMedianaDeTres();
		qsort.sortString(data, "getDia");
		CSV.gravar(data, "db/casos/mes-melhor-caso.csv");

		// Passwords Medio Caso
		System.out.println("Preparando o arquivo para os casos medios...");
		data = CSV.ler("db/passwords.csv");
		data.shuffle();
		CSV.gravar(data, "db/casos/passwords-medio-caso.csv");
		// Passwords Pior caso
		System.out.println("Preparando os arquivos para os piores casos...");
		data = CSV.ler("db/passwords.csv");
		qsort = new QuickSortMedianaDeTres();
		qsort.sortStringDesc(data, "getLength");
		CSV.gravar(data, "db/casos/password-pior-caso.csv");

		data = CSV.ler("db/passwords.csv");
		qsort = new QuickSortMedianaDeTres();
		qsort.sortStringDesc(data, "getDia");
		CSV.gravar(data, "db/casos/dia-pior-caso.csv");

		data = CSV.ler("db/passwords.csv");
		qsort = new QuickSortMedianaDeTres();
		qsort.sortStringDesc(data, "getDia");
		CSV.gravar(data, "db/casos/mes-pior-caso.csv");
		*/
		// Ordenação Melhor Caso
		// BubbleSort
		Array<Integer> passwordTempoMelhorCaso = new Array<>();
		Array<Integer> diaTempoMelhorCaso = new Array<>();
		Array<Integer> mesTempoMelhorCaso = new Array<>();
		System.out.println("Ordenando para os melhores casos...");

		// BubbleSort
/*
		System.out.println("BubbleSort");
		data = CSV.ler("db/casos/password-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new BubbleSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/bubble-password-melhor-caso.csv");

		data = CSV.ler("db/casos/dia-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new BubbleSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/bubble-dia-melhor-caso.csv");

		data = CSV.ler("db/casos/mes-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new BubbleSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/bubble-mes-melhor-caso.csv");

		// HeapSort
		System.out.println("HeapSort");
		data = CSV.ler("db/casos/password-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new HeapSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		mesTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/heap-password-melhor-caso.csv");

		data = CSV.ler("db/casos/dia-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new HeapSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		mesTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/heap-dia-melhor-caso.csv");

		data = CSV.ler("db/casos/mes-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new HeapSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/heap-mes-melhor-caso.csv");

		// InsertionSort
		System.out.println("InsertionSort");
		data = CSV.ler("db/casos/password-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new InsertionSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/insertion-password-melhor-caso.csv");

		data = CSV.ler("db/casos/dia-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new InsertionSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/insertion-dia-melhor-caso.csv");

		data = CSV.ler("db/casos/mes-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new InsertionSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/insertion-mes-melhor-caso.csv");

		// MergeSort
		System.out.println("MergeSort");
		data = CSV.ler("db/casos/password-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new MergeSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/mergesort-password-melhor-caso.csv");

		data = CSV.ler("db/casos/dia-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new MergeSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/mergesort-dia-melhor-caso.csv");

		data = CSV.ler("db/casos/mes-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new MergeSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/mergesort-mes-melhor-caso.csv");
*/
		// QuickSort
		System.out.println("A");
		System.out.println("QuickSort");
		data = CSV.ler("db/casos/password-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new QuickSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/quick-password-melhor-caso.csv");

		System.out.println("B");
		data = CSV.ler("db/casos/dia-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new QuickSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/quick-dia-melhor-caso.csv");

		System.out.println("C");
		data = CSV.ler("db/casos/mes-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new QuickSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/quick-mes-melhor-caso.csv");

		// SelectionSort
		System.out.println("SelectionSort");
		data = CSV.ler("db/casos/password-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new SelectionSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/selection-password-melhor-caso.csv");

		data = CSV.ler("db/casos/dia-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new SelectionSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/selection-dia-melhor-caso.csv");

		data = CSV.ler("db/casos/mes-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new SelectionSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoMelhorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/selection-mes-melhor-caso.csv");

		// Ordenação Caso Médio
		// BubbleSort
		Array<Integer> passwordTempoCasoMedio = new Array<>();
		Array<Integer> diaTempoCasoMedio = new Array<>();
		Array<Integer> mesTempoCasoMedio = new Array<>();

		System.out.println("Ordenando para os casos medios...");
		// BubbleSort

		System.out.println("BubbleSort");
		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new BubbleSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/bubble-password-melhor-caso.csv");

		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new BubbleSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/bubble-dia-melhor-caso.csv");

		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new BubbleSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/bubble-mes-melhor-caso.csv");

		// HeapSort
		System.out.println("HeapSort");
		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new HeapSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/heap-password-melhor-caso.csv");

		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new HeapSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/heap-dia-melhor-caso.csv");

		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new HeapSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/heap-mes-melhor-caso.csv");

		// InsertionSort
		System.out.println("InsertionSort");
		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new InsertionSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/insertion-password-melhor-caso.csv");

		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new InsertionSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/insertion-dia-melhor-caso.csv");

		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new InsertionSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/insertion-mes-melhor-caso.csv");

		// MergeSort
		System.out.println("MergeSort");
		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new MergeSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/mergesort-password-melhor-caso.csv");

		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new MergeSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/mergesort-dia-melhor-caso.csv");

		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new MergeSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/mergesort-mes-melhor-caso.csv");

		// QuickSort
		System.out.println("QuickSort");
		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new QuickSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/quick-password-melhor-caso.csv");

		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new QuickSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/quick-dia-melhor-caso.csv");

		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new QuickSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/quick-mes-melhor-caso.csv");

		// SelectionSort
		System.out.println("SelectionSort");
		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new SelectionSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/selection-password-melhor-caso.csv");

		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new SelectionSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/selection-dia-melhor-caso.csv");

		data = CSV.ler("db/casos/passwords-medio-caso.csv.csv");
		startTime = System.nanoTime();
		algoritmo = new SelectionSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoCasoMedio.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/selection-mes-melhor-caso.csv");

		// Ordenação Pior Caso
		Array<Integer> passwordTempoPiorCaso = new Array<>();
		Array<Integer> diaTempoPiorCaso = new Array<>();
		Array<Integer> mesTempoPiorCaso = new Array<>();
		System.out.println("Ordenando para o pior caso...");

		// BubbleSort
		System.out.println("BubbleSort");
		data = CSV.ler("db/casos/password-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new BubbleSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/bubble-password-pior-caso.csv");

		data = CSV.ler("db/casos/dia-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new BubbleSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/bubble-dia-pior-caso.csv");

		data = CSV.ler("db/casos/mes-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new BubbleSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/bubble-mes-pior-caso.csv");

		// HeapSort
		System.out.println("HeapSort");
		data = CSV.ler("db/casos/password-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new HeapSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/heap-password-pior-caso.csv");

		data = CSV.ler("db/casos/dia-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new HeapSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/heap-dia-pior-caso.csv");

		data = CSV.ler("db/casos/mes-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new HeapSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/heap-mes-pior-caso.csv");

		// InsertionSort
		System.out.println("InsertionSort");
		data = CSV.ler("db/casos/password-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new InsertionSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/insertion-password-pior-caso.csv");

		data = CSV.ler("db/casos/dia-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new InsertionSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/insertion-dia-pior-caso.csv");

		data = CSV.ler("db/casos/mes-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new InsertionSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/insertion-mes-pior-caso.csv");

		// MergeSort
		System.out.println("MergeSort");
		data = CSV.ler("db/casos/password-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new MergeSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/mergesort-password-pior-caso.csv");

		data = CSV.ler("db/casos/dia-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new MergeSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/mergesort-dia-pior-caso.csv");

		data = CSV.ler("db/casos/mes-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new MergeSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/mergesort-mes-pior-caso.csv");

		// QuickSort
		System.out.println("QuickSort");
		data = CSV.ler("db/casos/password-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new QuickSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/quick-password-pior-caso.csv");

		data = CSV.ler("db/casos/dia-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new QuickSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/quick-dia-pior-caso.csv");

		data = CSV.ler("db/casos/mes-melhor-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new QuickSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/quick-mes-pior-caso.csv");

		// SelectionSort
		System.out.println("SelectionSort");
		data = CSV.ler("db/casos/password-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new SelectionSort();
		algoritmo.sortString(data, "getLength");
		stopTime = System.nanoTime();
		passwordTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/selection-password-pior-caso.csv");

		data = CSV.ler("db/casos/dia-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new SelectionSort();
		algoritmo.sortString(data, "getDia");
		stopTime = System.nanoTime();
		diaTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/selection-dia-pior-caso.csv");

		data = CSV.ler("db/casos/mes-pior-caso.csv");
		startTime = System.nanoTime();
		algoritmo = new SelectionSort();
		algoritmo.sortString(data, "getMes");
		stopTime = System.nanoTime();
		mesTempoPiorCaso.add(Resultado.executionTime(startTime, stopTime));
		CSV.gravar(data, "db/ordenados/selection-mes-pior-caso.csv");

		// Arquivo formatado
		System.out.println("Gerando arquivo com data formatada");
		data = CSV.ler("db/passwords.csv");
		CSV.gravar(data, "db/outros/passwords_formatted_data.csv");

		// Filtro senhas
		System.out.println("Filtrando senhas...");
		CSV.gravar(data.getFilter("getPassword"), "db/outros/password_classifier.csv");

		// Resultados
		Array<String> nomesLinhas = new Array<>(new String[] {"BubbleSort","HeapSort","InsertionSort","MergeSort","QuickSort","SelectionSort"});
		Array<String> nomesColunas = new Array<>(new String[] {"ALGORITMOS","TEMPO PASSWORD","TEMPO DIA","TEMPO MES"});
		Resultado.tabela("TEMPO DE EXECUÇÃO DOS ALGORITMOS", nomesLinhas, nomesColunas, passwordTempoMelhorCaso, diaTempoMelhorCaso, mesTempoMelhorCaso);
		nomesColunas = new Array<>(new String[] {"ALGORITMOS","TEMPO  MELHOR CASO","TEMPO MÉDIO CASO ","TEMPO PIOR CASO"});
		Resultado.tabela("TEMPO DE EXECUÇÃO DOS ALGORITMOS PARA ORDENAÇÃO DE NÚMEROS", nomesLinhas, nomesColunas, passwordTempoCasoMedio, diaTempoCasoMedio, mesTempoCasoMedio);
		nomesColunas = new Array<>(new String[] {"ALGORITMOS","TEMPO MELHOR CASO","TEMPO MÉDIO CASO ","TEMPO PIOR CASO"});
		Resultado.tabela("TEMPO DE EXECUÇÃO DOS ALGORITMOS PARA ORDENAÇÃO DE STRINGS", nomesLinhas, nomesColunas, passwordTempoCasoMedio , diaTempoCasoMedio, mesTempoCasoMedio);
	}
}