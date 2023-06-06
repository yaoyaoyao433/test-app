package retrofit.android;

import retrofit.RestAdapter;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class AndroidLog implements RestAdapter.Log {
    private static final int LOG_CHUNK_SIZE = 4000;
    private final String tag;

    public AndroidLog(String str) {
        this.tag = str;
    }

    @Override // retrofit.RestAdapter.Log
    public final void log(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 4000;
            logChunk(str.substring(i, Math.min(length, i2)));
            i = i2;
        }
    }

    public void logChunk(String str) {
        getTag();
    }

    public String getTag() {
        return this.tag;
    }
}
