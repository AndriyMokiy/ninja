package ninja;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {

        Cat grishkaCat = new Cat();
        grishkaCat.setName("Grishka");

        Cat murzikCat = new Cat();
        murzikCat.setName("Murzik");

        Cat kolyaCat = new Cat();
        kolyaCat.setName("Kolya");

        Cat barsikCat = new Cat();
        barsikCat.setName("Barsik");

        Cat dashaCat = new Cat();
        dashaCat.setName("Dasha");

        Cat mashaCat = new Cat();
        mashaCat.setName("Masha");

        Cat vovaCat = new Cat();
        vovaCat.setName("Vova");

        Cat vaskaCat = new Cat();
        vaskaCat.setName("Vaska");

        Cat bublikCat = new Cat();
        bublikCat.setName("Bublik");


        HashMap<String, Cat> catHashMap = new HashMap<>();

        catHashMap.put(grishkaCat.getName(), grishkaCat);

        catHashMap.put(murzikCat.getName(), murzikCat);

        catHashMap.put(kolyaCat.getName(), kolyaCat);

        catHashMap.put(barsikCat.getName(), barsikCat);

        catHashMap.put(dashaCat.getName(), dashaCat);

        catHashMap.put(mashaCat.getName(), mashaCat);

        catHashMap.put(vovaCat.getName(), vovaCat);

        catHashMap.put(vaskaCat.getName(), vaskaCat);

        catHashMap.put(bublikCat.getName(), bublikCat);

        Iterator iterator = catHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        fun();

    }

    public static void fun() {
        HashSet<String> hset = new HashSet<>();
        hset.add("банан");
        hset.add("вишня");
        hset.add("груша");
        hset.add("дыня");
        hset.add("ежевика");
        hset.add("женьшень");
        hset.add("земляника");
        hset.add("ирис");
        hset.add("картофель");
        System.out.println(hset);

        for (String element : hset)
            System.out.println(element);

    }


}

