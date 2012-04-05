package playerTests;

import com.player.bll.MediaLibrary;
import com.player.bll.Song;
import java.util.Iterator;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class MediaLibraryTest {
  
  MediaLibrary library;
  Song song1;
  Song song2;
  Song song3;
    
  public MediaLibraryTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() {
    song1 = new Song( "Little Black Submarines", "The Black Keys" );
    song2 = new Song( "These Days", "Dr. Dog" );
    song3 = new Song( "Civilian", "Wye Oak" );
    library = new MediaLibrary( );
    library.add( song1 );
    library.add( song2 );
    library.add( song3 );
  }

  @Test
  public void isEmptyLibraryTest() {
    library = new MediaLibrary();
    assertEquals( 0, library.size() );
  }

  @Test
  public void songSizeTest() {
    assertEquals( 3, library.size() );
  }

  @Test
  public void addSongSizeTest() {
    library.add( new Song( "TestTitle4", "Test Artist4" ) );
    assertEquals( 4, library.size() );
  }

  @Test
  public void removeSongTest() {
    library.remove( song2 );
    assertEquals( 2, library.size() );
  }

  @Test
  public void removedCorrectSongTest() {
    library.remove( song2 );
    for( Song song : library ) {
      assertFalse( song.equals( song2 ) );
    }
  }
  
  @Test
  public void sortedByTitleTest() {
    library = library.sortByTitle();
    Iterator it = library.iterator();
    assertEquals( song3, it.next() );
    assertEquals( song1, it.next() );
    assertEquals( song2, it.next() );
  }

  @Test
  public void sortedByArtistTest() {
    library = library.sortByArtist();
    Iterator it = library.iterator();
    assertEquals( song2, it.next() );
    assertEquals( song1, it.next() );
    assertEquals( song3, it.next() );
  }

}
