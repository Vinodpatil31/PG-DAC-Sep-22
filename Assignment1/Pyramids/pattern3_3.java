class pattern3_3{
public static void main(String args[]){


for(int i=1;i<=9;i++)
{
	for (int j=8; j>=i; j--)
	{
		System.out.print(" ");
	}
	for (int j=1; j<=i; j++)
	{
		System.out.print("*");
		;
	}
	for (int j=1; j<=i-1; j++)
	{
		System.out.print("*");
		;
	}
	System.out.println();
}

}
}