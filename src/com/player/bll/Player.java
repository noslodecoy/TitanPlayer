package com.player.bll;

import java.util.ListIterator;

public class Player {

  private Playlist playlist;
  private ListIterator playlistIterator;
  private Song currentSong;
  private boolean isPlaying;

  public Player( Playlist playlistToUse ) {
    playlist = playlistToUse;
    playlistIterator = playlist.iterator();
    isPlaying = false;
    currentSong = (Song)playlistIterator.next();
  }

  public Song getCurrentSong() {
    return currentSong;
  }
  
  public void play() {
    isPlaying = true;
  }

  public void stop() {
    isPlaying = false;
  }
  
  public boolean isPlaying() {
    return isPlaying;
  }
  
  public void skipForward() {
    if ( playlistIterator.hasNext() ) {
      currentSong = (Song)playlistIterator.next();
    }
  }

  public void skipBackward() {
    if ( playlistIterator.hasPrevious() ) {
      currentSong = (Song)playlistIterator.previous();
    }
  }

  public Playlist getPlaylist() {
    return playlist;
  }

}
