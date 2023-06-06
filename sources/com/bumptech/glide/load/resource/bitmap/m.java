package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m implements com.bumptech.glide.load.e<com.bumptech.glide.load.model.g, Bitmap> {
    private final com.bumptech.glide.load.e<InputStream, Bitmap> a;
    private final com.bumptech.glide.load.e<ParcelFileDescriptor, Bitmap> b;

    @Override // com.bumptech.glide.load.e
    public final String a() {
        return "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }

    public m(com.bumptech.glide.load.e<InputStream, Bitmap> eVar, com.bumptech.glide.load.e<ParcelFileDescriptor, Bitmap> eVar2) {
        this.a = eVar;
        this.b = eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bumptech.glide.load.e
    public com.bumptech.glide.load.engine.l<Bitmap> a(com.bumptech.glide.load.model.g gVar, int i, int i2) throws IOException {
        com.bumptech.glide.load.engine.l<Bitmap> a;
        ParcelFileDescriptor parcelFileDescriptor;
        InputStream inputStream = gVar.a;
        if (inputStream != null) {
            try {
                a = this.a.a(inputStream, i, i2);
            } catch (IOException e) {
                if (Log.isLoggable("ImageVideoDecoder", 2)) {
                    Log.v("ImageVideoDecoder", "Failed to load image from stream, trying FileDescriptor", e);
                }
            }
            return (a != null || (parcelFileDescriptor = gVar.b) == null) ? a : this.b.a(parcelFileDescriptor, i, i2);
        }
        a = null;
        if (a != null) {
            return a;
        }
    }
}
