package study.chapter6.item35;

import study.chapter6.item34.enum_ex.Rainbow;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //ordinal
        System.out.println(Rainbow.RED);

        //enumMap 에서 ordinal() 사용하는 내용 디버깅
        Map<Rainbow, Integer> rainbowEnumMap = new EnumMap<>(Rainbow.class);
        rainbowEnumMap.put(Rainbow.RED, 10);

        //enumSet
        Set<Rainbow> rainbowSet = EnumSet.allOf(Rainbow.class);
        rainbowSet.remove(Rainbow.RED);
        rainbowSet.add(Rainbow.GREEN);
        System.out.println(rainbowSet);
    }
}
