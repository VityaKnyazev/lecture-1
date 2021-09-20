package by.it_academy.java_enterprise.knyazev;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final int DATA = 3;
	
    public static void main( String[] args )
    {
    	Cube cube = new Cube();
    	int result = cube.getCube(DATA);
    	
        System.out.println( "Hello World! Our cube result equals " + result);
    }
}
