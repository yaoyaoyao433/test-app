package retrofit.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import retrofit.mime.TypedInput;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class Response {
    private final TypedInput body;
    private final List<Header> headers;
    private final String reason;
    private final int status;
    private final String url;

    public Response(String str, int i, String str2, List<Header> list, TypedInput typedInput) {
        if (str == null) {
            throw new IllegalArgumentException("url == null");
        }
        if (i < 200) {
            throw new IllegalArgumentException("Invalid status code: " + i);
        } else if (str2 == null) {
            throw new IllegalArgumentException("reason == null");
        } else {
            if (list == null) {
                throw new IllegalArgumentException("headers == null");
            }
            this.url = str;
            this.status = i;
            this.reason = str2;
            this.headers = Collections.unmodifiableList(new ArrayList(list));
            this.body = typedInput;
        }
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getReason() {
        return this.reason;
    }

    public final List<Header> getHeaders() {
        return this.headers;
    }

    public final TypedInput getBody() {
        return this.body;
    }
}
