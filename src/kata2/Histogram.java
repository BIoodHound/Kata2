/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;
import static kata2.Kata2.data;

/**
 *
 * @author gonca
 */

public class Histogram<T> {
    private final T[] data;

    public Histogram(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    
    public Map<String, Integer> getHistogram(){
        Map<String, Integer> histogram = new HashMap<String, Integer>();
        for (T key : data) {
            histogram.put((String) key, histogram.containsKey(key) ? histogram.get(key) + 1: 1);
        }
        
        return histogram;
    }
}
