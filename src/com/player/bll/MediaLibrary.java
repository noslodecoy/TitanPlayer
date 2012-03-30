package com.player.bll;

import java.util.ArrayList;
import java.util.List;

public class MediaLibrary {
  
  List<Song> songs;
  
  public MediaLibrary() {
    songs = new ArrayList<Song>();
  }

  public int songCount() {
    return songs.size();
  }

  public void addSong( Song songToAdd ) {
    songs.add( songToAdd );
  }
  
  public void removeSong( int songIndexToRemove ) {
    songs.remove( songs.get( songIndexToRemove ) );
  }
}
