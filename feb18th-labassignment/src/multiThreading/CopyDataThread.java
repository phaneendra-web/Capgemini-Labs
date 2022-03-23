package multiThreading;

import java.io.*;

public class CopyDataThread extends Thread {
	FileReader fr;
	FileWriter fw;

	public CopyDataThread(FileReader fr, FileWriter fw) {
		this.fr = fr;
		this.fw = fw;
	}

	public void run() {
	
		int cnt = 0;
		int i;
		try {
			while ((i =fr.read()) != -1) {
				fw.write(((char) i));
				cnt++;
				if (cnt == 10) {
					cnt = 0;
					System.out.println("10 char copied");
					Thread.sleep(1000);
				}
			}
			fr.close();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Task Completed");
	}

}