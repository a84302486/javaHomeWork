package javaSE.ch03;

public class 作業2 {

	public static void main(String[] args) {
		int s = 256559;
		int minute = s / 60;
		int hour = minute / 60;
		int day = hour / 24;
		
		System.out.println(s + "秒=多少天,多少小時,多少分與多少秒?");
		System.out.println("等於:" + day + "天" +(hour % 24) + "小時" + (minute % 60) 
				+ "分" + (s % 60) + "秒");
		System.out.println("等於:" + hour + "小時" + (minute % 60) + "分" 
				+ (s % 60) + "秒");
		System.out.println("等於:" + minute + "分" + (s % 60) + "秒");
//
		
	}

}
