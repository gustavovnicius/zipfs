package zipfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer musicsCount = sc.nextInt();
		Integer toSelect = sc.nextInt();

		List<Music> album = new ArrayList<Music>();
		for(int i = 1; i <= musicsCount; i++) {
			Integer times = sc.nextInt();
			String name = sc.next();
			album.add(new Music(name, i, times * 1));
		}
		Collections.sort(album);
		
		for(int i = 0; i < toSelect; i++) {
			System.out.println(album.get(i).getName());
		}
		
		sc.close();
	}
}
