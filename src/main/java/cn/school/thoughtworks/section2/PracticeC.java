package cn.school.thoughtworks.section2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> expectedResult = new HashMap<>();
        for (int i = 0; i < collection1.size(); i++) {
            String[] strList = (collection1.get(i)).split(":|-|[\\[\\]]");
            String cur = strList[0];
            int addNum = 1;
            if (strList.length > 1){
                addNum = Integer.valueOf(strList[1]);
            }
            if(expectedResult.containsKey(cur)){
                expectedResult.put(cur,expectedResult.get(cur)+addNum);
            }
            else{
                expectedResult.put(cur,addNum);
            }
        }
        return expectedResult;
    }
}
