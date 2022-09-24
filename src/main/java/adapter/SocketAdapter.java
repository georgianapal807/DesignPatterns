package adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SocketAdapter extends UsaSocket {
    private RomanianSocket romanianSocket;

    @Override
    public void chargeUsaPhone() {
        romanianSocket.chargeRomanianPhone();
    }

}
