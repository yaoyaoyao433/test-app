package com.sankuai.waimai.platform.utils;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class n {
    public static ChangeQuickRedirect a;
    private Map<String, Object> b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        private static final n a = new n();
    }

    public n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e520e133939ac77e9b043501bef7683d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e520e133939ac77e9b043501bef7683d");
        } else {
            this.b = new HashMap();
        }
    }

    public static n a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94c442a3c456109450a624cae2dd9a56", RobustBitConfig.DEFAULT_VALUE) ? (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94c442a3c456109450a624cae2dd9a56") : a.a;
    }

    public final void a(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb74d152040fa107348bdf7ff0ea6774", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb74d152040fa107348bdf7ff0ea6774");
        } else if (obj == null) {
        } else {
            this.b.put(obj.getClass().getName(), obj);
        }
    }

    @Nullable
    public final Object a(@Nullable Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f1f2d15c50286f3935a82e21610c31b", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f1f2d15c50286f3935a82e21610c31b") : this.b.get(cls.getName());
    }
}
