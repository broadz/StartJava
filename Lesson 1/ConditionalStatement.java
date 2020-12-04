public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 31;
		boolean man = true;
		float height = 1.7f; 
		char firsNameLetter = 'D';
		if(age > 20) {
			System.out.println("Ваш возраст больше 20");
		} 
		if(man == true) {
			System.out.println("Вы мужчина");
		} 
		if(man != true) {
			System.out.println("Вы не мужчина");
		}
		if(height < 1.80) {
			System.out.println("Ваш рост меньше 1.80");
		} else {
			System.out.println("Ваш рост меньше 1.80");
		}
		if(firsNameLetter == 'M') {
			System.out.println("Ваше имя начинается с буквы M");
		} else if(firsNameLetter == 'I') {
			System.out.println("Ваше имя начинается с буквы I");
		} else {  
			System.out.println("Ваше имя не начинается с буквы М или I");
		}
	}
}