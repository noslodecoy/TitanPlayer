package playerTests;

import com.player.bll.Song;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

public class SongTest {
  
  Song song1;
  Song song2;
  Song song3;

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
  }
  
  @Test
  public void songTitleTest() {
    assertEquals( "Little Black Submarines", song1.getTitle() );
  }

  @Test
  public void songArtistTest() {
    assertEquals( "The Black Keys", song1.getArtist() );
  }

  @Test
  public void songEqualsTest() {
    Song testSong = new Song( song1.getTitle(), song1.getArtist() );
    assertTrue( testSong.equals( song1 ) );
  }

  @Test
  public void songNotEqualsTest() {
    Song testSong = new Song( "Not a real title", "Not a real artist" );
    assertFalse( testSong.equals( song1 ) );
  }
  
  @Test
  public void artistComparatorTest() {
    ArrayList list = new ArrayList<Song>();
    list.add( song1 );
    list.add( song2 );
    list.add( song3 );
    Collections.sort( list, Song.CompareByArtist );
    assertEquals( list.get(0), song2  );
    assertEquals( list.get(1), song1  );
    assertEquals( list.get(2), song3  );
  }

  @Test
  public void titleComparatorTest() {
    ArrayList list = new ArrayList<Song>();
    list.add( song1 );
    list.add( song2 );
    list.add( song3 );
    Collections.sort( list, Song.CompareByTitle );
    assertEquals( list.get(0), song3  );
    assertEquals( list.get(1), song1  );
    assertEquals( list.get(2), song2  );
  }

}
