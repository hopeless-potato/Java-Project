package condition.blocks;

public class SwitchBlock {

	public static void main(String[] args) {
		
 /*	String programming="lang5";
	
	switch(programming) {
	
	case "lang1":
	System.out.println("python");
	break;
	
	case "lang2":
	System.out.println("C");
	break;
	
	case "lang3":
	System.out.println("java");
	break;
	
	case "lang4":
	System.out.println("ruby");
	break;
	
	default:
		System.out.println("Not a programming language: Linux");
		
	} */
	
	char Div = 'E';               
    int ClassNumber = 3;
    switch( ClassNumber )
    {
        case 1:
            System.out.println("English, Maths, Science");
            break;
        case 2:
            switch( Div ) 
            {
                case 'B':
                    System.out.println("Hindi,Maths,Science");
                    break;
                case 'C':
                    System.out.println("Geo, History, Maths");
                    break;
                case 'A':
                    System.out.println("Telagu, Science, Maths");
                    break;
            }
            break;
        case 3:
            switch( Div ) 
            {
                case 'A':
                    System.out.println("MArathi, Science");
                    break;
                case 'B':
                    System.out.println("PE,Hindi, Sanskrit");
                    break;
                case 'C':
                    System.out.println("English, PE");
                    break;
            }
            break;
        case 4:
            switch( Div ) 
            {
                case 'B':
                    System.out.println("Maths, chemistry, English");
                    break;
                case 'A':
                    System.out.println("Marathi, hindi");
                    break;
                case 'C':
                    System.out.println("Chemistry, data science");
                    break;
                default:
              System.out.println("Only Fun");
            }
            break;
            
        default:
        System.out.println("Invalid division");  }
	
	
		
	}

}
