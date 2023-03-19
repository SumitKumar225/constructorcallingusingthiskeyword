package javaPractice;

public class MethodCalling {
	
		public void abc() {
			System.out.println("i am default");
		}
		public void abc(int a) {
			System.out.println("i am one");
		}
		public void abc(int a,int b) {
			System.out.println("i am two");
		}
		public void abc(int a,int b,int c) {
			System.out.println("i am three");
		}
		public void abc(int a,int b,int c,int d) {
			this.abc(4, 5,56);
			this.abc(1);
			this.abc(1, 2);
			this.abc();
			
			System.out.println("i am four");
		}

	public static void main(String[] args) {
		
		MethodCalling x=new MethodCalling();
		x.abc(1, 2, 3, 4);
		
		
	}

}
