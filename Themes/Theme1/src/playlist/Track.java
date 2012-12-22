package playlist;

public class Track {
  private final String tArtist;
  private final String tTitle;
  private final int tMin;
  private final int tSec;
  
  public Track( String artist, String title, int min, int sec ) {
    this.tArtist = artist;
    this.tTitle = title;
    this.tMin = min + sec / 60;
    this.tSec = sec % 60;
  }
  
  public String toString() {
    return ( this.tTitle + ": " + this.tArtist + " (" + this.tMin +
    ":" + this.tSec + ")" );
  }
  
  public String getArtist() {
    return this.tArtist;
  }
  
  public String getTitle() {
    return this.tTitle;
  }
  
  public int getMinutes() {
    return this.tMin;
  }
  
  public int getSeconds() {
    return this.tSec;
  }
}