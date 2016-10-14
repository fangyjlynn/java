import java.io.*;
public class Test{
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("e:\\a.txt"));
		String content=null;
		while((content=br.readLine())!=null){
			ReflectUtils.getInstance(content);
		}
	}
}

class Student{
	String name;
	private int age;

	public Student(){}
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}

	public void study(){
		System.out.println("学习");
	}
	public void study(String str){
		System.out.println("学习"+str);
	}
}

class Teacher{
	String name;
	private int age;

	public Teacher(){}
	public Teacher(String name,int age){
		this.name=name;
		this.age=age;
	}

	public void teach(){
		System.out.println("教学");
	}
	public void teach(String str){
		System.out.println("教"+str);
	}
}