interface Test{
	float test1();
}

class Test1 implements Test{
	@Override
	public float test1(){
	} 
}

class Main{
	public static void main(String[] args){
		Test1 methodt = new Test1.test1();
		System.out.println(methodt);
	}
}
