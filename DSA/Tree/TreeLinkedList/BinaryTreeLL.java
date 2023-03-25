package DSA.Tree.TreeLinkedList;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeLL {

    BinaryNode root;

    public BinaryTreeLL(){
        this.root = null;
    }

    //preOrder Traversal

    public void preOrder(BinaryNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //InOrder Traversal

    public void InOrder(BinaryNode node){
        if(node == null){
            return;
        }
        InOrder(node.left);
        System.out.print(node.value+" ");
        InOrder(node.right);
    }

    //PostOrder Traversal

    public void PostOrder(BinaryNode node){
        if(node == null){
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.value+" ");

    }

    //LevelOrder Traversal

    public void LevelOrder(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value+" ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }

    // search

    public void search(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = new BinaryNode();
            if(presentNode.value == value){
                System.out.println("Found "+value+" in the Tree");
                return;
            }else{
                if(presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The Value "+value+" is Not Found in the Tree");
    }

    public void Insert(String value){
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if(root == null){
            root = newNode;
            System.out.println("Inserted new Node at Root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.left == null){
                presentNode.left = newNode;
                System.out.println("Inserted new Node at Left");
                break;
            }else if(presentNode.right == null){
                presentNode.right = newNode;
                System.out.println("Inserted New node at Right");
                break;
            }
            else{
                queue.add(presentNode.left);
                queue.add(presentNode.right); 
            }
        }
    }

    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode , presentNode = null;
        while(!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();

            if(presentNode.left == null){
                previousNode.right = null;
                return;
            }else if(presentNode.right == null){
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    public void DeleteNode(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value == value){
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("The Node is Deleted");
                return;
            }else{
                if(presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The Node Does Not Exist in Tree");
    }

    public void DeleteTree(){
        root = null;
        System.out.println("Binary Tree has Been Deleted");
    }
    
}
