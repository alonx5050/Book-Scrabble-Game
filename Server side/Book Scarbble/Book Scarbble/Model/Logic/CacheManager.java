//written by: Roee Shemesh - 209035179
package test;

import java.util.HashSet;
public class CacheManager {
    private final CacheReplacementPolicy crp;
    private final int size;
	public CacheManager(int size,CacheReplacementPolicy crp){
        this.size=size;
        this.crp=crp;
    }
    HashSet<String> wordsInCache=new HashSet<String>();
    public boolean query(String word){
        return wordsInCache.contains(word);
    }
    public void add(String word){
        crp.add(word);
        wordsInCache.add(word);
        if (wordsInCache.size()>size)
            wordsInCache.remove(crp.remove());
    }

}
