package com.sankuai.waimai.mach.component.swiper;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.parser.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    String b;
    boolean c;
    int d;
    int e;
    int f;
    boolean g;
    boolean h;
    float i;
    float j;
    float k;
    float l;
    float m;
    float n;
    float o;
    d p;
    String q;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "161cbbee1428fa66aca068ce44d57e45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "161cbbee1428fa66aca068ce44d57e45");
            return;
        }
        this.c = true;
        this.i = -1.0f;
        this.j = 1.0f;
        this.k = 1.0f;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0.5f;
        this.o = 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "744ea4bdbbd7149b08dbb600448047a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "744ea4bdbbd7149b08dbb600448047a6")).floatValue();
        }
        try {
            return (float) (Integer.parseInt(str) / 100.0d);
        } catch (NumberFormatException unused) {
            return 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79f19d704e79feb1132288e95866f17d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79f19d704e79feb1132288e95866f17d")).floatValue();
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9808087a42b8f9142e9e3f31e79a8418", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9808087a42b8f9142e9e3f31e79a8418")).floatValue();
        }
        try {
            return Float.parseFloat(str.substring(0, str.indexOf("%"))) / 100.0f;
        } catch (NumberFormatException unused) {
            return 0.5f;
        }
    }
}
