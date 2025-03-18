package music;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicPlayerModelTest {

  @Test
  void playVolumeUp2Test() {
    var player = new MusicPlayerModel();
    player.start();
    player.volumeUp();
    player.volumeUp();

    assertEquals(player.getVolume(), 2);
    assertEquals(player.getStatus(), Status.ON);
  }

}