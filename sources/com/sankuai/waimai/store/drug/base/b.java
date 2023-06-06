package com.sankuai.waimai.store.drug.base;

import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.idata.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b<T extends com.sankuai.waimai.store.base.idata.a> {
    public static ChangeQuickRedirect a;
    private final SparseArray<T> b;

    @NonNull
    public abstract T b(int i);

    public abstract void b(int i, T t);

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16ba2c3765779f78fef30de484432f46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16ba2c3765779f78fef30de484432f46");
        } else {
            this.b = new SparseArray<>();
        }
    }

    @NonNull
    public final synchronized T a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a64eb32bdb1f35d1806db3c94d5c46cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a64eb32bdb1f35d1806db3c94d5c46cd");
        }
        T t = this.b.get(i);
        if (t == null || t.a()) {
            t = b(i);
        }
        t.a(true);
        this.b.put(i, t);
        return t;
    }

    public final synchronized void a(int i, @NonNull T t) {
        Object[] objArr = {Integer.valueOf(i), t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54033fdb6063d719a0d7f5b29954eeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54033fdb6063d719a0d7f5b29954eeb");
            return;
        }
        this.b.put(i, t);
        t.a(false);
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "954ed1d6255b3f3f747da32a4e39c353", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "954ed1d6255b3f3f747da32a4e39c353");
            return;
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.b.keyAt(i);
            b(keyAt, this.b.get(keyAt));
        }
    }
}
