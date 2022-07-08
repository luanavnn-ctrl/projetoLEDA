package data;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Password {
	
	private int index;
	private String password;
	private int length;
	private String data;
	
	public Password() {}

	public Password(String[] col) {
		SimpleDateFormat fromUser = new SimpleDateFormat("yyyy-mm-dd HH:MM:SS");
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy HH:SS:SS");
		index = Integer.parseInt(col[0]);
		password = col[1];
		length = col[2].equals("") ? 0 : Integer.parseInt(col[2]);
		try {
			data = myFormat.format(fromUser.parse(col[3]));
		} catch (ParseException e) {
			data = col[3];
		}
	}

	public int getIndex() {
		return index;
	}

	public String getPassword() {
		return password;
	}

	public int getLength() {
		return length;
	}

	public String getData() {
		return data;
	}

	public int getDia() {
		return Integer.parseInt(data.substring(0,2));
	}

	public int getMes() {
		System.out.println(Integer.parseInt(data.substring(3,5)));
		return Integer.parseInt(data.substring(3,5));
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