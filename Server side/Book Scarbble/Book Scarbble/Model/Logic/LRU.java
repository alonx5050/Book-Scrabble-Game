//written by: Roee Shemesh - 209035179
package test;

import java.util.LinkedHashSet;

public class LRU implements CacheReplacementPolicy{
    LinkedHashSet<String> wordsInCache=new LinkedHashSet<String>();
    public void add(String word){
        if(wordsInCache.contains(word))
                wordsInCache.remove(word);
        wordsInCache.add(word);
    }
    public String remove(){
        return wordsInCache.iterator().next();
    }
}
