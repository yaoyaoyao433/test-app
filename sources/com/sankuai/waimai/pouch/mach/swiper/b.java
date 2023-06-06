package com.sankuai.waimai.pouch.mach.swiper;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.parser.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    String b;
    boolean c;
    int d;
    int e;
    int f;
    int g;
    boolean h;
    boolean i;
    float j;
    float k;
    float l;
    float m;
    float n;
    float o;
    float p;
    float q;
    float r;
    float s;
    float t;
    d u;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a2b7c50c269e2bd2d08b502d8f1b4cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a2b7c50c269e2bd2d08b502d8f1b4cc");
            return;
        }
        this.c = true;
        this.j = -1.0f;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.5f;
        this.p = 0.5f;
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.t = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2a8bf2f4b2560c7b31a86c9e7d3aae5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2a8bf2f4b2560c7b31a86c9e7d3aae5")).floatValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5302f8bf4120f145e543006cc1bd46d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5302f8bf4120f145e543006cc1bd46d")).floatValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5337096a9c45ff0a48d6e915b1e7c2c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5337096a9c45ff0a48d6e915b1e7c2c7")).floatValue();
        }
        try {
            return Float.parseFloat(str.substring(0, str.indexOf("%"))) / 100.0f;
        } catch (NumberFormatException unused) {
            return 0.5f;
        }
    }
}
