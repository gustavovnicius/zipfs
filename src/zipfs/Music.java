package zipfs;

public class Music implements Comparable<Music> {
	private String name;
	private Integer position;
	private Integer qi;

	public Music(String name, Integer position, Integer qi) {
		this.name = name;
		this.position = position;
		this.qi = qi;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public int compareTo(Music anotherMusic) {
		return -(position.compareTo(anotherMusic.position) + qi.compareTo(anotherMusic.qi));
	}
}
