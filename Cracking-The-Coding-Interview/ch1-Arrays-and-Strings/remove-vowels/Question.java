import java.util.*; 

  static String removeVowels(String word) {
    if (word == null) {
      throw new ArgumentNullException();
    }
    if (word.isEmpty()) {
      return word;
    }
    Set<Character> vowels = new HashSet<Character>(Arrays.asList('a','o','u','e','i'));
    char[] wordChars = word.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < wordChars.length; i++) {
      char c = wordChars[i];
      if (!vowels.contains(c)) {
        sb.append(c);
      }
    }
    return sb.toString();
  }
