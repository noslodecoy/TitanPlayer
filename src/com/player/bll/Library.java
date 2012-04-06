package com.player.bll;

import java.util.*;

public class Library {
  
  Set<Song> library;
  
  public  Library() {
    library = new TreeSet( Song.CompareByArtist );
  }

  public void sortByArtist() {
    Set newSet = new TreeSet( Song.CompareByArtist );
    newSet.addAll( library );
    library = newSet;
  }

  public void sortByTitle() {
    Set newSet = new TreeSet( Song.CompareByTitle );
    newSet.addAll( library );
    library = newSet;
  }

  public boolean contains( Song songToTest ) {
    return library.contains( songToTest );
  }

  public int size() {
    return library.size();
  }
  
  public void add( Song songToAdd ) {
    library.add( songToAdd );
  }
  
  public void addAll( Collection collectionToAdd) {
    library.addAll( collectionToAdd );
  }
  
  public Set<Song> get() {
    return Collections.unmodifiableSet( library );
  }
    
  public void remove( Song songToRemove ) {
    library.remove( songToRemove );
  }
  
  public Iterator iterator() {
    return library.iterator();
  }
  
}