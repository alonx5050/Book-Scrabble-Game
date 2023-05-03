//written by: Roee Shemesh - 209035179
package test;

import java.util.LinkedHashMap;

public class LFU implements CacheReplacementPolicy{
    LinkedHashMap<String,Integer> wordsInCache=new LinkedHashMap<String,Integer>();
    public void add(String word){
        int newValue=1;
        if(wordsInCache.containsKey(word)) {
            newValue = wordsInCache.get(word) + 1;
            wordsInCache.remove(word);
        }
        wordsInCache.put(word,newValue);
    }
    public String remove() {
        String key=wordsInCache.keySet().iterator().next();
        int min = wordsInCache.get(key);
        for(String word : wordsInCache.keySet()){
            if(wordsInCache.get(word) < min) {
                min = wordsInCache.get(word);
                key = word;
            }
        }
        return key;
    }
}
