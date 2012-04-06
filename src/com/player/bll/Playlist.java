package com.player.bll;

import java.util.*;

public class Playlist {

  private String name;
  private List<Song> playlist;
  
  public Playlist( String nameToUse ) {
    name = nameToUse;
    playlist = new LinkedList();
  }

  public void setName( String newName ) {
    name = newName;
  }
  
  public String getName() {
    return name;
  }
  
  public void add( Song songToAdd ) {
    playlist.add( songToAdd );
  }

  public void add( int index, Song songToAdd ) {
    playlist.add( index, songToAdd );
  }

  public void addAll( Collection songsToAdd ) {
    playlist.addAll( songsToAdd );
  }
  
  public List<Song> get() {
    return Collections.unmodifiableList( playlist );
  }
    
  public void remove( Song songToRemove ) {
    playlist.remove( songToRemove );
  }
  
  public int size() {
    return playlist.size();
  }
  
  public boolean contains( Song songToFind ) {
    return playlist.contains( songToFind );
  }

  public ListIterator iterator() {
    return playlist.listIterator();
  }
}
