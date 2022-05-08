package ABC;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s=" mr kanak and bob is refer  from murud janjira";
			s.trim();
			s=s+" ";
			String w=""; 
			String r="";
			int count=0;
			
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch!=' ') {
					w=w+ch;
					r=ch+r;	
				}
			
				else if (ch==' '){
					if(w.equalsIgnoreCase(r)) {
					System.out.println(w+" "+r);
					count++;
					}
					else {
					w="";
					r="";
					}
					}
				} 
			System.out.println("The count of Palindrome words :"+count);
		}
	
	}

