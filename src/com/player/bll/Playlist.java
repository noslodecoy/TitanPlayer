package com.player.bll;

import java.util.LinkedList;

public class Playlist extends LinkedList<Song> {

  private String name;
  
  public Playlist( String name ) {
    super();
    setName( name );
  }

  public void setName( String newName ) {
    name = newName;
  }
  
  public String getName() {
    return name;
  }
}
