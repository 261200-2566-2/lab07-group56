import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
            HSet<String> set = new HSet<>();

            //Add
            set.add("Red");
            set.add("Green");
            set.add("Blue");

            //Show size
            System.out.println("Size: " + set.size());
            //check isEmpty
            System.out.println("Is empty? : "+set.isEmpty());
            //show all elements
            System.out.println("Set:");
            for (String s : set) {
                System.out.println(" - " + s);
            }
            //check Red are contain in set
            System.out.println("Are red contains in Set : "+set.contains("Red"));
            System.out.println("--------------------------------------");

            //create collection color
            Set<String> allColors = new HSet<>();
            allColors.add("Pink");
            allColors.add("Orange");
            allColors.add("Purple");
            //addAll
            set.addAll(allColors);
            System.out.println("Size: " + set.size());
            //show all element
            for (String s : set) {
                System.out.println(" - " + s);
            }
            //กรณี add ซ้ำ
            allColors.add("Pink");
            //containsAll
            System.out.println("All colors is in this set : "+set.containsAll(allColors));
            //remove
            set.remove("Pink");
            set.remove("Purple");
            System.out.println("Size: " + set.size());
            for (String s : set) {
                System.out.println(" - " + s);
            }
            System.out.println("--------------------------------------");
        }

}