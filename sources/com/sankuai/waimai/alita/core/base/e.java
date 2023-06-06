package com.sankuai.waimai.alita.core.base;

import android.support.annotation.NonNull;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private final q b;

    public e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d57acf4092cd2687146f695abdf2d82f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d57acf4092cd2687146f695abdf2d82f");
        } else {
            this.b = q.a(com.meituan.android.singleton.b.a, str, 2);
        }
    }

    public final void a(@NonNull String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94cf269c1c4ffeb1fb592da1fa67925e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94cf269c1c4ffeb1fb592da1fa67925e");
        } else {
            this.b.a(str, str2);
        }
    }

    public final String b(@NonNull String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b0c852bf4b6298b1fea7bf662a6bd2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b0c852bf4b6298b1fea7bf662a6bd2a");
        }
        try {
            return this.b.b(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public final boolean a(@NonNull String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b74aa83060ed359aa56ab0ab5d5b1e7a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b74aa83060ed359aa56ab0ab5d5b1e7a")).booleanValue();
        }
        try {
            return this.b.b(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    public final void b(@NonNull String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "051fa89ec6afdb9daedca981c4000a92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "051fa89ec6afdb9daedca981c4000a92");
        } else {
            this.b.a(str, z);
        }
    }
}
