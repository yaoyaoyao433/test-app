package com.bumptech.glide.load.resource.webp;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.bitmap_recycle.c;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.b;
import com.bumptech.glide.load.resource.gif.d;
import com.squareup.picasso.MonitorData;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements e<InputStream, b> {
    private final Context a;
    private final c b;

    @Override // com.bumptech.glide.load.e
    public final String a() {
        return "";
    }

    public a(Context context, c cVar) {
        this.a = context;
        this.b = cVar;
    }

    @Override // com.bumptech.glide.load.e
    public final d a(InputStream inputStream, int i, int i2) {
        return a(a(inputStream), i, i2);
    }

    private static byte[] a(InputStream inputStream) {
        try {
            int available = inputStream.available();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(available);
            byte[] bArr = new byte[available];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            Log.w("WebpResourceDecoder", "Error reading data from stream", e);
            return null;
        }
    }

    private d a(byte[] bArr, int i, int i2) {
        Bitmap a = a(bArr);
        if (a == null) {
            return null;
        }
        d dVar = new d(new b(this.a, null, this.b, com.bumptech.glide.load.resource.d.b(), i, i2, null, bArr, a, ImageHeaderParser.ImageType.ANIMATED_WEBP));
        MonitorData monitorData = new MonitorData();
        monitorData.c = bArr.length;
        monitorData.b = "image/animated_webp";
        monitorData.d = a.getWidth();
        monitorData.e = a.getHeight();
        monitorData.i = i;
        monitorData.j = i2;
        monitorData.f = a.getConfig() == null ? "" : a.getConfig().toString();
        monitorData.g = a.getWidth();
        monitorData.h = a.getHeight();
        dVar.a(monitorData);
        return dVar;
    }

    private static Bitmap a(byte[] bArr) {
        com.bumptech.glide.webpdecoder.a aVar = new com.bumptech.glide.webpdecoder.a();
        aVar.a(bArr);
        aVar.a.d();
        return aVar.a();
    }
}
