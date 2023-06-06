package com.dianping.animated.webp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.dianping.animated.base.AnimatedImageDecoder;
import com.dianping.animated.base.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a implements AnimatedImageDecoder {
    public static ChangeQuickRedirect a = null;
    private static final String n = "a";
    protected WebPImage b;
    protected int c;
    protected int d;
    protected Bitmap e;
    protected int[] f;
    protected Bitmap g;
    protected Bitmap h;
    protected int i;
    protected int j;
    protected final Paint k;
    protected Canvas l;
    protected com.dianping.animated.base.b m;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57890b40be7e6510c845c46143a682a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57890b40be7e6510c845c46143a682a5");
            return;
        }
        this.c = -1;
        this.i = 0;
        this.j = 0;
        this.k = new Paint();
        this.k.setColor(0);
        this.k.setStyle(Paint.Style.FILL);
        this.k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public a(com.dianping.animated.base.b bVar) {
        this();
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a5df61a0d9dcafd0776aa48072f61f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a5df61a0d9dcafd0776aa48072f61f");
        } else {
            this.m = bVar;
        }
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2efb8d0edd7f09c70c93f88256a8fcb4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2efb8d0edd7f09c70c93f88256a8fcb4")).intValue();
        }
        if (this.b != null) {
            return this.b.a();
        }
        return 0;
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5b828deaedf13f7cbefcc844b8604b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5b828deaedf13f7cbefcc844b8604b2")).intValue();
        }
        if (this.b != null) {
            return this.b.b();
        }
        return 0;
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final int c() {
        return this.d;
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80e151d15015132f37ad17f30fa4d1b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80e151d15015132f37ad17f30fa4d1b1");
        } else {
            this.c = (this.c + 1) % f();
        }
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daba2fc2d31a3203ad7e5becee776a61", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daba2fc2d31a3203ad7e5becee776a61")).intValue();
        }
        if (this.b == null || i < 0) {
            return 0;
        }
        WebPImage webPImage = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = WebPImage.a;
        return (PatchProxy.isSupport(objArr2, webPImage, changeQuickRedirect2, false, "c18ae1daccb2b0c0d19b4ba77c3be8ea", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr2, webPImage, changeQuickRedirect2, false, "c18ae1daccb2b0c0d19b4ba77c3be8ea") : webPImage.nativeGetFrameDurations())[i % this.b.c()];
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "379fcfbb484a4884e3c9b94808b0ceb9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "379fcfbb484a4884e3c9b94808b0ceb9")).intValue();
        }
        if (f() <= 0 || this.c < 0) {
            return 0;
        }
        return a(this.c);
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d04592278c1c10cae1ef88a14f943da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d04592278c1c10cae1ef88a14f943da")).intValue();
        }
        if (this.b != null) {
            return this.b.c();
        }
        return 0;
    }

    public final int j() {
        return this.c;
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final void g() {
        this.c = -1;
    }

    public final int k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7df7ff21d957a4948e9e84b05fcb5519", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7df7ff21d957a4948e9e84b05fcb5519")).intValue();
        }
        if (this.b != null) {
            WebPImage webPImage = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = WebPImage.a;
            return PatchProxy.isSupport(objArr2, webPImage, changeQuickRedirect2, false, "4da847b40c34eccc21d4dde68ef38601", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, webPImage, changeQuickRedirect2, false, "4da847b40c34eccc21d4dde68ef38601")).intValue() : webPImage.nativeGetLoopCount();
        }
        return 0;
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final synchronized Bitmap h() {
        boolean z;
        Bitmap a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37b651a1b0522e6d548d395d8c3f6b0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37b651a1b0522e6d548d395d8c3f6b0b");
        }
        if (this.b.c() <= 0 || this.c < 0) {
            StringBuilder sb = new StringBuilder("Unable to decode frame, frameCount=");
            sb.append(this.b.c());
            sb.append(", framePointer=");
            sb.append(this.c);
            this.d = 1;
        }
        if (this.d != 1 && this.d != 2 && this.d != 4) {
            this.d = 0;
            try {
                if (this.g == null) {
                    if (this.m != null) {
                        this.g = this.m.a(this.i, this.j, Bitmap.Config.ARGB_8888);
                    }
                    if (this.g == null) {
                        this.g = l();
                    }
                    this.l = new Canvas(this.g);
                }
                int i = this.c;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41d44b96ef93cc5fa795b8ffdf6d50c4", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41d44b96ef93cc5fa795b8ffdf6d50c4")).booleanValue();
                } else {
                    if (i != 0) {
                        com.dianping.animated.base.a b = this.b.b(i);
                        com.dianping.animated.base.a b2 = this.b.b(i - 1);
                        if ((b.f != a.EnumC0054a.NO_BLEND || !a(b)) && (b2.g != a.b.DISPOSE_TO_BACKGROUND || !a(b2))) {
                            z = false;
                        }
                    }
                    z = true;
                }
                if (!z && this.g != null) {
                    com.dianping.animated.base.a b3 = this.b.b(this.c - 1);
                    if (b3.g == a.b.DISPOSE_TO_BACKGROUND) {
                        a(this.l, b3);
                    }
                } else {
                    this.l.drawColor(0, PorterDuff.Mode.SRC);
                }
                com.dianping.animated.base.a b4 = this.b.b(this.c);
                if (b4.f == a.EnumC0054a.NO_BLEND) {
                    a(this.l, b4);
                }
                int i2 = this.c;
                Canvas canvas = this.l;
                Object[] objArr3 = {Integer.valueOf(i2), canvas};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f1d238f4d60bc86411b251cb38797df2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f1d238f4d60bc86411b251cb38797df2");
                } else {
                    WebPFrame a3 = this.b.a(i2);
                    try {
                        a(canvas, a3);
                    } finally {
                        a3.a();
                    }
                }
                if (this.f == null) {
                    this.f = new int[this.i * this.j];
                }
                this.g.getPixels(this.f, 0, this.i, 0, 0, this.i, this.j);
                if (this.m == null) {
                    if (this.e == null) {
                        this.e = l();
                    }
                    a2 = this.e;
                } else {
                    a2 = this.m.a(this.i, this.j, Bitmap.Config.ARGB_8888);
                    if (a2 == null) {
                        a2 = l();
                    }
                }
                a2.setPixels(this.f, 0, this.i, 0, 0, this.i, this.j);
                return a2;
            } catch (OutOfMemoryError unused) {
                return null;
            }
        }
        new StringBuilder("Unable to decode frame, status=").append(this.d);
        return null;
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public synchronized void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee4e0563ae5c530f46d8e2c30b28ee8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee4e0563ae5c530f46d8e2c30b28ee8e");
            return;
        }
        if (this.b != null) {
            this.b.finalize();
        }
        this.d = 4;
        if (this.g != null) {
            if (this.m != null) {
                this.m.a(this.g);
            } else {
                this.g.recycle();
            }
            this.g = null;
        }
        if (this.h != null) {
            this.h.recycle();
            this.h = null;
        }
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final int a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e066ba628a27995f538ca551f5235e9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e066ba628a27995f538ca551f5235e9")).intValue();
        }
        try {
            i();
            this.b = WebPImage.a(bArr);
            this.i = this.b.a();
            this.j = this.b.b();
            this.c = -1;
            this.d = 0;
            return 0;
        } catch (Throwable unused) {
            this.d = 2;
            return 2;
        }
    }

    private boolean a(com.dianping.animated.base.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b85faa1debed061b3894ad3b5eeacefb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b85faa1debed061b3894ad3b5eeacefb")).booleanValue() : aVar.b == 0 && aVar.c == 0 && aVar.d == this.b.a() && aVar.e == this.b.b();
    }

    private void a(Canvas canvas, WebPFrame webPFrame) {
        Object[] objArr = {canvas, webPFrame};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef35d81df00f70f96996d31706e466e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef35d81df00f70f96996d31706e466e2");
            return;
        }
        int d = webPFrame.d();
        int e = webPFrame.e();
        int b = webPFrame.b();
        int c = webPFrame.c();
        synchronized (this) {
            if (this.h == null) {
                this.h = Bitmap.createBitmap(this.i, this.j, Bitmap.Config.ARGB_8888);
            }
            this.h.eraseColor(0);
            webPFrame.a(b, c, this.h);
            canvas.drawBitmap(this.h, d, e, (Paint) null);
        }
    }

    private void a(Canvas canvas, com.dianping.animated.base.a aVar) {
        Object[] objArr = {canvas, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b8543cf039746e1c630691add5d587b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b8543cf039746e1c630691add5d587b");
        } else {
            canvas.drawRect(aVar.b, aVar.c, aVar.b + aVar.d, aVar.c + aVar.e, this.k);
        }
    }

    private Bitmap l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99ae9b987eccb1c278209aa9ed456a7c", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99ae9b987eccb1c278209aa9ed456a7c") : Bitmap.createBitmap(this.i, this.j, Bitmap.Config.ARGB_8888);
    }
}
