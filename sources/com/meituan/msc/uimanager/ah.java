package com.meituan.msc.uimanager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ah {
    public static ChangeQuickRedirect a;
    private static final int[] c = {1, 2, 4, 8, 16, 32, 64, 128, 256};
    public final float[] b;
    private int d;
    private final float e;
    private boolean f;

    public ah() {
        this(0.0f);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79fa0f362ddaee41bf868a827798688f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79fa0f362ddaee41bf868a827798688f");
        }
    }

    public ah(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8870cc8d9afdcf0beae43d7060cd35a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8870cc8d9afdcf0beae43d7060cd35a");
            return;
        }
        this.d = 0;
        this.e = f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.b = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e81956481ad4f3d3dda4acbee89d7f07", RobustBitConfig.DEFAULT_VALUE) ? (float[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e81956481ad4f3d3dda4acbee89d7f07") : new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    }

    public final boolean a(int i, float f) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21f1d348fd523298464852da19d59229", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21f1d348fd523298464852da19d59229")).booleanValue();
        }
        if (q.a(this.b[i], f)) {
            return false;
        }
        this.b[i] = f;
        if (com.meituan.android.msc.yoga.f.a(f)) {
            this.d = (~c[i]) & this.d;
        } else {
            this.d = c[i] | this.d;
        }
        this.f = ((this.d & c[8]) == 0 && (this.d & c[7]) == 0 && (this.d & c[6]) == 0) ? true : true;
        return true;
    }

    public final float a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a97065edb0bca95b68edbe45353e2aff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a97065edb0bca95b68edbe45353e2aff")).floatValue();
        }
        float f = (i == 4 || i == 5) ? Float.NaN : this.e;
        if (this.d == 0) {
            return f;
        }
        if ((this.d & c[i]) != 0) {
            return this.b[i];
        }
        if (this.f) {
            char c2 = (i == 1 || i == 3) ? (char) 7 : (char) 6;
            if ((this.d & c[c2]) != 0) {
                return this.b[c2];
            }
            if ((this.d & c[8]) != 0) {
                return this.b[8];
            }
        }
        return f;
    }
}
