package com.meituan.android.common.statistics.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class LazySingletonProvider<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile T instance;

    public abstract T createInstance();

    public T getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b305e5558d3f7a5c74d642638a64a3c", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b305e5558d3f7a5c74d642638a64a3c");
        }
        if (this.instance == null) {
            synchronized (this) {
                if (this.instance == null) {
                    this.instance = createInstance();
                }
            }
        }
        return this.instance;
    }
}
