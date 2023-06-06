package com.meituan.android.recce.shark;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Array;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static <T> T[] a(List<T> list, Class<T> cls) {
        boolean z;
        Object[] objArr = {list, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19fe4a43356e8e40856b29fdb90b28e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (T[]) ((Object[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19fe4a43356e8e40856b29fdb90b28e0"));
        }
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fd61cb67ad4d627a49f3e1502cdc6ccc", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fd61cb67ad4d627a49f3e1502cdc6ccc")).booleanValue();
        } else {
            z = list == null || list.isEmpty();
        }
        if (z) {
            return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 0));
        }
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, list.size()));
        for (int i = 0; i < tArr.length; i++) {
            if (cls.isAssignableFrom(list.get(i).getClass())) {
                tArr[i] = list.get(i);
            }
        }
        return tArr;
    }
}
