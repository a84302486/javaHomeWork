package javaSE.ch03;

public class �@�~2 {

	public static void main(String[] args) {
		int s = 256559;
		int minute = s / 60;
		int hour = minute / 60;
		int day = hour / 24;
		
		System.out.println(s + "��=�h�֤�,�h�֤p��,�h�֤��P�h�֬�?");
		System.out.println("����:" + day + "��" +(hour % 24) + "�p��" + (minute % 60) 
				+ "��" + (s % 60) + "��");
		System.out.println("����:" + hour + "�p��" + (minute % 60) + "��" 
				+ (s % 60) + "��");
		System.out.println("����:" + minute + "��" + (s % 60) + "��");
//
		
	}

}
