package com.player.bll;

import java.util.LinkedList;


public class Playlist {

  String name;
  LinkedList<Song> songs;

  public Playlist( String nameOfPlaylist ) {
    name = nameOfPlaylist;
    songs = new LinkedList<Song>();
  }

  public int getSongCount() {
    return songs.size();
  }
  
  public String getName() {
    return name;
  }

}
