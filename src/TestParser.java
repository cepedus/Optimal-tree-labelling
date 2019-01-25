import java.io.File;

public class TestParser {
    final String project_dir;
    int test_number;
    String test_dir;

    // Constructors
    public TestParser(int test_number){
        this.project_dir = new File("").getAbsolutePath();
        System.out.println("Will look for tests on: " + this.project_dir);
        if(test_number < 1 || test_number > 10){
            System.out.println(String.valueOf(test_number)+" is not a valid test. Executing default test 1");
            this.test_number = 1;
        }
        else this.test_number = test_number;
        this.test_dir = this.project_dir + "\\test\\labelling." + String.valueOf(this.test_number) + ".in";
    }

    public TestParser(){
        this.project_dir = new File("").getAbsolutePath();
        System.out.println("Will look for tests on: " + this.project_dir);
        this.test_number = 1;
        System.out.println("No test number provided. Executing default test 1");
        this.test_dir = this.project_dir + "\\test\\labelling." + String.valueOf(this.test_number) + ".in";
    }

    // File reader

    private int[] intParser(String line){
        String[] parts = line.split(" ");
        int[] out = new int[2];
        out[0] = Integer.parseInt(parts[0]);
        out[1] = Integer.parseInt(parts[1]);
        return out;
    }

    public LabeledTree makeTree(){
        BufferedReader br = new BufferedReader(new FileReader(this.test_dir))
            String line;
            
               // process the line.
            
        
    }
    

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        /*System.out.println("Hello, World");
        String cwd = System.getProperty("user.dir");
        System.out.println("Current working directory : " + cwd);

        Str
        String parentPath = file.getAbsoluteFile().getParent();
        System.out.println(parentPath);
        System.out.println(new File("").getAbsolutePath());*/

        TestParser test = new TestParser(10);
        TestParser test2= new TestParser();
        //System.out.println(test.project_dir);

    }

}