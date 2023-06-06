package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.tencent.mapsdk.internal.kn;
import com.tencent.mapsdk.internal.kv;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class jr extends jj {
    public static final int a = 10;
    private static final kv.a g;
    private static final kv.g<kv.i<Bitmap>> h;
    protected final AtomicInteger b = new AtomicInteger();
    protected Bitmap c;
    protected byte[] d;
    public int e;
    public String f;

    static {
        kv.a aVar = new kv.a(Bitmap.Config.ARGB_8888);
        g = aVar;
        h = kv.a(aVar);
    }

    public jr() {
    }

    public jr(Bitmap bitmap) {
        this.c = bitmap;
        i();
        h();
    }

    public jr(byte[] bArr) {
        this.d = bArr;
        if (bArr != null) {
            a(bArr);
        }
    }

    public final synchronized Bitmap c() {
        if (this.c == null) {
            a(this.d);
        }
        if (this.c == null || !this.c.isRecycled()) {
            return this.c;
        }
        return null;
    }

    public final void d() {
        if (this.c == null || this.c.isRecycled()) {
            return;
        }
        int decrementAndGet = this.b.decrementAndGet();
        kn.a f = kn.f(ki.r);
        f.a("decrement refCount:" + decrementAndGet + " id = " + this.f);
    }

    public final void e() {
        if (this.c == null || this.c.isRecycled()) {
            return;
        }
        int incrementAndGet = this.b.incrementAndGet();
        kn.a f = kn.f(ki.r);
        f.a("increment refCount:" + incrementAndGet + " id = " + this.f);
    }

    public static void a(kv.a aVar) {
        kv.a aVar2 = g;
        if (aVar != null) {
            aVar2.a = aVar.a;
            aVar2.b = aVar.b;
            aVar2.c = aVar.c;
        }
    }

    @Override // com.tencent.mapsdk.internal.jj
    public final int a() {
        return this.e;
    }

    @Override // com.tencent.mapsdk.internal.jj
    public final byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        if (this.d != null) {
            return this.d;
        }
        if (this.c != null && !this.c.isRecycled()) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    if (this.c.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        kd.a(byteArrayOutputStream);
                        return byteArray;
                    }
                    kd.a(byteArrayOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    kd.a(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                byteArrayOutputStream = null;
                th = th3;
            }
        }
        return new byte[0];
    }

    @Override // com.tencent.mapsdk.internal.jj
    public final void a(byte[] bArr) {
        f();
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        this.d = bArr;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.sankuai.waimai.launcher.util.image.a.a(bArr, 0, bArr.length, options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            return;
        }
        g.a = options.outWidth;
        g.b = options.outHeight;
        Bitmap bitmap = null;
        boolean z = false;
        for (int i = 0; !z && i < 20; i++) {
            kv.i<Bitmap> a2 = h.a();
            if (a2 != null) {
                bitmap = a2.a;
                if (!bitmap.isRecycled() && bitmap.getWidth() == options.outWidth && bitmap.getHeight() == options.outHeight) {
                    z = true;
                }
            }
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        if (z) {
            options2.inBitmap = bitmap;
        }
        options2.inSampleSize = 1;
        options2.inMutable = true;
        this.c = com.sankuai.waimai.launcher.util.image.a.a(bArr, 0, bArr.length, options2);
        this.d = null;
        i();
        h();
    }

    private void h() {
        if (this.c == null && this.d != null) {
            this.e = this.d.length;
        }
        if (this.c == null || this.c.isRecycled()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.e = this.c.getAllocationByteCount();
        } else {
            this.e = this.c.getByteCount();
        }
    }

    private void i() {
        if (this.c == null || this.c.isRecycled()) {
            return;
        }
        this.f = gx.a(this.c);
    }

    public boolean f() {
        if (this.c != null && !this.c.isRecycled() && this.b.decrementAndGet() <= 0) {
            this.c.recycle();
            kn.f(ki.r).a("recycle out");
        }
        this.d = null;
        return this.c == null || this.c.isRecycled();
    }

    public final boolean g() {
        if (this.c != null) {
            return this.c.isRecycled();
        }
        return this.d == null || this.d.length == 0;
    }

    private String j() {
        return this.f;
    }

    public String toString() {
        return "BitmapData{id='" + this.f + "'}";
    }
}
