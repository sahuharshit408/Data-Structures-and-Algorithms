package DSA.AllPairShortestPath.FloydWarshallAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode> {
    public String name;
    public ArrayList<WeightedNode> neighbors = new ArrayList<WeightedNode>();
    public HashMap<WeightedNode, Integer> weightMap = new HashMap<>();
    public boolean isVisited = false;
    public WeightedNode parent;
    public int index ;
    public int distance;

    public WeightedNode(String name , int index){
        this.name = name;
        distance = Integer.MAX_VALUE;
        this.index = index;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(WeightedNode o) {
        return this.distance;
    }
}