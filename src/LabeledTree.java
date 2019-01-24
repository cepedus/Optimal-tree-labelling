public class LabeledTree{

    public static void main(String[] args) {
        System.out.println("Hi FOlks");

        Vertex v1 = new Vertex(1, "ABCD");
        Vertex v2 = new Vertex(1, "AJBG");

        System.out.println(v1.equals(v2));

        for(char c : v1.common_labels(v2)) {
            System.out.print(" " + c);
        }
    }





}