package com.sankuai.waimai.store.manager.appinfo;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a9559bfae0b28b80bd5c4d8ba65da7f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a9559bfae0b28b80bd5c4d8ba65da7f") : com.sankuai.waimai.foundation.core.common.a.a().c();
    }

    public static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f32581c88a965a52c407070673e319c5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f32581c88a965a52c407070673e319c5")).intValue() : com.sankuai.waimai.foundation.core.common.a.a().f();
    }

    public static Activity c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b6d538aa6f87d3f297a82c187fbb6c8", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b6d538aa6f87d3f297a82c187fbb6c8") : com.sankuai.waimai.foundation.utils.activity.a.a().b();
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dde0c804da980f82ef7aaa6ffb03cbb0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dde0c804da980f82ef7aaa6ffb03cbb0")).booleanValue() : com.sankuai.waimai.foundation.core.a.c();
    }
}
