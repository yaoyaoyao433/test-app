package com.dianping.imagemanager.image.drawable;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    int b;
    private boolean c;
    private ColorFilter d;
    private int e;
    private int f;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aca60a8cbbc6dcb477b07e79c7f38ade", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aca60a8cbbc6dcb477b07e79c7f38ade");
            return;
        }
        this.b = -1;
        this.c = false;
        this.d = null;
        this.e = -1;
        this.f = -1;
    }

    public final void a(ColorFilter colorFilter) {
        this.d = colorFilter;
        this.c = true;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764e89146746af0879b2568ef3608b2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764e89146746af0879b2568ef3608b2f");
        } else {
            this.e = z ? 1 : 0;
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca25023841ac1c6446a07b161e7e6a8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca25023841ac1c6446a07b161e7e6a8e");
        } else {
            this.f = z ? 1 : 0;
        }
    }

    public final void a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65bd9e6d077e65e2f398a80356d45076", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65bd9e6d077e65e2f398a80356d45076");
        } else if (drawable == null) {
        } else {
            if (this.b != -1) {
                drawable.setAlpha(this.b);
            }
            if (this.c) {
                drawable.setColorFilter(this.d);
            }
            if (this.e != -1) {
                drawable.setDither(this.e != 0);
            }
            if (this.f != -1) {
                drawable.setFilterBitmap(this.f != 0);
            }
        }
    }
}
