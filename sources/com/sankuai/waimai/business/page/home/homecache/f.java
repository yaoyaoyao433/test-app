package com.sankuai.waimai.business.page.home.homecache;

import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static q b;

    private static q a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f762a76f57d776b0d90e0a217f4a1daf", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f762a76f57d776b0d90e0a217f4a1daf");
        }
        if (b != null) {
            return b;
        }
        q a2 = q.a(com.meituan.android.singleton.b.a, "wm_homepage_cip_channel");
        b = a2;
        return a2;
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4501af1ed568e5d28517605876aba5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4501af1ed568e5d28517605876aba5c");
        } else {
            a().a(str, str2);
        }
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20a6adf475c480711e829da8a84f7dfb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20a6adf475c480711e829da8a84f7dfb") : a().b(str, "");
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "153bb88766aa74d7afc872ed44967d16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "153bb88766aa74d7afc872ed44967d16");
        } else {
            a().a(str, "");
        }
    }
}
