package com.sankuai.xm.imui.theme;

import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements Cloneable {
    public static ChangeQuickRedirect a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Float j;
    public Float k;
    public Float l;
    public Integer m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Integer q;
    public Integer r;
    public Drawable s;
    public Drawable t;
    public Drawable u;

    public final void a(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e2ac5fa7957f7a5dff616d93f4cf786", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e2ac5fa7957f7a5dff616d93f4cf786");
        } else {
            this.n = Integer.valueOf(i);
        }
    }

    public final void a(@ColorInt Integer num) {
        this.o = num;
    }

    public final void b(@ColorInt Integer num) {
        this.p = num;
    }

    public final void c(@ColorInt Integer num) {
        this.d = num;
    }

    public final void d(@ColorInt Integer num) {
        this.f = num;
    }
}
