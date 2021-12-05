package king;

class parents{
	public void marg()
	{
		System.out.print("arrange");
	}
}
class son extends parents{
	public void marg() {
		System.out.print("marriage");
	}
}
class society{
	public void main(String[] args)
	{
		son s1=new son();
		s1.marg();
	}
}