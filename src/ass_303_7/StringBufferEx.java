package ass_303_7;

public class StringBufferEx {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abcdefghi");
		
		//arg 1 = start index
		//arg 2 = end index
		//arg 3 = what to replace it with
		
		//replace index 0-5 with '12345'
		//Does two operations: Delete then insert
		sb.replace(0, 5, "12345678");
		
		System.out.println(sb);
		
		//insert characters starting at index 0
		sb.insert(0, "ABDE");
		
		System.out.println(sb);
	}
}
