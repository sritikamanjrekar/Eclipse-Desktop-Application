package practice;

class AA{
	AA(){
		System.out.println("A");
	}
}

class BB extends AA{
	BB(){
		System.out.println("B");
	}
}

 class C extends BB{
	
	C(){
		System.out.println("C");
	}

	public static void main(String[] args) {
		//Constructor in inheritance
		new C();
	}

}
