package playerTests;

import com.player.bll.Player;
import com.player.bll.Playlist;
import com.player.bll.Song;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class PlaylistTest {
  Playlist playlist;
  Player player;
  Song song1;
  Song song2;
  Song song3;

  public PlaylistTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() {
    song1 = new Song( "TestTitle1", "Test Artist1" );
    song2 = new Song( "TestTitle2", "Test Artist2" );
    song3 = new Song( "TestTitle3", "Test Artist3" );
    playlist = new Playlist( "untitled" );
    playlist.add( song1 );
    playlist.add( song2 );
    playlist.add( song3 );
  }

  @Test
  public void emptyPlaylistTest() {
    playlist = new Playlist( "Untitled" );
    assertEquals( 0, playlist.size() );
  }
  
  @Test
  public void playlistNameTest() {
    playlist.setName( "test name" );
    assertEquals( "test name", playlist.getName() );
  }

  @Test
  public void addSongTest() {
    playlist.add( new Song( "TestTitle4", "Test Artist4" ) );
    assertEquals( 4, playlist.size() );
  }

  @Test
  public void removeSongTest() {
    playlist.remove( song2 );
    for( Song song : playlist ) {
      assertFalse( song.equals( song2 ) );
    }
  }

}
