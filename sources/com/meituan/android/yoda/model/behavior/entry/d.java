package com.meituan.android.yoda.model.behavior.entry;

import com.meituan.android.yoda.interfaces.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements g {
    public static ChangeQuickRedirect a;
    private static com.meituan.android.yoda.model.behavior.collection.a<d> b = new com.meituan.android.yoda.model.behavior.collection.a<>(60);
    private StringBuilder c;
    private float d;
    private float e;
    private int f;
    private long g;

    private d(float f, float f2, int i, long j) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7086ebadc3c9527b2e12674c8092b33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7086ebadc3c9527b2e12674c8092b33");
            return;
        }
        this.c = new StringBuilder();
        this.g = 0L;
        this.d = f;
        this.e = f2;
        this.f = i;
        this.g = j;
    }

    public static d a(float f, float f2, int i, long j) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "617bdc538dee13417beef7331dacb880", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "617bdc538dee13417beef7331dacb880");
        }
        d b2 = b.b();
        if (b2 == null) {
            return new d(f, f2, i, j);
        }
        b2.d = f;
        b2.e = f2;
        b2.f = i;
        b2.g = j;
        return b2;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d905f6eb069f1e859dff4619656c787", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d905f6eb069f1e859dff4619656c787");
        }
        this.c.delete(0, this.c.length());
        StringBuilder sb = this.c;
        sb.append(CommonConstant.Symbol.BRACKET_LEFT);
        sb.append(this.d);
        sb.append(CommonConstant.Symbol.COMMA);
        sb.append(this.e);
        sb.append(CommonConstant.Symbol.COMMA);
        sb.append(this.f);
        sb.append(CommonConstant.Symbol.COMMA);
        sb.append(this.g);
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    @Override // com.meituan.android.yoda.interfaces.g
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c54b0ba1e139a6f830469323c6c17a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c54b0ba1e139a6f830469323c6c17a1");
            return;
        }
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0;
        this.g = 0L;
        this.c.delete(0, this.c.length());
        b.a(this);
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5622bf4c4f1bfcc3e86590de4c2c747b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5622bf4c4f1bfcc3e86590de4c2c747b");
        } else {
            b.a();
        }
    }
}
