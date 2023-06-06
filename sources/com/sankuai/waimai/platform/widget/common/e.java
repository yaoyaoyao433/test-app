package com.sankuai.waimai.platform.widget.common;

import android.support.v4.util.SparseArrayCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e<T> {
    public static ChangeQuickRedirect a;
    public SparseArrayCompat<d<T>> b;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae28fe37019df3541c5f86d79cc35361", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae28fe37019df3541c5f86d79cc35361");
        } else {
            this.b = new SparseArrayCompat<>();
        }
    }

    public final int a(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fabf9447274b96792d6c1e44e5f0e84", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fabf9447274b96792d6c1e44e5f0e84")).intValue();
        }
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.b.valueAt(i2).a(t, i)) {
                return this.b.keyAt(i2);
            }
        }
        throw new IllegalArgumentException("No ItemViewDelegate added that matches position=" + i + " in data source");
    }

    public final void a(b bVar, T t, int i) {
        Object[] objArr = {bVar, t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1236c87b99603c615aa8eac1b10ccbec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1236c87b99603c615aa8eac1b10ccbec");
            return;
        }
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            d<T> valueAt = this.b.valueAt(i2);
            if (valueAt.a(t, i)) {
                valueAt.a(bVar, t, i);
                return;
            }
        }
        throw new IllegalArgumentException("No ItemViewDelegateManager added that matches position=" + i + " in data source");
    }
}
