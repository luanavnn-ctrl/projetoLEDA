package app;

import data.Password;
import sort.MergeSort;
import sort.Sort;
import sort.SortAux;
import util.Array;
import data.CSV;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		
		Array<Password> data;
		SortAux sortAux = new SortAux();
		Sort algoritmo;

		System.out.println("Preparando os arquivos para os melhores casos...");

		// Password
		data = CSV.ler("db/passwords.csv");
		sortAux = new SortAux();
		sortAux.sortString(data, "getPassword");
		CSV.gravar(data, "db/casos/password-melhor-caso.csv");
		// Dia
		data = CSV.ler("db/passwords.csv");
		sortAux = new SortAux();
		sortAux.sortInteger(data, "getDia");
		CSV.gravar(data, "db/casos/dia-melhor-caso.csv");
		// Mes
		data = CSV.ler("db/passwords.csv");
		sortAux = new SortAux();
		sortAux.sortInteger(data, "getMes");
		CSV.gravar(data, "db/casos/mes-melhor-caso.csv");

		// Data formatada
		data = CSV.ler("db/passwords.csv");
		System.out.println("Gerando com data formatada...");
		CSV.gravar(data, "db/outros/data-formatada.csv");

		// MergeSort
		System.out.println("Ordenando com MergeSort...");
		algoritmo = new MergeSort();
		algoritmo.sortInteger(data, "getLength");

		// Gravar arquivo em CSV
		System.out.println("Gravando arquivo...");
		CSV.gravar(data, "db/ordenados/mergesort-length.csv");

		// Filtrar senhas
		System.out.println("Filtrando senhas...");
		CSV.gravar(data.getFilter("getPassword"), "db/outros/mergesort-filtered.csv");
	}
}