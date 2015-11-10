/**
 * Created by Вадик on 10.11.2015.
 */
public class Spell {
    public static  int[] letterHist(String str){
        int[] hist = new int[26];
        int index;
        char[] chars = str.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            index = chars[i]-97;
            hist[index]++;
        }
        return hist;
    }

    public static boolean canSpell(String base, String toCheck){
        int[] histogramBase = letterHist(base);
        int[] histogramToCheck = letterHist(toCheck);

        for (int i = 0; i < histogramToCheck.length ; i++) {
            if(histogramToCheck[i] > histogramBase[i] && histogramToCheck[i] != 0){
                return false;
            }
        }
        return true;
    }
}
