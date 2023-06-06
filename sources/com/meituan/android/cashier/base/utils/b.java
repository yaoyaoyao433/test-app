package com.meituan.android.cashier.base.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static <T> boolean a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ec082b5f78bb8fa9d4509f0ffd10025", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ec082b5f78bb8fa9d4509f0ffd10025")).booleanValue() : list == null || list.isEmpty();
    }
}
