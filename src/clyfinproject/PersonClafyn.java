package clyfinproject;

public class PersonClafyn {
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonClafyn p = new PersonClafyn();
		int res = p.add(1,2);
		System.out.println(res);
		int res2 = p.sub(10,5);
		System.out.println(res2);
	}

}
