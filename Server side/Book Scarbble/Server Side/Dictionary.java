//written by: Roee Shemesh - 209035179
package test;

import java.io.IOException;
import java.io.*;


public class Dictionary {
    private final CacheManager existWords;
    private final CacheManager notExistWords;
    private final BloomFilter bloomFilter;
    private String[] filesNames;

    public Dictionary(String... filesNames) {
        existWords = new CacheManager(400, new LRU());
        notExistWords = new CacheManager(100, new LFU());
        bloomFilter = new BloomFilter(256, "MD5", "SHA1");
        this.filesNames = filesNames;
        for (String filename : filesNames) {
            File file = new File(filename);
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String st;
                while ((st = br.readLine()) != null) {
                    String[]words=st.split(" ");
                    for (String word : words)
                        if(word.compareTo("")!=0)
                        bloomFilter.add(word);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Boolean query(String word) {
        if (existWords.wordsInCache.contains(word))
            return true;
        if (notExistWords.wordsInCache.contains(word))
            return false;
        if (bloomFilter.contains(word)) {
            existWords.add(word);
            return true;
        }
        notExistWords.add(word);
        return false;
    }

    public Boolean challenge(String word) {
        try {
            if (IOSearcher.search(word,filesNames)) {
                existWords.add(word);
                return true;
            }
            notExistWords.add(word);
            return false;
        }
        catch (IOException e) {
            return false;
        }
    }


}
