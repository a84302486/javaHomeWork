package servelet.ch01.ex03;

public class Mammal {
	
		private String name;
		private long birthday;
		
		public Mammal(String name,long birthday){
			this.name = name;
			this.birthday = birthday;
		}
		public Mammal(long birthday){
			this.name = "無名氏";
			this.birthday = birthday;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getBirthday() {
			return birthday;
		}
		public void setBirthday(long birthday) {
			this.birthday = birthday;
		}
		@Override
		public String toString(){
			return getClass().getName()+"姓名:" + name + "生日:" +birthday;
		}
	}

