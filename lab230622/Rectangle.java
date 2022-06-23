package lab230622;

public class Rectangle {
	
	private int length;
	private int bredth;
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		
		if(length<=10 || length>=50) {
			System.out.println("Length between 10 & 50");
		}
			
		this.length = length;
	}
	public int getBredth() {
		return bredth;
	}
	public void setBredth(int bredth) {
		if(bredth<=5 || bredth>=20)
		{
			System.out.println("Bredth Between 5 & 20");
		}
		this.bredth = bredth;
	}

	public Rectangle(int length , int bredth) {
		setLength(length);
		setBredth(bredth);
	}

	void getarea() {
		if(getBredth()<=20 && getBredth()>=5) {
			if(getLength()<=50 && getLength()>=10)
			{
				System.out.println(getBredth()*getLength());
			}
			else
			{
				System.out.println("Length Error!");
			}
		}
	else
	{
		System.out.println("Bredth Error!");
	}
	
	}	

}
