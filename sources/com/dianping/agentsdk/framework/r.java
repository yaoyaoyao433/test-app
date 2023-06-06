package com.dianping.agentsdk.framework;

import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class r {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    private a g;

    public r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f8c36244921520df460e7ad5775aa73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f8c36244921520df460e7ad5775aa73");
            return;
        }
        this.g = a.AUTO;
        this.b = -1;
        this.c = -1;
    }

    public final a a() {
        return this.g == null ? a.AUTO : this.g;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final Drawable d() {
        return this.d;
    }

    public final Drawable e() {
        return this.e;
    }

    public final Drawable f() {
        return this.f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        AUTO,
        NONE,
        TOP,
        MIDDLE,
        BOTTOM,
        SINGLE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0edb9dbad0aae16867b447ceb0773d79", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0edb9dbad0aae16867b447ceb0773d79");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59e473e1f56ee3da225cfc38cb469102", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59e473e1f56ee3da225cfc38cb469102") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e741c129a3bc28e3a3e8614f5e20a7f", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e741c129a3bc28e3a3e8614f5e20a7f") : (a[]) values().clone();
        }
    }
}
