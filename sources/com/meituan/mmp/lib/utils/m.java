package com.meituan.mmp.lib.utils;

import com.meituan.mmp.main.annotation.NeedDependency;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        Class<?> a();
    }

    public static boolean a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "920dce76aae4f714815a1fb7ad2b2211", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "920dce76aae4f714815a1fb7ad2b2211")).booleanValue();
        }
        try {
            aVar.a().getAnnotation(NeedDependency.class);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
