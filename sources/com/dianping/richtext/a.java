package com.dianping.richtext;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.text.style.DynamicDrawableSpan;
import android.util.Log;
import com.dianping.imagemanager.utils.downloadphoto.c;
import com.dianping.imagemanager.utils.downloadphoto.h;
import com.dianping.picasso.PicassoUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a extends DynamicDrawableSpan {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public WeakReference<i> d;
    private final int e;
    private final int f;
    private final int g;
    private final com.dianping.imagemanager.utils.downloadphoto.c h;
    private Context i;
    private int j;
    private int k;
    private Bitmap l;
    private Drawable m;
    private Drawable n;
    private String o;
    private String p;
    private int q;
    private int r;
    private int s;

    public static /* synthetic */ void a(a aVar, i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "6c479131efda24a68ebd6b62a55487a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "6c479131efda24a68ebd6b62a55487a3");
        } else if (iVar != null) {
            iVar.update();
        }
    }

    public a(Context context, String str, int i, int i2, int i3, int i4, i iVar) {
        Object[] objArr = {context, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49ed5b0547f7785a98d474a2ffd18112", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49ed5b0547f7785a98d474a2ffd18112");
            return;
        }
        this.b = 0;
        this.e = 0;
        this.f = 1;
        this.g = 2;
        this.h = c.a.a;
        this.i = context;
        this.b = 1;
        this.p = str;
        this.q = i;
        this.r = i2;
        this.j = i3;
        this.k = i4;
        this.d = new WeakReference<>(iVar);
        b();
        this.m = this.i.getResources().getDrawable(R.drawable.placeholder_loading);
        this.n = this.i.getResources().getDrawable(R.drawable.placeholder_error);
        com.dianping.imagemanager.base.a.a().a(context);
        h.a aVar = new h.a(str);
        aVar.c(0);
        aVar.a(true);
        com.dianping.imagemanager.utils.downloadphoto.d a2 = this.h.a(aVar.b);
        if (this.d != null && (a2 == null || !(a2.a() instanceof Bitmap))) {
            a();
        } else if (a2 == null || !(a2.a() instanceof Bitmap)) {
        } else {
            this.c = 1;
            this.l = (Bitmap) a2.a();
        }
    }

    public a(Context context, String str, int i, int i2, int i3, int i4) {
        Object[] objArr = {context, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea696885cb2f3092c4c332c7804341b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea696885cb2f3092c4c332c7804341b0");
            return;
        }
        this.b = 0;
        this.e = 0;
        this.f = 1;
        this.g = 2;
        this.h = c.a.a;
        this.i = context;
        this.b = 0;
        this.o = str;
        this.q = i;
        this.r = i2;
        this.j = i3;
        this.k = i4;
        b();
        this.m = this.i.getResources().getDrawable(R.drawable.placeholder_loading);
        this.n = this.i.getResources().getDrawable(R.drawable.placeholder_error);
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "137f5399507de34e1323bbd02706454f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "137f5399507de34e1323bbd02706454f");
        } else {
            this.s = (int) ((this.r / g.d) * g.e);
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ffc277eb7c75bd2d2019d94c15b5139", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ffc277eb7c75bd2d2019d94c15b5139");
            return;
        }
        this.h.a(new h.a(this.p).b, new com.dianping.imagemanager.utils.downloadphoto.e() { // from class: com.dianping.richtext.a.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.imagemanager.utils.downloadphoto.e
            public final void a(com.dianping.imagemanager.utils.downloadphoto.a aVar) {
            }

            @Override // com.dianping.imagemanager.utils.downloadphoto.e
            public final void a(com.dianping.imagemanager.utils.downloadphoto.a aVar, int i, int i2) {
            }

            @Override // com.dianping.imagemanager.utils.downloadphoto.e
            public final void b(com.dianping.imagemanager.utils.downloadphoto.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bc95b19da1868ad74647b521d4a930d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bc95b19da1868ad74647b521d4a930d");
                    return;
                }
                a.this.c = 2;
                a.a(a.this, (i) a.this.d.get());
            }

            @Override // com.dianping.imagemanager.utils.downloadphoto.e
            public final void a(com.dianping.imagemanager.utils.downloadphoto.a aVar, com.dianping.imagemanager.utils.downloadphoto.d dVar) {
                Object[] objArr2 = {aVar, dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb6c88ed1cebe4f19bd8ee9428d07376", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb6c88ed1cebe4f19bd8ee9428d07376");
                    return;
                }
                a.this.c = 2;
                a.a(a.this, (i) a.this.d.get());
            }

            @Override // com.dianping.imagemanager.utils.downloadphoto.e
            public final void b(com.dianping.imagemanager.utils.downloadphoto.a aVar, com.dianping.imagemanager.utils.downloadphoto.d dVar) {
                Object[] objArr2 = {aVar, dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dab9598508733038e0284998e6245530", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dab9598508733038e0284998e6245530");
                    return;
                }
                if (dVar == null || !(dVar.a() instanceof Bitmap)) {
                    a.this.c = 2;
                } else {
                    a.this.c = 1;
                    a.this.l = (Bitmap) dVar.a();
                }
                a.a(a.this, (i) a.this.d.get());
            }
        });
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c1846f30bc38ed4a0f5dffbd3a5bba8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c1846f30bc38ed4a0f5dffbd3a5bba8")).intValue();
        }
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -this.r;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
            fontMetricsInt.descent = 0;
        }
        return this.q;
    }

    @Override // android.text.style.DynamicDrawableSpan
    public Drawable getDrawable() {
        Drawable drawable;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a92c3209e80f91213615e8bb8086a8a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a92c3209e80f91213615e8bb8086a8a2");
        }
        if (this.b == 1) {
            if (this.c == 1) {
                drawable = new BitmapDrawable(this.i.getResources(), this.l);
            } else {
                drawable = this.c == 0 ? this.m : this.n;
            }
        } else {
            try {
                drawable = this.i.getResources().getDrawable(this.i.getResources().getIdentifier(this.o, PicassoUtils.DEF_TYPE, this.i.getPackageName()));
            } catch (Exception unused) {
                drawable = this.n;
                Log.e("sms", "Unable to find resource: " + this.o);
            }
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, this.q, this.r);
            return drawable;
        }
        return this.n;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Object[] objArr = {canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1f31a306cb5fd376ac78a28ed0e41f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1f31a306cb5fd376ac78a28ed0e41f9");
            return;
        }
        Drawable drawable = getDrawable();
        canvas.save();
        int i6 = (i4 - drawable.getBounds().bottom) + this.s;
        if (this.j != 0) {
            if (this.k == 1) {
                i6 = (int) (i6 - Math.ceil((this.j - this.r) / 2.0f));
            } else if (this.k == 2) {
                i6 -= this.j - this.r;
            }
        }
        canvas.translate(f, i6);
        drawable.draw(canvas);
        canvas.restore();
    }
}
