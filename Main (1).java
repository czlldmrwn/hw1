import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    System.out.println("Введите порядковый номер дня недели:");
	    Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		switch (day) {
		    case 1: case 2: case 3: case 4:
		        System.out.println("Продолжительность рабочего дня "+ 8*60*60 +" секунд");
		        break;
	        case 5:
	            System.out.println("Продолжительность рабочего дня "+ 6*60*60 +" секунд");
	            break;
	        case 6: case 7:
                System.out.println("Выходной день");
                break;
            default:
	            System.out.println("Введен некорректный порядковый номер");
	            break;
		}
	}
}
