package zohoFirst;
interface chimi
{
	void method();
}
public class AnnonymousDout {
	
	void display()
	{
		int x = 3;
		chimi c = new chimi()
				{
			int y = 5;
					@Override
					public void method() {
						System.out.println("Annonymous "+x+y);
						
					}
//					public void Return()
//					{
//						System.out.println("Return method");
//					}
			
				};
				c.method();
	}
	chimi c1 = new chimi()
			{

				@Override
				public void method() {
					
					System.out.println("Annonymous class");
				}
		
			};
	public static void main(String [] args)
	{
		
	}

}
