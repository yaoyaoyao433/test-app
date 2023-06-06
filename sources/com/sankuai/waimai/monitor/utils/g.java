package com.sankuai.waimai.monitor.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g<T> {
    public static ChangeQuickRedirect a;
    private WeakReference<T> b;

    public final T a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2f3bc356a4a914f8df52acf2c699674", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2f3bc356a4a914f8df52acf2c699674");
        }
        if (this.b != null) {
            return this.b.get();
        }
        return null;
    }

    public final void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50d19c6147ab28996cefde71ac718847", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50d19c6147ab28996cefde71ac718847");
        } else {
            this.b = t == null ? null : new WeakReference<>(t);
        }
    }
}
