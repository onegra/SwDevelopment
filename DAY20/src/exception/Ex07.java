package exception;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Phonebook{
	private String name;
	private String pnum;
	
	public Phonebook(String name, String pnum) {
		super();
		this.name = name;
		this.pnum = pnum;
	}
	@Override
	public String toString() {
		return String.format("%s : %s", name, pnum);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	
	
}
public class Ex07 {
	public static void main(String[] args) throws IOException {
		File f = new File("7.txt");
		ArrayList<Phonebook> list = new ArrayList<>();
		
		if(f.exists() == false) {
			f.createNewFile();
		}
		else {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String[] arr = sc.nextLine().split(" : ");
				Phonebook ob = new Phonebook(arr[0], arr[1]);
				list.add(ob);
			}
			sc.close();
		}
		System.out.println("출력");
		list.forEach(ob -> System.out.println(ob));
		System.out.println("출력 끝");
		
		Scanner sc = new Scanner(System.in);
		String name,pnum;
		System.out.println("새로 추가할 이름 : ");
		name = sc.nextLine();
		System.out.println("새로 추가할 사람의 전화번호");
		pnum = sc.nextLine();
		
		Phonebook ob = new Phonebook(name, pnum);
		list.add(ob);
		
		FileOutputStream fos = new FileOutputStream(f);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		for(Phonebook pb : list) {
			osw.append(pb.toString() +"\n");
		}
		osw.flush();
		osw.close();
		fos.close();
		sc.close();
		System.out.println("저장 끝");
				
	}

}
