package com.meituan.msc.common.utils;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static <T> Set<T> a(T... tArr) {
        Object[] objArr = {tArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b744adc7e70a1de486427f251da41f46", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b744adc7e70a1de486427f251da41f46") : new HashSet(Arrays.asList(tArr));
    }

    public static <T> boolean a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f791c34433ec4a9d5fe80cb6e13eeaff", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f791c34433ec4a9d5fe80cb6e13eeaff")).booleanValue() : list == null || list.isEmpty();
    }

    public static <T> String a(@Nullable Collection<T> collection) {
        boolean z = true;
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9346ea142cf66e44851d2016665012b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9346ea142cf66e44851d2016665012b0");
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
