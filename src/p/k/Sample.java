package p.k;

public class Sample {
	
	public static String reverse(String arg) {
		if (arg.length() == 0) return arg;
		else return reverse(arg.substring(1, arg.length())) + arg.substring(0, 1);
	}

	public static void main(String[] args) {
		System.out.println(reverse("Some text"));
	}
}
