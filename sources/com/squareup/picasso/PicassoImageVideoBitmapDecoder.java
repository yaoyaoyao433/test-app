package com.squareup.picasso;

import android.graphics.Bitmap;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.l;
import com.bumptech.glide.load.model.g;
import com.bumptech.glide.load.resource.bitmap.c;
import com.bumptech.glide.load.resource.gifbitmap.a;
import com.bumptech.glide.load.resource.gifbitmap.b;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PicassoImageVideoBitmapDecoder implements e<g, a> {
    private BitmapStreamDecoder a;

    @Override // com.bumptech.glide.load.e
    public final String a() {
        return "com.squareup.picasso.PicassoImageVideoBitmapDecoder";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PicassoImageVideoBitmapDecoder(BitmapStreamDecoder bitmapStreamDecoder) {
        this.a = bitmapStreamDecoder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bumptech.glide.load.e
    public l<a> a(g gVar, int i, int i2) throws IOException {
        Bitmap a;
        InputStream inputStream = gVar.a;
        if (inputStream != null) {
            try {
                a = this.a.a(inputStream, i, i2);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } else {
            a = null;
        }
        return new b(new a(c.a(a, null, Picasso.b()), null));
    }
}
