package com.ksenoZaur;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    public List<String> getPatterns() {
        return  new ArrayList<String>() {{ add("Adapter"); add("Proxy"); add("Decorator"); add("Composite");}};
    }

    public List<String> getLanguages() {
        return  new ArrayList<String>() {{ add("Java"); add("C#"); add("JavaScript");}};
    }

    public void generate() {

    }
}
