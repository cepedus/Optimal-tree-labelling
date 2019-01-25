import java.util.ArrayList;
import java.util.HashSet;

public class LabeledTree{
    Vertex[] vertexes;
    ArrayList<HashSet<Integer>> adj;
    int size;

    LabeledTree(int N){
        this.size = N;
        this.adj = new ArrayList<HashSet<Integer>>(N);
        this.vertexes = new Vertex[N];
        for(int i = 0; i < N; i++){
            this.vertexes[i] = new Vertex(i);
            this.adj.add(new HashSet<>());
        }
    }

    public boolean isLeaf(int n){
        return this.adj.get(n).size() == 1
        ;
    }

    public int leafCount(){
        int count = 0;
        for(int i = 0; i < this.size; i++) if(isLeaf(i)) count++;
        return count;
    }

    public boolean isLink(int u, int v){
        return this.adj.get(u).contains(v);
    }

    public void addLink(int u, int v){
        this.adj.get(u).add(v);
        this.adj.get(v).add(u);
    }

    public static void main(String[] args) {
        System.out.println("Hi FOlks");

        Vertex v1 = new Vertex(1, "ABCD");
        Vertex v2 = new Vertex(1, "AJBG");

        System.out.println(v1.equals(v2));

        LabeledTree t1 = new LabeledTree(4);

        for(Vertex v : t1.vertexes)System.out.println(v.id);
        t1.addLink(0, 1);
        t1.addLink(2, 0);
        t1.addLink(1, 2);
        t1.addLink(1, 3);

        for(Vertex v : t1.vertexes) System.out.println(t1.isLeaf(v.id));

        //for(char c : v1.common_labels(v2)) {
        //    System.out.print(" " + c);
        //}
    }





}