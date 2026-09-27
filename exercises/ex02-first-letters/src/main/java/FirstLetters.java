/**
 * Exercise (Chapter 1: Introduction to Java) — Strings and StringBuilder.
 * <p>
 * Complete {@link #firstLetters(String)} below.
 * <p>
 * <p>
 * Relevant reading: 1.4. Strings and 1.4.4. StringBuilder.
 */
public class FirstLetters {

  public static void main(String[] args) {
    String phrase = "Idol Long Oolong Vertical Europe University Toyota";
    // Should print ILOVEUT once firstLetters is implemented.
    System.out.println("First letters of \"" + phrase + "\": " + firstLetters(phrase));
  }

  /**
   * Given a string of words separated by single spaces, returns a new string
   * made of the first character of each word, in order. You may assume the
   * input contains at least one word.
   * <p>
   * Example: {@code firstLetters("Good Morning")} returns {@code "GM"}.
   *
   * @param words a non-empty string of words separated by single spaces
   * @return the first character of each word, concatenated
   */
  public static String firstLetters(String words) {
    StringBuilder string = new StringBuilder();
    words = strip_leading(words);
    int first_index = 0;
    for (int i = 0; i < words.length(); i++) {
      Character chr = words.charAt(i);

      if (chr.equals(' ')) {
        string.append(words.charAt(first_index));
        first_index = i + 1;
      }
    }
    if (first_index < words.length()) {
      string.append(words.charAt(first_index));
    }
    return string.toString();
  }

  public static String strip_leading(String words) {
    int first_index = 0;
    for (int i = 0; i < words.length(); i++) {
      Character chr = words.charAt(i);

      if (chr.equals(' ')) {
        continue;
      } else {
        first_index = i;
        break;
      }
    }

    return words.substring(first_index);
  }
}
