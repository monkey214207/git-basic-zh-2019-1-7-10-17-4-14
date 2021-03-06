package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> expectedResult = new HashMap<>();
        for (int i = 0; i < collection1.size(); i++) {
            String cur = collection1.get(i);
            if(expectedResult.containsKey(cur)){
                expectedResult.put(cur,expectedResult.get(cur)+1);
            }
            else{
                expectedResult.put(cur,1);
            }
        }

        return expectedResult;
    }
}
