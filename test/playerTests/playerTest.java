package playerTests;

import com.player.bll.Player;
import com.player.bll.Playlist;
import com.player.bll.Song;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class playerTest {
  
  Playlist playlist;
  Player player;
  Song song1;
  Song song2;
  Song song3;
    
  public playerTest() {
  }

  @Before
  public void setUp() {
    playlist = new Playlist( "untitled" );
    player = new Player( playlist );
    song1 = new Song( "Little Black Submarines", "The Black Keys" );
    song2 = new Song( "These Days", "Dr. Dog" );
    song3 = new Song( "Civilian", "Wye Oak" );
    playlist.add( song1 );
    playlist.add( song2 );
    playlist.add( song3 );
  }

  @Test
  public void getCurrentSongTest() {
    Song song = player.getCurrentSong();
    assertTrue( song.equals( song1 ) );
  }
  
  @Test
  public void playSongTest() {
    player.play();
    assertTrue( player.isPlaying() );
  }

  @Test
  public void playingFirstSongTest() {
    player.play();
    Song song = player.getCurrentSong();
    assertTrue( song.equals( song1 ) );
  }

  @Test
  public void skipSongTest() {
    player.skipForward();
    Song song = player.getCurrentSong();
    assertTrue( song.equals( song2 ) );
  }

  @Test
  public void continuePlayingAfterSkipTest() {
    player.play();
    player.skipForward();
    assertTrue( player.isPlaying() );
  }

  @Test
  public void skipWithoutPlayingTest() {
    player.skipForward();
    assertFalse( player.isPlaying() );
  }
  
  @Test
  public void skipPastEndOfListTest() {
    player.skipForward();
    player.skipForward();
    player.skipForward();
    Song song = player.getCurrentSong();
    assertTrue( song.equals( song1 ) );
  }

  @Test
  public void stopSongAfterPlayingTest() {
    player.play();
    player.stop();
    assertFalse( player.isPlaying() );
  }

}
