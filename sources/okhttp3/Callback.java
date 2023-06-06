package okhttp3;

import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface Callback {
    void onFailure(Call call, IOException iOException);

    void onResponse(Call call, Response response) throws IOException;
}
