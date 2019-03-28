package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collectionC = getCollectionC(collectionA);
        return updateCollectionC(object, collectionC);

    }

    private Map<String, Integer> updateCollectionC(Map<String, List<String>> object, Map<String, Integer> collectionC) {
        List<String> listB = object.get("value");
        for (int i = 0; i < listB.size(); i++) {
            String cur = listB.get(i);
            if(collectionC.containsKey(cur)){
                collectionC.put(cur, collectionC.get(cur) - collectionC.get(cur) / 3);
            }
        }
        return collectionC;
    }

    private Map<String, Integer> getCollectionC(List<String> collectionA) {
        Map<String, Integer> expectedResult = new HashMap<>();
        for (int i = 0; i < collectionA.size(); i++) {
            String cur = collectionA.get(i);
            String[] strList = cur.split("-");
            if (strList.length > 1){
                expectedResult.put(strList[0],Integer.valueOf(strList[1]));
            }
            else{
                if(expectedResult.containsKey(cur)){
                    expectedResult.put(cur,expectedResult.get(cur)+1);
                }
                else{
                    expectedResult.put(cur,1);
                }
            }
        }
        return expectedResult;
    }
}
