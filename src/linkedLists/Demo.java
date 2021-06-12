package linkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//
        printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs");
//        placesToVisit.remove(4);

    }

    private static void printList(LinkedList<String> linkedList){
        // use ITERATOR
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {  //hasNext()  checks to see if an element points to another element
            System.out.println("Now visiting " + i.next()); // next() returns the current element
                                                        // and moves on to the next element.
        }
        System.out.println("================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            // .next() get us to the first entry
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                //equal.  Do not add
                System.out.println(newCity + " is already included");
                return false;
            } else if(comparison > 0) {
                // newCity should appear before this one
                // but we're already moved on with next().  So we have to go back
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                //move on to next city

            }
        }
        // if we get to the end of the list and still haven't added the city....
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itinerary.");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
        }
        while(!quit) {
            int action = scanner.nextInt();
            //clear input line
            scanner.nextLine();
        }
    }
}
