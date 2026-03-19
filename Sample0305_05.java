package jump2java;

public class Sample0305_05 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello jump to java");
		sb.delete(6, 11);
		System.out.println(sb.toString());
	}

}
