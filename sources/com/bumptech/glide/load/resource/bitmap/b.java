package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements com.bumptech.glide.load.f<Bitmap> {
    private Bitmap.CompressFormat a;
    private int b;

    @Override // com.bumptech.glide.load.b
    public final String a() {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }

    @Override // com.bumptech.glide.load.b
    public final /* synthetic */ boolean a(Object obj, OutputStream outputStream) {
        Bitmap.CompressFormat a;
        com.bumptech.glide.load.engine.l lVar = (com.bumptech.glide.load.engine.l) obj;
        Bitmap bitmap = (Bitmap) lVar.a();
        long a2 = com.bumptech.glide.util.d.a();
        String b = lVar.b();
        if (this.a != null) {
            a = this.a;
        } else {
            a = com.bumptech.glide.util.h.a(b, bitmap);
        }
        bitmap.compress(a, this.b, outputStream);
        if (Log.isLoggable("BitmapEncoder", 2)) {
            StringBuilder sb = new StringBuilder("Compressed with type: ");
            sb.append(a);
            sb.append(" of size ");
            sb.append(com.bumptech.glide.util.h.a(bitmap));
            sb.append(" in ");
            sb.append(com.bumptech.glide.util.d.a(a2));
            return true;
        }
        return true;
    }

    public b() {
        this(null, 90);
    }

    private b(Bitmap.CompressFormat compressFormat, int i) {
        this.a = null;
        this.b = 90;
    }
}
