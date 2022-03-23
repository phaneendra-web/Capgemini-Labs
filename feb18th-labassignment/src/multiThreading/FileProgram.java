package multiThreading;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("C:\\Users\\GSRIKA\\Documents\\Source.txt");
			FileWriter fw=new FileWriter("C:\\Users\\GSRIKA\\Documents\\Target.txt");
			CopyDataThread th1=new CopyDataThread(fr, fw);
			th1.start();
			//ExecutorService executor = Executors.newSingleThreadExecutor();
		    //executor.execute(new CopyDataThread(fr,fw));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}