package DSA.SingleSourceShortestPath.BFS;

import DSA.SingleSourceShortestPath.BFS.GraphNode;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {

    ArrayList<DSA.SingleSourceShortestPath.BFS.GraphNode> nodeList;
    int[][] adjacencyMatrix;

    public Graph(ArrayList<DSA.SingleSourceShortestPath.BFS.GraphNode> nodeList){
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i , int j){
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(" ");
        for (int i = 0 ; i < nodeList.size() ; i++){
            s.append(nodeList.get(i).name+" ");
        }
        s.append("\n");
        for (int i = 0 ; i < nodeList.size() ; i++){
            s.append(nodeList.get(i).name+": ");
            for (int j : adjacencyMatrix[i]){
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public ArrayList<DSA.SingleSourceShortestPath.BFS.GraphNode> getNeighbours(DSA.SingleSourceShortestPath.BFS.GraphNode node){
        ArrayList<DSA.SingleSourceShortestPath.BFS.GraphNode> neighbours = new ArrayList<DSA.SingleSourceShortestPath.BFS.GraphNode>();
        int nodeIndex = node.index;
        for (int i = 0 ; i < adjacencyMatrix.length ; i++){
            if (adjacencyMatrix[nodeIndex][i] == 1){
                neighbours.add(nodeList.get(i));
            }
        }
        return neighbours;
    }

    void bfsVisit(DSA.SingleSourceShortestPath.BFS.GraphNode node){
        LinkedList<DSA.SingleSourceShortestPath.BFS.GraphNode> queue = new LinkedList<DSA.SingleSourceShortestPath.BFS.GraphNode>();
        queue.add(node);
        while (!queue.isEmpty()){
            DSA.SingleSourceShortestPath.BFS.GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<DSA.SingleSourceShortestPath.BFS.GraphNode> neighbours = getNeighbours(currentNode);
            for (DSA.SingleSourceShortestPath.BFS.GraphNode neighbour: neighbours){
                if (!neighbour.isVisited){
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }

    public void bfs(){
        for (DSA.SingleSourceShortestPath.BFS.GraphNode node: nodeList){
            if (!node.isVisited){
                bfsVisit(node);
            }
        }
    }

    void dfsVisit(DSA.SingleSourceShortestPath.BFS.GraphNode node){
        Stack<DSA.SingleSourceShortestPath.BFS.GraphNode> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            DSA.SingleSourceShortestPath.BFS.GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name+ " ");
            ArrayList<DSA.SingleSourceShortestPath.BFS.GraphNode> neighbors = getNeighbours(currentNode);
            for (DSA.SingleSourceShortestPath.BFS.GraphNode neighbor : neighbors){
                if (!neighbor.isVisited){
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    void dfs(){
        for (DSA.SingleSourceShortestPath.BFS.GraphNode node : nodeList){
            if (!node.isVisited){
                dfsVisit(node);
            }
        }
    }
    public void addDirectedEdge(int i , int j){
        adjacencyMatrix[i][j] = 1;
    }

    void topologicalVisit(DSA.SingleSourceShortestPath.BFS.GraphNode node , Stack<DSA.SingleSourceShortestPath.BFS.GraphNode> stack){
        ArrayList<DSA.SingleSourceShortestPath.BFS.GraphNode> neighbors = getNeighbours(node);
        for (DSA.SingleSourceShortestPath.BFS.GraphNode neighbor : neighbors){
            if (!neighbor.isVisited){
                topologicalVisit(neighbor , stack);
            }
        }
        node.isVisited = true;
        stack.push(node);
    }

    void topologicalSort(){
        Stack<DSA.SingleSourceShortestPath.BFS.GraphNode> stack = new Stack<>();
        for (DSA.SingleSourceShortestPath.BFS.GraphNode node : nodeList){
            if (!node.isVisited){
                topologicalVisit(node, stack);
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop().name+ " ");
        }
    }

    public static void pathPrint(GraphNode node){
        if (node.parent!=null){
            pathPrint(node.parent);
        }
        System.out.print(node.name+" ");
    }

    public void bfsForSSSP(GraphNode node){
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNode currentNode = queue.remove();
            currentNode.isVisited = true;
            System.out.print("Printing Path for "+currentNode.name+": ");
            pathPrint(currentNode);
            System.out.println();
            ArrayList<GraphNode> neighbors = getNeighbours(currentNode);
            for (GraphNode neighbor : neighbors){
                if (!neighbor.isVisited){
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                    neighbor.parent = currentNode;
                }
            }
        }
    }
}
