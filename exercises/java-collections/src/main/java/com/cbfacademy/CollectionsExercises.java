package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> integers = new LinkedList<>();

        //  - add 4 as the first element of the list
        integers.addFirst(4);
        //  - then add 5, 6, 8, 2, 9 to the list
        integers.addAll(Arrays.asList(5, 6, 8, 2, 9));
        //  - add another 2 as the last element of the list
        integers.addLast(2);
        //  - add 4 as the 3rd element of the list
        integers.add(2, 4);
        //  - invoke the method element() on the list and print the result on the screen
        System.out.print(integers.element());
        //  - return the list
        return integers;
        // throw new RuntimeException("Not implemented");
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        Stack<Integer> stacks = new Stack<>();
        //  - add 5, 6, 8, 9 to the stack
        stacks.push(5);        
        stacks.push(6);        
        stacks.push(8);        
        stacks.addElement(9);        
        //  - print the first element of the stack on the screen
        System.out.print(stacks.firstElement());
        //  - print the last element of the stack on the screen
        System.out.print(stacks.lastElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        // int poppedElement = stacks.pop();
        System.out.print(stacks.pop());
        //  - invoke the push(4) method on the stack
        stacks.push(4);
        //  - return the stack
        return stacks;
        // throw new RuntimeException("Not implemented");
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> dequeue = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the queue
        dequeue.add(5);
        dequeue.add(6);
        dequeue.add(8);
        dequeue.add(9);

        //  - print the first element of the queue on the screen
       System.out.print(dequeue.getFirst());
        //  - print the last element of the queue on the screen
       System.out.print(dequeue.getLast());
        //  - invoke the method poll() on the queue and print the result on the screen
       System.out.print(dequeue.poll());
       
        //  - invoke the element() method on the queue and print the result on the screen
       System.out.print(dequeue.element());

        //  - return the queue
        return dequeue;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        Map<Integer, String> languages = new HashMap<>();
        //  - add {1, TypeScript} entry to the map
        languages.put(1, "Typescript");
        //  - add {2, Kotlin} entry to the map
        languages.put(2, "Kotlin");
        //  - add {3, Python} entry to the map
        languages.put(3, "Python");
        //  - add {4, Java} entry to the map
        languages.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        languages.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map
        languages.put(6, "Rust");
        // Return the keys and then the values associated 
        return (HashMap<Integer, String>) languages;
        //  - determine the set of keys from the map and print it on the screen

        

        //  - determine the set of values from the map and print it on the screen

        //  - determine whether the map contains "English" as a language and print the result on the screen

        // System.out.print(languages.containsValue("English"));

        //  - return the map
        // throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Collections Exercises";
    }
}
