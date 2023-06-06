package com.sankuai.waimai.foundation.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ai<T> {
    public static ChangeQuickRedirect a;
    private WeakReference<T> b;

    public final T a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97bbdb2c3999759d79c2ef89f1ef0d5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97bbdb2c3999759d79c2ef89f1ef0d5f");
        }
        if (this.b != null) {
            return this.b.get();
        }
        return null;
    }

    public final void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a047f1d72029aa535617eb86aa2a86e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a047f1d72029aa535617eb86aa2a86e");
        } else {
            this.b = t == null ? null : new WeakReference<>(t);
        }
    }
}
