package DSA.Tree;

public class Main {

    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode coke = new TreeNode("Coke");
        TreeNode soda = new TreeNode("Soda");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(coke);
        cold.addChild(soda);
        System.out.println(drinks.print(0));
    }
    
}
