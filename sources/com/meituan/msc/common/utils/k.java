package com.meituan.msc.common.utils;

import com.meituan.msc.common.annotation.NeedDependency;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        Class<?> a();
    }

    public static boolean a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e12a34c4f3c7734b1bcd9c5fef52241f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e12a34c4f3c7734b1bcd9c5fef52241f")).booleanValue();
        }
        try {
            aVar.a().getAnnotation(NeedDependency.class);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
