package dev.lpa;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Can be declared exactly like an AL
//        LinkedList<String> placesToVisit = new LinkedList<>();

        // Can also decl w. var
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
//        System.out.println(placesToVisit);

        addMoreEls(placesToVisit);
//        System.out.println(placesToVisit);

        removeEls(placesToVisit);

        System.out.println(placesToVisit);

    }

    private static void addMoreEls  (LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        // Stack methods
        list.push("Alice Springs");

    }

    private static void removeEls(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");

        String s1 = list.remove(); //removes first el
//        System.out.println(s1 + " was removed");
        String s2 = list.removeFirst(); //removes first el
//        System.out.println(s2 + " was removed");
        String s3 = list.removeLast(); //removes first el
//        System.out.println(s3 + " was removed");

        // Queue/Deque poll methods
        String p1 = list.poll();
//        System.out.println(p1 + "was removed");

        String p2 = list.pollFirst();
//        System.out.println(p2 + "was removed");
        String p3 = list.pollLast();
//        System.out.println(p3 + "was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); // removes first el
        System.out.println(p4 + " was removed");

    }
}