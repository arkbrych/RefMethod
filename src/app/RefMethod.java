package app;

import java.util.ArrayList;
import java.util.List;

public class RefMethod {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Arkadiusz");
        names.add("Piotr");
        names.add("Anna");
        names.add("Jarek");
        names.add("Sławek");

        System.out.println(names);

        // _Klasa anonimowa_
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
//        System.out.println(names);

        // _Lambda_
//        Collections.sort(names, (x, y) -> x.compareToIgnoreCase(y) );
//        System.out.println(names);

        // _Referencja metody_
//        Collections.sort(names, String::compareToIgnoreCase);
//        System.out.println(names);

        // _Referencja metody - sort jest w liście_
        names.sort(String::compareToIgnoreCase);
        System.out.println(names);

    }
}
