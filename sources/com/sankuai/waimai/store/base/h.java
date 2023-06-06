package com.sankuai.waimai.store.base;

import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.idata.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class h<T extends com.sankuai.waimai.store.base.idata.a> {
    public static ChangeQuickRedirect a;
    private final SparseArray<T> b;

    @NonNull
    public abstract T b(int i);

    @NonNull
    public abstract T b(int i, String str, String str2);

    public abstract void b(int i, T t);

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "641391aa60c35c676ba8eb08d91284ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "641391aa60c35c676ba8eb08d91284ad");
        } else {
            this.b = new SparseArray<>();
        }
    }

    @NonNull
    public final synchronized T a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db22ebb4b0970bb17187c73e3bda9bf8", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db22ebb4b0970bb17187c73e3bda9bf8");
        }
        T t = this.b.get(i);
        if (t == null || t.a()) {
            t = b(i);
        }
        t.a(true);
        this.b.put(i, t);
        return t;
    }

    @NonNull
    public final synchronized T a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d12f954c5e8b9d742f8745159655888e", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d12f954c5e8b9d742f8745159655888e");
        }
        T t = this.b.get(i);
        if (t == null || t.a()) {
            t = b(i, str, str2);
        }
        t.a(true);
        this.b.put(i, t);
        return t;
    }

    public final synchronized void a(int i, @NonNull T t) {
        Object[] objArr = {Integer.valueOf(i), t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c1ed65fae5f357c024cb621871b8848", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c1ed65fae5f357c024cb621871b8848");
            return;
        }
        this.b.put(i, t);
        t.a(false);
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bef5c8a211477cac50fbc5cbb3d19358", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bef5c8a211477cac50fbc5cbb3d19358");
            return;
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.b.keyAt(i);
            b(keyAt, this.b.get(keyAt));
        }
    }
}
