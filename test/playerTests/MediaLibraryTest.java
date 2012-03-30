package playerTests;

import com.player.bll.MediaLibrary;
import com.player.bll.Song;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class MediaLibraryTest {
  
  public MediaLibraryTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Test
  public void emptyLibraryTest() {
    MediaLibrary emptyLibrary = new MediaLibrary();
    assertEquals( 0, emptyLibrary.songCount() );
  }

  @Test
  public void addSongTest() {
    MediaLibrary libraryInstance = new MediaLibrary();
    libraryInstance.addSong( new Song( "TestTitle1", "Test Artist1" ) );
    libraryInstance.addSong( new Song( "TestTitle2", "Test Artist2" ) );
    assertEquals( 2, libraryInstance.songCount() );
  }

  @Test
  public void removeSongTest() {
    MediaLibrary libraryInstance = new MediaLibrary();
    libraryInstance.addSong( new Song( "TestTitle1", "Test Artist1" ) );
    libraryInstance.addSong( new Song( "TestTitle2", "Test Artist2" ) );
    libraryInstance.removeSong( 1 );
    assertEquals( 1, libraryInstance.songCount() );
  }
}
