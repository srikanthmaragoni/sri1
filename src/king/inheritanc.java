package king;

class inheritance{
	public void marg()
	{
		System.out.print("arrange");
	}
}
class sons extends inheritance{
	public void marg() {
		System.out.print("marriage");
	}
}
class societys{
	public void main(String[] args)
	{
		sons s1=new sons();
		s1.marg();
	}
}