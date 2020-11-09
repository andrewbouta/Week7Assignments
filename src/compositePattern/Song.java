package compositePattern;

public class Song implements IComponent {
	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist) {
		this.songName = songName;
		this.artist = artist;
	}

// Your code goes here!
	public void play() {
	System.out.println("Playing the song...");
	}

	public void setPlaybackSpeed(float speed) {
		System.out.println("Setting the playlist speed to..." + speed);
	}

	public String getName() {
		return songName; // returns song name
	}

	public String getArtist() {
		return artist;
	}

}