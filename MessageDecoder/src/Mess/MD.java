package Mess;

public class MD {
public static void main(String[] args) {
	
	MessageDecoder decoder = new MessageDecoder();

	int code=decoder.decodeCharacter('A');
	System.out.println(code);
}
}
