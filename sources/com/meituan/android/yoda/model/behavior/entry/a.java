package com.meituan.android.yoda.model.behavior.entry;

import com.meituan.android.yoda.interfaces.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements g {
    public static ChangeQuickRedirect a;
    private static com.meituan.android.yoda.model.behavior.collection.a<a> b = new com.meituan.android.yoda.model.behavior.collection.a<>(60);
    private StringBuilder c;
    private float d;
    private float e;
    private float f;
    private long g;

    private a(float f, float f2, float f3, long j) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb105355bccad148ee0bd2f2a2a4f334", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb105355bccad148ee0bd2f2a2a4f334");
            return;
        }
        this.c = new StringBuilder();
        this.g = 0L;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = j;
    }

    public static a a(float f, float f2, float f3, long j) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8451a24eedaf1b3e8ace3ecc83562fd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8451a24eedaf1b3e8ace3ecc83562fd1");
        }
        a b2 = b.b();
        if (b2 == null) {
            return new a(f, f2, f3, j);
        }
        b2.d = f;
        b2.e = f2;
        b2.f = f3;
        b2.g = j;
        return b2;
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7d7e387c7ff43cb53f3e62c4561819b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7d7e387c7ff43cb53f3e62c4561819b");
        } else {
            b.a();
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecb16e4092cc202ffc6bb5b93f9f7c06", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecb16e4092cc202ffc6bb5b93f9f7c06");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fee61a0d45484446333f410a6a2bf52b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fee61a0d45484446333f410a6a2bf52b");
            return;
        }
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0L;
        this.c.delete(0, this.c.length());
        b.a(this);
    }
}
