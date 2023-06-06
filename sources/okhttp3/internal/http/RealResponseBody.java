package okhttp3.internal.http;

import javax.annotation.Nullable;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.e;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    @Nullable
    private final String contentTypeString;
    private final e source;

    public RealResponseBody(@Nullable String str, long j, e eVar) {
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = eVar;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        if (this.contentTypeString != null) {
            return MediaType.parse(this.contentTypeString);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public final e source() {
        return this.source;
    }
}
