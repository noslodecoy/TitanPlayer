package com.player.bll;

public class Player {

  private Playlist playlist;
  private int playlistIndex;
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
    playlistIndex = ( playlistIndex + 1 < playlist.size() ) ? playlistIndex + 1 : 0;
  }
  
  public Playlist getPlaylist() {
    return playlist;
  }

}
