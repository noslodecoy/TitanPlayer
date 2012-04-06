package playerTests;

import com.player.bll.Player;
import com.player.bll.Playlist;
import com.player.bll.Song;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class PlaylistTest {
  Playlist playlist;
  Player player;
  List<Song> songs;

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
    songs = new ArrayList();
    songs.add( new Song( "Little Black Submarines", "The Black Keys" ) );
    songs.add( new Song( "These Days", "Dr. Dog" ) );
    songs.add( new Song( "Civilian", "Wye Oak" ) );

    playlist = new Playlist( "untitled" );
    playlist.addAll( songs );
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
  public void addSongToMiddleTest() {
    Song testSong = new Song( "TestTitle4", "Test Artist4" );
    playlist.add( 3, testSong );
    assertEquals( testSong, playlist.get(3) );
  }

  
  @Test
  public void playlistContainsTest() {
    assertTrue( playlist.contains( songs.get(0) ) );
  }

  @Test
  public void addAllSongCountTest() {
    playlist = new Playlist( "untitled" );
    playlist.addAll( songs );
    assertEquals( songs.size(), playlist.size() );
  }

  @Test
  public void addAllSongTest() {
    playlist.addAll( songs );
    for ( Song songToTest : songs ){
      assertTrue( playlist.contains( songToTest ) );
    }
  }
  
  @Test
  public void removeSongTest() {
    playlist.remove( songs.get(1) );
    assertFalse( playlist.contains( songs.get(1) ) );
  }
  
  @Test
  public void getSongByIndexTest() {
    Song testSong = playlist.get(1);
    assertEquals( songs.get(1), testSong );
  }
  
}
