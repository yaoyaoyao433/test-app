package com.squareup.picasso;

import android.graphics.Bitmap;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.l;
import com.bumptech.glide.load.resource.bitmap.c;
import com.bumptech.glide.load.resource.gifbitmap.a;
import com.bumptech.glide.load.resource.gifbitmap.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PicassoFileToStreamDecoder implements e<File, a> {
    private BitmapStreamDecoder a;

    @Override // com.bumptech.glide.load.e
    public final String a() {
        return "com.squareup.picasso.PicassoFileToStreamDecoder";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PicassoFileToStreamDecoder(BitmapStreamDecoder bitmapStreamDecoder) {
        this.a = bitmapStreamDecoder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bumptech.glide.load.e
    public l<a> a(File file, int i, int i2) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                Bitmap a = this.a.a(fileInputStream2, i, i2);
                try {
                    fileInputStream2.close();
                } catch (IOException unused) {
                }
                return new b(new a(c.a(a, null, Picasso.b()), null));
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
