package data;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Password {
	private String index;
	private String password;
	private String length;
	private String data;

	SimpleDateFormat fromUser = new SimpleDateFormat("yyyy-mm-dd HH:MM:SS");
	SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy HH:SS:SS");

	public Password() {}

	public Password(String[] col) {
		index = col[0];
		password = col[1];
		length = col[2].equals("") ? "0" : col[2];
		try {
			data = myFormat.format(fromUser.parse(col[3]));
		} catch (ParseException e) {
			data = col[3];
		}
	}

	public String getIndex() {
		return index;
	}

	public String getPassword() {
		return password;
	}
	public String getLength() {
		return length;
	}

	public String getData() {
		return data;
	}

	public String getDia() {
		return data.substring(0,2);
	}

	public String getMes() {
		return data.substring(3,5);
	}

	@Override
	public String toString() {
		String string = "";
		string += getIndex() + ",";
		string += getPassword() + ",";
		string += getLength() + ",";
		string += getData();
		return string;
	}
}