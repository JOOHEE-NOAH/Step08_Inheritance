package inheritance;
//������, ���� 2�� ������, toString()
public class SuperTest {
 public String name;
 public String addr;

  public SuperTest() {
	  
  }
  public SuperTest(String name, String addr) {
	  super();
	  this.name=name;
	  this.addr=addr;
  }
  @Override   //����Ѵٴ� ��
  public String toString() {
	  return "�̸��� "+name+"�̰� ��� ���� "+addr+"�Դϴ�.";
  }
}
