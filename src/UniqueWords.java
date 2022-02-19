
/*Project: Lab2 git hub
 * Class: UniqueWords.java
 * Author: Sara Vrbic
 * Date: February 18 2022
 * sees how many unique words there are in the array list.
 */



import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
	public static int countUnique(ArrayList<String> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j)) && j != i) {
					break;
				} else if (j == list.size() - 1) {
					count++;
				}

			}
		}
		return count;
	}

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}

