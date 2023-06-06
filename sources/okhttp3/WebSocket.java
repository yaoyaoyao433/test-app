package okhttp3;

import javax.annotation.Nullable;
import okio.f;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface WebSocket {

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, @Nullable String str);

    long queueSize();

    Request request();

    boolean send(String str);

    boolean send(f fVar);
}
