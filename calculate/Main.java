package calculate;

import java.io.IOException;
import java.util.Scanner;


public class Main {
	//������� ������������
	static RomanNumeral Numeral = new RomanNumeral();
	
	public static void main(String[] args) throws IOException {
		int A=0;
		int B=0;
		int test = 0;
		int test2 = 0;
		String operation = "";
		
		try (
			//���� ������
				Scanner console = new Scanner(System.in)) {
			System.out.print("������� �������������� ���������: ");
      
			// ���� �������
			String value = console.next();
			//���� ��������
			operation = console.next();
			//���� �������
			String value2 = console.next();
     
  
			
			//�������� ������� �����
			try {
				char c = value.charAt( 0 );

				if ( Character.isDigit( c ) )
				{
					//������ ��������
					int int_value = Integer.parseInt( value );
					A = int_value;
					test = 1;

						if (A>0 && A<11) {}
						else
						{System.out.println("������ ����� �����������!");
						System.exit(0);
			    	}
				}
				else {
					//������� �� ������� � ��������
					A = RomanNumeral.convertRomanToInt(value);
					test = 2;
					if (A>0 && A<11) {}
					else
					{System.out.println("������ ����� �����������!");
					System.exit(0);
				}
				}
			} finally{}
			           
			
			
			
			//�������� �������
			try {
				char d = value2.charAt( 0 );

				if ( Character.isDigit( d ) )
				{
					//������ ��������
					int int_value2 = Integer.parseInt( value2 );
					B = int_value2;
					test2 = 1;
						if (B>0 && B<11) {}
						else
						{System.out.println("������ ����� �����������!");
						System.exit(0);
			    	}
				}
				else {
					//������� �� ������� � ��������
					B = RomanNumeral.convertRomanToInt(value2);
					test2 = 2;
					if (B>0 && B<11) {}
					else
					{System.out.println("������ ����� �����������!");
					System.exit(0);
				}
				}
			} finally{}
		}
        //�������� ����� ����
		if ((test==1 & test2==1) || (test==2 & test2==2)) {        	
    	} 
    	else
    	{System.out.println("������ �����!");
    	System.exit(0);
    	}    
		
		 
    	
        
        //����� �������� � ����������
        int result = 0;
        switch (operation) {
        	case "+":
        	result = A + B;
        	break;
        	case "-":
        	result = A - B;
        	break;
        	case "*":
        	result = A * B;
        	break;
        	case "/":
        	result = A / B;
        	break;
        	default:
            System.out.println("�������������� �������� �����������!");
			
          
        	}
        
      //�������� ����� ����
		if (test==2) {
			System.out.println("��������� = " + RomanNumeral.convertIntegerToRoman(result));
		} 
		else
			System.out.println("��������� = " + result);
		}
		
		
}   
	
	
	
   
    
