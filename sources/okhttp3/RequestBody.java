package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.d;
import okio.f;
import okio.m;
import okio.s;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class RequestBody {
    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract MediaType contentType();

    public abstract void writeTo(d dVar) throws IOException;

    public static RequestBody create(@Nullable MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(@Nullable final MediaType mediaType, final f fVar) {
        return new RequestBody() { // from class: okhttp3.RequestBody.1
            @Override // okhttp3.RequestBody
            @Nullable
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() throws IOException {
                return fVar.h();
            }

            @Override // okhttp3.RequestBody
            public void writeTo(d dVar) throws IOException {
                dVar.c(fVar);
            }
        };
    }

    public static RequestBody create(@Nullable MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(@Nullable final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        Util.checkOffsetAndCount(bArr.length, i, i2);
        return new RequestBody() { // from class: okhttp3.RequestBody.2
            @Override // okhttp3.RequestBody
            @Nullable
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return i2;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(d dVar) throws IOException {
                dVar.c(bArr, i, i2);
            }
        };
    }

    public static RequestBody create(@Nullable final MediaType mediaType, final File file) {
        if (file == null) {
            throw new NullPointerException("file == null");
        }
        return new RequestBody() { // from class: okhttp3.RequestBody.3
            @Override // okhttp3.RequestBody
            @Nullable
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return file.length();
            }

            @Override // okhttp3.RequestBody
            public void writeTo(d dVar) throws IOException {
                s a;
                s sVar = null;
                try {
                    a = m.a(file);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    dVar.a(a);
                    Util.closeQuietly(a);
                } catch (Throwable th2) {
                    th = th2;
                    sVar = a;
                    Util.closeQuietly(sVar);
                    throw th;
                }
            }
        };
    }
}
