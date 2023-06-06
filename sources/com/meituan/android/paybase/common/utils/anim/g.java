package com.meituan.android.paybase.common.utils.anim;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public int[] b;
    private float[] c;
    private int[] d;

    private float[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff6045419aeb643ef31e0ba02cc173be", RobustBitConfig.DEFAULT_VALUE) ? (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff6045419aeb643ef31e0ba02cc173be") : (float[]) this.c.clone();
    }

    public final g a(float... fArr) {
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7447e2d6db706d1a193ad776f746ff3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7447e2d6db706d1a193ad776f746ff3a");
        }
        this.c = (float[]) fArr.clone();
        return this;
    }

    public final int[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e21a9a01212411e25116f21e61ef026", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e21a9a01212411e25116f21e61ef026") : (int[]) this.d.clone();
    }

    public final int[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6406d58c0b3545692edd8b8b09412bdb", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6406d58c0b3545692edd8b8b09412bdb") : (int[]) this.b.clone();
    }

    public final float a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "999d34ca9a06c8c515b82856c1119411", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "999d34ca9a06c8c515b82856c1119411")).floatValue();
        }
        int[] b = b();
        float[] c = c();
        if (b == null || c == null || b.length == 0 || c.length == 0) {
            return 0.0f;
        }
        int i2 = 0;
        while (i2 < b.length && b[i2] < i) {
            i2++;
        }
        if (i2 == 0) {
            return c[0];
        }
        if (i2 >= c.length) {
            return c[c.length - 1];
        }
        int i3 = i2 - 1;
        return c[i3] + ((c[i2] - c[i3]) * ((i - b[i3]) / (b[i2] - b[i3])));
    }
}
