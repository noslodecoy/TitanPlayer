package playerTests;

import com.player.bll.Library;
import com.player.bll.Song;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class LibraryTest {
  
  Library library;
  List<Song> songs;
    
  public LibraryTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() {
    songs = new ArrayList();
    songs.add( new Song( "Little Black Submarines", "The Black Keys" ) );
    songs.add( new Song( "These Days", "Dr. Dog" ) );
    songs.add( new Song( "Civilian", "Wye Oak" ) );
    library = new Library( );
    library.addAll( songs );
  }

  @Test
  public void isEmptyLibraryTest() {
    library = new Library();
    assertEquals( 0, library.size() );
  }

  @Test
  public void librarySizeTest() {
    assertEquals( 3, library.size() );
  }

  @Test
  public void addSongSizeTest() {
    library.add( new Song( "TestTitle4", "Test Artist4" ) );
    assertEquals( 4, library.size() );
  }

  @Test
  public void addAllSongCountTest() {
    library.addAll( songs );
    assertEquals( songs.size(), library.size() );
  }

  @Test
  public void addAllSongTest() {
    library.addAll( songs );
    for ( Song songToTest : songs ){
      assertTrue( library.contains( songToTest ) );
    }
  }

  @Test
  public void removeSongTest() {
    library.remove( songs.get(1) );
    assertEquals( 2, library.size() );
  }

  @Test
  public void removedCorrectSongTest() {
    library.remove( songs.get(1) );
    assertFalse( library.contains( songs.get(1) ) );
  }
  
  @Test
  public void sortedByTitleTest() {
    library = new Library();
    Song song1 = new Song( "aaa", "zzz" );
    Song song2 = new Song( "ccc", "bbb" );
    Song song3 = new Song( "zzz", "aaa" );
    library.add( song2 );
    library.add( song3 );
    library.add( song1 );
    library.sortByTitle();
    Iterator iterator = library.get().iterator();
    assertEquals( song1, iterator.next() );
    assertEquals( song2, iterator.next() );
    assertEquals( song3, iterator.next() );
  }

  @Test
  public void sortedByArtistTest() {
    library = new Library();
    Song song1 = new Song( "zzz", "aaa" );
    Song song2 = new Song( "ddd", "ccc" );
    Song song3 = new Song( "aaa", "zzz" );
    library.add( song2 );
    library.add( song3 );
    library.add( song1 );
    library.sortByArtist();
    Iterator iterator = library.get().iterator();
    assertEquals( song1, iterator.next() );
    assertEquals( song2, iterator.next() );
    assertEquals( song3, iterator.next() );
  }

  @Test
  public void libraryIteratorTest() {
    Iterator libraryIterator = library.iterator();
    assertTrue( libraryIterator.hasNext() );
  }

}
