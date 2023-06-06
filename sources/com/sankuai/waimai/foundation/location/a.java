package com.sankuai.waimai.foundation.location;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static int b;

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a838c5037a813a851547bae54e1a2105", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a838c5037a813a851547bae54e1a2105");
            return;
        }
        if (f.a().b()) {
            b = i + 500;
        } else {
            b = i - 500;
        }
        e.c().a(b, 100, "wm_home_location_report");
    }

    public static void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92b00d44cc9b2986a23d77bacbd771ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92b00d44cc9b2986a23d77bacbd771ff");
        } else {
            e.c().a(b + i, 100, "wm_home_location_report");
        }
    }
}
