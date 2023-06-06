package com.meituan.android.singleton;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class e<T> {
    public static ChangeQuickRedirect b;
    private volatile T a;

    public abstract T a();

    public final T b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52362afe43f6f4953841fcc674d4ca09", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52362afe43f6f4953841fcc674d4ca09");
        }
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = a();
                }
            }
        }
        return this.a;
    }
}
