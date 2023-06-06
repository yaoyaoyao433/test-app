package com.meituan.android.mrn.engine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.meituan.android.mrn.config.a {
    public static ChangeQuickRedirect a;
    private static volatile a b;

    @Override // com.meituan.android.mrn.config.a, com.meituan.android.mrn.config.e
    public final String a() {
        return "";
    }

    @Override // com.meituan.android.mrn.config.a, com.meituan.android.mrn.config.e
    public final String b() {
        return null;
    }

    @Override // com.meituan.android.mrn.config.a, com.meituan.android.mrn.config.e
    public final boolean c() {
        return false;
    }

    @Override // com.meituan.android.mrn.config.a, com.meituan.android.mrn.config.e
    public final boolean d() {
        return false;
    }

    @Override // com.meituan.android.mrn.config.e
    public final String e() {
        return null;
    }

    @Override // com.meituan.android.mrn.config.e
    public final int f() {
        return 0;
    }

    @Override // com.meituan.android.mrn.config.e
    public final String g() {
        return null;
    }

    @Override // com.meituan.android.mrn.config.e
    public final String h() {
        return null;
    }

    @Override // com.meituan.android.mrn.config.e
    public final String i() {
        return null;
    }

    @Override // com.meituan.android.mrn.config.e
    public final String j() {
        return null;
    }

    @Override // com.meituan.android.mrn.config.e
    public final String k() {
        return null;
    }

    @Override // com.meituan.android.mrn.config.e
    public final String l() {
        return null;
    }

    @Override // com.meituan.android.mrn.config.e
    public final int m() {
        return 0;
    }

    @Override // com.meituan.android.mrn.config.e
    public final String n() {
        return null;
    }

    @Override // com.meituan.android.mrn.config.e
    public final String o() {
        return null;
    }

    public static synchronized a p() {
        synchronized (a.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75ffba6f7dfa1dabaa7be91e6f778a5c", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75ffba6f7dfa1dabaa7be91e6f778a5c");
            }
            if (b == null) {
                b = new a();
            }
            return b;
        }
    }
}
