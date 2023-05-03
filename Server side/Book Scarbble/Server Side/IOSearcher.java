//written by: Roee Shemesh - 209035179
package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class IOSearcher {

    public static Boolean search(String word,String...files) throws IOException {
        for(String fileName : files){
            File f1=new File(fileName);
            String[] words;
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            String s;
            while((s=br.readLine())!=null)
            {
                words=s.split(" ");
                for (String w : words)
                {
                    if (w.equals(word))
                    {
                        return true;
                    }
                }
            }
            fr.close();
        }
        return false;
    }
}
