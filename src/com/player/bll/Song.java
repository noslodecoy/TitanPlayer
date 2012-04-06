package com.player.bll;

import java.util.Comparator;

public class Song {

  String title;
  String artist;
  boolean isEmpty;

  public Song() {
    isEmpty = true;
  }

  public Song( String newTitle, String newArtist ) {
    isEmpty = false;
    title = newTitle;
    artist = newArtist;
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getArtist() {
    return artist;
  }

  public boolean equals( Song songToCompare ) {
    if ( this == songToCompare ) {
      return true;
    }
    if ( this.isEmpty() && songToCompare.isEmpty() ) {
      return true;
    }
    return ( this.getTitle().equals( songToCompare.getTitle() ) && this.getArtist().equals( songToCompare.getArtist() ) );
  }
  
  public boolean isEmpty() {
    return isEmpty;
  }


  public static Comparator<Song> CompareByTitle = new Comparator<Song>() {

    @Override
    public int compare(Song song1, Song song2) {
      String songName1 = song1.getTitle().toUpperCase();
      String songName2 = song2.getTitle().toUpperCase();
      return songName1.compareTo( songName2 );
    }

  };

  public static Comparator<Song> CompareByArtist = new Comparator<Song>() {
    @Override
    public int compare(Song song1, Song song2) {
      String songName1 = song1.getArtist().toUpperCase();
      String songName2 = song2.getArtist().toUpperCase();
      return songName1.compareTo( songName2 );
    }
  };

}
