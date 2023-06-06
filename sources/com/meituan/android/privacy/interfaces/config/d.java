package com.meituan.android.privacy.interfaces.config;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static volatile a b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        c a(String str, String str2, String str3);
    }

    @NonNull
    public static c a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42f87f2f67a426fbdc1a882e009231ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42f87f2f67a426fbdc1a882e009231ce");
        }
        if (b != null) {
            return b.a(str, str2, str3);
        }
        return c.a();
    }
}
