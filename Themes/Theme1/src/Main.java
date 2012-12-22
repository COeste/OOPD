import playlist.Track;
import playlist.Playlist;

class Main {
  public static void main(String[] _) {
    Track test1 = new Track("TestArtist1", "TestTitle1", 12, 34);
    Track test2 = new Track("TestArtist2", "TestTitle2", 34, 56);
    Track test3 = new Track("TestArtist3", "TestTitle3", 56, 78);
    Playlist test4 = new Playlist( test3 );
    
    //Track tests
    assert test1.toString().equals("TestTitle1: TestArtist1 (12:34)");
    assert test1.getArtist().equals("TestArtist1");
    assert test1.getTitle().equals("TestTitle1");
    assert test1.getMinutes() == 12;
    assert test1.getSeconds() == 34;
    assert test2.toString().equals("TestTitle2: TestArtist2 (34:56)");
    assert test3.toString().equals("TestTitle3: TestArtist3 (57:18)");
    
    //Playlist tests
    assert test4.getNowPlaying().toString().equals("TestTitle3: TestArtist3 (57:18)");
    assert test4.getNowPlaying().getArtist().equals("TestArtist3");
    assert test4.getNowPlaying().getTitle().equals("TestTitle3");
    assert test4.getNowPlaying().getMinutes() == 57;
    assert test4.getNowPlaying().getSeconds() == 18;
    test4.addTrack( test1 );
    test4.addTrack( test2 );
    assert test4.toString().equals("TestTitle3: TestArtist3 (57:18), TestTitle1: TestArtist1 (12:34), TestTitle2: TestArtist2 (34:56), ");
    assert test4.findShortestTrack().equals( test1 );
    test4.previousTrack();
    assert test4.getNowPlaying() == test2;
    test4.previousTrack();
    assert test4.getNowPlaying() == test1;
    test4.nextTrack();
    assert test4.getNowPlaying() == test2;
    test4.nextTrack();
    assert test4.getNowPlaying() == test3;
    test4.removeTrack( test1 );
    assert test4.toString().equals("TestTitle3: TestArtist3 (57:18), TestTitle2: TestArtist2 (34:56), ");
    
    
  }
}