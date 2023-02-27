package lambda;

interface Calc
{
	public void calc();
}
public class firstle {

	public static void main(String[] args) {
		int multiple=25;
		Calc c=new Calc()
				{
				 public void calc()
				 {
					 System.out.println("Calculate 5*5="+multiple);
				 }
				};
				c.calc();
	}

}
