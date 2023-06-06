package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.c;
import okio.d;
import okio.f;
import org.apache.http.entity.mime.MIME;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class MultipartBody extends RequestBody {
    private final f boundary;
    private long contentLength = -1;
    private final MediaType contentType;
    private final MediaType originalType;
    private final List<Part> parts;
    public static final MediaType MIXED = MediaType.get("multipart/mixed");
    public static final MediaType ALTERNATIVE = MediaType.get("multipart/alternative");
    public static final MediaType DIGEST = MediaType.get("multipart/digest");
    public static final MediaType PARALLEL = MediaType.get("multipart/parallel");
    public static final MediaType FORM = MediaType.get("multipart/form-data");
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {13, 10};
    private static final byte[] DASHDASH = {45, 45};

    MultipartBody(f fVar, MediaType mediaType, List<Part> list) {
        this.boundary = fVar;
        this.originalType = mediaType;
        this.contentType = MediaType.get(mediaType + "; boundary=" + fVar.a());
        this.parts = Util.immutableList(list);
    }

    public final MediaType type() {
        return this.originalType;
    }

    public final String boundary() {
        return this.boundary.a();
    }

    public final int size() {
        return this.parts.size();
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final Part part(int i) {
        return this.parts.get(i);
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.contentType;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(d dVar) throws IOException {
        writeOrCountBytes(dVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long writeOrCountBytes(@Nullable d dVar, boolean z) throws IOException {
        c cVar;
        if (z) {
            dVar = new c();
            cVar = dVar;
        } else {
            cVar = 0;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers;
            RequestBody requestBody = part.body;
            dVar.c(DASHDASH);
            dVar.c(this.boundary);
            dVar.c(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    dVar.b(headers.name(i2)).c(COLONSPACE).b(headers.value(i2)).c(CRLF);
                }
            }
            MediaType contentType = requestBody.contentType();
            if (contentType != null) {
                dVar.b("Content-Type: ").b(contentType.toString()).c(CRLF);
            }
            long contentLength = requestBody.contentLength();
            if (contentLength != -1) {
                dVar.b("Content-Length: ").n(contentLength).c(CRLF);
            } else if (z) {
                cVar.s();
                return -1L;
            }
            dVar.c(CRLF);
            if (z) {
                j += contentLength;
            } else {
                requestBody.writeTo(dVar);
            }
            dVar.c(CRLF);
        }
        dVar.c(DASHDASH);
        dVar.c(this.boundary);
        dVar.c(DASHDASH);
        dVar.c(CRLF);
        if (z) {
            long j2 = j + cVar.b;
            cVar.s();
            return j2;
        }
        return j;
    }

    static StringBuilder appendQuotedString(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(charAt);
            }
        }
        sb.append('\"');
        return sb;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class Part {
        final RequestBody body;
        @Nullable
        final Headers headers;

        public static Part create(RequestBody requestBody) {
            return create(null, requestBody);
        }

        public static Part create(@Nullable Headers headers, RequestBody requestBody) {
            if (requestBody == null) {
                throw new NullPointerException("body == null");
            }
            if (headers != null && headers.get("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (headers != null && headers.get("Content-Length") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
            return new Part(headers, requestBody);
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, RequestBody.create((MediaType) null, str2));
        }

        public static Part createFormData(String str, @Nullable String str2, RequestBody requestBody) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            StringBuilder sb = new StringBuilder("form-data; name=");
            MultipartBody.appendQuotedString(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                MultipartBody.appendQuotedString(sb, str2);
            }
            return create(new Headers.Builder().addUnsafeNonAscii(MIME.CONTENT_DISPOSITION, sb.toString()).build(), requestBody);
        }

        private Part(@Nullable Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        @Nullable
        public final Headers headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class Builder {
        private final f boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public Builder(String str) {
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
            this.boundary = f.a(str);
        }

        public final Builder setType(MediaType mediaType) {
            if (mediaType == null) {
                throw new NullPointerException("type == null");
            }
            if (!mediaType.type().equals("multipart")) {
                throw new IllegalArgumentException("multipart != " + mediaType);
            }
            this.type = mediaType;
            return this;
        }

        public final Builder addPart(RequestBody requestBody) {
            return addPart(Part.create(requestBody));
        }

        public final Builder addPart(@Nullable Headers headers, RequestBody requestBody) {
            return addPart(Part.create(headers, requestBody));
        }

        public final Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public final Builder addFormDataPart(String str, @Nullable String str2, RequestBody requestBody) {
            return addPart(Part.createFormData(str, str2, requestBody));
        }

        public final Builder addPart(Part part) {
            if (part == null) {
                throw new NullPointerException("part == null");
            }
            this.parts.add(part);
            return this;
        }

        public final MultipartBody build() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new MultipartBody(this.boundary, this.type, this.parts);
        }
    }
}
