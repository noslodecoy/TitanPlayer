package com.player.bll;

import java.util.Comparator;
import java.util.TreeSet;

public class MediaLibrary extends TreeSet<Song> {
  
  public  MediaLibrary() {
    super( Song.CompareByTitle );
  }

  public  MediaLibrary( Comparator useComparator ) {
    super( useComparator );
  }

  public MediaLibrary sortByArtist() {
    MediaLibrary newSet = new MediaLibrary( Song.CompareByArtist );
    newSet.addAll( this );
    return newSet;
  }

  public MediaLibrary sortByTitle() {
    MediaLibrary newSet = new MediaLibrary( Song.CompareByTitle );
    newSet.addAll( this );
    return newSet;
  }

}