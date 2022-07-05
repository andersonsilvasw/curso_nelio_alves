package cursonelioalves.section19.application;

import cursonelioalves.section19.entities.ListProducts;

import java.util.HashSet;
import java.util.Set;

public class ProgramListProducts {
    public static void main(String[] args) {

        Set<ListProducts> set = new HashSet<>();

        set.add(new ListProducts("TV", 900.00));
        set.add(new ListProducts("Notebook", 1200.00));
        set.add(new ListProducts("Tablet", 400.00));

        ListProducts prod = new ListProducts("Notebook", 1200.00);

        System.out.println(set.contains(prod));
    }
}
