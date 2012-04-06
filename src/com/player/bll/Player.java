package com.player.bll;

import java.util.ListIterator;

public class Player {

  private Playlist playlist;
  private int playlistIndex;
  private Song currentSong;
  private boolean isPlaying;

  public Player( Playlist playlistToUse ) {
    playlist = playlistToUse;
    playlistIndex = 0;
    isPlaying = false;
  }

  public Song getCurrentSong() {
    return playlist.get( playlistIndex );
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
    if ( ( playlistIndex + 1 ) < playlist.size() ) {
      ++playlistIndex;
    }
  }

  public void skipBackward() {
    if ( ( playlistIndex - 1 ) >= 0 ) {
      --playlistIndex;
    }
  }

  public Playlist getPlaylist() {
    return playlist;
  }

}
