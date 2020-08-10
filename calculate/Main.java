package calculate;

import java.io.IOException;
import java.util.Scanner;


public class Main {
	//включил наследование
	static RomanNumeral Numeral = new RomanNumeral();
	
	public static void main(String[] args) throws IOException {
		int A=0;
		int B=0;
		int test = 0;
		int test2 = 0;
		String operation = "";
		
		try (
			//ввод данных
				Scanner console = new Scanner(System.in)) {
			System.out.print("Введите арифметическое выражение: ");
      
			// ввод первого
			String value = console.next();
			//ввод операции
			operation = console.next();
			//ввод второго
			String value2 = console.next();
     
  
			
			//проверка первого числа
			try {
				char c = value.charAt( 0 );

				if ( Character.isDigit( c ) )
				{
					//принял арабские
					int int_value = Integer.parseInt( value );
					A = int_value;
					test = 1;

						if (A>0 && A<11) {}
						else
						{System.out.println("Первое число некорректно!");
						System.exit(0);
			    	}
				}
				else {
					//перевел из римских в арабские
					A = RomanNumeral.convertRomanToInt(value);
					test = 2;
					if (A>0 && A<11) {}
					else
					{System.out.println("Первое число некорректно!");
					System.exit(0);
				}
				}
			} finally{}
			           
			
			
			
			//проверка второго
			try {
				char d = value2.charAt( 0 );

				if ( Character.isDigit( d ) )
				{
					//принял арабские
					int int_value2 = Integer.parseInt( value2 );
					B = int_value2;
					test2 = 1;
						if (B>0 && B<11) {}
						else
						{System.out.println("Второе число некорректно!");
						System.exit(0);
			    	}
				}
				else {
					//перевел из римских в арабские
					B = RomanNumeral.convertRomanToInt(value2);
					test2 = 2;
					if (B>0 && B<11) {}
					else
					{System.out.println("Второе число некорректно!");
					System.exit(0);
				}
				}
			} finally{}
		}
        //проверка ввода цифр
		if ((test==1 & test2==1) || (test==2 & test2==2)) {        	
    	} 
    	else
    	{System.out.println("ошибка ввода!");
    	System.exit(0);
    	}    
		
		 
    	
        
        //выбор операции и вычисление
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
            System.out.println("арифметическое действие некорректно!");
			
          
        	}
        
      //проверка ввода цифр
		if (test==2) {
			System.out.println("Результат = " + RomanNumeral.convertIntegerToRoman(result));
		} 
		else
			System.out.println("Результат = " + result);
		}
		
		
}   
	
	
	
   
    
