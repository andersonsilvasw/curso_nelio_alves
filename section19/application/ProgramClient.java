package cursonelioalves.section19.application;

import cursonelioalves.section19.entities.Client;

public class ProgramClient {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");
        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        // Mesmo c1 e c2 estando com os mesmos conteúdos, c1 igual a c2 deu como false, pq o que importa no == é o espaço da memória e não o conteúdo.
        System.out.println(s1 == s2);
        // Nesse caso deu true pq o compilador trata a expressão literal de forma especial, diferente seria se tivessa = new String("Test"); aí daria false.
    }
}
