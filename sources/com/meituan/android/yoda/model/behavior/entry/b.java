package com.meituan.android.yoda.model.behavior.entry;

import com.meituan.android.yoda.interfaces.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements g {
    public static ChangeQuickRedirect a;
    private static com.meituan.android.yoda.model.behavior.collection.a<b> b = new com.meituan.android.yoda.model.behavior.collection.a<>(15);
    private StringBuilder c;
    private float d;
    private float e;
    private String f;
    private int g;

    private b(float f, float f2, String str, int i) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53e8f1a5f37231673ac69969d4612f15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53e8f1a5f37231673ac69969d4612f15");
            return;
        }
        this.c = new StringBuilder();
        this.d = f;
        this.e = f2;
        this.f = str;
        this.g = i;
    }

    public static b a(float f, float f2, String str, int i) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b77d3b35307eb9c4f8b6cfd655161989", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b77d3b35307eb9c4f8b6cfd655161989");
        }
        b b2 = b.b();
        if (b2 == null) {
            return new b(f, f2, str, i);
        }
        b2.d = f;
        b2.e = f2;
        b2.f = str;
        b2.g = i;
        return b2;
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "edcf7895bcb48342774ea264da1397bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "edcf7895bcb48342774ea264da1397bb");
        } else {
            b.a();
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f2b2bbed7918fc41e9e2e6e11aa798e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f2b2bbed7918fc41e9e2e6e11aa798e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab319a83cb286cbf549a15963e2713c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab319a83cb286cbf549a15963e2713c1");
            return;
        }
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = null;
        this.g = 0;
        this.c.delete(0, this.c.length());
        b.a(this);
    }
}
