import java.io.*;
import java.net.*;
//accessing website codes using buffered reader
public class UrlCC{
	public static void main(String args[]) throws IOException{
		try{
			URL url = new URL("https://ocsaly.com");
			URLConnection myUrlC = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(myUrlC.getInputStream()));
			String myLine;
			while ((myLine = br.readLine())!=null){
				System.out.println(myLine);
			}
			br.close();
		}catch(IOException exception){
			System.out.println(exception.getMessage());
		}
	}
}