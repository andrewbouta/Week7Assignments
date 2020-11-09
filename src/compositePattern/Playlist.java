package compositePattern;

import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	// Your code goes here!

	public void play() {
	System.out.println(playlistName);
	}

	public void add(IComponent component) { // adding method
	playlist.add(component);
	}

	public void remove(IComponent component) { // remove method
	playlist.remove(component);
	}

	public void setPlaybackSpeed(float speed) { // playback speed
	System.out.println("Setting the playlist speed to..." + speed);
	}

	public String getName() {
	return playlistName;
	}


}
