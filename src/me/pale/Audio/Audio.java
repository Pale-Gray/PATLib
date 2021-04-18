package me.pale.Audio;

import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio {
	
	Clip clip;
	URL file;
	AudioInputStream audioStream;

	public Audio(String path) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		URL file = this.getClass().getResource(path);
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		this.clip = clip;
		this.file = file;
		this.audioStream = audioStream;
		
	}
	
	public long currentFrame() {
		
		return clip.getMicrosecondPosition();
		
	}
	
	public long length() {
		
		return clip.getMicrosecondLength();
		
	}
	
	public void playAudio() {
		
		clip.start();
		
	}
	
	public void stopAudio() {
		
		clip.stop();
		
	}
	
}
