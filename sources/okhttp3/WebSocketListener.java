package okhttp3;

import javax.annotation.Nullable;
import okio.f;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i, String str) {
    }

    public void onClosing(WebSocket webSocket, int i, String str) {
    }

    public void onFailure(WebSocket webSocket, Throwable th, @Nullable Response response) {
    }

    public void onMessage(WebSocket webSocket, String str) {
    }

    public void onMessage(WebSocket webSocket, f fVar) {
    }

    public void onOpen(WebSocket webSocket, Response response) {
    }
}
