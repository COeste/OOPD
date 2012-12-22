package playlist;
import playlist.Track;

public class Playlist {
  private java.util.List<Track> playList = new java.util.ArrayList<Track>();
  private int nowPlaying;
  
  public Playlist( Track initTrack ) {
    this.playList.add( initTrack );
    this.nowPlaying = 0;
  }
  
  public void addTrack( Track toAdd ) {
    this.playList.add( toAdd );
  }
  
  public void removeTrack( Track toRemove ) {
    this.playList.remove( toRemove );
  }
  
  public Track getNowPlaying() {
    return this.playList.get( nowPlaying );
  }
    
  public void nextTrack() {
    if( this.nowPlaying == ( this.playList.size() - 1)) {
      this.nowPlaying = 0;
    }
    else {
      this.nowPlaying++;
    }
  }
  
  public void previousTrack() {
    if( this.nowPlaying == 0 ) {
      this.nowPlaying = this.playList.size() - 1;
    }
    else {
      this.nowPlaying--;
    }
  }
  
  public Track findShortestTrack() {
    Track shortTrack= this.playList.get(0);
    
    for( int i = 1; i < playList.size(); i++ ) {
      Track temp = this.playList.get(i);
      
      if( temp.getMinutes() * 60 + temp.getSeconds() < 
           shortTrack.getMinutes() * 60 +  shortTrack.getSeconds() ) {
        shortTrack = temp;
      }
    }
    
    return shortTrack;
  }
  
  public String toString() {
    String returnString = "";
    
    for( int i = 0; i < playList.size(); i++ ) {
      returnString += playList.get(i).toString() + ", ";
    }
    
    return returnString;
  }
}