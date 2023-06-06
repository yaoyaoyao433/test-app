package com.sankuai.waimai.foundation.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static <T> boolean a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31b228ed1bdb9558ff5a61c2a6f1895a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31b228ed1bdb9558ff5a61c2a6f1895a")).booleanValue() : list == null || list.isEmpty();
    }

    public static <T> int b(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c72e2e12d3237b302a9567339b57b1ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c72e2e12d3237b302a9567339b57b1ec")).intValue();
        }
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
