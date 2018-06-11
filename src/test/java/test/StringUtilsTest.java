package test;

import dev.StringUtils;

public class StringUtilsTest {

	public static boolean levenshteinDistanceTest(String ch1, String ch2)
	{
		if(ch1.equals("chat") && ch2.equals("chats") && StringUtils.levenshteinDistance(ch1, ch2) == 1)
			return true;
		else if(ch1.equals("chien") && ch2.equals("chine") && StringUtils.levenshteinDistance(ch1, ch2) == 2)
			return true;
		else 
			return false;
	}

	public static void affichage(boolean bool)
	{
		if(bool)
			System.out.println("fonctionne");
		else
			System.out.println("fonctionne pas");
	}
	
	public static void main(String[] args)
	{
		System.out.println("cas 1: ");
		StringUtilsTest.affichage(levenshteinDistanceTest("chat","chats"));
		System.out.println("cas 2: ");
		StringUtilsTest.affichage(levenshteinDistanceTest("chien","chine"));
		System.out.println("cas 3: ");
		StringUtils.levenshteinDistance("test", null);
	}
	
}
