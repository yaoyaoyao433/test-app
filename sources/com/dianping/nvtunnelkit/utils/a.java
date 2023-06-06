package com.dianping.nvtunnelkit.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a(Collection collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e36d0470043eff38cbabd3c5e1811049", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e36d0470043eff38cbabd3c5e1811049")).intValue();
        }
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    public static boolean b(Collection collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77754ec9887729396b8ffc8530f2dcca", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77754ec9887729396b8ffc8530f2dcca")).booleanValue() : collection == null || collection.isEmpty();
    }

    public static boolean c(Collection collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26507b763eb42fa38630220b01e62f75", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26507b763eb42fa38630220b01e62f75")).booleanValue() : !b(collection);
    }
}
