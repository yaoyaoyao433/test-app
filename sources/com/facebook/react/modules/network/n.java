package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.s;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n {
    @Nullable
    public static InputStream a(Context context, String str, String str2, int i) {
        try {
            Uri parse = Uri.parse(str);
            if (parse.getScheme().startsWith("http")) {
                return a(context, parse);
            }
            if (i == 2) {
                return Privacy.createContentResolver(context, str2).b(parse);
            }
            com.facebook.common.logging.a.d("[RequestBodyUtil@getFileInputStream]", "fetch by rn, none-http request, permission denied: " + parse);
            return null;
        } catch (Exception e) {
            com.facebook.common.logging.a.d("ReactNative", "Could not retrieve file for contentUri " + str, e);
            return null;
        }
    }

    private static InputStream a(Context context, Uri uri) throws IOException {
        File createTempFile = File.createTempFile("RequestBodyUtil", "temp", com.facebook.react.common.d.a(context));
        createTempFile.deleteOnExit();
        InputStream wrapOpenStream = HttpURLWrapper.wrapOpenStream(new URL(uri.toString()));
        try {
            ReadableByteChannel newChannel = Channels.newChannel(wrapOpenStream);
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.getChannel().transferFrom(newChannel, 0L, Long.MAX_VALUE);
            FileInputStream fileInputStream = new FileInputStream(createTempFile);
            fileOutputStream.close();
            newChannel.close();
            return fileInputStream;
        } finally {
            wrapOpenStream.close();
        }
    }

    @Nullable
    public static RequestBody a(MediaType mediaType, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return RequestBody.create(mediaType, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public static RequestBody a(final MediaType mediaType, final InputStream inputStream) {
        return new RequestBody() { // from class: com.facebook.react.modules.network.n.1
            @Override // okhttp3.RequestBody
            public final MediaType contentType() {
                return MediaType.this;
            }

            @Override // okhttp3.RequestBody
            public final long contentLength() {
                try {
                    return inputStream.available();
                } catch (IOException unused) {
                    return 0L;
                }
            }

            @Override // okhttp3.RequestBody
            public final void writeTo(okio.d dVar) throws IOException {
                s a;
                s sVar = null;
                try {
                    a = okio.m.a(inputStream);
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

    public static RequestBody a(String str) {
        if (str.equals("POST") || str.equals(OneIdNetworkTool.PUT) || str.equals("PATCH")) {
            return RequestBody.create((MediaType) null, okio.f.b);
        }
        return null;
    }
}
