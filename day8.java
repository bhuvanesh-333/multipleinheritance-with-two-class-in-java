interface printable{
	void display();
}
interface showable{
	void display();
}

class document implements printable,showable{


	@Override
	public void display() {
		System.out.println("class c");
		
	}
} 

public class day8 {
public static void main(String[] args) {
		document a=new document();
		a.display();

	
}}
