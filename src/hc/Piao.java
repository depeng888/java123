package hc;

public class Piao extends Thread {
	int count=40;

	public void run() {
		// TODO Auto-generated method stub
		while(count>0){
		System.out.println(getName()+"������"+count+"��");
		count--;
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}




	
	
	
}