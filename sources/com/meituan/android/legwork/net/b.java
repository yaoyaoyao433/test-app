package com.meituan.android.legwork.net;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.meituan.android.legwork.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final b b = new b();

    public static b a() {
        return b;
    }

    public final String a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c25bfd3a70b351e648ae5231c84f1e1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c25bfd3a70b351e648ae5231c84f1e1a");
        }
        if (z) {
            String a2 = com.meituan.android.legwork.common.hostInfo.b.e().a(com.meituan.android.legwork.a.a(), "https://paotui.meituan.com/");
            if (TextUtils.isEmpty(a2)) {
                a2 = z.b(com.meituan.android.legwork.a.a(), "key_host", "");
            }
            return TextUtils.isEmpty(a2) ? "https://paotui.meituan.com/" : a2;
        }
        return "https://paotui.meituan.com/";
    }

    @SuppressLint({"ApplySharedPref"})
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5001d3520d8cbcd9254c074f8faee3e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5001d3520d8cbcd9254c074f8faee3e2");
        } else {
            z.a(com.meituan.android.legwork.a.a(), "key_host", str);
        }
    }
}
