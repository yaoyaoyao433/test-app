package retrofit;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface Profiler<T> {
    void afterCall(RequestInformation requestInformation, long j, int i, T t);

    T beforeCall();

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class RequestInformation {
        private final String baseUrl;
        private final long contentLength;
        private final String contentType;
        private final String method;
        private final String relativePath;

        public RequestInformation(String str, String str2, String str3, long j, String str4) {
            this.method = str;
            this.baseUrl = str2;
            this.relativePath = str3;
            this.contentLength = j;
            this.contentType = str4;
        }

        public final String getMethod() {
            return this.method;
        }

        public final String getBaseUrl() {
            return this.baseUrl;
        }

        public final String getRelativePath() {
            return this.relativePath;
        }

        public final long getContentLength() {
            return this.contentLength;
        }

        public final String getContentType() {
            return this.contentType;
        }
    }
}
