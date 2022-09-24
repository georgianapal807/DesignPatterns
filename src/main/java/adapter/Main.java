package adapter;

public class Main {
    public static void main(String[] args) {
        UsaSocket socket = new UsaSocket();
        socket.chargeUsaPhone();

        UsaSocket usaSocketAdapter = new SocketAdapter(new RomanianSocket());
        usaSocketAdapter.chargeUsaPhone();
        System.out.println("-----------------------------------------------------");

        Mp3Player mp3Player = new Mp3Player();
        mp3Player.playSong();

        Mp4Player mp4Player = new Mp4Player();
        mp4Player.playVideo();

        Mp3Player playerAdapter = new PlayerAdapter(new Mp4Player());
        System.out.print("I am a Mp3Player and SURPRIZE!!!!  ");
        playerAdapter.playSong();
    }
}
