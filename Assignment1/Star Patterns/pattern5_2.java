class pattern5_2{
	public static void main(String args[]){
		{
			for(int i=5;i>=1;i--)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("  ");
				}
				
				for(int j=1;j<=6-i;j++)
				{
					System.out.print("* ");
				}
				
				for(int j=2;j<=6-i;j++)
				{
					System.out.print("* ");
				}
				
				
			  System.out.println();
			} 
			
			
		
		}
		
	}
}