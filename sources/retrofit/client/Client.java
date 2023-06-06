package retrofit.client;

import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface Client {

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface Provider {
        Client get();
    }

    Response execute(Request request) throws IOException;
}
