import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	private HashMap<String,String> mapATB;
	private HashMap<String,String> mapBTA;
	public Dictionary() { 
		mapATB=initializeAlphabetToBrailleLibrary();
		mapBTA=initializeBrailleToAlphabetLibrary();
	}
	
	public HashMap<String, String> getMapATB() { return mapATB; }

	public HashMap<String, String> getMapBTA() { return mapBTA; }
	
	//Får hashMap value fra key
	public String getValueFromKey(String key, HashMap<String,String> map) { 
		return map.get(key); 
	}

	private HashMap<String,String> initializeAlphabetToBrailleLibrary(){
		HashMap<String,String> mapATB = new HashMap<String,String>();
		// Numbers
		mapATB.put("1", "\u2801");
		mapATB.put("2", "\u2803");
		mapATB.put("3", "\u2809");
		mapATB.put("4", "\u2819");
		mapATB.put("5", "\u2811");
		mapATB.put("6", "\u280B");
		mapATB.put("7", "\u281B");
		mapATB.put("8", "\u2813");
		mapATB.put("9", "\u280A");
		mapATB.put("0", "\u281A");
		
		// Letters
		mapATB.put("a", "\u2801");
		mapATB.put("b", "\u2803");
		mapATB.put("c", "\u2809");
		mapATB.put("d", "\u2819");
		mapATB.put("e", "\u2811");
		mapATB.put("f", "\u280B");
		mapATB.put("g", "\u281B");
		mapATB.put("h", "\u2813");
		mapATB.put("i", "\u280A");
		mapATB.put("j", "\u281A");
		mapATB.put("k", "\u2805");
		mapATB.put("l", "\u2807");
		mapATB.put("m", "\u280D");
		mapATB.put("n", "\u281D");
		mapATB.put("o", "\u2815");
		mapATB.put("p", "\u280F");
		mapATB.put("q", "\u281F");
		mapATB.put("r", "\u2817");
		mapATB.put("s", "\u280E");
		mapATB.put("t", "\u281E");
		mapATB.put("u", "\u2825");
		mapATB.put("v", "\u2827");
		mapATB.put("w", "\u283A");
		mapATB.put("x", "\u282D");
		mapATB.put("y", "\u283D");
		mapATB.put("z", "\u2835");
		
//		contractions
		mapATB.put("but", 		"\u2803");
		mapATB.put("do", 		"\u2819");
		mapATB.put("every", 	"\u2811");
		mapATB.put("from", 		"\u280B");
		mapATB.put("go", 		"\u281B");
		mapATB.put("have", 		"\u2813");
		mapATB.put("just", 		"\u281A");
		mapATB.put("knowledge", "\u2828");
		mapATB.put("like", 		"\u2838");
		mapATB.put("more", 		"\u280D");
		mapATB.put("not", 		"\u281D");
		mapATB.put("people", 	"\u280F");
		mapATB.put("quite", 	"\u281F");
		mapATB.put("rather", 	"\u2817");
		mapATB.put("so", 		"\u280E");
		mapATB.put("that", 		"\u281E");
		mapATB.put("us", 		"\u2825");
		mapATB.put("very", 		"\u2827");
		mapATB.put("it", 		"\u282D");
		mapATB.put("you", 		"\u283D");
		mapATB.put("as", 		"\u2835");
		mapATB.put("and", 		"\u282F");
		mapATB.put("for", 		"\u283F");
		mapATB.put("of", 		"\u2837");
		mapATB.put("the", 		"\u282E");
		mapATB.put("with", 		"\u283E");
		mapATB.put("will", 		"\u283A");
		mapATB.put("his", 		"\u2826");
		mapATB.put("in", 		"\u2814");
		mapATB.put("was", 		"\u2834");
		mapATB.put("to", 		"\u2816");
		
		// Signs
		mapATB.put(",", "\u2802");
		mapATB.put(";", "\u2806");
		mapATB.put(":", "\u2812");
		mapATB.put(".", "\u2832");
		mapATB.put("!", "\u2816");
		mapATB.put("(", "\u2836");
		mapATB.put(")", "\u2836");
		mapATB.put("?", "\u2826");
		mapATB.put("\\","\u2804");
		mapATB.put("#", "\u283C");
		mapATB.put("/", "\u280C");
		
		return mapATB;
	
	}
	private HashMap<String,String> initializeBrailleToAlphabetLibrary(){
		HashMap<String,String> mapBTA = new HashMap<String,String>();
		
		//swapper key og value i mapATB og lagrer det i mapBTA 
        for(Map.Entry<String, String> entry: mapATB.entrySet()){
        	mapBTA.put(entry.getValue(), entry.getKey());
        }
        return mapBTA;
	}

	

}
