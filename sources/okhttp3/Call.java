package okhttp3;

import java.io.IOException;
import okio.t;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface Call extends Cloneable {

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    Call clone();

    void enqueue(Callback callback);

    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    t timeout();
}
