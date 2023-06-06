package com.meituan.mmp.lib.utils;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static <T> List<T> a(T... tArr) {
        Object[] objArr = {tArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a83daf59dd304a811e60d56269a5d0d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a83daf59dd304a811e60d56269a5d0d") : new ArrayList(Arrays.asList(tArr));
    }

    public static <T> Set<T> b(T... tArr) {
        Object[] objArr = {tArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4294ceaabab16c5c7de1318d7458d509", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4294ceaabab16c5c7de1318d7458d509") : new HashSet(Arrays.asList(tArr));
    }

    public static <T> boolean a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed237361cb80efa00f6305259bbbf55a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed237361cb80efa00f6305259bbbf55a")).booleanValue() : list == null || list.isEmpty();
    }

    public static <T> String a(@Nullable Collection<T> collection) {
        boolean z = true;
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "615e21e4a6bb32b7149315e463de6bbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "615e21e4a6bb32b7149315e463de6bbc");
        }
        if (collection == null) {
            return StringUtil.NULL;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(CommonConstant.Symbol.BIG_BRACKET_LEFT);
        for (T t : collection) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(t.toString());
        }
        sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        return sb.toString();
    }
}
