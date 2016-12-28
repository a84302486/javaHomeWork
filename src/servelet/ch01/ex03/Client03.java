package servelet.ch01.ex03;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client03 {

	public static void main(String[] args) throws ParseException  {
		String date = "2010-12-20 18:27:36";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		Date ndate = sdf.parse(date);
		long ins = dateToLong(ndate);

		int x = (int)(Math.random()*10)+1;
		
		if(x % 2 ==0){
			Cat c =new Cat("kitty", ins);
		}else if (x % 2 !=0){
			Dog d =new Dog("Snoopy", ins);
		}
		
	}

	public static long dateToLong(Date date) {
		return date.getTime();
	}
}
