import java.util.*;


/**
 * Created by James Lockley on 03/10/2016.
 *
 */
@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class Maps {

	int numberOfEntries;
	String questionTwoAnswer;
	String questionThreeLunch;
	String questionThreeDinner;
    String questionFourAnswer;

	Map<String, String> hashMap = new HashMap<>();
	Map<String, String> emptyMap = new HashMap<>();


	/*****************************************************************
	 *1. We can see how many entries our Map has
	 *****************************************************************/
	public Integer sizeOfMap() {
		Map<String, String> simpleMap = createSimpleMap("Key", "Value");
        numberOfEntries = 10;
		return simpleMap.size();
	}

	/*****************************************************************
	 *2. We can access Map keys to get the value associated
	 *****************************************************************/
	public String valuesFromMap() {
		hashMap = createSimpleMap("Breakfast", "Eggs");
		return hashMap.get("Breakfast");
	}

	/*****************************************************************
	 *3. We can add to our Map
	 *See if you can guess what I want for lunch
	 *****************************************************************/
	public String addToMap(String lunch) {
        questionThreeLunch = "Baked Potato";
		hashMap.put("Lunch", questionThreeLunch);
		return lunch;
	}

	/*****************************************************************
	 *4. We can see if our dictionary has a key
	 *****************************************************************/
	public Boolean isKeyInMap() {
        questionFourAnswer = "Brunch";
		return hashMap.containsKey(questionFourAnswer);
	}

	/*****************************************************************
	 *5. We can add a dictionary into another dictionary
	 *****************************************************************/
	public Map<String, String> addMapToMap(String key, String value) {
		Map<String, String> anotherMap = createSimpleMap(key, "Ice-cream");
		hashMap.putAll(anotherMap);
		return hashMap;
	}

	/*****************************************************************
	 *6. We can list the keys of a map
	 *****************************************************************/
	public Set<String> keysOfMap() {
        Map<String, String> tempMap = createSimpleMap("Elevensies","Grapes");
		Set<String> keys = hashMap.keySet();
		return tempMap.keySet();
	}

	/*****************************************************************
	 *7. We can also list the values of a map
	 ****************************************************************/
	public Collection<String> valuesOfMap() {
        Map<String, String> tempMap = createSimpleMap("Fondue","Cheese");
		return tempMap.values();
	}





	/*****************************************************************
	 *The following is not a question
	 * Can you work out what this Method does and why it is here?
	 *****************************************************************/
	private static <T> Map<T, String> createSimpleMap(T key, String value) {
		Map<T, String> map = new HashMap<>();
		map.put(key, value);
		return map;
	}

}
