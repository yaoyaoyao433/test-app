package com.meituan.msc.mmpviews.csstypes;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class d<T> {
    public static ChangeQuickRedirect c;
    protected T[] d;

    public abstract T a();

    @NonNull
    public final T a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92be552e090ecdf214e19995c534511d", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92be552e090ecdf214e19995c534511d");
        }
        if (this.d == null || this.d.length == 0) {
            return a();
        }
        if (this.d.length > i) {
            return this.d[i];
        }
        return this.d[0];
    }

    public final int b() {
        return this.d.length;
    }
}
