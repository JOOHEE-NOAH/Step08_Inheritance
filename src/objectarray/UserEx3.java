package objectarray;
//������Ʈ ��ü�迭-------2
public class UserEx3 {

	public static void main(String[] args) {
//		int [] num=new int[] {10,20,30};
		
//		User[] ob=new User[] {
//			new  User("kim","010-222-1111"),
//			new  User("lee","010-222-1111"),
//			new  User("park","010-333-1111")
//		}; //ū �迭 ����� ����. ���� ,�̰� �������� ;�����ݷ� �߰� ->������ �迭 ������ �ٸ��� ����.
		
		User[] ob= {new  User("kim","010-222-1111"), // ���� �ݷ��� �ƴϰ� �޸���.
					new  User("lee","010-222-1111"),
					new  User("park","010-333-1111")	
		}; //-->�����ݷ� ����! �迭�� �����̶� �����ݷ����� ������
		
		for(int i=0; i<ob.length;i++)
			System.out.println(ob[i].getName()+"\t"+ob[i].getPhone());
		
		//���� for��(�� �� ��)
		for (User x:ob)
			System.out.println(x.getName()+"\t"+x.getPhone());
	}
					
}
