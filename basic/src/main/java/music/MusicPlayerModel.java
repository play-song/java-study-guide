package music;

import lombok.Getter;

@Getter
public class MusicPlayerModel implements MusicPlayer {

  private int volume;
  private Status status;

  public MusicPlayerModel() {
    this.volume = 0;
    this.status = Status.OFF;
  }

  @Override
  public void on() {
    this.status = Status.ON;
  }

  @Override
  public void getState() {
    this.status = status;
    System.out.println("this.volume : " + volume);
    System.out.println("this.status : " + status);
  }

  @Override
  public void volumeUp() {
    this.volume++;
  }

  @Override
  public void volumeDown() {
    if (this.volume < 0) {
      this.volume = 0;
      return;
    }
    this.volume--;
  }

  @Override
  public void off() {
    this.status = Status.OFF;
  }
}
