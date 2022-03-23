package multiThreading;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;

public class Timer implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer tm=new Timer();
		Thread th=new Thread(tm);
		th.start();
		//Using ExecutorService to run our thread
//		ExecutorService executor1 = Executors.newSingleThreadExecutor();
//		executor1.execute(th);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}