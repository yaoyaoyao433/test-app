package com.meituan.android.privacy.impl.config;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.config.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k implements d.a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static k a = new k();
    }

    public k() {
    }

    @Override // com.meituan.android.privacy.interfaces.config.d.a
    public final com.meituan.android.privacy.interfaces.config.c a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "186e1dbec6ef862fa3158946b71ebf64", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.privacy.interfaces.config.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "186e1dbec6ef862fa3158946b71ebf64");
        }
        Context context = PermissionGuard.a.a.getContext(null);
        if (context == null) {
            return com.meituan.android.privacy.interfaces.config.c.a();
        }
        d a2 = d.a(context);
        return a2.a(a2.a(str, false), str2, str3);
    }

    public static com.meituan.android.privacy.interfaces.config.c a(String str, String str2, @NonNull f fVar, @Nullable f fVar2) {
        com.meituan.android.privacy.interfaces.config.c a2;
        Object[] objArr = {str, str2, fVar, fVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcb2d6764f0efda2541ded77edfc5528", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.privacy.interfaces.config.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcb2d6764f0efda2541ded77edfc5528");
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (fVar2 == null || (a2 = fVar2.a(str, str2)) == null) {
            com.meituan.android.privacy.interfaces.config.c a3 = fVar.a(str, str2);
            return a3 == null ? new com.meituan.android.privacy.interfaces.config.c() : a3;
        }
        return a2;
    }
}
