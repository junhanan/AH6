import java.util.List;
import java.util.ArrayList;
import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    List<String> result = new ArrayList<>();
    // broooooo initialize the head of the linked list
    Node<String> current = head;

    while (current != null) {
      // add val to the current node
      result.add(current.val);
      // after adding the current node's value to the result list
      // update the current to the next node
      current = current.next;
    }
    return result;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    
    // -> [ "a", "b", "c", "d" ]

    // List<String> values = Solution.linkedListValues(a);
    System.out.println(Solution.linkedListValues(a));
  }
}
