package com.meituan.itc.android.mtnn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public a b;
    private float[] c;
    private int[] d;
    private byte[] e;
    private long f;
    private long g;

    public f(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a32cbbb83102aebd5b34a847785cd74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a32cbbb83102aebd5b34a847785cd74");
            return;
        }
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 0L;
        this.g = 0L;
        this.b = a.DataFormat_NCHW;
        this.f = j;
        this.g = j2;
    }

    public final boolean a(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7891f6b0b4237c071fc9b3dc87329849", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7891f6b0b4237c071fc9b3dc87329849")).booleanValue();
        }
        boolean nativeReshapeTensor = MTNNNetNative.nativeReshapeTensor(this.g, this.f, iArr);
        this.c = null;
        return nativeReshapeTensor;
    }

    public final boolean b(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f38e6f519ab63297aeb810b4e4aae62", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f38e6f519ab63297aeb810b4e4aae62")).booleanValue() : MTNNNetNative.nativeSetInputIntData(this.f, this.b.e, iArr);
    }

    public final boolean a(float[] fArr) {
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9786a6288a62d8786fb3c9c082ef3d8b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9786a6288a62d8786fb3c9c082ef3d8b")).booleanValue() : MTNNNetNative.nativeSetInputFloatData(this.f, this.b.e, fArr);
    }

    public final int[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b480386fd22ce44b13f080d012b44d8b", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b480386fd22ce44b13f080d012b44d8b") : MTNNNetNative.nativeTensorGetDimensions(this.f);
    }

    public final float[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b9533d3b715a521009294bebb893322", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b9533d3b715a521009294bebb893322");
        }
        if (this.c == null) {
            this.c = new float[d()];
        }
        MTNNNetNative.nativeTensorGetData(this.f, this.b.e, this.c);
        return this.c;
    }

    public final int[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd08946e1cf03d6f4d51dea081a34034", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd08946e1cf03d6f4d51dea081a34034");
        }
        if (this.d == null) {
            this.d = new int[d()];
        }
        MTNNNetNative.nativeTensorGetIntData(this.f, this.b.e, this.d);
        return this.d;
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "276cd31bc65e03e8074c8b8b9eb43c12", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "276cd31bc65e03e8074c8b8b9eb43c12")).intValue() : MTNNNetNative.nativeTensorElementSize(this.f, this.b.e);
    }
}
