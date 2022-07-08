package sort;

import data.Password;
import util.Array;

public interface Sort {

	void sortInteger(Array<Password> A, String method) throws Exception;
	void sortString(Array<Password> A, String method) throws Exception;

}