import java.net.InetAddress;
public class TestException{
	public static void main(String[] args)throws Exception{
		try{
			int[] a={1,2,3,4};
			int i=a[5];
		}catch(Exception e){
			InetAddress id=InetAddress.getLocalHost();
			e.printStackTrace();
			new ExceptionSave(e,id).printException();
		}
	}
}