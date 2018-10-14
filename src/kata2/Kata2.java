package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    static int[] data = {5, 8, 21, 5, 12, 6, 1, 2, 6, 8, 3, 1, 8, 1, 53};
    static Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
    
    public static void main(String[] args) {
        histogramCalc();
        showHist();      
    }
    
    static void histogramCalc(){
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{histogram.put(data[i], 1);}
            
        }
    }
    
    static void showHist(){
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey()+ "==>"+histogram.get(entry.getKey()));
        }
    }    
}
