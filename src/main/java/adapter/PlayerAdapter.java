package adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class PlayerAdapter extends Mp3Player {
    private Mp4Player video;

    @Override
    public void playSong() {
        video.playVideo();
    }
}
