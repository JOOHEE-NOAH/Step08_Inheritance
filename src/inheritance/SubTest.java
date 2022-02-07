package inheritance;
class SubTest1{
	String name,addr;
	
	public SubTest1() {
		
	}
	public SubTest1(String name, String addr) {
		this.name=name;
		this.addr=addr;
	}
	public void view() {
		System.out.println("이름은 "+name+"이고 사는 곳은 "+addr+"입니다.");
	}
}
 class SubTest extends SubTest1 {
	int age;
	double score;
	
	public SubTest(String name, String addr,int age, double score) {
		super(name,addr);
		this.age=age;
		this.score=score;	
	}
		
	
	public String toString() {
		super.view();
		return "나이는 "+age+"세이고 점수는 "+score+"점입니다.";
	}
	public static void main(String[] args) {
		SuperTest ob1=new SuperTest("뽀로로","대흥동");
		
		// 이름은 뽀로로이고 사는 곳은 대흥동입니다.
		System.out.println(ob1); //--toString 생략.
		System.out.println();
		SubTest ob2=new SubTest("크롱","대현동",23,85.4);
		//이름은 크롱이고 사는 곳은 대현동입니다.
		//나이는 23세이고 점수는 85.4점입니다.
		System.out.println(ob2);
	}

}
