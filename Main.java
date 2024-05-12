package Tugas11;

public class Main {
  static int factorial(int n)
  {
    if(n == 1)
    {
      return 1;
    }
    else {
      return n * factorial(n-1);
    }
  }

  public static void main(String[] args)
  {
      Node root = new Node(5);
      BinarySearchTree bst = new BinarySearchTree(root);
      bst.insert(2);
      bst.insert(4);
      bst.insert(10);
      bst.insert(7);
      bst.insert(8);
      bst.insert(6);
      bst.insert(11);

      int n = 3;
      System.out.println("Factorial " + n + ": " + factorial(n));
    
      System.out.println("In Order: ");
      bst.inOrder(root);
      System.out.println("\nPost Order: ");
      bst.postOrder(root);
      System.out.println("\nPre Order");
      bst.preOrder(root);
  }
}
