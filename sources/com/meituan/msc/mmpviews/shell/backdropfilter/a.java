package com.meituan.msc.mmpviews.shell.backdropfilter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static int e;
    public Bitmap b;
    public Bitmap c;
    public Canvas d;
    public boolean f;
    public RenderScript g;
    public ScriptIntrinsicBlur h;
    public Allocation i;
    public Allocation j;
    private float k;
    private boolean l;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c238daa6f619f9d294a5052fe181a141", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c238daa6f619f9d294a5052fe181a141");
        } else {
            this.k = 4.0f;
        }
    }

    public final boolean a(float f, View view) {
        float f2;
        Object[] objArr = {Float.valueOf(f), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81b3f22fcffebde44400926ebfb7e122", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81b3f22fcffebde44400926ebfb7e122")).booleanValue();
        }
        float f3 = this.k;
        float f4 = f / f3;
        if (f4 > 25.0f) {
            f3 = (f3 * f4) / 25.0f;
            f2 = 25.0f;
        } else {
            f2 = f4;
        }
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return false;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int max = Math.max(1, (int) (width / f3));
        int max2 = Math.max(1, (int) (height / f3));
        boolean z = this.l;
        if (this.d == null || this.c == null || this.c.getWidth() != max || this.c.getHeight() != max2) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff980f324c542e15974b8aa89cdcbb79", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff980f324c542e15974b8aa89cdcbb79");
            } else {
                if (this.b != null) {
                    this.b.recycle();
                    this.b = null;
                }
                if (this.c != null) {
                    this.c.recycle();
                    this.c = null;
                }
            }
            try {
                this.b = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                if (this.b != null) {
                    this.d = new Canvas(this.b);
                    this.c = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    if (this.c == null) {
                        a();
                        return false;
                    }
                    z = true;
                } else {
                    a();
                    return false;
                }
            } catch (OutOfMemoryError unused) {
                a();
                return false;
            } catch (Throwable unused2) {
                a();
                return false;
            }
        }
        if (z) {
            if (a(view.getContext(), this.b, f2)) {
                this.l = false;
                return true;
            }
            return false;
        }
        return true;
    }

    @SuppressLint({"NewApi"})
    private boolean a(Context context, Bitmap bitmap, float f) {
        Object[] objArr = {context, bitmap, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9b9f2111fa02ca38368c24566aaa6f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9b9f2111fa02ca38368c24566aaa6f")).booleanValue();
        }
        if (this.g == null) {
            try {
                this.g = RenderScript.create(context);
                this.h = ScriptIntrinsicBlur.create(this.g, Element.U8_4(this.g));
            } catch (RSRuntimeException unused) {
                a();
                return false;
            }
        }
        this.h.setRadius(f);
        this.i = Allocation.createFromBitmap(this.g, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        this.j = Allocation.createTyped(this.g, this.i.getType());
        return true;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cb5da845370ec663eae4b43c5707764", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cb5da845370ec663eae4b43c5707764");
            return;
        }
        if (this.i != null) {
            this.i.destroy();
            this.i = null;
        }
        if (this.j != null) {
            this.j.destroy();
            this.j = null;
        }
        if (this.h != null) {
            this.h.destroy();
            this.h = null;
        }
        if (this.g != null) {
            this.g.destroy();
            this.g = null;
        }
    }
}
