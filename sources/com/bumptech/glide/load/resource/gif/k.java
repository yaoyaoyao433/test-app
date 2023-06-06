package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import com.bumptech.glide.gifdecoder.a;
import com.bumptech.glide.load.engine.l;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k implements com.bumptech.glide.load.f<b> {
    private static final a a = new a();
    private final a.InterfaceC0036a b;
    private final com.bumptech.glide.load.engine.bitmap_recycle.c c;
    private final a d;

    @Override // com.bumptech.glide.load.b
    public final String a() {
        return "";
    }

    @Override // com.bumptech.glide.load.b
    public final /* bridge */ /* synthetic */ boolean a(Object obj, OutputStream outputStream) {
        com.bumptech.glide.util.d.a();
        return a(((b) ((l) obj).a()).a.b, outputStream);
    }

    public k(com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        this(cVar, a);
    }

    private k(com.bumptech.glide.load.engine.bitmap_recycle.c cVar, a aVar) {
        this.c = cVar;
        this.b = new com.bumptech.glide.load.resource.gif.a(cVar);
        this.d = aVar;
    }

    private static boolean a(byte[] bArr, OutputStream outputStream) {
        try {
            outputStream.write(bArr);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 3)) {
                Log.d("GifEncoder", "Failed to write data to output stream in GifResourceEncoder", e);
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a {
        a() {
        }
    }
}
