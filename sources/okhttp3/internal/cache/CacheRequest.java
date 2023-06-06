package okhttp3.internal.cache;

import java.io.IOException;
import okio.r;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface CacheRequest {
    void abort();

    r body() throws IOException;
}
