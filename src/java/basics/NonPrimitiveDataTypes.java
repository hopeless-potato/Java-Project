package java.basics;

public class NonPrimitiveDataTypes {
	
	public static void main(String[] args) {
		
///////////////Length, Index, Upper & Lower Case///////////////////////////////
		
		String a="welcome to java basics";
		int b=a.length();
		System.out.println("length of string: "+(b)); 
		
		int index=a.indexOf("to");
		System.out.println("index is: "+(index));
		
		System.out.println("index is: "+a.indexOf('a',15));
		
		System.out.println(a.charAt(7));  //char count starts from 0.
		
		System.out.println(a.toUpperCase());
		
		String str="RANDOM TEXT";
		System.out.println(str.toLowerCase());
		

/////////////////////Joining the Strings & Concate//////////////////////////////
		
		
		String c="i like java";
		String d="and Linux";
		String e="\"both\"";
		String f=c+" "+d+" "+e;
		System.out.print(f);
		
		String g=f.concat(". What about you?");
		System.out.println('\n' +g); //As you did not use println in the previous string,
		                           // use \n to print this output to the next line.
		
		
		String h=c.concat(" "+d).concat(" "+e);
		System.out.println(h);
		
		
//////////////////Contains, equals, equalsignorecase method///////////////////	
		
		//contains & equals method are case sensitive
		
		System.out.println(c.contains(d));
		
		String i="Hello World";
		String j="hello world";
		String k="Hello World was the first program";
		System.out.println(i.equals(j));		
		System.out.println(k.contains(j));		
		
				
	}

}
