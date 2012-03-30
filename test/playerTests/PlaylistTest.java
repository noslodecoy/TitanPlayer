package playerTests;

import com.player.bll.Playlist;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class PlaylistTest {

  public PlaylistTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Test
  public void createEmptyPlaylistTest() {
    Playlist playlistInstance = new Playlist( "test name" );
    assertEquals( 0, playlistInstance.getSongCount() );
    assertEquals( "test name", playlistInstance.getName() );
  }
}
