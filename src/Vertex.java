import java.util.Set;
import java.util.HashSet;

class Vertex {
    Set<Character> label = new HashSet<Character>();
    int id;
    Vertex(int id, String label) {
        this.id = id;
        if(label == "$") this.label = null;
        else{
            for(char c : label.toCharArray()) label.add(c);
        }
    }

    public boolean equals(Vertex otherVertex){
        return this.id == otherVertex.id;
    }
 
    public Set<Character> common_labels(Vertex otherVertex){
        Set<Character> common = this.label;
        common.retainAll(otherVertex.label);
        return common;
    }
}