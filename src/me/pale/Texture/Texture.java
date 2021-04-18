package me.pale.Texture;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;

public class Texture extends Image {
	
	ImageIcon tex1;
	Image tex2;
	Image tex3;
	Image tex;

	public Texture(String path, int scalex, int scaley) {
				
		ImageIcon tex1 = new ImageIcon(getClass().getResource(path));
		Image tex2 = tex1.getImage();
		Image tex3 = tex2.getScaledInstance(scalex, scaley, java.awt.Image.SCALE_SMOOTH);
		Image tex = tex3;
		
		this.tex1 = tex1;
		this.tex2 = tex2;
		this.tex3 = tex3;
		this.tex = tex;
		
	}
	
	public Image getTexture() {
		
		Image texture = tex;
		
		return texture;
		
	}
	
	//Image(getClass().getResource(path));

	@Override
	public int getWidth(ImageObserver observer) {
	
		return tex3.getWidth(null);
		
	}

	@Override
	public int getHeight(ImageObserver observer) {
		
		return tex3.getHeight(null);
		
	}

	@Override
	public ImageProducer getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Graphics getGraphics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getProperty(String name, ImageObserver observer) {
		// TODO Auto-generated method stub
		return null;
	}	
}
