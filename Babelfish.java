import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Babelfish {

	/**
	 * Problem C: Babelfish
	You have just moved from Waterloo to a big city. The people here speak an incomprehensible dialect of a foreign language. 
	Fortunately, you have a dictionary to help you understand them.
	Input consists of up to 100,000 dictionary entries, followed by a blank line, followed by a message of up to 100,000 words. 
	Each dictionary entry is a line containing an English word, followed by a space and a foreign language word. 
	No foreign word appears more than once in the dictionary. The message is a sequence of words in the foreign language, one word on each line. 
	Each word in the input is a sequence of at most 10 lowercase letters. Output is the message translated to English, one word per line. 
	Foreign words not in the dictionary should be translated as "eh".
	
	Sample Input
	dog ogday
	cat atcay
	pig igpay
	froot ootfray
	loops oopslay

	atcay
	ittenkay
	oopslay
	Output for Sample Input
	cat
	eh	
	loops

	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));   
		boolean dicFin = false;
		HashMap<String,String> hm = new HashMap<String, String>();
		String str;
		while ((str = sc.readLine()) != null) {
			if(str.equals("")){
				dicFin = true;
				continue;
			}
			if(!dicFin){
				String[] entry = str.split(" ");
				hm.put(entry[1], entry[0]);
			}
			else{
				String trans = "";
				trans = hm.get(str);
				if(trans == null){
					trans = "eh";
				}
				System.out.println(trans);
			}
		}
	}

}
