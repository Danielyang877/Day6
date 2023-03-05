//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // primitive type
        int i = 1;
        boolean isWillieAMan = true;

        // Object
        Integer j = Integer.valueOf(1);
        System.out.println(j);

        System.out.println("Generic");
        Foo<String, Integer> foo = new Foo();
        foo.setI("hello");
        foo.j = 1;
        foo.print();

        System.out.println("Map =====");
        // Dictionary, Map
        // ["xxx": "yyy"]
        Map<String, String> map = new HashMap<>();
        map.put("willie", "is tall");
        map.put("daniel", "is tall too");
        map.put("willie", "is short");

        System.out.println(map.get("willie"));


        // linked list 1-2-3
        System.out.println("List ====");
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
    }
}


// interface