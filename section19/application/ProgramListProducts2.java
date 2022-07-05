package cursonelioalves.section19.application;

import cursonelioalves.section19.entities.ListProducts2;

import java.util.Set;
import java.util.TreeSet;

public class ProgramListProducts2 {
    public static void main(String[] args) {

        Set<ListProducts2> set = new TreeSet<>();

        set.add(new ListProducts2("TV", 900.00));
        set.add(new ListProducts2("Notebook", 1200.00));
        set.add(new ListProducts2("Tablet", 400.00));

        for (ListProducts2 p : set) {
            System.out.println(p);
        }
    }
}
