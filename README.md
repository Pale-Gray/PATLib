# PATLib

![IMG](readme/patlibimage.png "PATLibImage")

A simple image loading / audio library for Java

**ABOUT**

PATLib is a simple image loading and audio library for Java.
It just makes loading images and audio a little bit easier.

### **HOW TO USE**

**FOR AUDIO LOADING**

To use the `Audio` class, here are the steps:

Instantiate a new Audio using `Audio [name];`.
Then, in the main method, do this:
`[name] = new Audio("/pathtofile.wav");
all texture and audio files must be in a `res` source folder!!!

There are two methods for playing and stopping audio
`Audio.playAudio();` and `Audio.stopAudio();`

**FOR TEXTURE LOADING**

First, instantiate a new Texture by doing this:
`Texture [name] = new Texture("/pathtoimage.png', scalex, scaley);
make sure image files are in `res` src folder!

To use a Texture, you need to use the `paintComponent` class.

to draw a texture on the screen, use this:
`g.drawImage([name].getTexture(), x, y, observer);

`getTexture()` returns the `Texture` instantiation as an `Image`, so it is readable by the `drawImage` method.

Also, you can use the default Image methods for Texture declarations too.

That is all! Happy image loading!

~ Pale_Gray


