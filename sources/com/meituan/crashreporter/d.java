package com.meituan.crashreporter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.snare.n;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class d {
    public static ChangeQuickRedirect b;

    @Deprecated
    public String a() {
        return null;
    }

    @Deprecated
    public String b() {
        return null;
    }

    public String d() {
        return "";
    }

    public String e() {
        return "";
    }

    public boolean g() {
        return false;
    }

    public String h() {
        return "";
    }

    public n c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfde4fe66c88f5452a24a0e61b56745a", RobustBitConfig.DEFAULT_VALUE) ? (n) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfde4fe66c88f5452a24a0e61b56745a") : new n();
    }

    public com.meituan.crashreporter.crash.b f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d3702804a2c2491732bfc07ad42f503", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.crashreporter.crash.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d3702804a2c2491732bfc07ad42f503") : new com.meituan.crashreporter.crash.b() { // from class: com.meituan.crashreporter.d.1
            @Override // com.meituan.crashreporter.crash.b
            public final boolean a(String str, boolean z) {
                return true;
            }
        };
    }
}
