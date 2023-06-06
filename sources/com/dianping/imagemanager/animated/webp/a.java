package com.dianping.imagemanager.animated.webp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.dianping.animated.webp.WebPFrame;
import com.dianping.imagemanager.animated.b;
import com.dianping.imagemanager.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a extends com.dianping.animated.webp.a implements b {
    public static ChangeQuickRedirect n = null;
    private static final String o = "a";
    private Bitmap p;
    private String q;

    @Override // com.dianping.imagemanager.animated.b
    public final String q_() {
        return "animatedwebpdecode";
    }

    @Override // com.dianping.imagemanager.animated.b
    public final synchronized Bitmap p_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b10e00605991b2313d65ff35c51fa066", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b10e00605991b2313d65ff35c51fa066");
        } else if (this.p != null) {
            return this.p;
        } else {
            this.p = com.dianping.imagemanager.image.cache.memory.b.a().a(this.q, com.dianping.imagemanager.image.cache.a.DEFAULT, false, true);
            if (this.p != null) {
                return this.p;
            }
            if (this.b == null) {
                this.d = 2;
            } else if (this.b.c() <= 0) {
                this.d = 1;
            }
            if (this.d != 1 && this.d != 2 && this.d != 4) {
                this.d = 0;
                WebPFrame a = this.b.a(0);
                this.p = Bitmap.createBitmap(this.i, this.j, Bitmap.Config.ARGB_8888);
                int d = a.d();
                int e = a.e();
                int b = a.b();
                int c = a.c();
                if (d == 0 && e == 0) {
                    a.a(b, c, this.p);
                } else {
                    Canvas canvas = new Canvas(this.p);
                    if (this.h == null) {
                        this.h = Bitmap.createBitmap(this.i, this.j, Bitmap.Config.ARGB_8888);
                    }
                    this.h.eraseColor(0);
                    a.a(b, c, this.h);
                    canvas.drawBitmap(this.h, d, e, (Paint) null);
                }
                com.dianping.imagemanager.image.cache.memory.b.a().a(this.q, com.dianping.imagemanager.image.cache.a.DEFAULT, this.p, true);
                return this.p;
            }
            String str = o;
            k.a(str, "Unable to decode frame, status=" + this.d);
            return null;
        }
    }

    @Override // com.dianping.imagemanager.animated.b
    public final void a(String str) {
        this.q = str;
    }

    @Override // com.dianping.animated.webp.a, com.dianping.animated.base.AnimatedImageDecoder
    public final synchronized void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "247eca73d68839ada0df2be9c818fe1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "247eca73d68839ada0df2be9c818fe1c");
            return;
        }
        super.i();
        this.p = null;
    }
}
