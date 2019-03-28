package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> listB = object.get("value");
        for (int i = 0; i < listB.size(); i++) {
            String cur = listB.get(i);
            if(collectionA.containsKey(cur)){
                collectionA.put(cur, collectionA.get(cur) - collectionA.get(cur) / 3);
            }
        }
        return collectionA;
    }
}
