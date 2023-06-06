package com.sankuai.waimai.store.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ap<T> {
    public static ChangeQuickRedirect a;
    private WeakReference<T> b;

    public final T a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f77510487297b4968eb695ef765b96d", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f77510487297b4968eb695ef765b96d");
        }
        if (this.b != null) {
            return this.b.get();
        }
        return null;
    }

    public final void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a59d15e4df0bb18eff29503b96a868f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a59d15e4df0bb18eff29503b96a868f");
        } else {
            this.b = t == null ? null : new WeakReference<>(t);
        }
    }
}
