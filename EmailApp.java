package emailapp;
import java.util.*;

public class EmailApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Email em1 = new Email("John","Smith");
		
		System.out.println(em1.showInfo());
	}
}
