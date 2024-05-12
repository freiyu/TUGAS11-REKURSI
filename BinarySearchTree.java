package Tugas11;

public class BinarySearchTree {
  Node root;
  
  public BinarySearchTree(Node root) 
  {
      this.root = root;
  }

  public void insert(int n)
  {
      Node newNode = new Node(n);
      Node temp = root;

      while(temp != null)
      {
        if(temp.value > n)
        {
          if(temp.left == null)
          {
            temp.left = newNode;
            return;
          }
          temp = temp.left;
        }
        else if(temp.value < n)
        {
          if(temp.right == null)
          {
            temp.right = newNode;
            return;
          }
          temp = temp.right;
        }
        else
        {
          return;
        }
      }
  }

  public void inOrder(Node node)
  {
    //Modifikasi bagian ini
    if(node != null){
      inOrder(node.left);
      System.out.print(node.value + " ");
      inOrder(node.right);
    }
  }

  public void preOrder(Node node)
  {
    //Modifikasi bagian ini
    if(node != null){
      System.out.print(node.value + " ");
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  public void postOrder(Node node)
  {
    //Modifikasi bagian ini
    if(node != null){
      postOrder(node.left);
      postOrder(node.right);
      System.out.print(node.value + " ");
    }
    
  }
}
