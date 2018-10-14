package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    static int[] data = {5, 8, 21, 5, 12, 6, 1, 2, 6, 8, 3, 1, 8, 1, 53};
    static Histogram histo;
    static Map<Integer, Integer> histogr;
    
    public static void main(String[] args) {
        histo = new Histogram(data);
        histogr = histo.getHistogram();
        showHist();
        
    }
    
    static void showHist(){
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey()+ "==>"+ histogr.get(entry.getKey()));
        }
    }    
}
