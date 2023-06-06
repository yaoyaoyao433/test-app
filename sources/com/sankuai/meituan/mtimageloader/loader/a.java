package com.sankuai.meituan.mtimageloader.loader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.mtimageloader.listener.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "716d4a645bf730eee9fa6a86c429a11e", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "716d4a645bf730eee9fa6a86c429a11e") : com.sankuai.meituan.mtimageloader.config.a.k();
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1fdf7240395271d644361ee7033bd9fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1fdf7240395271d644361ee7033bd9fe");
        } else {
            a().a();
        }
    }

    public static b.C0608b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "261eca69b7ed32ac8fe0ee06a9436953", RobustBitConfig.DEFAULT_VALUE) ? (b.C0608b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "261eca69b7ed32ac8fe0ee06a9436953") : new b.C0608b();
    }
}
