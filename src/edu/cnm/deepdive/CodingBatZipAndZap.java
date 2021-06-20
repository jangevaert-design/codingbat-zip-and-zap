package edu.cnm.deepdive;

  /*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp"

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
   */

public class CodingBatZipAndZap {

  public static void main(String[] args) {
    System.out.printf("The String %s gives the following: " + zipZap("zipXzap") + ".\n", "zipXzap");
    System.out.printf("The String %s gives the following: " + zipZap("zopzop") + ".\n", "zopzop");
    System.out.printf("The String %s gives the following: " + zipZap("zzzopzop") + ".\n", "zzzopzop");
  }

  public static String zipZap(String str) {

    for (int i = 0; i < str.length() - 2; i++) {
      if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
        str = str.substring(0, i + 1) + str.substring(i + 2);
      }
    }
    return str;
  }

}
