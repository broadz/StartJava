public class ConditionalStatement {
	public static void main(String[] args) {

		int age = 31;
		if(age > 20) {
			System.out.println("Ваш возраст больше 20");
		} 

		boolean man = true;
		if(man) {
			System.out.println("Вы мужчина");
		} 

		if(!man) {
			System.out.println("Вы не мужчина");
		}

		float height = 1.7f; 
		if(height < 1.80) {
			System.out.println("Ваш рост меньше 1.80");
		} else {
			System.out.println("Ваш рост меньше 1.80");
		}

		char firsNameLetter = 'D';
		if(firsNameLetter == 'M') {
			System.out.println("Ваше имя начинается с буквы M");
		} else if(firsNameLetter == 'I') {
			System.out.println("Ваше имя начинается с буквы I");
		} else {  
			System.out.println("Ваше имя не начинается с буквы М или I");
		}
		
	}
}