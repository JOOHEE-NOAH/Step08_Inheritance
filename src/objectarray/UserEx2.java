package objectarray;
//��ü�迭, ������Ʈ �迭....[]
public class UserEx2 {

	public static void main(String[] args) {
//		int []num=new int[3];
//		num[0]=10;
//		num[1]=20;
//		num[2]=30;
		
//	}
	User [] ob=new User[3];
	ob[0]= new  User("kim","010-222-1111");
	ob[1]= new  User("lee","010-222-1111");
	ob[2]= new  User("park","010-333-1111");
	//������ֱ�	
	
	for(int i=0; i<ob.length;i++)
		System.out.println(ob[i].getName()+"\t"+ob[i].getPhone());
	
	//���� for��
	for (User x:ob)
		System.out.println(x.getName()+"\t"+x.getPhone());

	}
}
