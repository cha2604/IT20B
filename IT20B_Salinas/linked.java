package midterm;


import java.util.LinkedList;

public class linked {

    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();

// insertion
        name.add("Clodan");
        name.addFirst("Ranielo");
        name.addLast("Carcel");
        name.add("Magnus");

        System.out.println("Linked List Original: " + name);
        System.out.println(name.size());

//  Seraching  
        if (name.contains("Clodan")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        boolean containslion = name.contains("Clodan");
        System.out.println(containslion);

//      Deletion
//        name.remove();
//        name.removeFirst();
//        name.removeLast();
//        name.remove(2);
//        System.out.println("LinkedList After Deletion: " + name);
//        Insertion:    add(); addFirst();  addLast();  add(index, data);
//         Deletion:    remove();   removeFirst();  removeLast(); remove(index);
//          Searching operation:        contains(element); size();
    }

}