package lambda;

interface Calc1
{
	public void calc();
}

public class secle {

	public static void main(String[] args) {
		int a=5;
		int b=5;
		Calc c=()->{
			System.out.println("Calculate 5*5="+a*b);
		};
		c.calc();
	}

}
