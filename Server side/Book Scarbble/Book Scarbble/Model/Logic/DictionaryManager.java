//written by: Roee Shemesh - 209035179
package test;

import java.util.HashMap;

public class DictionaryManager {

    HashMap<String, Dictionary> books = new HashMap<String, Dictionary>();
    private static DictionaryManager myDictionaryManager = null;

    public static DictionaryManager get() {
        if (myDictionaryManager == null)
            myDictionaryManager = new DictionaryManager();
        return myDictionaryManager;
    }

    private void addBooks(String... args) {
        for (int i = 0; i < args.length - 1; i++) {
            if (!books.containsKey(args[i]))
                books.put(args[i], new Dictionary(args[i]));
        }
    }

    public boolean query(String... args) {
        boolean flag = false;
        addBooks(args);
        for (int i = 0; i < args.length - 1; i++) {
            if (books.get(args[i]).query(args[args.length - 1]))
                flag = true;
        }
        return flag;
    }

    public boolean challenge(String... args) {
        boolean flag = false;
        addBooks(args);
        for (int i = 0; i < args.length - 1; i++) {
            if (books.get(args[i]).challenge(args[args.length - 1]))
                flag = true;
        }
        return flag;
    }

    public int getSize() {
        return books.size();
    }
}
