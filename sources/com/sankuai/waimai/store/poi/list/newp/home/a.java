package com.sankuai.waimai.store.poi.list.newp.home;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.ab;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "647b899cf8ff9136cf97722c94b8a3ec", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "647b899cf8ff9136cf97722c94b8a3ec")).booleanValue() : ab.b().b(com.sankuai.waimai.store.util.b.a(), "sc_float_card_cache", false);
    }
}
