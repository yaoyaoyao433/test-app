package com.meituan.android.legwork.net.response;

import com.meituan.android.legwork.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.legwork.net.response.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0271a {
        public static a a = new a();
    }

    public a() {
    }

    public final boolean a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4da3364f7e78e67481157cad38663db8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4da3364f7e78e67481157cad38663db8")).booleanValue();
        }
        if (i != 10000) {
            return false;
        }
        com.meituan.android.legwork.common.user.a.a().a(m.a.a.a());
        return false;
    }
}
