import java.net.*;
import java.io.*;

public class parseStock {
	public void test() {
		StringBuffer document = new StringBuffer();
		try {
			URL url = new URL("http://tw.stock.yahoo.com/q/q?s=2311");
			URLConnection conn = url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			String line = null;
			while ((line = reader.readLine()) != null)
				System.out.println(line);
			reader.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		parseStock catch2 = new parseStock();
		catch2.test();
	}
}