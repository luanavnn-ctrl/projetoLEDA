package util;

import data.Password;

public class Array<T> {

	private T[] array;

	public Array() {
		this(0);
	}

	@SuppressWarnings("unchecked")
	public Array(int size) {
		array = (T[]) new Object[size];
	}

	public Array(T[] array) {
		this.array = array;
	}

	public int size() {
		return array.length;
	}

	public T get(int index) {
		return array[index];
	}

	public void set(int index, T element) {
		array[index] = element;
	}

	public T[] getArray() {
		return array;
	}

	@SuppressWarnings("unchecked")
	public void add(T element) {
		T[] newArray = (T[]) new Object[array.length + 1];
		System.arraycopy(array, 0, newArray, 0, array.length);
		newArray[array.length] = element;
		array = newArray;

	}

	@SuppressWarnings("unchecked")
	public void add(int index, T element) {
		T[] newArray = (T[]) new Object[array.length + 1];

		for (int i = 0, j = 0; i < array.length; i++, j++) {
			if (j == index) {
				newArray[j++] = element;
			}
			newArray[j] = array[i];
		}

		if (index == array.length) {
			newArray[index] = element;
		}
		array = newArray;
	}

	public void append(T element) {
		add(element);
	}

	public void shuffle() {
		for (int i = 0; i < array.length; i++) {
			int j = (int) (Math.random() * array.length);
			T aux = array[i];
			array[i] = array[j];
			array[j] = aux;
		}
	}

	public void swap(int i, int j) {
		T aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}

	public Array<Password> getFilter(String method) throws Exception {
		Array<Password> data = new Array<>();
		for (int i = 1; i < size(); i++) {
			String string = (String) get(i).getClass().getMethod(method).invoke(get(i));
			if ((string.length() <= 7 || string.length() > 8) && string.matches("^(?=.*[a-z]+)(?=.*[A-Z]+)(?=.*\\d+)(?=.*[^a-zA-Z\\d]).+$")) {
				data.add(new Password(get(i).toString().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)")));
			}
		}
		return data;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		for (T t : array) {
			string.append(t.toString() + "\n");
		}
		return string.substring(0, string.length() - 1);
	}
}